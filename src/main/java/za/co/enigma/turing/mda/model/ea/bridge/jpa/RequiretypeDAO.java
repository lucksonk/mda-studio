package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TRequiretype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class RequiretypeDAO  extends CrudDAOService<TRequiretype>{

	public RequiretypeDAO() {}
	@Inject
	public RequiretypeDAO
	(EntityManager em) {
			super(em);}
}
