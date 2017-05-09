package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.Usystable;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class UsystableDAO extends CrudDAOService<Usystable> {

public UsystableDAO() {}
@Inject
public UsystableDAO
(EntityManager em) {
		super(em);}
}
