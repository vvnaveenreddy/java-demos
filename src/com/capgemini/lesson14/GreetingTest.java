package com.capgemini.lesson14;

import org.junit.Test;
 import static org.junit.Assert.*;


public class GreetingTest {
@Test
public void testGreet()
{
	Greeting greeting = new Greeting();
	assertEquals("Test failed","WELCOME TO JAVA", greeting.greet());
}
}
