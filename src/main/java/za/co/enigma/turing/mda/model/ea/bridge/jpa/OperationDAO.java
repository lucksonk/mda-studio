package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TOperation;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class OperationDAO extends CrudDAOService<TOperation>{

public OperationDAO(){}
@Inject
public OperationDAO
(EntityManager em) {
		super(em);}
}
