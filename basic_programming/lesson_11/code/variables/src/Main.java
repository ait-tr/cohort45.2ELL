public class Main {

    public static void main(String[] args) {
        //DRY = Don't repeat yourself
        String nameFirst = "Даниил";
        String nameSecond = "Михаил";
        String nameThird = "Евгений";

        //hello(nameFirst);
        //hello(nameSecond);
        //hello(nameThird);
        int t = 2;

        brushTeeth(2);
        double answer = Math.sqrt(4);

        System.out.println(answer);
        answer++;
    }

    public static void hello(String name) {
        System.out.println();
        System.out.println("Привет, " + name);
        System.out.println("---------------------");
    }

    public static void brushTeeth(int time) {
        System.out.println("Окей, папа, я пошел чистить зубы");
        time--;
        System.out.println("Я буду это делать вот такое количество минут = " + time);
    }

    public static void iAmDaniilAndIWantToTellYouAbout() {

    }



}
