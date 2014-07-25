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
	
	public Set duplicates (Object [] listElements)
	{
		Set notDuplicates = new HashSet<Objects>();
		Set duplicates = new LinkedHashSet<Objects>();
		
		for(Object o : listElements){
			if(!notDuplicates.add(o))
				duplicates.add(o);
		}
		return notDuplicates;
		
	}

}
