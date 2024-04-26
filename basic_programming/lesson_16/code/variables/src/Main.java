public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Мурка",  "сфинкс", 10);
        Dog dog = new Dog("Локи", "Мальтийская болонка", 1, 8);
        //Animal animal = new Animal(); нельзя создать объект абстратного класса
        //cat.born();
        //dog.born();

        //каждая кошка - это животное
        //но не каждое животное - кошка

        Cat a = new Cat();

        //каждая кошка - это животное
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        Animal animal3 = new Pig();

        //animal1.born();
        //animal2.born();
        //animal3.born();

        PetHospital petHospital = new PetHospital();

        petHospital.petChildBirth(animal1);
        petHospital.petChildBirth(animal2);
        petHospital.petChildBirth(animal3);

        //Cat cat1 = new Animal();
        //Cat cat2 = new Dog();

    }
}
