package edu.pdx.cs410J.JoshuaAndKyle;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);




  }

  public String compute(String s) {
    int number = Integer.parseInt(s);
    StringBuilder sb = new StringBuilder();

    if(number % 3 == 0){
      sb.append("Foo");
    } 
    
    if (number % 5 == 0) {
      sb.append("Bar");
    }

    if (number % 7 == 0) {
      sb.append("Qix");
    }

    for (char c: s.toCharArray()) {
      if (c == '3') {
        sb.append("Foo");
      }
  
      if (c == '5') {
        sb.append("Bar");
      }

      if (c == '7') {
        sb.append("Qix");
      }
    }

    // if input string contains a 3, add Foo to our String
    

    if (sb.length() == 0) {
      sb.append(s);
    }

    

    // return our string from stringbuilder
    return sb.toString();
  }
}