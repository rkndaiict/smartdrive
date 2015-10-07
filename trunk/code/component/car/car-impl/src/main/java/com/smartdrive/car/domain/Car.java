package com.smartdrive.car.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.smartdrive.common.domain.AbstractTrackedEntity;

@Table(name = "CAR")
@Entity
public class Car extends AbstractTrackedEntity {

	private static final long serialVersionUID = -403160250897288147L;

	@JoinColumn(name = "CAR_BRAND_ID")
	private CarBrand carBrand;

	@Column(name = "CAR_NAME")
	private String carName;

	@Column(name = "CAR_MODEL")
	private String carModel;

	public CarBrand getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(CarBrand carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [carBrand=");
		builder.append(carBrand);
		builder.append(", carName=");
		builder.append(carName);
		builder.append(", carModel=");
		builder.append(carModel);
		builder.append("]");
		return builder.toString();
	}
}
