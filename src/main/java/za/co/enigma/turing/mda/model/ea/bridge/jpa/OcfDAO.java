package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TOcf;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class OcfDAO extends CrudDAOService<TOcf> {


	public OcfDAO() {}
@Inject
public OcfDAO
(EntityManager em) {
		super(em);}
}
