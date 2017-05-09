package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TDiagramobject;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class DiagramobjectDAO extends CrudDAOService<TDiagramobject> {

	public DiagramobjectDAO() {}
	
	@Inject
	public DiagramobjectDAO(EntityManager em) {
		super(em);
	}
}
