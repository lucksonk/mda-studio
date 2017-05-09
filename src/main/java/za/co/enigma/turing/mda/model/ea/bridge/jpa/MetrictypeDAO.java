package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TMetrictype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class MetrictypeDAO extends CrudDAOService<TMetrictype> {

	public MetrictypeDAO() {}
	
	@Inject
	public MetrictypeDAO
	(EntityManager em) {
			super(em);}
}
