public class ExamTask {

    public static void main(String[] args) {
        //есть 5 учеников школы, они написали тест по иностранному языку. Каждый получил от 0 до 100 баллов
        //найдите наибольший результат

        int[] marks = new int[5];

        marks[0] = 78;
        marks[1] = 56;
        marks[2] = 34;
        marks[3] = 89;
        marks[4] = 12;

        int min = marks[0];

        for (int index = 0; index < marks.length; index++) {
            if (marks[index] < min) {
                min = marks[index];
            }
        }

        System.out.println(min);


    }
}
