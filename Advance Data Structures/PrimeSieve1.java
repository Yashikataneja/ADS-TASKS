
import java.util.Arrays;

public class PrimeSieve1{
    
    public static void main(String[] args){

        //what is prime sieve?
        //The sieve of Eratosthenese is a highly efficient algo used to find all teh prime numbers up to a given limit N.


        // ?Steps

        //Define the Range :- 
        // initialize the array 
        // create an array of boolean type isPrime of size of n+1 and 
        // initialize all the elements to true (all the ele are prime)
        // set isPrime[0]=isPrime[0]=isprime[1]=false
        // mark non prime numbers 
        // if isPrime[p] is true, mark all the multiples of p as false.

        //start marking from p*p, as smaller multiples of p would already been marked.


        int n=50;
        System.out.println("prime numbers upto 50 are  "+sieve(n));

    }

    public static List<Integer> sieve(int n){{
        boolean[] isPrime=new boolean[n+1];
        Arrays.fill(isPrime,val:true);
        isPrime[0]=false;
        isPrime[1]=false;
        for(int p=2;p*p<=n;p++){
            if(isPrime[p]){
                for(int multiple=p*p;multiple<=n;multiple+=p){
                    isPrime[multiple]=false;
                }
            }
        }
        List<Integer>primes=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(isPrime[i])


        }

    }

    }
}