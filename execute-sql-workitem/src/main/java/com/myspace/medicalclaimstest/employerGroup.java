package com.myspace.medicalclaimstest;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Employer Group")
public class employerGroup implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Group Number")
	private java.lang.String groupNumber;
	@org.kie.api.definition.type.Label("Group Name")
	private java.lang.String groupName;
	@org.kie.api.definition.type.Label("Group Status")
	@org.kie.api.definition.type.Description("The current status of our relationship with the group (Active, Inactive, etc.)")
	private java.lang.String groupStatus;

	public employerGroup() {
	}

	public java.lang.String getGroupNumber() {
		return this.groupNumber;
	}

	public void setGroupNumber(java.lang.String groupNumber) {
		this.groupNumber = groupNumber;
	}

	public java.lang.String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(java.lang.String groupName) {
		this.groupName = groupName;
	}

	public java.lang.String getGroupStatus() {
		return this.groupStatus;
	}

	public void setGroupStatus(java.lang.String groupStatus) {
		this.groupStatus = groupStatus;
	}

	public employerGroup(java.lang.String groupNumber,
			java.lang.String groupName, java.lang.String groupStatus) {
		this.groupNumber = groupNumber;
		this.groupName = groupName;
		this.groupStatus = groupStatus;
	}

}