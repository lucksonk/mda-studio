package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TTcf;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class TcfDAO extends CrudDAOService<TTcf> {

	public TcfDAO () {}
	@Inject
public TcfDAO
	(EntityManager em) {
			super(em);}
}
