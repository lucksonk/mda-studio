package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TTaggedvalue;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class TaggedvalueDAO  extends CrudDAOService<TTaggedvalue>{

	public TaggedvalueDAO() {}

@Inject
public TaggedvalueDAO
(EntityManager em) {
		super(em);}
}
