import java.util.Scanner;
import java.io.*;


public class DEUCENG {
    //public variable for date
    static int day = 1;
    static String contenet="";
   //changing date everyday
    public static void date() {
        String date = "---- Date:" + day + ".1.2021---- ";
        day++;
        System.out.println(date);
    }
    public static void input() throws FileNotFoundException {

        String fileName="C:\\Users\\HP\\Downloads\\input.txt";
        File  f =new File(fileName);
        Scanner s = new Scanner(f);
        date();

        while (s.hasNextLine()) {
            contenet += s.nextLine()+"\n";
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        input();
        String[] w= contenet.split(";");

        Office o1=new Office();
        Office o2=new Office();


        Employee e1=new Employee();
        Employee e2=new Employee();
        for (int i=0;i<3;i++){

        }
        e2.setName("HAMED");
        o2.setID("2");
        o2.setPhone(w[1]);
        o2.setAddress(w[2]);
        o2.setEmployee(e2);

        e1.setName("YASSER");
        o1.setID("1");
        o1.setPhone("7620357");
        o1.setAddress("Syria/Aleppo");
        o1.setEmployee(e1);

        o1.push(o1);
        o1.push(o2);
        o1.show();





    }
}