package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TObject;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ObjectDAO extends CrudDAOService<TObject>{

	public ObjectDAO() {}
@Inject
public ObjectDAO

(EntityManager em) {
		super(em);}
}
