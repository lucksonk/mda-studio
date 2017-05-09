package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TStatustype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class StatustypeDAO extends CrudDAOService<TStatustype> {

	public StatustypeDAO() {}

@Inject
public StatustypeDAO
(EntityManager em) {
		super(em);}
}
