package za.co.enigma.turing.mda.model.ea.bridge.jpa;


import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TOperationpre;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class OperationpreDAO extends CrudDAOService<TOperationpre>{

	public OperationpreDAO() {}

@Inject
public OperationpreDAO
(EntityManager em) {
		super(em);}
}
