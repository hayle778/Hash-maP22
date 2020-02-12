import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exc {
public static void main(String[]args){
Scanner input = new Scanner( System.in );
  //  Map map = new HashMap( );

 //   map.put( "Eng", 23 );
  //  map.put("Amh", 45);

    HashMap<String, Integer> zork = new HashMap<String , Integer>(  );
String gee="";

     zork.put("yes", 1);
     zork.put("no",0 );
     zork.put("alright",25);
     zork.put( "", 3 );
     zork.put( "oky", 666 );
     zork.put( "yess", 1500 );

     System.out.println( "user:"+ "Do you gonna offer for me a room?" );
     System.out.println( "zork:" + zork.put("yes", 1 ));
     System.out.println( "user:" + "Can you offer for me a discount?");
     System.out.println( "zork:" + zork.put("alright",25));
     System.out.println( "user:" + "How many bed rooms you have?");
     System.out.println( "zork:" + zork.put( "",3 )+ ": do you have any other question?");
     System.out.println( "user:" + ":"+ input.nextLine() );
     // String x = input.nextLine();
     System.out.println("Zork:" + zork.put(  "", 254) );

     // for inhance loop

  //   for (Integer key : map.values()) {
  //      System.out.println("Key = " + key);
  //  }
     System.out.println( "user" + "How much you gonna charge me per room?");
     System.out.println( "Zork" + zork.put( "oky", 666 ));
     System.out.println( "user" + "How much you charge me for all room");
     System.out.println( "user"+ zork.put( "yess", 1500 ) );

     // for inhance loop
    // for ( String X : zork){
    //     System.out.println( ""+ zork );
    // }



          int y = 0;
     for(y=0; y < 3;y++){
     System.out.println( "" + zork );




     }

}


}
