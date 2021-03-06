package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TEfforttype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class EfforttypeDAO extends CrudDAOService<TEfforttype>{

	public EfforttypeDAO() {}

	@Inject
	public EfforttypeDAO(EntityManager em) {
		super(em);
	}
}
