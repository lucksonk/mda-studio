package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TObjectmetric;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ObjectmetricDAO extends CrudDAOService<TObjectmetric> {

	public ObjectmetricDAO(){}

@Inject
public ObjectmetricDAO
(EntityManager em) {
		super(em);}
}
