public class PetHospital {

    public void helpForAnimal(Animal animal) {
        System.out.println("Сейчас будет прочитана инструкция");
        animal.readInstruction();
        System.out.println("Сейчас оказывается помощь " + animal.getClass());
        animal.born();
    }

}
