package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TObjecttest;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ObjecttestDAO extends CrudDAOService<TObjecttest>{

	public ObjecttestDAO() {}
	@Inject
public ObjecttestDAO
	(EntityManager em) {
			super(em);}
}
