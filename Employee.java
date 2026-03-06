import java.util.Scanner;
public class Employee {
    int empid,TA DA,HRA,Tax,basic,netsal;
    String empname;
    void getdata()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee name,  id , basic,TA,DA,HRA & Tax : ");
         empname=scan.nextLine();
        empid=scan.nextInt();

        TA=scan.nextInt();
        DA = scan.nextInt();
        HRA = scan.nextInt();
        Tax = scan.nextInt();
        basic = scan.nextInt();
    }
    void calc()
    {
        netsal=(TA+DA+HRA+basic)-Tax;
        System.out.println("Net Salary is "+netsal);
    }
void display()
{
    System.out.println("The empid is "+empid);
    System.out.println("The name is "+empname);
    
}
public static void main(String args[])
{
    Employee.obj=new Employee();
    obj.getdata();
    obj.cal();
    obj.display();

}
}
