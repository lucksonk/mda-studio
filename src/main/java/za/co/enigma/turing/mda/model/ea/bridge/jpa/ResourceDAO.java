package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TResource;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ResourceDAO extends CrudDAOService<TResource> {

public ResourceDAO() {}
@Inject
public ResourceDAO
(EntityManager em) {
		super(em);}
}
