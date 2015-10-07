package com.smartdrive.user.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.smartdrive.common.domain.AbstractTrackedEntity;

@Table(name = "USER_PROFILE_ROLE")
@Entity
public class UserProfileRole extends AbstractTrackedEntity {

	private static final long serialVersionUID = -8854877856317671685L;

	@JoinColumn(name = "USER_PROFILE_ID")
	private UserProfile userProfile;

	@Column(name = "ROLE_NAME")
	private String roleName;

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserProfileRole [userProfile=");
		builder.append(userProfile);
		builder.append(", roleName=");
		builder.append(roleName);
		builder.append("]");
		return builder.toString();
	}
}
