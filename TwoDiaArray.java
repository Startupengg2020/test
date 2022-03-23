package capgemini;

public class TwoDiaArray {
    static void multidim(){
        int a[][] = { {3,2,7},
                {4,5},
                {6,7,2,1}
        };
        System.out.println("a.length = " + a.length);
        for(int i=0;i<a.length;i++){
            System.out.println("a[i].length = " + a[i].length);
            for(int j=0;j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        multidim();
    }
}
