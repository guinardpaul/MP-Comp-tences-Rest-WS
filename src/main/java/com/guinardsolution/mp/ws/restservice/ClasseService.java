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
import org.springframework.web.bind.annotation.RestController;

import com.guinardsolution.mp.ws.dao.IClasseDao;
import com.guinardsolution.mp.ws.entities.Classe;

/**
 * The Class ClasseService.
 *
 * @author Paul
 */
@RestController
public class ClasseService {

	/** The dao. */
	@Autowired
	private IClasseDao dao;

	/**
	 * Gets the all classes.
	 *
	 * @return the all
	 */
	@RequestMapping(value = "/classes", method = RequestMethod.GET)
	public List<Classe> getAll() {
		return dao.findAll();
	}

	/**
	 * Gets the classe by id.
	 *
	 * @param id
	 *            the id
	 * @return the by id
	 */
	@RequestMapping(value = "/classes/{id}", method = RequestMethod.GET)
	public Classe getById(@PathVariable String id) {
		return dao.getOne(Integer.parseInt(id));
	}

	/**
	 * Save or update.
	 *
	 * @param classe
	 *            the classe
	 * @return the classe
	 */
	@RequestMapping(value = "/classes", method = RequestMethod.POST)
	public Classe saveOrUpdate(@RequestBody Classe classe) {
		return dao.saveAndFlush(classe);
	}

	/**
	 * Delete.
	 *
	 * @param id
	 *            the id
	 */
	@RequestMapping(value = "/classes/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		dao.deleteById(Integer.parseInt(id));
	}

}
