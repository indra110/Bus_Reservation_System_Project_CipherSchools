package busproject;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Welcome to Bus reservation system");
//        System.out.println("1. Sign up");
//        System.out.println("2. Login");
//        System.out.println("3. Reset Password");
//        System.out.println("Enter your input");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
        LoginSignup loginSignup = new LoginSignup();
//
//        switch (input){
//            case 1:
//                System.out.print("Name -> ");
//                String nm = sc.nextLine();
//                System.out.print("Phone -> ");
//                int ph = sc.nextInt();
//                System.out.println("Email -> ");
//                String eml = sc.nextLine();
//                System.out.println("Street -> ");
//                String strt = sc.nextLine();
//                System.out.println("City -> ");
//                String cty = sc.nextLine();
//                System.out.println("State -> ");
//                String ste = sc.nextLine();
//                System.out.println("Password -> ");
//                String pass = sc.nextLine();
//                System.out.println(loginSignup.signup(nm, ph, eml, strt, cty, ste, pass));
//                break;
//
//            case 2:
//                System.out.println("Name -> ");
//                String email1 = sc.nextLine();
//                System.out.println("Password -> ");
//                String pwd = sc.nextLine();
//                System.out.println(loginSignup.login(email1, pwd));
//                break;
//
//            default:
//                System.out.println("not valid");
//        }


//         System.out.println(loginSignup.signup("Indranil", 75850394, "indra@gmail.com", "Parulia", "Durgapur", "WB", "hello"));
//         System.out.println(loginSignup.signup("Aman", 9898999, "aman@gmail.com", "bansia", "Durgapur", "UP", "hew349"));
//         System.out.println(loginSignup.signup("Indranil", 75850394, "indra@gmail.com", "Parulia", "Durgapur", "WB", "hello"));
//         System.out.println(loginSignup.login("indra@gmail.com", "hello"));
//
//         UserOperation userOperation = new UserOperation();
//         System.out.println(userOperation.findUser("aman@gmail.com"));
//         userOperation.updateUserName("aman@gmail.com", "Deep");
//         System.out.println(userOperation.findUser("aman@gmail.com"));
//         System.out.println();


        BusOperation busOperation = new BusOperation();
        busOperation.createBus("100a", "Phagwara", "Delhi", "Ajay", 890);
        busOperation.createBus("101a", "Kolkata", "Durgapur", "Ravi", 250);
        busOperation.createBus("102b", "Jalandhar", "LPU", "Bhusan", 20);
        busOperation.createBus("100n", "Phagwara", "Delhi", "Raman", 760);
        busOperation.createBus("200a", "Phagwara", "Delhi", "Asis", 540);

        List<Bus> searchResult = busOperation.searchBus("Phagwara", "Delhi");

        for (Bus bus: searchResult){
            System.out.println(bus);
        }

    }
}
