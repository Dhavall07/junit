package com.epam.junit_deom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Remove_a_test {
	RemoveA removeA;
	@BeforeEach
	void setup() {
		removeA = new RemoveA();
	}

	@Test
	void RemoveChar() { 
		assertEquals("BCD",removeA.work("ABCD"));
	}
	@Test
	void Remove1Char() {
		
		assertEquals("CD",removeA.work("AACD"));
	}
	@Test
	void Remove2Char() {
		
		assertEquals("BCD",removeA.work("BACD"));
	}
	@Test
	void Remove3Char() {
		
		assertEquals("BBAA",removeA.work("BBAA"));
	}
	@Test
	void Remove4Char() {
		
		assertEquals("BBAA",removeA.work("AABBAA"));
	}


}
