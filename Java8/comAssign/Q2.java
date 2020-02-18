//2.    Create two interfaces Piano & Guitar with single default method void play() with
 //different implementations. Add single implementation class Instrument 
 //for both the interfaces. 
 //Solve method name ambiguity in Instrument class by using two different approaches.
 


public class Q2
{
  
  
  public interface Piano
{
default void play(){
  System.out.println("This is play from piano");
}
}
public interface Guitar
{
default void play(){
  System.out.println("This is play from Guitar");
}

}
    public static void main(String[] args){
    System.out.println("Second class in vscode");
    Q2 q2 = new Q2();
    Q2.Instrument ins = q2.new Instrument();
    ins.play();
    ins.play("Another");
    }

  public class Instrument implements Piano, Guitar  {

    public void play(){
      System.out.println("Play in Instrument");
    }
  public void play(String Another){
    System.out.println("Another approach Interfaces");
    Piano.super.play();
    Guitar.super.play();
}

  }
}
