import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
7.	Create a java class to 
i.	Create a list of string objects
ii.	Count no.strings whose length  is> 5
iii.	Count no.of empty strings
iv.	Find out empty strings & store them into new list by using Stream API.
*/

class Q7{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Sam");
        list.add("Dam Built");
        list.add("Cam is 64MP");
        list.add("Bam");
        list.add("Jam is sweet");
        list.add("");
        list.add(" ");
        list.add("");
        list.add("");
        int emptyValue=0;
        int lengthgreaterthanFive=0;
        for (String string : list) {
            if(string.length()>5){
                lengthgreaterthanFive++;
                System.out.println(string);
            }
            else if(string.isEmpty()){
                emptyValue++;
            }
        }
        System.out.println("EMpty Strings :"+emptyValue);
        System.out.println("Strings length greater than 5 : "+lengthgreaterthanFive);
        
       
       Stream<String> streamFromlist = list.stream();
       System.out.println("************************Using Streams 1************************");
       streamFromlist.forEach(p -> {
        if(p.length()>5) {
           System.out.println("String > 5 : "+p);
       }
    });

    long count=list.stream().filter(p -> p.isEmpty()).count();
    System.out.println("Number of empty strings in the list : "+count);

    long countGreaterthanFive=list.stream().filter(p -> p.length()>5).count();
    System.out.println("Number of strings in the list, whose length is greater than 5 : "+countGreaterthanFive);

    List<String> filtered = list.stream().filter(p -> p.length()>5).collect(Collectors.toList());
    System.out.println("List of String with length greater than 5 : "+filtered);

    List<String> emptyFiltered = list.stream().filter(p -> p.isBlank()||p.isEmpty()).collect(Collectors.toList());
    System.out.println("List of String with empty or blank values : "+emptyFiltered);

    System.out.println("************************Using Streams 1 END************************");
    
    Stream<String> streamtoList = list.stream();
    System.out.println("************************Using Streams 2 Start************************");
    ArrayList<String> FivelistAno = new ArrayList<String>();
    ArrayList<String> emptyStringlist = new ArrayList<String>();
    streamtoList.forEach(p -> getList(p,FivelistAno,emptyStringlist));
    System.out.println("Greater than five list : "+FivelistAno+" : "+"EMpty or Blank strings list : "+emptyStringlist); 
    System.out.println("Empty String list size :"+emptyStringlist.size());
    System.out.println("************************Using Streams 2 END************************");
    }

    public static void getList(String p,ArrayList<String> list,ArrayList<String> emptylist){
     //   ArrayList<String> list = new ArrayList<String>();
       // list.add(p);
         if(p.length()>5) {
            System.out.println("String > 5 : "+p);
            list.add(p);
        }
        else if(p.isEmpty()){
            emptylist.add(p);
        }
        else if(p.isBlank()){
            System.out.println("Blank add"+p);
            emptylist.add(p);
        }
    }

}