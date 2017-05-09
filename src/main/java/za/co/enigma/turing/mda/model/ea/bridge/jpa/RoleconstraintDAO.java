package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TRoleconstraint;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class RoleconstraintDAO extends CrudDAOService<TRoleconstraint> {

	public RoleconstraintDAO() {}

@Inject
public RoleconstraintDAO
(EntityManager em) {
		super(em);}
}
