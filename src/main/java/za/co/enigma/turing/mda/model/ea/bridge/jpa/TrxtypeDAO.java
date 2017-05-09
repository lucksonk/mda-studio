package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TTrxtype;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class TrxtypeDAO  extends CrudDAOService<TTrxtype>{

public TrxtypeDAO() {}
@Inject
public TrxtypeDAO
(EntityManager em) {
		super(em);}
}
