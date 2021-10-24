package com.shared.domaine;

public class Livre {
	int _idLivre;
	String _titre;
	double _prix;
	String _auteur;
	public int get_idLivre() {
		return _idLivre;
	}
	public void set_idLivre(int _idLivre) {
		this._idLivre = _idLivre;
	}
	public String get_titre() {
		return _titre;
	}
	public void set_titre(String _titre) {
		this._titre = _titre;
	}
	public double get_prix() {
		return _prix;
	}
	public void set_prix(double _prix) {
		this._prix = _prix;
	}
	public String get_auteur() {
		return _auteur;
	}
	public void set_auteur(String _auteur) {
		this._auteur = _auteur;
	}
	public Livre(int _idLivre, String _titre, double _prix, String _auteur) {
		super();
		this._idLivre = _idLivre;
		this._titre = _titre;
		this._prix = _prix;
		this._auteur = _auteur;
	}
	public Livre() {
		super();
	}
	

}
