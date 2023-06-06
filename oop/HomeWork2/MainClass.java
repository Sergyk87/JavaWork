package oop.HomeWork2;

public class MainClass {
    public static void main(String[] args) {

        // Cat cat = new Cat("Barsik", 5);

        Cat[] cats = { new Cat("Barsik", 5),
                new Cat("Tolstyj", 20),
                new Cat("CotVsapogah", 10) };

        int plateSize = 15;
        Plate plate = new Plate(plateSize);

        plate.info();

        for (Cat cat : cats) {
            if (cat.getAppetite() <= plate.getFood()) {
                catEat(plate, cat);
            } else {
                System.out.printf("Еды не хватило, %s остался голодным\nНужно добавить еды!", cat.getName());
                System.out.println();
                plate.addFood(plateSize);
                System.out.println("Наполнили тарелку");
                plate.info();
                catEat(plate, cat);

            }
            plate.info();
            System.out.println();
        }

    }

    public static void catEat(Plate plate, Cat cat) {
        if (cat.getAppetite() <= plate.getFood()) {
            plate.setFood(plate.getFood() - cat.getAppetite());
            cat.setSatiety(true);
            System.out.printf("%s - поел %d \n", cat.getName(), cat.getAppetite());
        }

        else
            System.out.println("Тут нужна тарелочка побольше...этой точно не хватит");
        cat.setSatiety(false);

    }
}

/*
 * Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
 * Допустим, в программе есть класс Кот. У кота есть кличка и аппетит (сколько
 * единиц еды он потребляет за приём
 * пищи). Эти поля мы заполняем с помощью конструктора. Также есть метод eat(),
 * который заставляет
 * кота покушать, но пока что он пустой, так как неизвестно, откуда кот должен
 * брать еду:
 * 
 * public class Cat {
 * private String name;
 * private int appetite;
 * public Cat(String name, int appetite) {
 * this.name = name;
 * this.appetite = appetite;
 * }
 * public void eat() { }
 * }
 * Чтобы можно было хранить еду, создадим класс Тарелка с полем food (еда
 * измеряется в целых
 * числах и не важно, что это за единицы измерения). При создании тарелки мы
 * можем указать
 * начальное значение food. В процессе работы с помощью метода info() можно
 * вывести в консоль
 * информацию о тарелке.
 * 
 * public class Plate {
 * private int food;
 * public Plate(int food) {
 * this.food = food;
 * }
 * public void info() {
 * System.out.println("plate: " + food);
 * }
 * }
 * Если в методе main() создать объекты этих классов, то можно узнать информацию
 * о тарелке и
 * вызвать пустой метод eat() у кота. Эти объекты пока никак не могут
 * взаимодействовать между собой.
 * Можно добавить в классы геттеры и сеттеры и получить код вроде.
 * 
 * public class MainClass {
 * public static void main(String[] args) {
 * Cat cat = new Cat("Barsik", 5);
 * Plate plate = new Plate(100);
 * plate.info();
 * cat.eat();
 * plate.setFood(plate.getFood() - cat.getAppetite());
 * }
 * }
 * ЗАДАНИЕ
 * 
 * 1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного
 * количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
 * 2. Каждому коту нужно добавить поле сытость (когда создаем котов, они
 * голодны). Если коту удалось покушать (хватило еды), сытость = true.
 * Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то
 * есть не может быть наполовину сыт (это сделано для упрощения логики
 * программы).
 * 3. Создать массив котов и тарелку с едой, попросить всех котов покушать из
 * этой тарелки и потом вывести информацию о сытости котов в консоль.
 * 4. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в
 * тарелку.
 * Достаточно выполнить первые 2 подпункта задачи.
 */