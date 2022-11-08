import java.util.Scanner;
	public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
 
    System.out.print("身長を入力してください：");
    double height = stdIn.nextDouble(); 
    System.out.print("体重を入力してください：");
    double weight = stdIn.nextDouble();  
      double bmi = weight / Math.pow(height, 2);
      double b=((double)Math.round(bmi*100))/100;
 	System.out.println(b);

	}
	}
