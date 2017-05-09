package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.THtml;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class HtmlDAO extends CrudDAOService<THtml> {

public HtmlDAO() {}


@Inject
public HtmlDAO
(EntityManager em) {
		super(em);}
}
