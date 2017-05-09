package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TAttributetag;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class AttributetagDAO extends CrudDAOService<TAttributetag> {

	public AttributetagDAO() {}
	
	@Inject
	public AttributetagDAO(EntityManager em) {
		super(em);}
}
