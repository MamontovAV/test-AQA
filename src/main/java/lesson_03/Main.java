package lesson_03;

public class Main {
    public static void main(String[] args) {

        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5599, true);

        productsArray[1] = new Product("iPhone 16 Pro", "15.03.2025",
                "Apple Inc.", "USA", 7899, false);

        productsArray[2] = new Product("Sony WH-1000XM6", "10.01.2025",
                "Sony Corporation", "Japan", 3499, true);

        productsArray[3] = new Product("LG OLED TV", "20.12.2024",
                "LG Electronics", "South Korea", 12999, false);

        productsArray[4] = new Product("Nike Air Max", "05.02.2025",
                "Nike Inc.", "USA", 2499, true);


        System.out.println("========== ИНФОРМАЦИЯ О ТОВАРАХ ==========");
        for (int i = 0; i < productsArray.length; i++) {
            System.out.println("Товар #" + (i + 1) + ":");
            productsArray[i].displayInfo();
        }


        System.out.println("========== ИНФОРМАЦИЯ О ПАРКЕ ==========");

        Park dreamPark = new Park("Dreamland Park");

        Park.Attraction attraction1 = dreamPark.new Attraction("Американские горки", "10:00-21:00", 500);
        Park.Attraction attraction2 = dreamPark.new Attraction("Колесо обозрения", "09:00-23:00", 300);
        Park.Attraction attraction3 = dreamPark.new Attraction("Комната страха", "11:00-20:00", 400);
        Park.Attraction attraction4 = dreamPark.new Attraction("Автодром", "10:00-22:00", 350);
        Park.Attraction attraction5 = dreamPark.new Attraction("Водные горки", "10:00-21:00", 250);

        Park.Attraction[] attractions = {attraction1, attraction2, attraction3, attraction4, attraction5};

        dreamPark.displayParkInfo(attractions);
    }
}