package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TMainttype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class MainttypeDAO extends CrudDAOService<TMainttype> {


	public MainttypeDAO() {}
@Inject
public MainttypeDAO
(EntityManager em) {
		super(em);}
}
