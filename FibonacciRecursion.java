/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccirecursion;
/**
 *
 * @author Sushil Kumar
 */
import java.util.Scanner;
public class FibonacciRecursion {

    /**
     * @param args the command line arguments
     */
    private int terms;
    FibonacciRecursion()
    {
        terms=15;
    }
    FibonacciRecursion(int terms)
    {
        this.terms=terms;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER HOW MANY TERMS OF FIBONACCI SERIES YOU WANT TO PRINT");
        terms=sc.nextInt();
    }
    int fibo(int n)
    {
        if(n==1)
        return 0;
        else if(n==2)
            return 1;
        else
            return fibo(n-1)+fibo(n-2);
    }
    void generate()
    {
        for(int i=1;i<=terms;i++)
        {
            System.out.print(fibo(i)+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        FibonacciRecursion f1=new FibonacciRecursion();
        f1.generate();
        FibonacciRecursion f2=new FibonacciRecursion(8);
        f2.generate();
        FibonacciRecursion f3=new FibonacciRecursion();
        f3.input();
        f3.generate();
    }
    
}
