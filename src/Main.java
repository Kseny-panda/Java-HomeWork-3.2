public class Main {
    public static void main(String[] args) {

        BmiService index = new BmiService();

        System.out.println();
        System.out.println("Рост: " + 1.87 + " метра, вес: " + 98 + " кг");
        System.out.println("Индекс массы тела: " + index.calculate(1.87, 98));

        System.out.println();
        System.out.println("Рост: " + 1.56 + " метра, вес: " + 45 + " кг");
        System.out.println("Индекс массы тела: " + index.calculate(1.56, 45));

        System.out.println();
        System.out.println("Рост: " + 1.79 + " метра, вес: " + 68 + " кг");
        System.out.println("Индекс массы тела: " + index.calculate(1.79, 68));

    }
}