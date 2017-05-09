package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TPackage;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class PackageDAO extends CrudDAOService<TPackage> {

	public PackageDAO() {}

@Inject
public PackageDAO
(EntityManager em) {
		super(em);}
}
