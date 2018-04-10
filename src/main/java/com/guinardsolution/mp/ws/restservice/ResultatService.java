/**
 * 
 */
package com.guinardsolution.mp.ws.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.guinardsolution.mp.ws.dao.IResultatDao;
import com.guinardsolution.mp.ws.entities.Resultat;

/**
 * The Class ResultatService.
 *
 * @author Paul
 */
public class ResultatService {
	/** The dao. */
	@Autowired
	private IResultatDao dao;

	/**
	 * Gets the all resultats.
	 *
	 * @return the all
	 */
	@RequestMapping(value = "/resultats", method = RequestMethod.GET)
	public List<Resultat> getAll() {
		return dao.findAll();
	}

	/**
	 * Gets the resultat by id.
	 *
	 * @param id
	 *            the id
	 * @return the by id
	 */
	@RequestMapping(value = "/resultats/{id}", method = RequestMethod.GET)
	public Resultat getById(@PathVariable String id) {
		return dao.getOne(Integer.parseInt(id));
	}

	/**
	 * Save or update.
	 *
	 * @param resultat
	 *            the resultat
	 * @return the resultat
	 */
	@RequestMapping(value = "/resultats", method = RequestMethod.POST)
	public Resultat saveOrUpdate(@RequestBody Resultat resultat) {
		return dao.saveAndFlush(resultat);
	}

	/**
	 * Delete.
	 *
	 * @param id
	 *            the id
	 */
	@RequestMapping(value = "/resultats/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		dao.deleteById(Integer.parseInt(id));
	}

}
