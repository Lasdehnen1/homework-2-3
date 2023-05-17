public class ServiceStation {


    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            car.checkVehicle(car);
        }
        if (bicycle != null) {
            bicycle.checkVehicle(bicycle);
        }
        if (truck != null) {
            truck.checkVehicle(truck);
        }
    }
}