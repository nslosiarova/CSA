public class loops{

    public static void main(String[] args){
        //the value has to be stored in doubles because of Math.pow()
        double a = 2;
        double b = 0;
        double sum=0;
        
        for(double c = 0; c<=64; c++){
            //a^c (e.g. 2^0=1 so b has value 1 now)
            b= Math.pow(a, c);
            // sum = 0 + 1
            sum =  sum + b;
            System.out.println(sum);
            //now it prints the sum instead of the value of b
        }
    }
}