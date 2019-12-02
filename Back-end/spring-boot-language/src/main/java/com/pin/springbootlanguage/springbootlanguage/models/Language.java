package com.pin.springbootlanguage.springbootlanguage.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "language", uniqueConstraints = {
		@UniqueConstraint(columnNames = "content"),
		@UniqueConstraint(columnNames = "vi"),
		@UniqueConstraint(columnNames = "en")
})
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(max = 255)
	private String content;
	
	@NotBlank
	@Size(max = 255)
	private String vi;
	
	@NotBlank
	@Size(max = 255)
	private String en;
	
	
	
	
	public Language() {}


	public Language(Long id, @NotBlank @Size(max = 255) String content, @NotBlank @Size(max = 255) String vi,
			@NotBlank @Size(max = 255) String en) {
		this.id = id;
		this.content = content;
		this.vi = vi;
		this.en = en;
	}

	
	public void setId(Long id) {
		this.id = id;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public void setVi(String vi) {
		this.vi = vi;
	}


	public void setEn(String en) {
		this.en = en;
	}


	public Long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getVi() {
		return vi;
	}

	public String getEn() {
		return en;
	}
	
	

}
