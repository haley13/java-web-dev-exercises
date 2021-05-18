package exercises.technology;

import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args){
        Laptop myLaptop= new Laptop(800,8, true, 100);
        Smartphone myPhone= new Smartphone(128, 4, true, 200 );
        System.out.println(myLaptop.getId());
        System.out.println(myPhone.getId());
        myPhone.takeSelfie();
        System.out.println(myLaptop.needsToPlugIn());
        System.out.println(myPhone.getNumberOfSelfies());

        myPhone.takeSelfie();
        System.out.println(myPhone.getNumberOfSelfies());
    }
}
//at first it didn't update because we didn't store the initial numbers. We didn't save the changes made to the phone object. S
//so everytime you run the program it creates a new object. starting from scratch, terminal lets us know we end the
//we end the process and exit the application, we're not constantly maintaining this myphone object or my laptop in memory;
//everytime I hit run, I start from scratch. we're not saving the data anywhere,
