package com.smartdrive.common.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "LOCATION")
@Entity
public class Location extends AbstractTrackedEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7794023097321949083L;

	@Column(name = "CITY")
	private String city;
	
	@Column(name = "STATE_CODE")
	private String stateCode;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Location [city=");
		builder.append(city);
		builder.append(", stateCode=");
		builder.append(stateCode);
		builder.append("]");
		return builder.toString();
	}
}
