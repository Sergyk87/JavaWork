public class Cat {
    private String name = null; // поле класса (field)
    private String breed = null; // порода

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public boolean equals(Object other) { // метод (method)
        return true;
    }
}
