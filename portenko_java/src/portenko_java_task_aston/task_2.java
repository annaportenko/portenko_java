package portenko_java_task_aston;
import java.util.Scanner;
public class task_2 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print ("Введите имя: ");
		String name = scan.nextLine ();
		if (name.equals("Вячеслав")) { 
			System.out.println ("Привет, Вячеслав");
		}
		else {
			System.out.println ("Нет такого имени");
		}
	}
}
