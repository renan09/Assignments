
public class Employee
{
    public Employee(){
        //System.out.println("Employee Constructor");
    }
    int id;
    String name;
    String address;
    Integer salary;

    public int getid(){
        return this.id;
    }
    public String getname(){
        return this.name;
    }
    public String getaddress(){
        return this.address;
    }

    public Integer getsalary(){
        return this.salary;
    }

    public void setid(int id){
        this.id=id;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setaddress(String address){
        this.address=address;
    }

    public void setsalary(Integer val){
        this.salary=val;
    }

   // public float compareTo(float value){
    // if(this.salary>=value) return this.salary;
    // else return value;
   // }

  

}