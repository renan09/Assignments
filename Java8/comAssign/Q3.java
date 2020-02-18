
/*
3.   Create an interface WordCount with single abstract method 
int count(String str) 
to count no.of words in a given string. 
Implement count(String str) method by using Lambda expression 
in an implementation class 
MyClassWithLambda & invoke it to display the result on the console. 
*/

class Q3{
    interface Welcome{
        public String welcomeUser(String str);
    }
    interface WordCount{
        String sample="";
        public int count(String str);
    }
    
    public class MyClassWithLambda implements WordCount{
       
// Using lambda function
        public int count(String str){
            System.out.println("Welcome : "+ str);
            Q3.WordCount wCount = (sizevalue) -> {
                int size= str.length();
                System.out.println("str size from lambda function : "+ size);
                return size;
            };

            return wCount.count(str);
        }
// Using lambda function two
        public int countAnotherOne(String str){
            
            Q3.WordCount wCount = (sizevalue) -> countAnother(str);

            return wCount.count(str);
        }

        public int countAnother(String str){
           

            int size=0;

        System.out.println("Welcome : "+ str);
        size= str.length();
        System.out.println("str size : "+ size);
        return size;
        }

        public void sampleHit(String str){
            Q3.Welcome comeHome = (wel) -> {
                return "Return of A EnGer Kio : Welcome "+str;
            }; 

            Q3.Welcome comeHome2 = (wel) -> {
                System.out.println("Return of A Dragon : Welcome "+str);
                return "Hero is back "+str;
             };

          String value= comeHome.welcomeUser(str); 
          System.out.println("Value of lambda function :"+value);
          String value2=comeHome2.welcomeUser(str); 
          System.out.println("Value of lambda function :"+value2);
        }
    }

    public static void main(String[] args)
    {

System.out.println("************Start*************");
Q3 q3 = new Q3();
Q3.MyClassWithLambda lcObject = q3.new MyClassWithLambda();
lcObject.count("Boom");
System.out.println("************-----------------------------*************");
lcObject.countAnother("BOOM BOX");
System.out.println("************-----------------------------*************");
lcObject.countAnotherOne("BoomBox Hits");
System.out.println("************END*************");
lcObject.sampleHit("Naren");
    }
}

