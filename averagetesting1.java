package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class averagetesting1 {

	@Test
	public void test() {
		AvergeTest test = new AvergeTest();
		int arr[] ={1,2,3,4,5};
		int output = test.averagefunc(3,arr);
		assertEquals(2,output);
	}

}
