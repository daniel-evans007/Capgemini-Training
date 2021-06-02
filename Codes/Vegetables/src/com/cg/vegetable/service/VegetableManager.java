package com.cg.vegetable.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


import com.cg.vegetable.model.Vegetable;

public class VegetableManager {

	static Scanner sc = new Scanner(System.in);
	
	public VegetableManager() {
		
	}
	
	ArrayList<Vegetable> vegList = new ArrayList<Vegetable>();
	
	public void addVeg(String vegId, String vegName, int vegPrice) {
		Vegetable veg = new Vegetable(vegId, vegName, vegPrice);
		checkIfVegetableAlreadyExists(veg);
		vegList.add(veg);
	}

	private void checkIfVegetableAlreadyExists(Vegetable veg) {
		if (vegList.contains(veg)) {
			throw new RuntimeException("This vegetable is already present in the list");
		}
		
	}
	
	public ArrayList<Vegetable> getAllVegetables() {
		if (vegList.size() == 0) {
			throw new RuntimeException("There are no books to print");
		}
		else {
			return vegList;
		}
	}
	
	public ArrayList<Vegetable> updateVegDetails() {
		System.out.print("Enter Vegetable ID: ");
		String vegId = sc.nextLine();
		
		for (int i=0;i<vegList.size();i++) {
			if (vegList.get(i).getVegId().equals(vegId)) {
				System.out.println("Enter 1 to update Vegetable Name");
				System.out.println("Enter 2 to update Vegetable Price");
				
				System.out.print("\nEnter choice: ");
				int choice = Integer.parseInt(sc.nextLine());
				
				switch (choice) {
				case 1:
					System.out.print("\nEnter the new Vegetable Name: ");
					String vegName = sc.nextLine();
					vegList.get(i).setVegName(vegName);
					break;
				case 2:
					System.out.print("\nEnter the new Vegetable Price: ");
					int vegPrice = Integer.parseInt(sc.nextLine());
					vegList.get(i).setVegPrice(vegPrice);
					break;
				}
				return vegList;
			}
		}		
		throw new RuntimeException("Vegetable doesn't exist");
	}
	
	public ArrayList<Vegetable> deleteVegetable() {
		System.out.print("\nEnter the ID of the Vegetable to be deleted: ");
		String vegId = sc.nextLine();
		
		for (int i=0;i<vegList.size();i++) {
			if (vegList.get(i).getVegId() == vegId) {
				vegList.remove(i);
				return vegList;
			}
		}
		throw new RuntimeException("Vegetable doesn't exist");
	}
	
	public ArrayList<Vegetable> sortVegetableList() {
		Collections.sort(vegList);
		System.out.println("Here's the sorted list of Vegetables\n");
		for (Vegetable veggies: vegList) {
			System.out.println(veggies);
		}
		return vegList;
	}
}