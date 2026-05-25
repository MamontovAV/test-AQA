package lesson_03;

class Park {
    private String parkName;

    public Park(String parkName) {
        this.parkName = parkName;
    }

    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void displayInfo() {
            System.out.println(" Аттракцион: " + name);
            System.out.println(" Время работы: " + workingHours);
            System.out.println(" Стоимость: " + cost + " руб.");
            System.out.println("   -----------------------------");
        }

        public String getName() { return name; }
        public String getWorkingHours() { return workingHours; }
        public double getCost() { return cost; }
    }

    public void displayParkInfo(Attraction[] attractions) {
        System.out.println("Парк: " + parkName);
        System.out.println("Аттракционы:");
        for (Attraction a : attractions) {
            a.displayInfo();
        }
    }
}
