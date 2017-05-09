package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TObjectscenario;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ObjectscenarioDAO extends CrudDAOService<TObjectscenario>{

	public ObjectscenarioDAO() {}
	@Inject
	public ObjectscenarioDAO
	(EntityManager em) {
			super(em);}
}
