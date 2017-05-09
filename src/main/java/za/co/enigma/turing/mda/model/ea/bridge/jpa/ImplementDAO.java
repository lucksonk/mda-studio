package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TImplement;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ImplementDAO  extends CrudDAOService<TImplement> {

	public ImplementDAO() {}

@Inject
public ImplementDAO
(EntityManager em) {
		super(em);}
}
