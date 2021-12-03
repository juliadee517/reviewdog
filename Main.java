// Your First Program
class Main {
  
  // You should not change this method
  public static void main(String[] args) {
    printHello();
    printStarPiramid();
    printFace();
  }
  
  /**
   * This method should print the below statement.
   * "Hello, CSS 142 Student!"
   */
  public static void printHello() {
    System.out.println("Hello, CSS 142 Student!");
  }

  /**
   *This method print out a piramid of stars:
   *"    *
   *    ***
   *   *****
   *  *******
   * *********"
   * 
   * <p>Note: You need to print out the String between 2 quotation marks (").
   *       There should be a new line printed at the end of each line.
   *       To print a new line, you can use '\n' or println.
   *       There should be no space after the stars.
   */
  public static void printStarPiramid() {
    System.out.println("    *");
    System.out.println("   ***");
    System.out.println("  *****");
    System.out.println(" *******");
    System.out.println("*********");
  }
    
  /** 
   * This method print out a face:
   *  +"""""+          
   * [| o o |]        
   *  |  ^  |
   *  | '-' |
   *  +-----+
   *  
   * <p>Note: You need to print out the String between 2 quotation marks (").
   *     There should be a new line printed at the end of each line.
   *     To print a new line, you can use '\n' or println.
   *     There should be no space after the String at each line.
   */
  public static void printFace() {
    System.out.println(" +\"\"\"\"\"+");
    System.out.println("[| o o |]");
    System.out.println(" |  ^  |");
    System.out.println(" | '-' |");
    System.out.println(" +-----+");
  }
  
  /** 
   *This method violates from CheckStyle rules.
   *Fix all code lines that cause a checkstyle warming
   */
  public static void printLongSentence() {
    System.out.print("This is a very long sentence that contains over 100 characters,");
    System.out.print("and it should cause a warming in checkstyle!\n");
    
    int num1 = 0; 
    double num2 = 2.5; 
    String string1 = "Hello World!";
    
    System.out.println(num1); 
    System.out.println(num2); 
    System.out.println(string1);
  }
}
