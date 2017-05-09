package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TConstant;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ConstantDAO extends CrudDAOService<TConstant>{

	public ConstantDAO(){}
	
	@Inject
	public ConstantDAO(EntityManager em) {
		super(em);}
}
