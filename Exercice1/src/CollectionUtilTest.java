import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;

/**
 * 
 */

/**
 * @author ialonsoc
 *
 */
public class CollectionUtilTest {

	@Test
	public void test1() {
		Object [] in = {"a", "b", "a", "c", "d", "c", "c"};
		Object [] out= {"a", "c"};
		
		Set <Object> setOut =CollectionUtil.duplicates (in);
		
		
	  	assertEquals(" List the duplicates elements",out, setOut.toArray(new Object[setOut.size()]));
				
	}
	
	@Test
	public void test2() {
		Object [] in = {"a", "b", "y", "c", "d", "c", "c"};
		Object [] out= {"c"};
		
		Set <Object> setOut =CollectionUtil.duplicates (in);
		
		
	  	assertEquals(" List the duplicates elements",out, setOut.toArray(new Object[setOut.size()]));
				
	}
	
	
	@Test
	public void test3() {
		Object [] in = {4, 4, 2, 5, 7, 2, 1 ,3 ,5};
		Object [] out= {4, 2, 5};
		
		Set <Object> setOut =CollectionUtil.duplicates (in);
		
		
	  	assertEquals(" List the duplicates elements",out, setOut.toArray(new Object[setOut.size()]));
				
	}
	
	
	@Test
	public void test4() {
		Object [] in = {4, 0, 2, 5, 7, 2, 1 ,3 ,5};
		Object [] out= {2, 5};
		
		Set <Object> setOut =CollectionUtil.duplicates (in);
		
		
	  	assertEquals(" List the duplicates elements",out, setOut.toArray(new Object[setOut.size()]));
				
	}

}
