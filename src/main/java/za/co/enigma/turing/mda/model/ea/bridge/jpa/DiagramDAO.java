package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TDiagram;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class DiagramDAO extends CrudDAOService<TDiagram> {

	public DiagramDAO(){}

	@Inject
	public DiagramDAO(EntityManager em) {
		super(em);
	}
}
