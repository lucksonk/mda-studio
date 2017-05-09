package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TList;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ListDAO extends CrudDAOService<TList> {

	public ListDAO() {}
	
	@Inject
	public ListDAO
	(EntityManager em) {
			super(em);}
}
