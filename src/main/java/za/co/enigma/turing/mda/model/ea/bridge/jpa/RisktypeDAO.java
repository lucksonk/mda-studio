package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TRisktype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class RisktypeDAO extends CrudDAOService<TRisktype>{

	public RisktypeDAO() {}
	@Inject
public RisktypeDAO
	(EntityManager em) {
			super(em);}
}
