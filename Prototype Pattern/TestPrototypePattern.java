import java.util.List;
import java.util.ArrayList;

/**
 * The getAccessControlObject() fetches a stored prototype object according to the controlLevel
 * passed, e.g. USER and returns a newly cloned object into userAccessControl,
 * for a 'USER' it returns 'DO_WORK'.
 * 
 * A user object is created passing two String variables and a userAccessControl object.
 * There contents are printed using the toString() method.
 * 
 * This is repeated for a second user but setAccess changes its userAccessControl to 
 * 'READ REPORTS'
 * 
 * User C is an example of how this works for a Manager.
 * 
 */

public class TestPrototypePattern {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        
        AccessControl userAccessControl = AccessControlProvider.getAccessControlObject("USER");
        User user = new User("User A", "USER Level", userAccessControl);
        
        //System.out.println("************************************");
        //System.out.println(user);
        users.add(user);

        userAccessControl = AccessControlProvider.getAccessControlObject("USER");
        user = new User("User B", "USER Level", userAccessControl);
        System.out.println("Changing access control of: "+user.getUserName());
        user.getAccessControl().setAccess("READ REPORTS");
        //System.out.println(user);
        users.add(user);
        
        //System.out.println("************************************");
        
        AccessControl managerAccessControl = AccessControlProvider.getAccessControlObject("MANAGER");
        user = new User("User C", "MANAGER Level", managerAccessControl);
        //System.out.println(user);
        users.add(user);
        
        //System.out.println("************************************");
        
        AccessControl SuperUserAccessControl = AccessControlProvider.getAccessControlObject("SUPERUSER");
        user = new User("User D", "SUPERUSER Level", SuperUserAccessControl);
        //System.out.println(user);
        users.add(user);
        
        for(User x: users){
            System.out.println("************************************");
            System.out.println(x);
        }
        

    }
}

