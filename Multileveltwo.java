class Manager 
{ 
int salary=8000; 
} 
class TeamLead extends Manager 
{ 
String teamName="ORANGE"; 
} 
class Developer extends TeamLead 
{ 
int prjcld=78; 
void putdata() 
{
System.out.println("Manager Salary :"+salary); 
System.out.println("TeamLead team Name :"+teamName); 
System.out.println("Developer_prjcld:"+prjcld); 
}
}
class Multileveltwo
{ 
public static void main(String args[]) 
{ 
Developer ob = new Developer(); 
ob.putdata(); 
}}