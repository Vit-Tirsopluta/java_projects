package training;
import java.util.Objects;

interface Reportable {
    void reportAboutLife();
    void reportAboutMovement();
}

interface Movable {
    void move();
}

abstract class CelestialBody {
    private String name;

    public String getName() {
        return name;
    }

    CelestialBody(String name) {
        this.name = name;
    }
}

abstract class Planet extends CelestialBody implements Reportable, Movable {
    
    public String orbitsAround;
    protected double gravity;
    private long population;
    private static int planetCount = 0;

    {
        System.out.println("Створення нового космічного тіла...");
    }

    public Planet(String name, double gravity, long population, String orbitsAround) {
        super(name); 
        this.gravity = gravity;
        this.population = population;
        this.orbitsAround = orbitsAround;
        planetCount++;
    }

    public double getGravity() {
        return gravity;
    }

    public long getPopulation() {
        return population;
    }

    public static int getPlanetCount() {
        return planetCount;
    }

    @Override
    public void reportAboutLife() {
        if (this.population > 0) {
            System.out.println("На планеті " + getName() + " є життя. Населення: " + this.population);
        } else {
            System.out.println("На планеті " + getName() + " немає життя.");
        }
    }

    @Override
    public void reportAboutMovement() {
        System.out.println(getName() + " рухається навколо об'єкта: " + this.orbitsAround);
    }

    @Override
    public void move() {
        System.out.println("Планета " + getName() + " рухається по орбіті.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Planet planet = (Planet) obj;
        return Double.compare(planet.gravity, gravity) == 0 &&
            population == planet.population &&
            Objects.equals(getName(), planet.getName());
    }
}


class Earth extends Planet {
    public Earth() {
        super("Earth", 9.8, 8_200_000_000L, "Sun");
    }
}

class Moon extends Planet {
    public Moon() {
        super("Moon", 1.62, 0L, "Earth");
    }
}

class Comet implements Movable {
    private String name;

    public Comet(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("Комета " + this.name + " летить крізь космос.\n");
    }
}

public class SpaceDemo {
    public static void main(String[] args) {
        System.out.println("--- Створення об'єктів ---");

        Movable[] spaceObjects = new Movable[2];
        spaceObjects[0] = new Earth(); 
        spaceObjects[1] = new Comet("Галлея");

        Earth earthObj = new Earth();
        Planet planetObj = new Moon();
        Reportable reportObj = new Earth();

        System.out.println("\n--- Демонстрація роботи масиву Movable ---");
        for (Movable obj : spaceObjects) {
            obj.move();
        }

        System.out.println("\n--- Демонстрація роботи об'єктів (твій код) ---");

        System.out.println("Виклик від типу 'Earth':");
        earthObj.reportAboutLife();
        System.out.println("Гравітація: " + earthObj.getGravity());

        System.out.println("\nВиклик від типу 'Planet':");
        planetObj.reportAboutLife();
        System.out.println("Гравітація: " + planetObj.getGravity());

        System.out.println("\nВиклик від типу 'Reportable':");
        reportObj.reportAboutLife();
    }
}