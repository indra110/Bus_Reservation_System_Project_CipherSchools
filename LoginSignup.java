package busproject;
import java.util.ArrayList;
import java.util.List;

public class LoginSignup {

    UserOperation userOperation = new UserOperation();
    // List<User> userList = new ArrayList<>();
    public String signup(String name, long phone, String email, String street, String city, String state, String password){
        if(userOperation.verifyEmail(email)){
            return "Email already taken Signup unsuccessful";
        }
        Contact contact = new Contact(name, phone, email);
        Address address = new Address(street, city, state);
        User user = new User(contact, address, password);
        userOperation.addUser(user);
        return "signup successful";
    }

    public String login(String email, String password){
        if(!userOperation.verifyEmail(email)){
            return "Incorrect Email";
        }
        if(!userOperation.verifyPassword(password)) {
            return "Incorrect Password";
        }
        return "Login Successful";
    }

}
