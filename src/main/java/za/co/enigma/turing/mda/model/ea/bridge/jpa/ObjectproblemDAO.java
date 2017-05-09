package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TObjectproblem;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ObjectproblemDAO  extends CrudDAOService<TObjectproblem>{

	public ObjectproblemDAO() {}
	@Inject
public ObjectproblemDAO
	(EntityManager em) {
			super(em);}
}
