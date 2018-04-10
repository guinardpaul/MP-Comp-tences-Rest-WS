/**
 * 
 */
package com.guinardsolution.mp.ws.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

// TODO: Auto-generated Javadoc
/**
 * The Class Resultat.
 *
 * @author Paul
 */
@Entity
@Table(name = "resultats")
public class Resultat implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2967477889956439773L;

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/** The result. */
	@Column(name = "results")
	private String result;

	/** The eleve. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "classe_id")
	@JsonBackReference
	private Eleve eleve;

	/**
	 * Instantiates a new resultat.
	 */
	public Resultat() {
		super();
	}

	/**
	 * Instantiates a new resultat.
	 *
	 * @param result
	 *            the result
	 */
	public Resultat(String result) {
		super();
		this.result = result;
	}

	/**
	 * Instantiates a new resultat.
	 *
	 * @param result
	 *            the result
	 * @param eleve
	 *            the eleve
	 */
	public Resultat(String result, Eleve eleve) {
		super();
		this.result = result;
		this.eleve = eleve;
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
	 * Gets the result.
	 *
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * Sets the result.
	 *
	 * @param result
	 *            the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * Gets the eleve.
	 *
	 * @return the eleve
	 */
	public Eleve getEleve() {
		return eleve;
	}

	/**
	 * Sets the eleve.
	 *
	 * @param eleve
	 *            the eleve to set
	 */
	public void setEleve(Eleve eleve) {
		this.eleve = eleve;
	}

}
