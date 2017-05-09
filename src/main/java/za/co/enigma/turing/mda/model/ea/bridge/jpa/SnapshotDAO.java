package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TSnapshot;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class SnapshotDAO extends CrudDAOService<TSnapshot> {

	
public SnapshotDAO() {}
@Inject
public SnapshotDAO
(EntityManager em) {
		super(em);}
}
