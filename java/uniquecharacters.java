/* Algorithm:
Convert to chararray
create an iterator that hashes each character into a hashtable
if it finds a duplicate, then it ends
otherwise it continues to the end of the line
*/

import java.util.HashMap;

public class practice {
    public static void main(String args[]) {
        System.out.println(uniqueCharString("Hey"));
    }
    public static boolean uniqueCharString(String myString) {
        char[] compareArray = myString.toCharArray();
        HashMap<String, Boolean> charMap = new HashMap<String, Boolean>();
        for (char c:compareArray) {
            boolean isUniqueSoFar = compareAndAddChar(c, charMap);
            if (!isUniqueSoFar) {
                return false;
            }
        }
        return true;
    }
    public static boolean compareAndAddChar(char myChar, HashMap charMap){
        if (charMap.containsKey(myChar)) {
            return false;
        } else {
            charMap.put(myChar, true);
            return true;
        }

    }
}
