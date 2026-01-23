package recursion.basics;

public class PrintingName {

    public static void main(String[] args) {
        print(1,5);
    }

    static void print(int count,int n){
        if (count > n)
            return;
        System.out.println(count+".Nurhasan");
        print(count+1,n);
    }
}
