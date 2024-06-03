package MAy2024.ex21052024.interfaceinterviewquestios;

public class lab1 {
}
class Shweta extends B1{
    @Override
    public void atb() {
        System.out.println("ATB completed");
    }

    @Override
    void mtb() {

    }
}
abstract class B1 implements course{
    abstract void mtb();
}
interface course{
    void atb();
}