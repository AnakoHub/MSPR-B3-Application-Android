package fr.epsi.androidmodele;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {
	@Id
	private int id;
	private String pseudo;
	private byte mot_de_passe;
	private String prenom;
	private String nom;
	private String email;
	private String adresse;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public byte getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(byte mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
}
