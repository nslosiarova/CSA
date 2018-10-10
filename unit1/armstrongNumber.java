public class armstrongNumber{
    public static void main (String args[]){
        int number = 420;
        while (number > 0) {
            System.out.println(number % 10);
            number = number / 10;
        
        }
        int a;
        int b =4;
        a = (++b - 2) % 3;
        System.out.println(a);

        boolean c;
        c = (b + 9!=8) && !(false);
        System.out.print(c);
    }
}