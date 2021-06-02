package com.cg.vegetable.model;

public class Vegetable implements Comparable<Vegetable> {

	private String vegId;
	private String vegName;
	private int vegPrice;
	
	public Vegetable() {
		
	}

	public Vegetable(String vegId, String vegName, int vegPrice) {
		super();
		this.vegId = vegId;
		this.vegName = vegName;
		this.vegPrice = vegPrice;
	}

	public String getVegId() {
		return vegId;
	}

	public void setVegId(String vegId) {
		this.vegId = vegId;
	}

	public String getVegName() {
		return vegName;
	}

	public void setVegName(String vegName) {
		this.vegName = vegName;
	}

	public int getVegPrice() {
		return vegPrice;
	}

	public void setVegPrice(int vegPrice) {
		this.vegPrice = vegPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((vegId == null) ? 0 : vegId.hashCode());
		result = prime * result + ((vegName == null) ? 0 : vegName.hashCode());
		result = prime * result + vegPrice;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vegetable other = (Vegetable) obj;
		if (vegId == null) {
			if (other.vegId != null)
				return false;
		} else if (!vegId.equals(other.vegId))
			return false;
		if (vegName == null) {
			if (other.vegName != null)
				return false;
		} else if (!vegName.equals(other.vegName))
			return false;
		if (vegPrice != other.vegPrice)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vegetable [vegId=" + vegId + ", vegName=" + vegName + ", vegPrice=" + vegPrice + "]";
	}

	@Override
	public int compareTo(Vegetable veg) {
		System.out.println("vegList sorted using ID");
		return vegId.compareTo(veg.vegId);
	}	
}