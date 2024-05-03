public class ResultPrinter {

    public void printResult(Person[] people) {
        System.out.println("Всего людей " + people.length);
        System.out.println("Первый человек" + people[0]);
        System.out.println("Последний человек" + people[people.length - 1]);
    }

}
