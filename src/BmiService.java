public class BmiService {

    // Метод принимает вес (в кг) и рост (в метрах)
    // и возвращает BMI (дробное число - double)
    public double calculate(double weightKg, double heightM) {

        // Рост в квадрате (heightM * heightM)
        double heightSq = heightM * heightM;

        // Формула: Вес / Рост^2
        double bmi = weightKg / heightSq;

        return bmi;
    }
}