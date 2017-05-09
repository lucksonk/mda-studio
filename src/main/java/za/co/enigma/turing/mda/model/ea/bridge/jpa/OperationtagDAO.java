package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TOperationtag;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class OperationtagDAO extends CrudDAOService<TOperationtag> {

	public OperationtagDAO(){}
	@Inject
public OperationtagDAO
	(EntityManager em) {
			super(em);}
}
