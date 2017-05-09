package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TConnector;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ConnectorDAO extends CrudDAOService<TConnector>{

	public ConnectorDAO() {}
	
	@Inject
	public ConnectorDAO(EntityManager em) {
		super(em);}
	
}
