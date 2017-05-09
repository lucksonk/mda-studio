package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TCategory;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class CategoryDAO extends CrudDAOService<TCategory> {

	public CategoryDAO() {}
	
	@Inject
	public CategoryDAO(EntityManager em) {
		super(em);}
}
