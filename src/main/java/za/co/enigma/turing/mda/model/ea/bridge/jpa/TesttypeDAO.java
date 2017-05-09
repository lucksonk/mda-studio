package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TTesttype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class TesttypeDAO  extends CrudDAOService<TTesttype>{

public TesttypeDAO() {}
@Inject
public TesttypeDAO
(EntityManager em) {
		super(em);}
}
