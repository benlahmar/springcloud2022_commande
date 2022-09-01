/**
 * 
 */
package com.habib.busines;

import java.util.List;

import com.habib.entities.Commande;

/**
 * @author moi
 *
 */
public interface IMetier {

	public Commande addcmd(Commande c, long idclient);
	public Commande findcmd(long idcmd);
	public List<Commande> all();
	public List<Commande> all(long idclient);
	
}
