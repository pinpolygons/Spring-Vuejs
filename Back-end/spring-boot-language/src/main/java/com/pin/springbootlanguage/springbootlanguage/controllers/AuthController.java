package com.pin.springbootlanguage.springbootlanguage.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pin.springbootlanguage.springbootlanguage.models.Language;
import com.pin.springbootlanguage.springbootlanguage.repository.LangRepository;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/")
public class AuthController {
	@Autowired
	LangRepository langRepository;
	
	
	public List<Language> getLanguages(){
		return langRepository.findAll();
	}
	@GetMapping("vi")
	public Map<String, String> getViLang(){
		Map<String, String> map = new HashMap<>();
		
		for (Language language : getLanguages()) {
			map.put(language.getContent(), language.getVi());
		}
		
		return map;
	}
	@GetMapping("en")
	public Map<String, String> getEnLang() {
		Map<String, String> map = new HashMap<>();
		
		for (Language language : getLanguages()) {
			map.put(language.getContent(), language.getEn());
		}
		
		return map;
	}
	
} 
