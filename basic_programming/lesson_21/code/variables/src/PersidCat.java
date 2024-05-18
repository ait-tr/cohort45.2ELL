public class PersidCat extends Cat {

    @Override
    public void eat(int countOfFood) {
        System.out.println("Персидская кошка сначала 5 минут бесится, перед тем, как поесть");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        super.eat(countOfFood);
    }
}
