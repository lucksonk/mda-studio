package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TSecpermission;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class SecpermissionDAO extends CrudDAOService<TSecpermission>{

	public SecpermissionDAO() {}

@Inject
public SecpermissionDAO
(EntityManager em) {
		super(em);}
}
