package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TComplexitytype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ComplexitytypeDAO extends CrudDAOService<TComplexitytype> {

	public ComplexitytypeDAO() {}
	
	@Inject
	public ComplexitytypeDAO(EntityManager em) {
		super(em);}
}
