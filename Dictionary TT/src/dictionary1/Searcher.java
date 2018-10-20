package dictionary1;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Searcher {
    
    public static ArrayList searchResult(String str, ArrayList list) {
        ArrayList result = new ArrayList();
        int pt = str.length();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).toString().length() >= pt) {
                if (list.get(i).toString().substring(0, pt).equalsIgnoreCase(str))
                    result.add(list.get(i));
            }
        }
        return result;
    }
}
