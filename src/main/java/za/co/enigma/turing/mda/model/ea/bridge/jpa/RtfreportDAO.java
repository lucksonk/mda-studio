package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TRtfreport;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class RtfreportDAO extends CrudDAOService<TRtfreport>{

	public RtfreportDAO() {}
	@Inject
public RtfreportDAO
	(EntityManager em) {
			super(em);}
}
