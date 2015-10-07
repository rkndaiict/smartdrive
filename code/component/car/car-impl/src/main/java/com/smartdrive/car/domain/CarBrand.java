package com.smartdrive.car.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.smartdrive.common.domain.AbstractTrackedEntity;

@Table(name = "CAR_BRAND")
@Entity
public class CarBrand extends AbstractTrackedEntity {

	private static final long serialVersionUID = -8805693763698812366L;

	@Column(name = "BRAND_NAME")
	private String brandName;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CarBrand [brandName=");
		builder.append(brandName);
		builder.append("]");
		return builder.toString();
	}
}
