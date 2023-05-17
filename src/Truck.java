public class Truck extends Vehicle implements Checkable {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void whatToCheck() {

        checkEngine();
        checkTrailer();
    }
}

