package One;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return "Мяу";
    }
}
