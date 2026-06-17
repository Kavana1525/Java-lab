public class TransposeMatrix {
    public static void main(String[] args) {

        int A[][] = {
                {1,2,3},
                {4,5,6}
        };

        System.out.println("Transpose:");

        for(int i=0;i<3;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(A[j][i]+" ");
            }
            System.out.println();
        }
    }
}