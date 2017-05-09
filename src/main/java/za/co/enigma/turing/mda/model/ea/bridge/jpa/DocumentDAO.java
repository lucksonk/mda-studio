package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TDocument;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class DocumentDAO  extends CrudDAOService<TDocument>{

	public DocumentDAO() {}


	@Inject
	public DocumentDAO(EntityManager em) {
		super(em);}
}
