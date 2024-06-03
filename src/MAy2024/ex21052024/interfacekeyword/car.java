package MAy2024.ex21052024.interfacekeyword;

public class car implements Brak, Engine{ //multiple inheritance

    @Override
    public void applyBreak() {
        System.out.println("Applying Break");
    }

    @Override
    public void startengine() {
        System.out.println("Startr engine");

    }

    @Override
    public void stopengine() {
        System.out.println("Stop the Engine");

    }
}
