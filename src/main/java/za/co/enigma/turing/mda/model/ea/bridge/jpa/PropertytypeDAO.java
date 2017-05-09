package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TPropertytype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class PropertytypeDAO extends CrudDAOService<TPropertytype>{

	public PropertytypeDAO() {}
	@Inject
	public PropertytypeDAO

	(EntityManager em) {
			super(em);}
}
