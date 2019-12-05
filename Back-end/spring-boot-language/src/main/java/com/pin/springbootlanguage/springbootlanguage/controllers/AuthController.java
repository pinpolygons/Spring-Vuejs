package com.pin.springbootlanguage.springbootlanguage.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pin.springbootlanguage.springbootlanguage.models.Language;
import com.pin.springbootlanguage.springbootlanguage.repository.LangRepository;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("")
public class AuthController {
	@Autowired
	LangRepository langRepository;
	
	public List<Language> getLanguages(){
		return langRepository.findAll();
	}
	@GetMapping("/vn")
	public ResponseEntity<?> getVi() {
		Map<String, String> viLangMap = new HashMap<>();
		for (Language language : getLanguages()) {
			viLangMap.put(language.getContent(), language.getVi());
		}
		return ResponseEntity.ok(viLangMap);
	}
	@GetMapping("/en")
	public ResponseEntity<?> getEn() {
		Map<String, String> enLangMap = new HashMap<>();
		for (Language language : getLanguages()) {
			enLangMap.put(language.getContent(), language.getEn());
		}
		
		return ResponseEntity.ok(enLangMap);
	}
} 
