package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_connector database table.
 * 
 */
@Entity
@Table(name="t_connector")
@NamedQuery(name="TConnector.findAll", query="SELECT t FROM TConnector t")
public class TConnector implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int connector_ID;

	private String actionFlags;

	private String btm_End_Label;

	private String btm_Mid_Label;

	private String btm_Start_Label;

	private String connector_Type;

	private String destAccess;

	private String destCard;

	private String destChangeable;

	private String destConstraint;

	private String destContainment;

	private String destElement;

	private int destIsAggregate;

	private int destIsNavigable;

	private int destIsOrdered;

	private String destQualifier;

	private String destRole;

	@Lob
	private String destRoleNote;

	private String destRoleType;

	private String destStereotype;

	@Lob
	private String destStyle;

	private String destTS;

	private int diagramID;

	private String direction;

	private String dispatchAction;

	@Column(name="ea_guid")
	private String eaGuid;

	private int end_Edge;

	private int end_Object_ID;

	private String eventFlags;

	private int headStyle;

	private int isBold;

	private int isLeaf;

	private int isRoot;

	private int isSignal;

	private int isSpec;

	private int isStimulus;

	private int lineColor;

	private int lineStyle;

	private String linkAccess;

	private String name;

	@Lob
	private String notes;

	private String pdata1;

	@Lob
	private String pdata2;

	private String pdata3;

	private String pdata4;

	@Lob
	private String pdata5;

	private int ptEndX;

	private int ptEndY;

	private int ptStartX;

	private int ptStartY;

	private int routeStyle;

	private int seqNo;

	private String sourceAccess;

	private String sourceCard;

	private String sourceChangeable;

	private String sourceConstraint;

	private String sourceContainment;

	private String sourceElement;

	private int sourceIsAggregate;

	private int sourceIsNavigable;

	private int sourceIsOrdered;

	private String sourceQualifier;

	private String sourceRole;

	@Lob
	private String sourceRoleNote;

	private String sourceRoleType;

	private String sourceStereotype;

	@Lob
	private String sourceStyle;

	private String sourceTS;

	private int start_Edge;

	private int start_Object_ID;

	@Lob
	private String stateFlags;

	private String stereotype;

	@Lob
	private String styleEx;

	private String subType;

	private int target2;

	private String top_End_Label;

	private String top_Mid_Label;

	private String top_Start_Label;

	private String virtualInheritance;

	public TConnector() {
	}

	public int getConnector_ID() {
		return this.connector_ID;
	}

	public void setConnector_ID(int connector_ID) {
		this.connector_ID = connector_ID;
	}

	public String getActionFlags() {
		return this.actionFlags;
	}

	public void setActionFlags(String actionFlags) {
		this.actionFlags = actionFlags;
	}

	public String getBtm_End_Label() {
		return this.btm_End_Label;
	}

	public void setBtm_End_Label(String btm_End_Label) {
		this.btm_End_Label = btm_End_Label;
	}

	public String getBtm_Mid_Label() {
		return this.btm_Mid_Label;
	}

	public void setBtm_Mid_Label(String btm_Mid_Label) {
		this.btm_Mid_Label = btm_Mid_Label;
	}

	public String getBtm_Start_Label() {
		return this.btm_Start_Label;
	}

	public void setBtm_Start_Label(String btm_Start_Label) {
		this.btm_Start_Label = btm_Start_Label;
	}

	public String getConnector_Type() {
		return this.connector_Type;
	}

	public void setConnector_Type(String connector_Type) {
		this.connector_Type = connector_Type;
	}

	public String getDestAccess() {
		return this.destAccess;
	}

	public void setDestAccess(String destAccess) {
		this.destAccess = destAccess;
	}

	public String getDestCard() {
		return this.destCard;
	}

	public void setDestCard(String destCard) {
		this.destCard = destCard;
	}

	public String getDestChangeable() {
		return this.destChangeable;
	}

	public void setDestChangeable(String destChangeable) {
		this.destChangeable = destChangeable;
	}

	public String getDestConstraint() {
		return this.destConstraint;
	}

	public void setDestConstraint(String destConstraint) {
		this.destConstraint = destConstraint;
	}

	public String getDestContainment() {
		return this.destContainment;
	}

	public void setDestContainment(String destContainment) {
		this.destContainment = destContainment;
	}

	public String getDestElement() {
		return this.destElement;
	}

	public void setDestElement(String destElement) {
		this.destElement = destElement;
	}

	public int getDestIsAggregate() {
		return this.destIsAggregate;
	}

	public void setDestIsAggregate(int destIsAggregate) {
		this.destIsAggregate = destIsAggregate;
	}

	public int getDestIsNavigable() {
		return this.destIsNavigable;
	}

	public void setDestIsNavigable(int destIsNavigable) {
		this.destIsNavigable = destIsNavigable;
	}

	public int getDestIsOrdered() {
		return this.destIsOrdered;
	}

	public void setDestIsOrdered(int destIsOrdered) {
		this.destIsOrdered = destIsOrdered;
	}

	public String getDestQualifier() {
		return this.destQualifier;
	}

	public void setDestQualifier(String destQualifier) {
		this.destQualifier = destQualifier;
	}

	public String getDestRole() {
		return this.destRole;
	}

	public void setDestRole(String destRole) {
		this.destRole = destRole;
	}

	public String getDestRoleNote() {
		return this.destRoleNote;
	}

	public void setDestRoleNote(String destRoleNote) {
		this.destRoleNote = destRoleNote;
	}

	public String getDestRoleType() {
		return this.destRoleType;
	}

	public void setDestRoleType(String destRoleType) {
		this.destRoleType = destRoleType;
	}

	public String getDestStereotype() {
		return this.destStereotype;
	}

	public void setDestStereotype(String destStereotype) {
		this.destStereotype = destStereotype;
	}

	public String getDestStyle() {
		return this.destStyle;
	}

	public void setDestStyle(String destStyle) {
		this.destStyle = destStyle;
	}

	public String getDestTS() {
		return this.destTS;
	}

	public void setDestTS(String destTS) {
		this.destTS = destTS;
	}

	public int getDiagramID() {
		return this.diagramID;
	}

	public void setDiagramID(int diagramID) {
		this.diagramID = diagramID;
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getDispatchAction() {
		return this.dispatchAction;
	}

	public void setDispatchAction(String dispatchAction) {
		this.dispatchAction = dispatchAction;
	}

	public String getEaGuid() {
		return this.eaGuid;
	}

	public void setEaGuid(String eaGuid) {
		this.eaGuid = eaGuid;
	}

	public int getEnd_Edge() {
		return this.end_Edge;
	}

	public void setEnd_Edge(int end_Edge) {
		this.end_Edge = end_Edge;
	}

	public int getEnd_Object_ID() {
		return this.end_Object_ID;
	}

	public void setEnd_Object_ID(int end_Object_ID) {
		this.end_Object_ID = end_Object_ID;
	}

	public String getEventFlags() {
		return this.eventFlags;
	}

	public void setEventFlags(String eventFlags) {
		this.eventFlags = eventFlags;
	}

	public int getHeadStyle() {
		return this.headStyle;
	}

	public void setHeadStyle(int headStyle) {
		this.headStyle = headStyle;
	}

	public int getIsBold() {
		return this.isBold;
	}

	public void setIsBold(int isBold) {
		this.isBold = isBold;
	}

	public int getIsLeaf() {
		return this.isLeaf;
	}

	public void setIsLeaf(int isLeaf) {
		this.isLeaf = isLeaf;
	}

	public int getIsRoot() {
		return this.isRoot;
	}

	public void setIsRoot(int isRoot) {
		this.isRoot = isRoot;
	}

	public int getIsSignal() {
		return this.isSignal;
	}

	public void setIsSignal(int isSignal) {
		this.isSignal = isSignal;
	}

	public int getIsSpec() {
		return this.isSpec;
	}

	public void setIsSpec(int isSpec) {
		this.isSpec = isSpec;
	}

	public int getIsStimulus() {
		return this.isStimulus;
	}

	public void setIsStimulus(int isStimulus) {
		this.isStimulus = isStimulus;
	}

	public int getLineColor() {
		return this.lineColor;
	}

	public void setLineColor(int lineColor) {
		this.lineColor = lineColor;
	}

	public int getLineStyle() {
		return this.lineStyle;
	}

	public void setLineStyle(int lineStyle) {
		this.lineStyle = lineStyle;
	}

	public String getLinkAccess() {
		return this.linkAccess;
	}

	public void setLinkAccess(String linkAccess) {
		this.linkAccess = linkAccess;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public String getPdata5() {
		return this.pdata5;
	}

	public void setPdata5(String pdata5) {
		this.pdata5 = pdata5;
	}

	public int getPtEndX() {
		return this.ptEndX;
	}

	public void setPtEndX(int ptEndX) {
		this.ptEndX = ptEndX;
	}

	public int getPtEndY() {
		return this.ptEndY;
	}

	public void setPtEndY(int ptEndY) {
		this.ptEndY = ptEndY;
	}

	public int getPtStartX() {
		return this.ptStartX;
	}

	public void setPtStartX(int ptStartX) {
		this.ptStartX = ptStartX;
	}

	public int getPtStartY() {
		return this.ptStartY;
	}

	public void setPtStartY(int ptStartY) {
		this.ptStartY = ptStartY;
	}

	public int getRouteStyle() {
		return this.routeStyle;
	}

	public void setRouteStyle(int routeStyle) {
		this.routeStyle = routeStyle;
	}

	public int getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public String getSourceAccess() {
		return this.sourceAccess;
	}

	public void setSourceAccess(String sourceAccess) {
		this.sourceAccess = sourceAccess;
	}

	public String getSourceCard() {
		return this.sourceCard;
	}

	public void setSourceCard(String sourceCard) {
		this.sourceCard = sourceCard;
	}

	public String getSourceChangeable() {
		return this.sourceChangeable;
	}

	public void setSourceChangeable(String sourceChangeable) {
		this.sourceChangeable = sourceChangeable;
	}

	public String getSourceConstraint() {
		return this.sourceConstraint;
	}

	public void setSourceConstraint(String sourceConstraint) {
		this.sourceConstraint = sourceConstraint;
	}

	public String getSourceContainment() {
		return this.sourceContainment;
	}

	public void setSourceContainment(String sourceContainment) {
		this.sourceContainment = sourceContainment;
	}

	public String getSourceElement() {
		return this.sourceElement;
	}

	public void setSourceElement(String sourceElement) {
		this.sourceElement = sourceElement;
	}

	public int getSourceIsAggregate() {
		return this.sourceIsAggregate;
	}

	public void setSourceIsAggregate(int sourceIsAggregate) {
		this.sourceIsAggregate = sourceIsAggregate;
	}

	public int getSourceIsNavigable() {
		return this.sourceIsNavigable;
	}

	public void setSourceIsNavigable(int sourceIsNavigable) {
		this.sourceIsNavigable = sourceIsNavigable;
	}

	public int getSourceIsOrdered() {
		return this.sourceIsOrdered;
	}

	public void setSourceIsOrdered(int sourceIsOrdered) {
		this.sourceIsOrdered = sourceIsOrdered;
	}

	public String getSourceQualifier() {
		return this.sourceQualifier;
	}

	public void setSourceQualifier(String sourceQualifier) {
		this.sourceQualifier = sourceQualifier;
	}

	public String getSourceRole() {
		return this.sourceRole;
	}

	public void setSourceRole(String sourceRole) {
		this.sourceRole = sourceRole;
	}

	public String getSourceRoleNote() {
		return this.sourceRoleNote;
	}

	public void setSourceRoleNote(String sourceRoleNote) {
		this.sourceRoleNote = sourceRoleNote;
	}

	public String getSourceRoleType() {
		return this.sourceRoleType;
	}

	public void setSourceRoleType(String sourceRoleType) {
		this.sourceRoleType = sourceRoleType;
	}

	public String getSourceStereotype() {
		return this.sourceStereotype;
	}

	public void setSourceStereotype(String sourceStereotype) {
		this.sourceStereotype = sourceStereotype;
	}

	public String getSourceStyle() {
		return this.sourceStyle;
	}

	public void setSourceStyle(String sourceStyle) {
		this.sourceStyle = sourceStyle;
	}

	public String getSourceTS() {
		return this.sourceTS;
	}

	public void setSourceTS(String sourceTS) {
		this.sourceTS = sourceTS;
	}

	public int getStart_Edge() {
		return this.start_Edge;
	}

	public void setStart_Edge(int start_Edge) {
		this.start_Edge = start_Edge;
	}

	public int getStart_Object_ID() {
		return this.start_Object_ID;
	}

	public void setStart_Object_ID(int start_Object_ID) {
		this.start_Object_ID = start_Object_ID;
	}

	public String getStateFlags() {
		return this.stateFlags;
	}

	public void setStateFlags(String stateFlags) {
		this.stateFlags = stateFlags;
	}

	public String getStereotype() {
		return this.stereotype;
	}

	public void setStereotype(String stereotype) {
		this.stereotype = stereotype;
	}

	public String getStyleEx() {
		return this.styleEx;
	}

	public void setStyleEx(String styleEx) {
		this.styleEx = styleEx;
	}

	public String getSubType() {
		return this.subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public int getTarget2() {
		return this.target2;
	}

	public void setTarget2(int target2) {
		this.target2 = target2;
	}

	public String getTop_End_Label() {
		return this.top_End_Label;
	}

	public void setTop_End_Label(String top_End_Label) {
		this.top_End_Label = top_End_Label;
	}

	public String getTop_Mid_Label() {
		return this.top_Mid_Label;
	}

	public void setTop_Mid_Label(String top_Mid_Label) {
		this.top_Mid_Label = top_Mid_Label;
	}

	public String getTop_Start_Label() {
		return this.top_Start_Label;
	}

	public void setTop_Start_Label(String top_Start_Label) {
		this.top_Start_Label = top_Start_Label;
	}

	public String getVirtualInheritance() {
		return this.virtualInheritance;
	}

	public void setVirtualInheritance(String virtualInheritance) {
		this.virtualInheritance = virtualInheritance;
	}

}