package c08;
/***
 * @author dayscounting
 * 重点为toString && printAll的封装吧
 */
import java.util.*; 

class Hamster { 
  private int hamsterNumber; 
  Hamster(int i) { 
    hamsterNumber = i; 
  } 
  public String toString() { 
    return "This is Hamster #" + hamsterNumber; 
  } 
} 
 
class Printer { 
  static void printAll(Enumeration e) { 
    while(e.hasMoreElements()) 
      System.out.println( 
        e.nextElement().toString()); 
  } 
} 
 
public class hantser { 
  public static void main(String[] args) { 
    Vector v = new Vector(); 
    for(int i = 0; i < 3; i++) 
      v.addElement(new Hamster(i)); 
    Printer.printAll(v.elements()); 
  } 
} ///: ̄ 