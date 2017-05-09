package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TMethod;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class MethodDAO  extends CrudDAOService<TMethod> {

	public MethodDAO() {}
	

@Inject
public MethodDAO
(EntityManager em) {
		super(em);}
}
