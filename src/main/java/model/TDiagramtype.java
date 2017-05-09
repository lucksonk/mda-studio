package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_diagramtypes database table.
 * 
 */
@Entity
@Table(name="t_diagramtypes")
@NamedQuery(name="TDiagramtype.findAll", query="SELECT t FROM TDiagramtype t")
public class TDiagramtype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String diagram_Type;

	private String name;

	private int package_ID;

	public TDiagramtype() {
	}

	public String getDiagram_Type() {
		return this.diagram_Type;
	}

	public void setDiagram_Type(String diagram_Type) {
		this.diagram_Type = diagram_Type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPackage_ID() {
		return this.package_ID;
	}

	public void setPackage_ID(int package_ID) {
		this.package_ID = package_ID;
	}

}