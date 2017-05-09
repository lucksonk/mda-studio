package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TPaletteitem;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class PaletteitemDAO extends CrudDAOService<TPaletteitem> {

public PaletteitemDAO() {}
@Inject
public PaletteitemDAO
(EntityManager em) {
		super(em);}
}
