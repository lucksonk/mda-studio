package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TStereotype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class StereotypeDAO extends CrudDAOService<TStereotype>{

	public StereotypeDAO() {}
	
	@Inject
public StereotypeDAO
	(EntityManager em) {
			super(em);}
}
