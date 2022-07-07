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
    if(Integer.parseInt(s) == 3){
      return "FooFoo";
    } else if (Integer.parseInt(s) == 5) {
      return "BarBar";
    }

    return s;
  }
}