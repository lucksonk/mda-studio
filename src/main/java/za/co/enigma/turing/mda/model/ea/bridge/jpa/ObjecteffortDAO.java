package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TObjecteffort;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ObjecteffortDAO extends CrudDAOService<TObjecteffort> {

	public ObjecteffortDAO() {}

@Inject
public ObjecteffortDAO
(EntityManager em) {
		super(em);}
}
