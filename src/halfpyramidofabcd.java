public class halfpyramidofabcd {
    public static void main(String[] args) {
        for(int i=1;i<=8;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+i-1));
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
