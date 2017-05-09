package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TDatatype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class DatatypeDAO extends CrudDAOService<TDatatype> {

	public DatatypeDAO() {}

	@Inject
	public DatatypeDAO(EntityManager em) {
		super(em);}
}
