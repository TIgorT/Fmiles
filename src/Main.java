public class Main {
    public static void main(String[] args) {
        short x = 16_500; // Стоимость авиабилета
        byte y = 20; // Количество рублей для одной бонусной мили
        short c = (short) (x / y); // формула расчёта бонусных миль
        System.out.println("Бесплатные мили: " + c);
    }
}