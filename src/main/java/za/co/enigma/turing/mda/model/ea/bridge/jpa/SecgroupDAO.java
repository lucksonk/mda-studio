package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TSecgroup;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class SecgroupDAO extends CrudDAOService<TSecgroup> {

	public SecgroupDAO() {}

@Inject
public SecgroupDAO
(EntityManager em) {
		super(em);}
}
