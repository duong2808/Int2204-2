package lab03.tu;

import java.util.Scanner;

public class Cau1 {


	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
    	System.out.print("Nhập số nguyên a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên b = ");
        int b = scanner.nextInt();
        System.out.println("USCLN của " + a + " và " +  b + " là: " + USCLN(a, b));
        System.out.print("Nhập số nguyên = ");
        int n = scanner.nextInt();
        System.out.println(n + "số đầu tiên của dãy số fibonacci: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(fibonacci(i) + " ");
        }

    }
        public static int USCLN(int a, int b) 
    {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
        public static int fibonacci(int n) 
        {
            int f0 = 0;
            int f1 = 1;
            int fn = 1;
     
            if (n < 0) 
            {
                return -1;
            } else if (n == 0 || n == 1)
            {
                return n;
            } else 
            {
                for (int i = 2; i < n; i++) 
                {
                    f0 = f1;
                    f1 = fn;
                    fn = f0 + f1;
                }
            }
            return fn;
        }
 }
