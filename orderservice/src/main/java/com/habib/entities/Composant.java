/**
 * 
 */
package com.habib.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author moi
 *
 */
@Entity
public class Composant {

	@Id
	@GeneratedValue
	long id;
	int qte;
	double price;
	
	@JsonBackReference
	@ManyToOne()
	Commande cmd;
	
	@Transient
	Produit produit;
	
	long idproduit;

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
	 * @return the qte
	 */
	public int getQte() {
		return qte;
	}

	/**
	 * @param qte the qte to set
	 */
	public void setQte(int qte) {
		this.qte = qte;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the cmd
	 */
	public Commande getCmd() {
		return cmd;
	}

	/**
	 * @param cmd the cmd to set
	 */
	public void setCmd(Commande cmd) {
		this.cmd = cmd;
	}

	/**
	 * @return the produit
	 */
	public Produit getProduit() {
		return produit;
	}

	/**
	 * @param produit the produit to set
	 */
	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	/**
	 * @return the idproduit
	 */
	public long getIdproduit() {
		return idproduit;
	}

	/**
	 * @param idproduit the idproduit to set
	 */
	public void setIdproduit(long idproduit) {
		this.idproduit = idproduit;
	}
	
	
	
}
