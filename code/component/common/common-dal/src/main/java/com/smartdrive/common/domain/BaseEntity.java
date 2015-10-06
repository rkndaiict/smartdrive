package com.smartdrive.common.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import org.springframework.security.acls.model.ObjectIdentity;

//@TypeDefs({@TypeDef(name = "encryptedString", typeClass = EncryptedStringType.class, parameters = { @Parameter(name = "encryptorRegisteredName", value = "hibernateStringEncryptor") }),
//		@TypeDef(name = "encryptedACHString", typeClass = EncryptedStringType.class, parameters = { @Parameter(name = "encryptorRegisteredName", value = "hibernateACHStringEncryptor") })})
@MappedSuperclass
public abstract class BaseEntity implements ObjectIdentity {


	private static final long serialVersionUID = 7620579745392806460L;

	@Transient
	private String type;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "owner_user_id")
	private Long ownerUserId;

	@Column(name = "EXCHANGE_ID")
	private String exchangeId;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the ownerUserIdentifier
	 */
	public Long getOwnerUserId() {
		return this.ownerUserId;
	}

	/**
	 * @param ownerUserId
	 *            the ownerUserIdentifier to set
	 */
	public void setOwnerUserId(Long ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.security.acls.model.ObjectIdentity#getIdentifier()
	 */
	@Override
	public Serializable getIdentifier() {
		return getId();
	}
	
	@Override
	public String getType() {
		return this.getClass().getCanonicalName();
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExchangeId() {
		return exchangeId;
	}

	public void setExchangeId(String exchangeId) {
		this.exchangeId = exchangeId;
	}
		
}
