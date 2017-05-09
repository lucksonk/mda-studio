package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TTask;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class TaskDAO extends CrudDAOService<TTask>{

public TaskDAO() {}
@Inject
public TaskDAO
(EntityManager em) {
		super(em);}
}
