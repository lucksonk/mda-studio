package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_diagramlinks database table.
 * 
 */
@Entity
@Table(name="t_diagramlinks")
@NamedQuery(name="TDiagramlink.findAll", query="SELECT t FROM TDiagramlink t")
public class TDiagramlink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int instance_ID;

	private int connectorID;

	private int diagramID;

	@Lob
	private String geometry;

	private int hidden;

	private String path;

	private String style;

	public TDiagramlink() {
	}

	public int getInstance_ID() {
		return this.instance_ID;
	}

	public void setInstance_ID(int instance_ID) {
		this.instance_ID = instance_ID;
	}

	public int getConnectorID() {
		return this.connectorID;
	}

	public void setConnectorID(int connectorID) {
		this.connectorID = connectorID;
	}

	public int getDiagramID() {
		return this.diagramID;
	}

	public void setDiagramID(int diagramID) {
		this.diagramID = diagramID;
	}

	public String getGeometry() {
		return this.geometry;
	}

	public void setGeometry(String geometry) {
		this.geometry = geometry;
	}

	public int getHidden() {
		return this.hidden;
	}

	public void setHidden(int hidden) {
		this.hidden = hidden;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getStyle() {
		return this.style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

}