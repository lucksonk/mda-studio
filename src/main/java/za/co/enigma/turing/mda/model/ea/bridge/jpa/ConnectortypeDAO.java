package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TConnectortype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ConnectortypeDAO extends CrudDAOService<TConnectortype>{

	
	public ConnectortypeDAO(){}
	
	@Inject
	public ConnectortypeDAO (EntityManager em) {
		super(em);}
}
