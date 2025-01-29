import java.util.Scanner;

/**
 * Calculates the Body Mass Index (BMI) based on user's weight and height.
 */
public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);
        String category = getBMICategory(bmi);

        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Your BMI category is: " + category);
    }

    /**
     * Calculates the BMI based on weight and height.
     *
     * @param weight the weight in kg
     * @param height the height in meters
     * @return the calculated BMI
     */
    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    /**
     * Returns the BMI category based on the calculated BMI.
     *
     * @param bmi the calculated BMI
     * @return the BMI category
     */
    private static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}


