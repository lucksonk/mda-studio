package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TObjectresource;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ObjectresourceDAO extends CrudDAOService<TObjectresource>{

	public ObjectresourceDAO() {}
	@Inject
public ObjectresourceDAO
	(EntityManager em) {
			super(em);}
}
