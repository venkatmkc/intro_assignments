import java.util.ArrayList;

public class Main {
    public static void simplest_exercise(){
        System.out.println("*");
    }
    public static void horizontal_line(int length)
    {
        for(int i=0;i<length;i++)
            System.out.print("*");
        System.out.println();
    }
    public static void vertical_line(int length)
    {
        for(int i=0;i<length;i++)
            System.out.println("*");
    }
    public static  void right_triangle(int length)
    {
        for(int i=0;i<length;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void isosceles_triange(int length)
    {
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<(length-i-1);j++)
                System.out.print(" ");
            for(int j=0;j<i*2+1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void diamond(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < (length - i - 1); j++)
                System.out.print(" ");
            for (int j = 0; j < i * 2 + 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(" ");
            for (int j = 0; j < (length - i) * 2 - 3; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void diamond_with_name(int length,String name)
    {
        for(int i=0;i<length-1;i++)
        {
            for(int j=0;j<(length-i-1);j++)
                System.out.print(" ");
            for(int j=0;j<i*2+1;j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println(name);
        for(int i=0;i<length-1;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print(" ");
            for(int j=0;j<(length-i)*2-3;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void fizzbuzz()
    {
        for(int i=1;i<=100;i++)
        {
            if(i%3==0&&i%5==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
    public static ArrayList<Integer> prime_factors(int number)
    {
        int limit=number/2;
        Boolean[] primes=new Boolean[limit+1];
        for(int i=2;i<=limit;i++)
            primes[i]=true;
        for(int i=2;i<=limit;i++) {
            if (primes[i]) {
                int cur = i * 2;
                for (int j = 2; cur <= limit; j++) {
                    primes[cur] = false;
                    cur = i * (j + 1);
                }
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=2;i<=limit;i++) {
            if (primes[i] && number % i == 0)
                result.add(i);
        }
        return result;
    }
    public static void print_list(ArrayList<Integer> list)
    {
        for(int i:list)
        {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        simplest_exercise();
        System.out.println();
        horizontal_line(5);
        System.out.println();
        vertical_line(3);
        System.out.println();
        right_triangle(3);
        System.out.println();
        isosceles_triange(3);
        System.out.println();
        diamond(3);
        System.out.println();
        diamond_with_name(3, "Venkat");
        System.out.println();
        fizzbuzz();
        System.out.println();
        print_list(prime_factors(3));
    }
}
