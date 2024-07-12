package ru.aston;

public class Park {

    public static class Attraction {

        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "\nАттракцион" +
                    "\nНазвание: " + name +
                    "\nВремя работы: " + workingHours +
                    "\nСтоимость: " + price;
        }

        public void informationOutput() {
            System.out.println(this);
        }
    }


}

