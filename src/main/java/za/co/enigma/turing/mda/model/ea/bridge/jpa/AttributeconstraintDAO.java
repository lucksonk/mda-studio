package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TAttributeconstraint;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class AttributeconstraintDAO  extends CrudDAOService<TAttributeconstraint> {

	public AttributeconstraintDAO() {}

	@Inject
	public AttributeconstraintDAO(EntityManager em) {
		super(em);
	}
}
