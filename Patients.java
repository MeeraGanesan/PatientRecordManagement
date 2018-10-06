import java.util.*;
class Patients
{
    String name;
    int id;
    String bg;
    void getinfo()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter your name");
        name=SC.next();
        System.out.println("Enter your ID");
        id=SC.nextInt();
        System.out.println("Enter your bloodgroup");
        bg=SC.next();
    }
    void disinfo()
    {
        System.out.println("Patient details");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Bloodgroup: "+bg);
    }
    int getid()
    {
        return id;
    }
}
        