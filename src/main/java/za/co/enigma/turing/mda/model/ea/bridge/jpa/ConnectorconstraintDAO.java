package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TConnectorconstraint;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ConnectorconstraintDAO extends CrudDAOService<TConnectorconstraint> {

	public ConnectorconstraintDAO() {}

	@Inject
	public ConnectorconstraintDAO(EntityManager em) {
		super(em);}
}

