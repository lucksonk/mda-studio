package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TPhase;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class PhaseDAO extends CrudDAOService<TPhase> {

	public PhaseDAO() {}

@Inject
public PhaseDAO
(EntityManager em) {
		super(em);}
}
