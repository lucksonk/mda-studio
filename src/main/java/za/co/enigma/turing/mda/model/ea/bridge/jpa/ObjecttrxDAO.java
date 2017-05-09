package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TObjecttrx;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ObjecttrxDAO extends CrudDAOService<TObjecttrx> {

	public ObjecttrxDAO() {}
	
	@Inject
public ObjecttrxDAO
	(EntityManager em) {
			super(em);}
}
