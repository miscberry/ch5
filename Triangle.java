import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	
	System.out.print("a: ");
	if (!in.hasNextInt()) {
            String bad = in.next();
            System.err.println("error: " + bad + " is not an integer");
            return;
        }
	int a = in.nextInt();
	
	System.out.print("b: ");
	if (!in.hasNextInt()) {
            String bad = in.next();
            System.err.println("error: " + bad + " is not an integer");
            return;
        }
	int b = in.nextInt();
	
	System.out.print("c: ");
	if (!in.hasNextInt()) {
            String bad = in.next();
            System.err.println("error: " + bad + " is not an integer");
            return;
        }
	int c = in.nextInt();
	
	if (Math.min(a,Math.min(b,c)) <= 0) System.out.print("error: length must be positive");
	else if (Math.max(a,Math.max(b,c)) > a+b+c-Math.max(a,Math.max(b,c))) System.out.print("not a triangle");
	else System.out.print("valid triangle");
    }
}
