public class PetHospital {

    public void petChildBirth(Animal animal) {
        System.out.println("Сейчас происходят манипуляции");
        animal.born();
        System.out.println("Все успешно");
    }

}
