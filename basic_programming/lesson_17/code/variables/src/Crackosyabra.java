public class Crackosyabra extends Animal {

    private int countOfViews;

    @Override
    void born() {
        System.out.println("Никак не рождается. Это фейк");
    }

    @Override
    void readInstruction() {
        System.out.println("1. А кто его знает, что делать");
    }
}
