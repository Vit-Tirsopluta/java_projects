import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Невідома особа";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " рухається.");
    }

    public void talk() {
        System.out.println(fullName + " говорить.");
    }

    @Override
    public String toString() {
        return "Ім'я: " + fullName + ", Вік: " + age;
    }

    public String getFullName() {
        return fullName;
    }
}

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();

        Person person2 = new Person("Іван Петренко", 25);

        System.out.println("--- Демонстрація методів ---");
        person1.talk();
        person1.move();
        person2.move();
        person2.talk();

        List<Person> peopleList = new ArrayList<>();
        peopleList.add(person1);
        peopleList.add(person2);

        String fileName = "java_projects/mkr2/people.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            for (Person p : peopleList) {
                writer.write(p.toString() + "\n");
            }
            System.out.println("\nУспішно записано у файл " + fileName);
        } catch (IOException e) {
            System.out.println("Виникла помилка при записі файлу: " + e.getMessage());
        }
    }
}