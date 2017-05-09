package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TConnectortag;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ConnectortagDAO extends CrudDAOService<TConnectortag>{


	public ConnectortagDAO(){}

	@Inject
	public ConnectortagDAO(EntityManager em) {
		super(em);}
}
