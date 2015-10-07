package com.smartdrive.individual.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.smartdrive.common.domain.AbstractTrackedEntity;
import com.smartdrive.common.domain.Address;
import com.smartdrive.user.domain.UserData;

@Table(name = "INDIVIDUAL")
@Entity
public class Individual extends AbstractTrackedEntity {

	private static final long serialVersionUID = -7363009065882379397L;

	@JoinColumn(name = "USER_ID")
	private UserData userData;

	@JoinColumn(name = "ADDRESS_ID")
	private Address address;

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Individual [userData=");
		builder.append(userData);
		builder.append(", address=");
		builder.append(address);
		builder.append("]");
		return builder.toString();
	}
}
