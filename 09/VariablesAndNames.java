public class VariablesAndNames {
        public static void main(String[] args) {
            int cars, drivers, passengers, carsNotDriven, carsDriven;
            double spaceInCar, carpoolCapacity, averagePassengersPerCar;
            
            //assign the value 100 to the variable "cars"
            cars = 100;
            //changing this below didnt make a difference
            spaceInCar = 4;
            //assign the value 30 to the variable "drivers"
            drivers = 30;
            //assign the value 90 to the variable "passengers"
            passengers = 90;
            carsNotDriven = cars - drivers;
            carsDriven = drivers;
            carpoolCapacity = carsDriven * spaceInCar;
            averagePassengersPerCar = passengers / carsDriven;
            
            System.out.println("There are " + cars + " cars available.");
            System.out.println("There are only " + drivers + " drivers available.");
            System.out.println("There will be " + carsNotDriven + " empty cars today.");
            System.out.println("We can transport " + carpoolCapacity + " people today.");
            System.out.println("We have " + passengers + " to carpool today.");
            System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
           

        
        }
}
