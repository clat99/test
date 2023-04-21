import java.io.Console;

public class Program {
  public static void main(String[] args) {
    System.out.print("Enter name  : ");
    Console  console = System.console();
    String name = console.readLine();
    //System.out.println("Name  : "+name);    
    console.printf("Name  : %s\n", name);
  }
}
