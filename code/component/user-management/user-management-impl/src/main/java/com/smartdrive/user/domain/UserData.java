package com.smartdrive.user.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.smartdrive.common.domain.AbstractTrackedEntity;

@Table(name = "USER_DATA")
@Entity
public class UserData extends AbstractTrackedEntity {

	private static final long serialVersionUID = -6263609494039936260L;

	@Column(name = "USER_IDENTIFIER")
	private String userIdentifier;

	@Column(name = "INVALID_LOGIN_ATTEMPT")
	private int invalidLoginAttempt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_LOGIN_ATTEMPT_TIME")
	private Date lastLoginAttemptTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_LOGIN_TIME")
	private Date lastLoginTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_PASSWORD_CHANGE_TIME")
	private Date lastPasswordChangeTime;

	public String getUserIdentifier() {
		return userIdentifier;
	}

	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}

	public int getInvalidLoginAttempt() {
		return invalidLoginAttempt;
	}

	public void setInvalidLoginAttempt(int invalidLoginAttempt) {
		this.invalidLoginAttempt = invalidLoginAttempt;
	}

	public Date getLastLoginAttemptTime() {
		return lastLoginAttemptTime;
	}

	public void setLastLoginAttemptTime(Date lastLoginAttemptTime) {
		this.lastLoginAttemptTime = lastLoginAttemptTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastPasswordChangeTime() {
		return lastPasswordChangeTime;
	}

	public void setLastPasswordChangeTime(Date lastPasswordChangeTime) {
		this.lastPasswordChangeTime = lastPasswordChangeTime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserData [userIdentifier=");
		builder.append(userIdentifier);
		builder.append(", invalidLoginAttempt=");
		builder.append(invalidLoginAttempt);
		builder.append(", lastLoginAttemptTime=");
		builder.append(lastLoginAttemptTime);
		builder.append(", lastLoginTime=");
		builder.append(lastLoginTime);
		builder.append(", lastPasswordChangeTime=");
		builder.append(lastPasswordChangeTime);
		builder.append("]");
		return builder.toString();
	}
}
