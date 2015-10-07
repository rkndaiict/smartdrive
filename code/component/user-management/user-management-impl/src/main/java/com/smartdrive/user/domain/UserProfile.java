package com.smartdrive.user.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.smartdrive.common.domain.AbstractTrackedEntity;

@Table(name = "USER_PROFILE")
@Entity
public class UserProfile extends AbstractTrackedEntity {

	private static final long serialVersionUID = -7243446087173410191L;

	@JoinColumn(name = "USER_ID")
	private UserData userData;

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserProfile [userData=");
		builder.append(userData);
		builder.append("]");
		return builder.toString();
	}
}
