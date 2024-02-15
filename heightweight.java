import java.util.Scanner;
public class heightweight {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter height");
    int d = sc.nextInt();
    System.out.println("Enter weight");
    int f = sc.nextInt();

    int x = d - f;

    if (x == 100) {
      System.out.println("Normal weight");
    } else if (x > 100) {
      System.out.println("Underweight  " + ((d - f) - 100) + "kq");
    } else if (x < 100) {
      System.out.println("Overweight  " + (100 - (d - f)) + "kq");
    }
  }
}
