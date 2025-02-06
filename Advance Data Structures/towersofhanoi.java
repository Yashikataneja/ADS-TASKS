public class towersofhanoi {
    public static void solve(int n,char source,char rod,char desti){
        if(n==1){
            System.out.println("Move Disk 1 from "+source+" to "+desti);
            return;
        }
        solve(n-1,source,desti,rod);
        System.out.println("Move Disk "+n+" from "+source+"to"+desti);  
        solve(n-1,rod,source,desti);
    }

    public static void main(String[] args) {
        int n=3;
        solve(n,'A','B','C');
    }
    
}
