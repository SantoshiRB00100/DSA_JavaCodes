package DSA_JavaCodes.Recursion;

public class placeTiles {
    public static int placeTls(int n, int m){
        if(n == m){
            return 2;
        }

        if(n < m){
            return 1;
        }
        
        //verticle
        int vertPlace = placeTls(n-1, m);

        //horizontal

        int horiPlace = placeTls(n-m, m);

        return vertPlace + horiPlace;
    }

    public static void main(String[] args) {
        int n = 4, m=2;
        System.out.println(placeTls(n,m));
    }
}
