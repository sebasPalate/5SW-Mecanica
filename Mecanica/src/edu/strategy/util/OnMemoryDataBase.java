
package edu.strategy.util;

import edu.strategy.util.User;
import java.util.HashMap;

/**
 *
 * @author Lenovo
 */
public class OnMemoryDataBase {
    private static final HashMap<String, User> USER_MAP = new HashMap<>();
    static {
        USER_MAP.put("davidt",new User("David", "12345", "Admin"));
        USER_MAP.put("sebasp",new User("Sebastian", "12345", "Bodeguero"));
        USER_MAP.put("jhonc",new User("Jhon", "12345", "Bodeguero"));
        }
    public static User findUserByName(String name){
        return USER_MAP.get(name);
    }
}
