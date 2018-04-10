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

import com.guinardsolution.mp.ws.dao.IAbstractDomaineDao;
import com.guinardsolution.mp.ws.entities.AbstractDomaine;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractDomaineService.
 *
 * @author Paul
 */
@RestController
public class AbstractDomaineService {
	/** The dao. */
	@Autowired
	private IAbstractDomaineDao dao;

	/**
	 * Gets the all abstractDomaine.
	 *
	 * @return the all
	 */
	@RequestMapping(value = "/domaines", method = RequestMethod.GET)
	public List<AbstractDomaine> getAll() {
		return dao.findAll();
	}

	/**
	 * Gets the abstractDomaine by id.
	 *
	 * @param id
	 *            the id
	 * @return the by id
	 */
	@RequestMapping(value = "/domaines/{id}", method = RequestMethod.GET)
	public AbstractDomaine getById(@PathVariable String id) {
		return dao.getOne(Integer.parseInt(id));
	}

	/**
	 * Save or update.
	 *
	 * @param abstractDomaine
	 *            the abstractDomaine
	 * @return the abstractDomaine
	 */
	@RequestMapping(value = "/domaines", method = RequestMethod.POST)
	public AbstractDomaine saveOrUpdate(@RequestBody AbstractDomaine abstractDomaine) {
		return dao.saveAndFlush(abstractDomaine);
	}

	/**
	 * Delete.
	 *
	 * @param id
	 *            the id
	 */
	@RequestMapping(value = "/domaines/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		dao.deleteById(Integer.parseInt(id));
	}

}
