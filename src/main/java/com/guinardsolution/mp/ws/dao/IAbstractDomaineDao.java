/**
 * 
 */
package com.guinardsolution.mp.ws.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guinardsolution.mp.ws.entities.AbstractDomaine;

/**
 * The Interface IAbstractDomaineDao.
 *
 * @author Paul
 */
public interface IAbstractDomaineDao extends JpaRepository<AbstractDomaine, Integer> {

}
