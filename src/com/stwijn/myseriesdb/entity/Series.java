package com.stwijn.myseriesdb.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

@Entity
@Table(name = "serie")
public class Series {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@NotBlank(message="dit veld is verplicht")
	@Column(name = "titel")
	private String titel;

	@Column(name = "genre")
	private String genre;
	
	@NotBlank(message="dit veld is verplicht")
	@Column(name = "platform")
	private String platform;

	@Pattern(regexp = "^(http://|https://|www.).*", message="ongeldige URL (http://, https:// of www.)")
	@Column(name = "imdb")
	private String imdb;

	@Pattern(regexp = "^(http://|https://|www.).*", message="ongeldige URL (http://, https:// of www.)")
	@Column(name = "mijnseries") 
	private String mijnseries;

	@Column(name = "status")
	private String status;

	public Series() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	public String getMijnseries() {
		return mijnseries;
	}

	public void setMijnseries(String mijnseries) {
		this.mijnseries = mijnseries;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Series [id=" + id + ", titel=" + titel + ", genre=" + genre + ", platform=" + platform + ", imdb="
				+ imdb + ", mijnseries=" + mijnseries + ", status=" + status + "]";
	}

}
