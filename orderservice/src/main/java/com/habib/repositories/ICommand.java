/**
 * 
 */
package com.habib.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habib.entities.Commande;

/**
 * @author moi
 *
 */
public interface ICommand extends JpaRepository<Commande, Long>{

	List<Commande> findByIdclient(long idclient);
}
