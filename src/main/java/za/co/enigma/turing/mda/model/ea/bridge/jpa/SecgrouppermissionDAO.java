package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TSecgrouppermission;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class SecgrouppermissionDAO  extends CrudDAOService<TSecgrouppermission>{

public SecgrouppermissionDAO() {}

@Inject
public SecgrouppermissionDAO
(EntityManager em) {
		super(em);}
}
