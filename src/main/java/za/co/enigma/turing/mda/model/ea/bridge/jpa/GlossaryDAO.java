package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TGlossary;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class GlossaryDAO extends CrudDAOService<TGlossary> {

public GlossaryDAO() {}

@Inject
public GlossaryDAO
(EntityManager em) {
		super(em);}
}
