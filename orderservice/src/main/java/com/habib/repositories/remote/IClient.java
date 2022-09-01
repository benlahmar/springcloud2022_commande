/**
 * 
 */
package com.habib.repositories.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.habib.entities.Compte;

/**
 * @author moi
 *
 */
@FeignClient(name = "users-service",
			url = "http://localhost:8082")
public interface IClient {

	@GetMapping("/comptes/{id}")
	Compte findclient(@PathVariable long id);
	
	
}
