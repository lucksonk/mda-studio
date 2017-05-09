package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TUmlpattern;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class UmlpatternDAO  extends CrudDAOService<TUmlpattern>{

	
public UmlpatternDAO() {}
@Inject
public UmlpatternDAO
(EntityManager em) {
		super(em);}
}
