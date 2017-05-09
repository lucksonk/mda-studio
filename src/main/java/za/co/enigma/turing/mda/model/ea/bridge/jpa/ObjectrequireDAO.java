package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TObjectrequire;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ObjectrequireDAO extends CrudDAOService<TObjectrequire> {

	public ObjectrequireDAO() {}
	@Inject
public ObjectrequireDAO
	(EntityManager em) {
			super(em);}
}
