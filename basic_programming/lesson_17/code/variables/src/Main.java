public class Main {

    public static void main(String[] args) {
        PetHospital petHospital = new PetHospital();
        Cat cat = new Cat("Белая", "сибирская");

        petHospital.helpForAnimal(cat);

        Animal animal = new Dog("Локи", "мальтезе", 2, 8);

        //int a = animal.getNumberOfKnownCommands();

        petHospital.helpForAnimal(animal);

        Crackosyabra crackosyabra = new Crackosyabra();
        petHospital.helpForAnimal(crackosyabra);
    }
}
