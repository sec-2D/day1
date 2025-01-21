1)public class Main {
    static void printnum(int n) 
    {
        if (n == 5)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n); 
        printnum(n+1);
    }
    public static void main(String[] args) 
    {
        printnum(1);
        
    }
}
2)
public class Main {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; 
        System.out.println(fibonacci(n));
    }
}
3)
public class Main {
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }
    public static void main(String[] args) {
        int number = 12345;
       System.out.println(sumOfDigits(number));
    }
}
4)
public class Main {
    static int digitSum(int n) {
        if (n < 10) {
            return n;
        }
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return digitSum(sum);
    }
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(digitSum(number));
    }
}
5)
public class Main {
    static void decimalToBinary(int n) {
        if (n == 0) {
            return; 
        }
        decimalToBinary(n / 2); 
        System.out.print(n % 2); 
    }
    public static void main(String[] args) {
        int decimal = 10; 
        decimalToBinary(decimal); 
    }
}
