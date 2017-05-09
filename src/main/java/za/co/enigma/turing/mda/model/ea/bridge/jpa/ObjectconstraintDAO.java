package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TObjectconstraint;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ObjectconstraintDAO extends CrudDAOService<TObjectconstraint>{

public ObjectconstraintDAO() {}
@Inject
public ObjectconstraintDAO
(EntityManager em) {
		super(em);}
}
