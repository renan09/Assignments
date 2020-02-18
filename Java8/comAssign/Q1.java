import java.util.*;
/*1.    Create an ArrayList of Employee( id,name,address,sal) objects and
 retrieve objects from ArrayList by using forEach() method of Iterable interface.
 */
public class Q1
{
  String name="";
 public Q1(String name){
  this.name=name;
 }
  
  public static void main(final String[] args) {
     
    Q1 h = new Q1("Nag");
    System.out.println("Welcome : "+h.name);
     ArrayList<String> Employee = new ArrayList<String>();
    Employee.add("181921");
    Employee.add(h.name);
    Employee.add("Hyderabad");
    Employee.add("10000");
    
    h.printlist(Employee);
    
    }
// Printing the arraylist using forEach
    public void printlist(ArrayList<String> Employee){
      Employee.forEach(value ->{
        System.out.println(value);
      }
      );
    }

    
}