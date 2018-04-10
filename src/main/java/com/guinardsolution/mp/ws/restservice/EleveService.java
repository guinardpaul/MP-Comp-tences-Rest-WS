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

import com.guinardsolution.mp.ws.dao.IEleveDao;
import com.guinardsolution.mp.ws.entities.Eleve;

/**
 * The Class EleveService.
 *
 * @author Paul
 */
public class EleveService {
	/** The dao. */
	@Autowired
	private IEleveDao dao;

	/**
	 * Gets the all classes.
	 *
	 * @return the all
	 */
	@RequestMapping(value = "/eleves", method = RequestMethod.GET)
	public List<Eleve> getAll() {
		return dao.findAll();
	}

	/**
	 * Gets the eleve by id.
	 *
	 * @param id
	 *            the id
	 * @return the by id
	 */
	@RequestMapping(value = "/eleves/{id}", method = RequestMethod.GET)
	public Eleve getById(@PathVariable String id) {
		return dao.getOne(Integer.parseInt(id));
	}

	/**
	 * Save or update.
	 *
	 * @param eleve
	 *            the eleve
	 * @return the eleve
	 */
	@RequestMapping(value = "/eleves", method = RequestMethod.POST)
	public Eleve saveOrUpdate(@RequestBody Eleve eleve) {
		return dao.saveAndFlush(eleve);
	}

	/**
	 * Delete.
	 *
	 * @param id
	 *            the id
	 */
	@RequestMapping(value = "/eleves/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		dao.deleteById(Integer.parseInt(id));
	}

}
