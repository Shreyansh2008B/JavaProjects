
import java.util.List;
import java.util.Scanner;



public class Compound_Intrest_Calculator {

    
    static public List<String> compound_options = List.of("Anually","semi-Anually","Quarterly","Monthly","Daily");
    static public List<Integer> CompoundTimes = List.of(1,2,4,12,365);
    public  static double  CompundIntreset(double principal,double rate,int  compoundmethod,int time)
    {   
        int n=CompoundTimes.get(compoundmethod-1);
        double x = principal* Math.pow(1+((rate/100)/n), n*time );
        
        return x;
    }
    public static  void main(String[] args) {

       Scanner s = new Scanner(System.in);
       System.out.println("Enter principal Amount: ");
       double principal  = s.nextDouble();

       System.out.println("Enter Rate(%): ");
       double rate  = s.nextDouble();

       System.out.println("Enter Time(in Years): ");
       int time  = s.nextInt();

       System.out.println("---Compound Options---");
       for(int i=0;i<compound_options.size();i++)
       {
        System.out.println(i+1+"." + compound_options.get(i));
       }
       int Compound_type = s.nextInt();
       double final_amount = CompundIntreset(principal,rate,Compound_type,time);
       System.out.println(final_amount) ;

       
       
       

    }
}
