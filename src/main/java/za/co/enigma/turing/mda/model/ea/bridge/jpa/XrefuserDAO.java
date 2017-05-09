package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TXrefuser;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class XrefuserDAO extends CrudDAOService<TXrefuser> {

	public XrefuserDAO() {}
	
	@Inject
	public XrefuserDAO
	(EntityManager em) {
			super(em);}
}
