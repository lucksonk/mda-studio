package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.Usysquery;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class UsysqueryDAO  extends CrudDAOService<Usysquery>{

	public UsysqueryDAO() {}
	
	@Inject
public UsysqueryDAO
	(EntityManager em) {
			super(em);}
}
