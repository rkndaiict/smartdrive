package com.smartdrive.common.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "ADDRESS")
@Entity
public class Address extends AbstractTrackedEntity {

	private static final long serialVersionUID = -5665225002041673470L;

	@Column(name = "CITY")
	private String city;

	@Column(name = "STATE_CODE")
	private String stateCode;

	@Column(name = "ZIP_CODE")
	private String zipCode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [city=");
		builder.append(city);
		builder.append(", stateCode=");
		builder.append(stateCode);
		builder.append(", zipCode=");
		builder.append(zipCode);
		builder.append("]");
		return builder.toString();
	}
}
