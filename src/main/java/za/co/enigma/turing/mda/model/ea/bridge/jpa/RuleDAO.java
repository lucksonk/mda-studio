package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TRule;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class RuleDAO  extends CrudDAOService<TRule>{

	public RuleDAO() {}

@Inject
public RuleDAO
(EntityManager em) {
		super(em);}
}
