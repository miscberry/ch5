import java.util.Scanner;

public class Quadratic {
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
	
	double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
	double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
	
	if(Math.pow(b, 2) - 4*a*c <0) System.out.print("no real roots");
	else if(a == 0) System.out.print("a can't be 0");
	else if(Math.pow(b, 2) - 4*a*c ==0) System.out.print(x1);
	else System.out.print(x1+", "+x2);
    }
}
