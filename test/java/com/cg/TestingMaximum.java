package com.cg;

import org.junit.Assert;
import org.junit.Test;

public class TestingMaximum {

	@Test
	public void testMaximumNumber() {
		Assert.assertEquals((Integer) 7, TestMaximum.testMax(7, 4, 2));
	}
}
