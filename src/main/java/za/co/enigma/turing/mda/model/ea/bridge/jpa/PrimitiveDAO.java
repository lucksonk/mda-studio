package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TPrimitive;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class PrimitiveDAO extends CrudDAOService<TPrimitive>{

	public PrimitiveDAO() {}
	@Inject
public PrimitiveDAO
	(EntityManager em) {
			super(em);}
}
