package com.smartdrive.user.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.smartdrive.common.domain.AbstractTrackedEntity;

@Table(name = "USER_PASSWORD")
@Entity
public class UserPassword extends AbstractTrackedEntity {

	private static final long serialVersionUID = 8757337808802643921L;

	@JoinColumn(name = "USER_ID")
	private UserData userData;

	@Column(name = "PASSWORD")
	private String password;

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserPassword [userData=");
		builder.append(userData);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}
}
