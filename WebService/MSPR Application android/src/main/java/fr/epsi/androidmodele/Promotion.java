package fr.epsi.androidmodele;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Promotion {
	
	@Id
	private String code;
	
	private String description;
	private String lien;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	
}
