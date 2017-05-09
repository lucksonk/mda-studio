package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TCardinality;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class CardinalityDAO extends CrudDAOService<TCardinality> {

	public CardinalityDAO() {}
	
	@Inject
	public CardinalityDAO(EntityManager em) {
		super(em);}
}
