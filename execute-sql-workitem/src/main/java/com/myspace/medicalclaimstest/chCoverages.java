package com.myspace.medicalclaimstest;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Coverage Holder Products")
public class chCoverages implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Products")
	private java.lang.String coverageProduct;

	@org.kie.api.definition.type.Label("Coverage Status")
	private java.lang.String coverageStatus;

	@org.kie.api.definition.type.Label(value = "Coverage Effective Date")
	private java.util.Date covEffectiveDate;

	public chCoverages() {
	}

	public java.lang.String getCoverageProduct() {
		return this.coverageProduct;
	}

	public void setCoverageProduct(java.lang.String coverageProduct) {
		this.coverageProduct = coverageProduct;
	}

	public java.lang.String getCoverageStatus() {
		return this.coverageStatus;
	}

	public void setCoverageStatus(java.lang.String coverageStatus) {
		this.coverageStatus = coverageStatus;
	}

	public java.util.Date getCovEffectiveDate() {
		return this.covEffectiveDate;
	}

	public void setCovEffectiveDate(java.util.Date covEffectiveDate) {
		this.covEffectiveDate = covEffectiveDate;
	}

	public chCoverages(java.lang.String coverageProduct,
			java.lang.String coverageStatus, java.util.Date covEffectiveDate) {
		this.coverageProduct = coverageProduct;
		this.coverageStatus = coverageStatus;
		this.covEffectiveDate = covEffectiveDate;
	}

	@Override
	public String toString() {
		return "chCoverages [coverageProduct=" + coverageProduct + ", coverageStatus=" + coverageStatus
				+ ", covEffectiveDate=" + covEffectiveDate + "]";
	}

}