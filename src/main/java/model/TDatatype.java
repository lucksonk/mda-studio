package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_datatypes database table.
 * 
 */
@Entity
@Table(name="t_datatypes")
@NamedQuery(name="TDatatype.findAll", query="SELECT t FROM TDatatype t")
public class TDatatype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int datatypeID;

	private String dataType;

	private int defaultLen;

	private int defaultPrec;

	private int defaultScale;

	private String genericType;

	private String hasLength;

	private int maxLen;

	private int maxPrec;

	private int maxScale;

	private String pdata1;

	private String pdata2;

	private String pdata3;

	private String pdata4;

	private String productName;

	private int size;

	private String type;

	private int user;

	public TDatatype() {
	}

	public int getDatatypeID() {
		return this.datatypeID;
	}

	public void setDatatypeID(int datatypeID) {
		this.datatypeID = datatypeID;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public int getDefaultLen() {
		return this.defaultLen;
	}

	public void setDefaultLen(int defaultLen) {
		this.defaultLen = defaultLen;
	}

	public int getDefaultPrec() {
		return this.defaultPrec;
	}

	public void setDefaultPrec(int defaultPrec) {
		this.defaultPrec = defaultPrec;
	}

	public int getDefaultScale() {
		return this.defaultScale;
	}

	public void setDefaultScale(int defaultScale) {
		this.defaultScale = defaultScale;
	}

	public String getGenericType() {
		return this.genericType;
	}

	public void setGenericType(String genericType) {
		this.genericType = genericType;
	}

	public String getHasLength() {
		return this.hasLength;
	}

	public void setHasLength(String hasLength) {
		this.hasLength = hasLength;
	}

	public int getMaxLen() {
		return this.maxLen;
	}

	public void setMaxLen(int maxLen) {
		this.maxLen = maxLen;
	}

	public int getMaxPrec() {
		return this.maxPrec;
	}

	public void setMaxPrec(int maxPrec) {
		this.maxPrec = maxPrec;
	}

	public int getMaxScale() {
		return this.maxScale;
	}

	public void setMaxScale(int maxScale) {
		this.maxScale = maxScale;
	}

	public String getPdata1() {
		return this.pdata1;
	}

	public void setPdata1(String pdata1) {
		this.pdata1 = pdata1;
	}

	public String getPdata2() {
		return this.pdata2;
	}

	public void setPdata2(String pdata2) {
		this.pdata2 = pdata2;
	}

	public String getPdata3() {
		return this.pdata3;
	}

	public void setPdata3(String pdata3) {
		this.pdata3 = pdata3;
	}

	public String getPdata4() {
		return this.pdata4;
	}

	public void setPdata4(String pdata4) {
		this.pdata4 = pdata4;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUser() {
		return this.user;
	}

	public void setUser(int user) {
		this.user = user;
	}

}