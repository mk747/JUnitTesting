package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class averagetesting2 {

	@Test
	public void test() {
		AvergeTest test = new AvergeTest();
		int arr[] ={1,2,3,4,5};
		int output = test.averagefunc(6,arr);
		assertEquals(3,output);
	}

}
