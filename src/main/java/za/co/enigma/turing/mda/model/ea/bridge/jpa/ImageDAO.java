package za.co.enigma.turing.mda.model.ea.bridge.jpa;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.TImage;
import za.co.enigma.turing.mda.jpa.crud.CrudDAOService;

@Stateless
public class ImageDAO  extends CrudDAOService<TImage> {

public ImageDAO(){}
@Inject
public ImageDAO
(EntityManager em) {
		super(em);}
}
