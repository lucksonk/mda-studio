package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TObjectrisk;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ObjectriskDAO extends CrudDAOService<TObjectrisk> {

	public ObjectriskDAO() {}

@Inject
public ObjectriskDAO
(EntityManager em) {
		super(em);}
}
