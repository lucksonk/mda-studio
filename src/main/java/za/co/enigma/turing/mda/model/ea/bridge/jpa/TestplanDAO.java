package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TTestplan;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class TestplanDAO extends CrudDAOService<TTestplan> {

	public TestplanDAO(){}

@Inject
public TestplanDAO
(EntityManager em) {
		super(em);}
}
