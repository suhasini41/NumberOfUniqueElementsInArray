package package1;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOfUniqueElementsInArray {

	private  int findCountOfUniqueElements(int[] a) {
		List<Integer> al = new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
			}
		}
		return al.size();
	}

	@Test
	public void testCase1()
	{
		int[] a = {1,1,1,2,2,3,3,9};
		Assert.assertEquals(findCountOfUniqueElements(a), 4);
	}
	
	@Test
	public void testCase2()
	{
		int[] a = {2,2,2,2,2};
		Assert.assertEquals(findCountOfUniqueElements(a), 1);
	}
	@Test
	public void testCase3()
	{
		int[] a = {1,2,3,4,5};
		Assert.assertEquals(findCountOfUniqueElements(a), 5);
	}
}
