/**
 * 
 */
package com.guinardsolution.mp.ws.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guinardsolution.mp.ws.entities.Eleve;

/**
 * The Interface IEleveDao.
 *
 * @author Paul
 */
public interface IEleveDao extends JpaRepository<Eleve, Integer> {

}
