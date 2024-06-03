package MAy2024.ex18052024;

import java.util.concurrent.Callable;

public class hasArelationship {

        public  void main(String[] args) {
            Engine engine = new Engine();
            Car car = new Car(engine);

            car.start(); // This will start the engine
        }


    class Car {

        private Engine engine;

        public Car(Engine engine) {
            this.engine = engine;
        }

        public void start() {
            engine.start();
        }
    }

    class Engine {
        public void start() {
            System.out.println("Engine started.");
        }
    }

}
