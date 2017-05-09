package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TOperationparam;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class OperationparamDAO extends CrudDAOService<TOperationparam> {

	public OperationparamDAO() {}
	@Inject
public OperationparamDAO
	(EntityManager em) {
			super(em);}
}
