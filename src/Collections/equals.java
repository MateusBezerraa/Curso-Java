package Collections;

import java.util.Date;

public class equals {
    
    public static void main(String[] args) {
        
        usuario u1 = new usuario("Pedro Silva", "pedroca123@gmail.com");
        usuario u2 = new usuario("Pedro Silva", "pedroca123@gmail.com");

        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(new Date()));

    }
}
