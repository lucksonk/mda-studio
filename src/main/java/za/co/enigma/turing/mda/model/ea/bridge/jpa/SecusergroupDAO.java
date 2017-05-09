package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TSecusergroup;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class SecusergroupDAO extends CrudDAOService<TSecusergroup> {

public SecusergroupDAO() {}
@Inject
public SecusergroupDAO
(EntityManager em) {
		super(em);}
}
