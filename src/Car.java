public class Car extends Vehicle implements Checkable{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void whatToCheck() {

        checkEngine();
    }
}