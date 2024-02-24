import org.apache.commons.math3.fitting.PolynomialCurveFitter;
import org.apache.commons.math3.fitting.WeightedObservedPoints;

public class NonLinearPolynomialRegression {

    public static void main(String[] args) {
        // Sample dataset
        double[][] data = {
            {1, 2},
            {2, 3},
            {3, 4},
            {4, 5},
            {5, 6}
        };

        // Number of coefficients for the polynomial function
        int degree = 2; // You can change the degree of polynomial as needed

        // Fitting a polynomial curve to the data
        double[] coefficients = fitPolynomial(data, degree);

        // Print the coefficients
        System.out.println("Coefficients:");
        for (int i = 0; i < coefficients.length; i++) {
            System.out.println("x^" + i + ": " + coefficients[i]);
        }
    }

    public static double[] fitPolynomial(double[][] data, int degree) {
        WeightedObservedPoints obs = new WeightedObservedPoints();

        // Add data points to the observation set
        for (int i = 0; i < data.length; i++) {
            double x = data[i][0];
            double y = data[i][1];
            obs.add(x, y);
        }

        // Perform polynomial regression
        PolynomialCurveFitter fitter = PolynomialCurveFitter.create(degree);
        return fitter.fit(obs.toList());
    }
}
