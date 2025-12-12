public class Main {
    public static void main(String[] args) {

        // 1. Создание объекта сервиса
        BmiService service = new BmiService();

        // Входные данные:
        double weight = 98; // Вес в килограммах (например, 98 кг)
        double height = 1.87; // Рост в метрах (например, 1 метр 87 см)

        // 2. Вызов метода calculate и получение результата
        double bmi = service.calculate(weight, height);

        // 3. Печать результата в консоль
        System.out.println("Ваш Индекс Массы Тела (BMI): " + bmi);
    }
}