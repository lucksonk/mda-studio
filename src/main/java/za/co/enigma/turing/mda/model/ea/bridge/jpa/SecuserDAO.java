package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TSecuser;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class SecuserDAO  extends CrudDAOService<TSecuser>{

	public SecuserDAO() {}

@Inject
public SecuserDAO
(EntityManager em) {
		super(em);}
}
