package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TSecuserpermission;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class SecuserpermissionDAO  extends CrudDAOService<TSecuserpermission>{

	public SecuserpermissionDAO() {}

@Inject
public SecuserpermissionDAO
(EntityManager em) {
		super(em);}
}
