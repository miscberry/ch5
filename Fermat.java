public class Fermat {
    public static void main(String[] args) {
	if(!checkFermat(5,7,9,3)) System.out.print("No, that doesn’t work.");
	else System.out.print("Holy smokes, Fermat was wrong!");
    }
    
    public static boolean checkFermat(int a, int b, int c, int n) {
	return(Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n) && n>2);
    }
}
