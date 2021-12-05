package pro.sky.javadev.c2lesson1;

public class Car extends Vehicle {

    protected static final int WHEELS_COUNT = 4;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car(String modelName) {
        this(modelName, WHEELS_COUNT);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}
