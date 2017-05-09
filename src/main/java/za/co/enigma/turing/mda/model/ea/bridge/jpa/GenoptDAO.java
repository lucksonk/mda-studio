package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TGenopt;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class GenoptDAO extends CrudDAOService<TGenopt> {

	public GenoptDAO() {}
	
	@Inject
	public GenoptDAO(EntityManager em) {
			super(em);}
}
