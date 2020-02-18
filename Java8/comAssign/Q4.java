import java.util.*;

/*

4.	Add following Ideas to Assignment 1

i.	Along with getters & setters add a static method static int 
compareBySal(Employee e1,Employee e2) to compare employee 
objects based on salaries.
ii.	Use Collections.sort (-,-) method to compare employee objects of Array List.
iii.	Invoke compareBySal() method by using Method Reference and
 pass it as second argument to the sort() method.

 */
public class Q4
{
  String name="Name";
 public Q4(String name)
 {
  this.name=name;
 }
 interface compare{
  public int comparebySal();
}

public class ReferenceClass{
  public int comparebySal(){
    System.out.println("No Implementation");
    return 2;
  };
}
 
  public static void main(final String[] args) {
     
    Q4 h = new Q4("Nag");
    System.out.println("Welcome : "+h.name);

     ArrayList<Employee> EmployeeList = new ArrayList<Employee>();
     Employee e1 = new Employee();
     Employee e2 = new Employee();
     Employee e3 = new Employee();
     Employee e4 = new Employee();
     Employee e5 = new Employee();

    e1.setid(181921);
    e1.setname("Nagan");
    e1.setaddress("Hyderabad");
    e1.setsalary(180000);

    e2.setid(181922);
    e2.setname("Magan");
    e2.setaddress("Hyderabad");
    e2.setsalary(900000);

    e3.setid(181923);
    e3.setname("Lagan");
    e3.setaddress("Hyderabad");
    e3.setsalary(30000);

    e4.setid(181924);
    e4.setname("Jagan");
    e4.setaddress("Hyderabad");
    e4.setsalary(50000);

    e5.setid(181925);
    e5.setname("pagan");
    e5.setaddress("Delhi");
    e5.setsalary(150000);
    
    EmployeeList.add(e1);
    EmployeeList.add(e2);
    EmployeeList.add(e3);
    EmployeeList.add(e4);
    EmployeeList.add(e5);
    h.printlist(EmployeeList);
Employee[] eList = EmployeeList.toArray(new Employee[EmployeeList.size()]);
   System.out.println("Direct Method"+compareBySal(e1,e2)); 
   // System.out.println(Q4.compareBySal(e3,e4));
    System.out.println("-----------------Array Sort Method Reference-------------------");
    Arrays.sort(eList,Q4::compareBySal);
    printval(eList);
    System.out.println("-----------------Array Sort method Override-------------------");
    compareBySal2(eList);
    System.out.println("-----------------Arraylist Sort-------------------");
    Q4.compareBySal3(EmployeeList);
    
    }
// Printing the arraylist using forEach
    public void printlist(ArrayList<Employee> Employee){
      Employee.forEach(value ->{
        System.out.println(value.getid()+"||"+value.getname()+"||"+value.getaddress()+"||"+value.getsalary());
      }
      );
    }
public static int compareBySal(Employee c, Employee d){
 // System.out.println("*&*&*&*&*&*&* Compare *&*&*&*&*&**&*&*&*&*& ");
return c.getsalary().compareTo(d.getsalary());
}

public static void compareBySal2(Employee[] eList) throws ClassCastException{
 // System.out.println("Second Array Sort");
  Arrays.sort(eList, (Employee ad, Employee ed)->{
    return ad.getsalary().compareTo(ed.getsalary());
  });  

for (Employee employee : eList) {
  System.out.println("Array Sorted : "+employee.getid()+"||"+employee.getname()+"||"+employee.getaddress()+"||"+employee.getsalary());
}
  }

  public static void compareBySal3(ArrayList<Employee> eList) throws ClassCastException{
   // System.out.println("Second Array Sort");
    Collections.sort(eList, (Employee ad, Employee ed)->{
      return ad.getsalary().compareTo(ed.getsalary());
    });
    printvals(eList);
  }
    
  public static void printval(Employee[] eList){
    for (Employee employee : eList) {
      System.out.println("Array Sorted  : "+employee.getid()+"||"+employee.getname()+"||"+employee.getaddress()+"||"+employee.getsalary());
    }
  }

  public static void printvals(ArrayList<Employee> eList){
    for (Employee employee : eList) {
      System.out.println("Arraylist Sorted : "+employee.getid()+"||"+employee.getname()+"||"+employee.getaddress()+"||"+employee.getsalary());
    }
  }
}


