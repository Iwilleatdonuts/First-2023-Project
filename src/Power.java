import java.util.ArrayList;

public class Power {

    int base;
    int exponent;
    
    public Power (int base, int exponent){
        this.base = base;
        this.exponent = exponent;
    }

    public int powerOf(){
        int product = 1;
        ArrayList<Integer> bases = new ArrayList<Integer>();
        for(int i = 1; i < exponent; i++){
            bases.add(base);
        }
        for(int i = 0 ; i <= bases.size(); i++){
            product = product * base;
        }
        return product;
    }
}
