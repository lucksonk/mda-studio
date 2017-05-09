package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TScript;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ScriptDAO extends CrudDAOService<TScript> {

public ScriptDAO() {}
@Inject
public ScriptDAO
(EntityManager em) {
		super(em);}
}
