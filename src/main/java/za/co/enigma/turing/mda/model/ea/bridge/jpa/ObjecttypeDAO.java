package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TObjecttype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ObjecttypeDAO extends CrudDAOService<TObjecttype>{

	public ObjecttypeDAO() {}
	@Inject
public ObjecttypeDAO
	(EntityManager em) {
			super(em);}
}
