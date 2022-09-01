/**
 * 
 */
package com.habib.busines;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.habib.entities.Commande;
import com.habib.entities.Compte;
import com.habib.repositories.ICommand;
import com.habib.repositories.IComposant;
import com.habib.repositories.remote.IClient;

/**
 * @author moi
 *
 */
@Service
public class MetierImp implements IMetier{

	@Autowired
	ICommand crepo;
	@Autowired
	IComposant corepo;
	@Autowired
	IClient client;
	
	@Override
	public Commande addcmd(Commande c, long idclient) {
		//verifier idclient
		Compte cl = client.findclient(idclient);
		c.setClient(cl);
		c=crepo.save(c);
		return c;
	}

	@Override
	public Commande findcmd(long idcmd) {
		//recuperer aussi les info du client
		

		Commande c = crepo.findById(idcmd).get();
		Compte cl = client.findclient(c.getIdclient());
		c.setClient(cl);
		return c;
		
		
	}

	@Override
	public List<Commande> all() {
		return crepo.findAll();
		
	}

	@Override
	public List<Commande> all(long idclient) {
		
		return crepo.findByIdclient(idclient);
	}

}
