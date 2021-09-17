public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weight1 = 75; // вес человека, кг
        double growth1 = 1.80; // рост человека, м
        double BMI1 = service.calculate(weight1, growth1);
        System.out.println("Индекс массы тела: " + BMI1);

    }
}
