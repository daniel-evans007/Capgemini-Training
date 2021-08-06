package com.cg.mts.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.mts.entities.Cab;
import com.cg.mts.repository.ICabRepository;
import com.cg.mts.service.CabService;

/**
 * @author Niharika
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CabServiceTest {
	@Autowired
	private CabService cabService;
	
	@MockBean
	private ICabRepository cabRepo;
	
	@Test
	public void insertCabTest(){
		Cab cab = new Cab(10001,"sedan",20.5f);
		Mockito.when(cabRepo.save(cab)).thenReturn(cab);
		assertEquals(cab, cabService.insertCab(cab));
	}
	
	@Test
	public void updateCabTest() {
		Cab cab= new Cab(1001,"sedan",20.50f);
		Cab newcab = new Cab(1001,"mini",25.4f);
		cabRepo.save(cab);
		
		cab.setCarType(newcab.getCarType());
		cab.setPerKmRate(newcab.getPerKmRate());
		cabRepo.save(cab);
		
		assertEquals(cab.getCabId(),newcab.getCabId());
		assertEquals(cab.getCarType(),newcab.getCarType());
		assertEquals(cab.getPerKmRate(),newcab.getPerKmRate());

		
	}
	
	@Test
	public void deleteCabTest() {
		Cab cab= new Cab();
		cab.setCabId(10001);
		Mockito.when(cabRepo.findById(cab.getCabId())).thenReturn(Optional.of(cab));
		cabService.deleteCab(cab.getCabId());
		//(cabRepo).delete(cab);
		verify(cabRepo).deleteById(cab.getCabId());
	}
	
	/*
	 * @Test public void viewCabsOfTypeTest() { 
	 * 
	 * }
	 * 
	 * @Test public void countCabsOfTypeTest() {
	 * 
	 * }
	 */

}
