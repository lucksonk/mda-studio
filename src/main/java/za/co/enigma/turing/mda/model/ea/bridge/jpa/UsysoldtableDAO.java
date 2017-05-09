package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.Usysoldtable;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class UsysoldtableDAO extends CrudDAOService<Usysoldtable> {

	public UsysoldtableDAO() {}

@Inject
public UsysoldtableDAO
(EntityManager em) {
		super(em);}
}
