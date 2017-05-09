package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TEcf;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class EcfDAO  extends CrudDAOService<TEcf> {

	public EcfDAO() {}

	@Inject
	public EcfDAO(EntityManager em) {
		super(em);
	}
}
