package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TIssue;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class IssueDAO extends CrudDAOService<TIssue>{
	public IssueDAO() {}
	@Inject
public IssueDAO
	(EntityManager em) {
			super(em);}
}
