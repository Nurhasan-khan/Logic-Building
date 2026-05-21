package recursion.basics;

public class TowerOfHanoi {
    public static void main(String[] args) {
        solve('A','C','B',3);
    }
    static void solve(char src,char dest , char aux , int n){
        if (n == 1) {
            System.out.println("Move Disk " + n + " From Source " + src + " to destination " + dest);
            return;
        }
        solve(src,aux,dest,n-1);
        System.out.println("Move Disk "+n+" From source "+src+" to destination "+dest);
        solve(aux,dest,src,n-1);
    }
}
