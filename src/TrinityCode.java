public class TrinityCode{
    public static void main(String[] args) {
        int one = 4;
        int two = 5;
        int placeholder = one;
        for(int i = 1; i<two;i++){
            one = one*placeholder;
        }
        System.out.println(one);
    }
}