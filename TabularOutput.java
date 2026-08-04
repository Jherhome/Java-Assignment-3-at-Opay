public class TabularOutput {
    public static void main(String[] args) {

        System.out.printf("N  " + "N2  " + "N3  " + "N4  %n" );
        int n;
        int n2 = 1;
        int n3 = 1;
        int n4 = 1;

        for (n = 1; n <= 5; n++) {
             n2 = n * n;
             n3 = n * n * n;
             n4 = n * n * n * n;

             System.out.printf(  n + "  " + n2 +"   " + n3 +"  " +n4 +"%n");
        }



    }
}
