import java.util.ArrayList;
import java.util.Scanner;

class Hospital {
    String specialists[] = new String[] { "neurologist", "general physian", "cardiologist", "dentist",
            "psychiatrist" };

}

class Reception {
    ArrayList al = new ArrayList();

    public boolean checkValid(String name, String add, String spec,String time) {
        al.add(name);
        al.add(add);
        al.add(spec);
        al.add(time);
        Hospital hs = new Hospital();
        String specialist = spec.toLowerCase();

        for (String s : hs.specialists) {
            if (s.equals(specialist))
            {
                return true;
            }
        }
        return false;
    }

    public boolean checkTransection(int fees) {
        if (fees >= 100) {
            return true;
        }
        return false;
    }

}

public class HospitalManagement {
    public static void main(String[] args) {
        Reception rp = new Reception();
        Hospital hs = new Hospital();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Adderss: ");
        String add = sc.nextLine();
        System.out.println("Available specialists: ");
        for (String str : hs.specialists) {
            System.out.println(str);
        }
        System.out.println("Speciality: ");
        String spec = sc.next();
        System.out.println("Time to meet(Morning or Afternoon or Evening): ");
        String time = sc.next();
        if (rp.checkValid(name,add,spec,time)) {
            System.out.println("Make a payment of 100: ");
            int fees = sc.nextInt();
            if (rp.checkTransection(fees)) {
                System.out.println("Your Appointment is confirmed");

            }
            else
            {
                System.out.println("your appointment is not confirmed");
            }

        } else {
            System.out.println(spec + " is not avialable in our hospital");
        }

    }
}
