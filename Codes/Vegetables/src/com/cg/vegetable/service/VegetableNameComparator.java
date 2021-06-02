package com.cg.vegetable.service;

import java.util.Comparator;

import com.cg.vegetable.model.Vegetable;

public class VegetableNameComparator implements Comparator<Vegetable> {

	@Override
	public int compare(Vegetable veg0, Vegetable veg1) {
		return veg0.getVegName().compareTo(veg1.getVegName());
	}
}
