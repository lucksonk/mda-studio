package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TFile;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class FileDAO extends CrudDAOService<TFile>{

	public FileDAO() {}

	@Inject
	public FileDAO(EntityManager em) {
		super(em);}
}
