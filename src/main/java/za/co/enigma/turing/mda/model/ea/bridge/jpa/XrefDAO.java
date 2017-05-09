package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TXref;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class XrefDAO extends CrudDAOService<TXref> {

	public XrefDAO() {}
	@Inject
	public XrefDAO
	(EntityManager em) {
			super(em);}
}
