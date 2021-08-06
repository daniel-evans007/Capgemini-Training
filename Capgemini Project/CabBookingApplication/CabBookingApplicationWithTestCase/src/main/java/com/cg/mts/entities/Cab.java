package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author Debajyoti
 *
 */
@Entity
public class Cab {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "cab_Sequence")
    @SequenceGenerator(name = "cab_Sequence", sequenceName = "CAB_SEQ",initialValue = 10001)
	private int cabId;
	private String carType;
	private float perKmRate;
	
	public Cab() {
		super();
	}

	public Cab(int cabId, String carType, float perKmRate) {
		super();
		this.cabId = cabId;
		this.carType = carType;
		this.perKmRate = perKmRate;
	}

	public int getCabId() {
		return cabId;
	}

	public void setCabId(int cabId) {
		this.cabId = cabId;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public float getPerKmRate() {
		return perKmRate;
	}

	public void setPerKmRate(float perKmRate) {
		this.perKmRate = perKmRate;
	}
}