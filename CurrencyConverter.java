import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter{
    public static void main(String args[]){
        double rupee,dollar,pound,euro,KWD;
        int code;
        DecimalFormat f=new DecimalFormat("##.####");
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to the Currency Converter application\nEnter the Currency Code\n1:Rupees \n2:Dollar\n3:Pound\n4:Euro\n5:Kuwaiti dinar");
        code=s.nextInt();
        switch(code){
            case 1->{
            System.out.println("Enter amount in rupees:");
            rupee=s.nextDouble();
            dollar=rupee/77.34;
            System.out.println("Dollar: "+f.format(dollar));
            pound=rupee/94.46;
            System.out.println("Pound: "+f.format(pound));
            euro=rupee/80.36;
            System.out.println("Euro: "+f.format(euro));
            KWD=rupee/251.92;
            System.out.println("Kuwaiti dinar: "+f.format(KWD));
            }
            case 2->{
            System.out.println("Enter amount in Dollar:");
            dollar=s.nextDouble();
            rupee=dollar*77.34;
            System.out.println("Rupees: "+f.format(rupee));
            pound=dollar*0.82;
            System.out.println("Pound: "+f.format(pound));
            euro=dollar*0.96;
            System.out.println("Euro: "+f.format(euro));
            KWD=dollar*0.31;
            System.out.println("Kuwaiti dinar: "+f.format(KWD));
            }
            case 3->{
            System.out.println("Enter amount in Pound:");
            pound=s.nextDouble();
            rupee=pound*94.43;
            System.out.println("Rupees: "+f.format(rupee));
            dollar=pound*1.22;
            System.out.println("Dollar: "+f.format(dollar));
            euro=pound*1.17;
            System.out.println("Euro: "+f.format(euro));
            KWD=pound*0.3748;
            System.out.println("Kuwaiti dinar: "+f.format(KWD));
            }
            case 4->{
            System.out.println("Enter amount in Euro:");
            euro=s.nextDouble();
            rupee=euro*80.43;
            System.out.println("Rupees: "+f.format(rupee));
            dollar=euro*1.04;
            System.out.println("Dollar: "+f.format(dollar));
            pound=euro*0.85;
            System.out.println("pound: "+f.format(pound));
            KWD=euro*0.318949;
            System.out.println("Kuwaiti dinar: "+f.format(KWD));
            }
            case 5->{
            System.out.println("Enter amount in Kuwaiti Dinar:");
            KWD=s.nextDouble();
            rupee=KWD*251.96;
            System.out.println("Rupees: "+f.format(rupee));
            dollar=KWD*3.26;
            System.out.println("Dollar: "+f.format(dollar));
            pound=KWD*2.67;
            System.out.println("pound: "+f.format(pound));
            euro=KWD*3.13;
            System.out.println("Euro: "+f.format(euro));
            }
            default->
            System.out.println("Invalid Code");
        }
    }
}