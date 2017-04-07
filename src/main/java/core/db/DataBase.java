package core.db;

import java.util.Collection;
import java.util.Map;

import com.google.common.collect.Maps;

import next.model.User;

public class DataBase {
    private static Map<String, User> users = Maps.newHashMap();
    
    static {
    	users.put("javajigi", new User("javajigi", "password", "name", "javajigi@slipp.net"));
    	users.put("a", new User("a", "a", "name2", "jasdfi@sliasfdpp.net"));
    }
    
    public static void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public static User findUserById(String userId) {
        return users.get(userId);
    }
    
    public static void updateUser(User user, User updatedUser) {
    	users.put(user.getUserId(), updatedUser);
    }

    public static Collection<User> findAll() {
        return users.values();
    }  

}
