import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber {
    public static void main(String[] args) {
	Random r = new Random();
	int ran = r.nextInt(100) + 1;
	int num = 0;
	
	check(ran,num);
	System.out.print("YOU GOT THE NUMBER!!!");
    }
    
    public static void check(int ran, int num) {
	if(ran != num) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("What number did I pick? ");
	    num = in.nextInt(); 
	    System.out.println(Math.abs(ran-num));
	    check(ran,num);
	}
    }
}

