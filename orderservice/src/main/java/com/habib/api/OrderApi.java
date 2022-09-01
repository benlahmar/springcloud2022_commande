/**
 * 
 */
package com.habib.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.habib.busines.IMetier;
import com.habib.entities.Commande;

/**
 * @author moi
 *
 */
@RestController
public class OrderApi {

	@Autowired
	IMetier service;
	@PostMapping("/commandes")
	public ResponseEntity<Commande> addc(@RequestBody Commande c )
	{
		c= service.addcmd(c, c.getIdclient());
		return new ResponseEntity<Commande>(c,HttpStatus.CREATED);
	}
	
	@GetMapping("/commandes/{id}")
	public Commande search(@PathVariable long id)
	{
		return service.findcmd(id);
	}
}
