package com.habib.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Commande {

	@Id
	@GeneratedValue
	long id;
	LocalDate date;
	
	@Transient
	Compte client;
	
	long idclient;
	@JsonManagedReference
	@OneToMany(mappedBy = "cmd", fetch = FetchType.EAGER)
	List<Composant> composants=new ArrayList<>();

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the client
	 */
	public Compte getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Compte client) {
		this.client = client;
	}

	/**
	 * @return the idclient
	 */
	public long getIdclient() {
		return idclient;
	}

	/**
	 * @param idclient the idclient to set
	 */
	public void setIdclient(long idclient) {
		this.idclient = idclient;
	}

	
	
}
