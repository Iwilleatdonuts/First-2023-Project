public class CEMCCayley2017Q22 {
    public static void main(String[] args) {

        for(int start = 1; start < 42; start++){

            double bottomRectanglePerim = start*2 + 84;
            
            double ps = 42-start;
            double psTop = (bottomRectanglePerim - 2*ps)/2;
            double leftRectanglePerim = 2*ps + 2*psTop;

            double pq = 42-psTop;
            double shadedRectanglePerim = ps+2*pq;

             if(shadedRectanglePerim == leftRectanglePerim){
                double shadedRectangleArea = (ps/2)*(pq);

                System.out.println("The perimeter of the rectangles are " + shadedRectanglePerim);
                System.out.println("The area of the shaded rectangle is "+ shadedRectangleArea);
                return;
             }
        }
    }
}
