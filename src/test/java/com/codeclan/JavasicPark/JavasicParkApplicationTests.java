package com.codeclan.JavasicPark;

import com.codeclan.JavasicPark.Models.Paddock;
import com.codeclan.JavasicPark.Models.PaddockType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavasicParkApplicationTests {

	private Paddock paddock;
	@Before
	public void setUp() throws Exception {
		paddock = new Paddock("paddock", "Herbivore", 5);
	}

	@Test
	public void contextLoads() {


	}

	@Test
	public void getPaddockType() {

//		assertEquals("HERBIVORE", paddock.getPaddockType());
	}
}
