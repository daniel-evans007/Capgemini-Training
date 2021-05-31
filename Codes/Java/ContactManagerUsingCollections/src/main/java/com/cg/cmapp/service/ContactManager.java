package com.cg.cmapp.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.cg.cmapp.model.Contact;

public class ContactManager {

	//allows us to retrieve and modify data while iterating through the collection of iterators.
	Map<String, Contact> contactList = new ConcurrentHashMap<String, Contact>();
	
	
}