import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 
 */

/**
 * @author ialonsoc
 *
 */
public class CollectionUtil {
	
	/**
	 * Entry a listElements it return a list with the duplicates elements
	 * @param listElements
	 * @return a set with the duplicates objects
	 */
	public static Set duplicates (Object [] listElements)
	{
		Set notDuplicates = new HashSet<Objects>();
		Set duplicates = new LinkedHashSet<Objects>();
		
		for(Object o : listElements){
			//if the object is not the set add it
			if(!notDuplicates.add(o))
				duplicates.add(o);
		}
		return duplicates;
		
	}

}
