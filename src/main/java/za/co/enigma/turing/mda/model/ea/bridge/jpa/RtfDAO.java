package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TRtf;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class RtfDAO  extends CrudDAOService<TRtf>{

	public RtfDAO(){}
	@Inject
public RtfDAO
	(EntityManager em) {
			super(em);}
}
