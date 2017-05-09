package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TObjectfile;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ObjectfileDAO extends CrudDAOService<TObjectfile> {

	public ObjectfileDAO() {}
	@Inject
public ObjectfileDAO
	(EntityManager em) {
			super(em);}
}
