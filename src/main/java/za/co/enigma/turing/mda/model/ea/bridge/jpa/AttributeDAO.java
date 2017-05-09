package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TAttribute;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class AttributeDAO extends CrudDAOService<TAttribute> {

	public AttributeDAO() {}
	
	@Inject
	public AttributeDAO(EntityManager em) {
		super(em);}
}
