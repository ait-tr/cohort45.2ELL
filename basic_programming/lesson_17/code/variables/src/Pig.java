public class Pig extends Animal {

    @Override
    void born() {
        System.out.println("свинка счастлива, что родилась");
    }

    @Override
    void readInstruction() {
        System.out.println("1. Сначала уложите ее на бок");
        System.out.println("2. Погладьте");
        System.out.println("3. Вы великолепны!");
    }

}
