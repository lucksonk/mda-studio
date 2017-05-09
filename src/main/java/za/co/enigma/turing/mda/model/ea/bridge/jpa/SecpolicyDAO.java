package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TSecpolicy;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class SecpolicyDAO extends CrudDAOService<TSecpolicy> {

	public SecpolicyDAO() {}

@Inject
public SecpolicyDAO
(EntityManager em) {
		super(em);}
}
