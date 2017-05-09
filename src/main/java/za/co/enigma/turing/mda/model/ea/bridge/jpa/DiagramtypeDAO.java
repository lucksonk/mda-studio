package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TDiagramtype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class DiagramtypeDAO extends CrudDAOService<TDiagramtype>{

	public DiagramtypeDAO() {}

	@Inject
	public DiagramtypeDAO(EntityManager em) {
		super(em);
	}
}
