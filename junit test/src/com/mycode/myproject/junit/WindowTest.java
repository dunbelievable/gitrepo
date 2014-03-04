package com.mycode.myproject.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mycode.myproject.Point;
import com.mycode.myproject.Window;

public class WindowTest {

	
	Window myWindow = null;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		// Initialise global resources here
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		//Release global resources here
		
	}

	@Before
	public void setUp() throws Exception {
		
		Point tl = new Point(50,50);
		Point br = new Point(100,100);
		
		myWindow = new Window(tl,br);
		
	}

	@After
	public void tearDown() throws Exception {

		//Release any per-test resources here
	
	}

	@Test
	public void testIsPointWithinWindow() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void test_IsPointWithinWindow_75_75_() {
		
		Point p = new Point(75,75);
		
		boolean pointIsWithinWindow = myWindow.isPointWithinWindow(p);
		
		assertTrue( pointIsWithinWindow );
		
	}
	
	@Test
	public void test_IsPointWithinWindow_150_150_() {
		fail("Not yet implemented");
	}
	
}
