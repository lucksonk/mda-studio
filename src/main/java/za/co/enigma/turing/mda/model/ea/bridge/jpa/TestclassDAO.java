package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TTestclass;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class TestclassDAO extends CrudDAOService<TTestclass> {

public TestclassDAO() {}
@Inject
public TestclassDAO
(EntityManager em) {
		super(em);}
}
