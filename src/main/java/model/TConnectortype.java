package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_connectortypes database table.
 * 
 */
@Entity
@Table(name="t_connectortypes")
@NamedQuery(name="TConnectortype.findAll", query="SELECT t FROM TConnectortype t")
public class TConnectortype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String connector_Type;

	private String description;

	public TConnectortype() {
	}

	public String getConnector_Type() {
		return this.connector_Type;
	}

	public void setConnector_Type(String connector_Type) {
		this.connector_Type = connector_Type;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}