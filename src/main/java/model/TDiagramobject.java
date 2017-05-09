package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_diagramobjects database table.
 * 
 */
@Entity
@Table(name="t_diagramobjects")
@NamedQuery(name="TDiagramobject.findAll", query="SELECT t FROM TDiagramobject t")
public class TDiagramobject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int instance_ID;

	private int diagram_ID;

	private int object_ID;

	private String objectStyle;

	private int rectBottom;

	private int rectLeft;

	private int rectRight;

	private int rectTop;

	private int sequence;

	public TDiagramobject() {
	}

	public int getInstance_ID() {
		return this.instance_ID;
	}

	public void setInstance_ID(int instance_ID) {
		this.instance_ID = instance_ID;
	}

	public int getDiagram_ID() {
		return this.diagram_ID;
	}

	public void setDiagram_ID(int diagram_ID) {
		this.diagram_ID = diagram_ID;
	}

	public int getObject_ID() {
		return this.object_ID;
	}

	public void setObject_ID(int object_ID) {
		this.object_ID = object_ID;
	}

	public String getObjectStyle() {
		return this.objectStyle;
	}

	public void setObjectStyle(String objectStyle) {
		this.objectStyle = objectStyle;
	}

	public int getRectBottom() {
		return this.rectBottom;
	}

	public void setRectBottom(int rectBottom) {
		this.rectBottom = rectBottom;
	}

	public int getRectLeft() {
		return this.rectLeft;
	}

	public void setRectLeft(int rectLeft) {
		this.rectLeft = rectLeft;
	}

	public int getRectRight() {
		return this.rectRight;
	}

	public void setRectRight(int rectRight) {
		this.rectRight = rectRight;
	}

	public int getRectTop() {
		return this.rectTop;
	}

	public void setRectTop(int rectTop) {
		this.rectTop = rectTop;
	}

	public int getSequence() {
		return this.sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

}