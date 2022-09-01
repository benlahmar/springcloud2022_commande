/**
 * 
 */
package com.habib.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.habib.entities.Commande;

/**
 * @author moi
 *
 */
public interface ICommand extends JpaRepository<Commande, Long>{

}
