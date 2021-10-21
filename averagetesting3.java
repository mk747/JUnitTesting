package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class averagetesting3 {

	@Test
	public void test() {
		ModifiedAverage test = new ModifiedAverage();
		int arr[] ={1,2,3,4,5};
		double output = test.averagefunc(2,arr);
		assertEquals(new Double(1.5),new Double(output));
	}

}
