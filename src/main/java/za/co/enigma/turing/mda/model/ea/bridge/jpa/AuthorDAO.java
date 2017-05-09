package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TAuthor;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class AuthorDAO extends CrudDAOService<TAuthor> {

	public AuthorDAO() {}

	@Inject
	public AuthorDAO(EntityManager em) {
		super(em);}
}
