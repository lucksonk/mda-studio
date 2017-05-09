package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TProjectrole;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ProjectroleDAO extends CrudDAOService<TProjectrole> {

	public ProjectroleDAO() {}
	
	@Inject
public ProjectroleDAO
	(EntityManager em) {
			super(em);}
}
