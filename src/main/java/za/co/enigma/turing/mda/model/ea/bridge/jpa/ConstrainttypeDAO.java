package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TConstrainttype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ConstrainttypeDAO extends CrudDAOService<TConstrainttype> {

	public ConstrainttypeDAO() {}

	@Inject
	public ConstrainttypeDAO(EntityManager em) {
		super(em);}
}
