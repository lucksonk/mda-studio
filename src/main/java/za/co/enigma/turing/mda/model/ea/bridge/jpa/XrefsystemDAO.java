package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TXrefsystem;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class XrefsystemDAO extends CrudDAOService<TXrefsystem> { 

	public XrefsystemDAO(){}

@Inject
public XrefsystemDAO
(EntityManager em) {
		super(em);}
}
