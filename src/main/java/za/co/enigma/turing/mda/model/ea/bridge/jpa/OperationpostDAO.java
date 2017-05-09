package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TOperationpost;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class OperationpostDAO  extends CrudDAOService<TOperationpost>{

	public OperationpostDAO() {}

@Inject
public OperationpostDAO
(EntityManager em) {
		super(em);}
}
