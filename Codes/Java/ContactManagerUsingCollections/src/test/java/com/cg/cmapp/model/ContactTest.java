/**
 * 
 */
package com.cg.cmapp.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Anirban Goswami
 *
 */
class ContactTest {

	/**
	 * @throws java.lang.Exception
	 */
	static Contact cont;
	static Contact cont1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cont = new Contact("Rama", "Krishna", "09831020095");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		cont = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		cont1 = new Contact();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		cont1 = null;
	}

	/**
	 * Test method for {@link com.cg.cmapp.model.Contact#Contact()}.
	 */
	@Test
	void testContact() {
		assertEquals(new Contact(), cont1);
	}


	/**
	 * Test method for {@link com.cg.cmapp.model.Contact#getfName()}.
	 */
	@Test
	void testGetfName() {
		assertEquals("Rama", cont.getfName());
	}

	/**
	 * Test method for {@link com.cg.cmapp.model.Contact#getlName()}.
	 */
	@Test
	void testGetlName() {
		assertEquals("Krishna", cont.getlName());
	}

	/**
	 * Test method for {@link com.cg.cmapp.model.Contact#getPhNo()}.
	 */
	@Test
	void testGetPhNo() {
		assertEquals("09831020095", cont.getPhNo());;
	}
}
