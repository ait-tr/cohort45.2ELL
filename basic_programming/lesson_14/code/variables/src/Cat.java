public class Cat {

    //2 случая где используем static (1%)
    //1 для создание констант, вместе со словом final (для полей) (90%)
    //2 для создания классов-утилит (где мы не планируем писать в стиле ООП) (10%)

    String name;
    final String type;
    int age;

    static final int MAX_LIVES = 9;


    //overloading
    public Cat(String name, String type, int age) {
        this.name = name;
        this.type = type;
        //две строки сверху можно заменить на this(name, type);
        this.age = age;
    }

    public Cat(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Cat() {
        type = "дворняга";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
