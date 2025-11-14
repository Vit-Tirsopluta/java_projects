package lab4;
import java.util.Objects;

abstract class Planet {

    // ЗАВДАННЯ 2:
    public String orbitsAround;
    private String name;
    protected double gravity;
    private long population;

    // ЗАВДАННЯ 3:
    private static int planetCount = 0;

    public abstract String getDescription();

    {
        System.out.println("Створення нового космічного тіла...");
    }

    // ЗАВДАННЯ 1:
    public Planet(String name, double gravity, long population, String orbitsAround) {
        this.name = name;
        this.gravity = gravity;
        this.population = population;
        this.orbitsAround = orbitsAround;
        planetCount++;
    }

    // Допоміжний конструктор
    public Planet(String name) {
        this(name, 0.0, 0L, "Unknown");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public static int getPlanetCount() {
        return planetCount;
    }
    
    public void reportAboutLife() {
        if (this.population > 0) {
            System.out.println("На планеті " + this.name + " є життя. Населення: " + this.population);
        } else {
            System.out.println("На планеті " + this.name + " немає життя.");
        }
    }

    public void reportAboutMovement() {
        System.out.println(this.name + " рухається навколо об'єкта: " + this.orbitsAround);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Planet planet = (Planet) obj;
        return Double.compare(planet.gravity, gravity) == 0 &&
        population == planet.population && Objects.equals(name, planet.name);
    }
}

class Earth extends Planet {
    public Earth() {
        super("Earth", 9.8, 8_200_000_000L, "Sun");
    }
    public String getDescription() {
        return "Земля - третя планета від Сонця, наш дім.";
    }
}

class Moon extends Planet {
    public Moon() {
        super("Moon", 1.62, 0L, "Earth");
    }
    public String getDescription() {
        return "Місяць - єдиний природний супутник Землі.";
    }
}


public class lab4 {
    public static void main(String[] args) {
        System.out.println("--- Створення об'єктів ---");
        Planet earth = new Earth();
        Planet moon = new Moon();

        System.out.println("\n--- Базова інформація ---");
        earth.reportAboutLife();
        earth.reportAboutMovement();
        System.out.println(earth.getDescription());

        System.out.println("Гравітація на Землі: " + earth.getGravity());

        System.out.println();

        moon.reportAboutLife();
        moon.reportAboutMovement();
        System.out.println(moon.getDescription());
        System.out.println("Гравітація на Місяці: " + moon.getGravity());

        //ЗАВДАННЯ 3:
        System.out.println("\n--- Демонстрація роботи статичного поля ---");
        System.out.println("Всього створено об'єктів Planet: " + Planet.getPlanetCount());

        //ЗАВДАННЯ 4:
        System.out.println("\n--- Демонстрація порівняння об'єктів ---");
        Planet earth2 = new Earth();
        System.out.println("Всього створено об'єктів Planet: " + Planet.getPlanetCount());
        
        System.out.println("Порівняння 'earth' та 'moon': " + earth.equals(moon)); 
        System.out.println("Порівняння 'earth' та 'earth2': " + earth.equals(earth2));
    }
}