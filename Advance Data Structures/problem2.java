public class problem2 {

    public static void main(String[] args){

        //given two integers L and R, find how many prime numbers 
        // lie between l and r 

        int L=10; int R=30;
        System.out.println("Prime numbers between l and r are "+countP(L,R));

    }

    public static int countP(int L,int R){
        int[]primes=new int[R+1];
        for(int i=0;i<=R;i++){
            primes[i]=1;
        }

        primes[0]=primes[1]=0;
        for(int i=2;i*i<=R;i++){
            if(primes[i]==1){
                for(int j=i*i;j<=R;j+=1){
                    primes[j]=0;
                }
            }
        }
        int count=0;
        for(int i=L;i<=R;i++){
            if(primes[i]==1){
                count++;
            }
        }
        return count++;
    }

    
}
