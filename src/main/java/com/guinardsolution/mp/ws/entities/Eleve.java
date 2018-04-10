/**
 * 
 */
package com.guinardsolution.mp.ws.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

// TODO: Auto-generated Javadoc
/**
 * Eleve object.
 *
 * @author Paul
 */
@Entity
@Table(name = "eleves")
public class Eleve implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -5039096999369173703L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** The first name. */
	@Column(name = "first_name")
	private String firstName;

	/** The last name. */
	@Column(name = "last_name")
	private String lastName;

	/** The classe. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "classe_id")
	@JsonBackReference
	private Classe classe;

	/** The resultats. */
	@OneToMany(mappedBy = "eleve", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private List<Resultat> resultats;

	/**
	 * Instantiates a new eleve.
	 */
	public Eleve() {
		super();
	}

	/**
	 * Instantiates a new eleve.
	 *
	 * @param firstName
	 *            the first name
	 * @param lastName
	 *            the last name
	 */
	public Eleve(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Instantiates a new eleve.
	 *
	 * @param firstName
	 *            the first name
	 * @param lastName
	 *            the last name
	 * @param resultats
	 *            the resultats
	 */
	public Eleve(String firstName, String lastName, List<Resultat> resultats) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.resultats = resultats;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the resultats.
	 *
	 * @return the resultats
	 */
	public List<Resultat> getResultats() {
		return resultats;
	}

	/**
	 * Sets the resultats.
	 *
	 * @param resultats
	 *            the resultats to set
	 */
	public void setResultats(List<Resultat> resultats) {
		this.resultats = resultats;
	}

	/**
	 * Gets the classe.
	 *
	 * @return the classe
	 */
	public Classe getClasse() {
		return classe;
	}

	/**
	 * Sets the classe.
	 *
	 * @param classe
	 *            the classe to set
	 */
	public void setClasse(Classe classe) {
		this.classe = classe;
	}

}
