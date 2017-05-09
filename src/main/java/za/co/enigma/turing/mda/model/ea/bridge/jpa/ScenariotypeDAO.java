package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TScenariotype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ScenariotypeDAO extends CrudDAOService<TScenariotype> {

	public ScenariotypeDAO() {}

@Inject
public ScenariotypeDAO
(EntityManager em) {
		super(em);}
}
