public class CEMCCayley2011Q20 {
    public static void main(String[] args) {

        for(int n = 1; n <= 100; n++){
            double calculate = (n*n*n) + (5*n*n);
            double answer = Math.sqrt(calculate);
                System.out.println(answer);
        }
    }
}
