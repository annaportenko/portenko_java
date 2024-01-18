package portenko_java_task_aston;
import java.util.Scanner;
public class task_1 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print ("Введите число больше 7: ");
		int number = scan.nextInt ();
		while (!scan.hasNextInt() && scan.hasNext()) {
		    System.out.println ("Ошибка ввода: "  + scan.next());
		}
		if (number>7) { 
			System.out.println ("Привет");
		}
		else if (number<7) {
			System.out.println ("Вы ввели число меньше 7, попробуйте еще раз.");	
		}
		else if (number==7) {
			System.out.println ("Вы ввели число равное 7, попробуйте еще раз.");
		}
	}
}