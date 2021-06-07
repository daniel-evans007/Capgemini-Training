package com.cg.lab_09.exercise3;

@FunctionalInterface
public interface CredValidation {

	boolean credentialValidation(String uname, String pword);
}