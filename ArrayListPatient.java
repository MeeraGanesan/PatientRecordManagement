import java.util.*;
class ArrayListPatient
{
    public void main()
    {
        Scanner SC=new Scanner(System.in);
        ArrayList<Patients> PA = new ArrayList<Patients>();
        
        
        while (true)
        {
            System.out.println("Choose 1)Input info 2)Display info 3)Search ID");
            int n=SC.nextInt();
            switch(n)
            {
                case 1:
                System.out.println("Enter patient information");
                Patients P = new Patients();
                P.getinfo();
                PA.add(P);
                break;
                case 2:
                for (Patients Pt: PA)
                {
                    Pt.disinfo();
                }
                break;
                case 3:
                System.out.println("Enter ID");
                int search=SC.nextInt();
                boolean found=false;
                for (Patients Pt: PA)
                {
                    if(Pt.getid()==search)
                    {
                        Pt.disinfo();
                        found=true;
                        break;
                    }
                    
                }
                if (!found)
                    {
                        System.out.println("Not found");
                    }
            }
               
            System.out.println("Do you want to stop? Yes/No");
            String ch = SC.next();
            if (ch.equals("Yes"))
            break;
        }
    }
             
        }
        

            