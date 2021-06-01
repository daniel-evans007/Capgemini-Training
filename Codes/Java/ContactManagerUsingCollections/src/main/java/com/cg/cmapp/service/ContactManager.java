package com.cg.cmapp.service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.cg.cmapp.model.Contact;

public class ContactManager {

	/**
	 * Contact Manager Constructor
	 */
	
	public ContactManager() {
		
	}
	//allows us to retrieve and modify data while iterating through the collection of iterators.
	Map<String, Contact> contactList = new ConcurrentHashMap<String, Contact>();
	
	/*add Contact Method to add contacts to contactList object
	*with arguments
	*@param firstName gets first name of contact.
	*@param lastName gets last name of contact.
	*@param phoneNo gets phoneNo of contact.
	*/
	
	//below are the documentation comments
	
	/**
	 * addContact Method to add contacts in to contactList Object
	 * 
	 * @param firstName gets the first name of contact
	 * @param lastName gets the last name of contact
	 * @param phoneNo gets the phoneNo of contact
	 */
	
	public void addContact(String firstName, String lastName, String phoneNo) {
		Contact contact = new Contact(firstName, lastName, phoneNo);
		validateContact(contact);
		checkIfContactAlreadyExist(contact);
		contactList.put(generateKey(contact), contact);
	}
	
	/**
	 * generateKey method generates the key to store a value in HashMap
	 * @param contact
	 * @return String
	 */

	private String generateKey(Contact contact) {
		// TODO Auto-generated method stub
		return String.format("%s-%s", contact.getfName(), contact.getlName());
	}
	
	/**
	 * checkIfContactAlreadyExist method checks whether contact is already added in the list
	 * @param contact
	 */

	private void checkIfContactAlreadyExist(Contact contact) {
		// TODO Auto-generated method stub
		if (contactList.containsKey(generateKey(contact))) {
			throw new RuntimeException("Contact already exists...");
		}
	}
	
	/**
	 * validateContact method validates the contact details using some condition
	 * @param contact
	 */

	private void validateContact(Contact contact) {
		// TODO Auto-generated method stub
		contact.validateFirstName();
		contact.validateLastName();
		contact.validatePhNo();
	}
	
	/**
	 * 
	 * @return contactList
	 */
	public Collection<Contact> getAllContacts() {
		return contactList.values();
	}
}