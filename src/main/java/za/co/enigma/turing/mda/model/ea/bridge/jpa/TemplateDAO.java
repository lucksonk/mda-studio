package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TTemplate;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class TemplateDAO extends CrudDAOService<TTemplate>{

public TemplateDAO() {}
@Inject
public TemplateDAO
(EntityManager em) {
		super(em);}
}
