/**
 * 
 */
package com.habib.busines;

import com.habib.entities.Commande;

/**
 * @author moi
 *
 */
public interface IMetier {

	public Commande addcmd(Commande c, long idclient);
	public Commande findcmd(long idcmd);
}
