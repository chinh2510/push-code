package bai3;
import java.util.Scanner;
public class MainTamGiac {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("nhap  c: ");
        double c = scanner.nextDouble();

        TamGiac tamGiac = new TamGiac(a, b, c);
        
        System.out.println("tam giac la:");
        System.out.println(tamGiac.toString());
    }
}
