public class Main {
    public static void main(String[] args) {
        short ticketPrice = 16_500; // Стоимость авиабилета
        byte priceMile = 20; // Количество рублей для одной бонусной мили
        short freeMiles = (short) (ticketPrice / priceMile); // формула расчёта бонусных миль
        System.out.println("Бесплатные мили: " + freeMiles);
    }
}