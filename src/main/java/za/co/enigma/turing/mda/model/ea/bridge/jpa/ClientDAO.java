package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TClient;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ClientDAO extends CrudDAOService<TClient> {

	public ClientDAO() {}
	
	@Inject
	public ClientDAO(EntityManager em) {
		super(em);}
}
