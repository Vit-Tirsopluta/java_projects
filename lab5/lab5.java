package lab5;
import java.util.Objects;

interface Reportable_life {
    void reportAboutLife();
}
interface Reportable_movement{
    void reportAboutMovement();
}

abstract class Planet{
    public String orbitsAround;
    protected String name;
    protected double gravity;
    protected long population;
    private static int planetCount = 0;

    public abstract String getDescription();

    {
        // System.out.println("Створення нового космічного тіла...");
    }

    public Planet(String name, double gravity, long population, String orbitsAround) {
        this.name = name;
        this.gravity = gravity;
        this.population = population;
        this.orbitsAround = orbitsAround;
        planetCount++;
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
    
    public long getPopulation() {
        return population;
    }

    public static int getPlanetCount() {
        return planetCount;
    }
    

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Planet planet = (Planet) obj;
        return Double.compare(planet.gravity, gravity) == 0 &&
            population == planet.population &&
            Objects.equals(name, planet.name);
    }
}

class Earth extends Planet implements Reportable_life{
    
    public Earth() {
        super("Earth", 9.8, 8_200_000_000L, "Sun");
    }
    @Override
    public void reportAboutLife() {
        if (this.population > 0) {
            System.out.println("На планеті " + this.name + " є життя. Населення: " + this.population);
        } else {
            System.out.println("На планеті " + this.name + " немає життя.");
        }
    }

    public String getDescription() {
        return "Земля - третя планета від Сонця, наш дім.";
    }
}

class Moon extends Planet implements Reportable_movement{

    public Moon() {
        super("Moon", 1.62, 0L, "Earth");
    }

    @Override
    public void reportAboutMovement() {
        System.out.println(this.name + " рухається навколо об'єкта: " + this.orbitsAround);
    }

    public String getDescription() {
        return "Місяць - єдиний природний супутник Землі.";
    }
}

public class lab5 {
    public static void main(String[] args) {
        System.out.println("--- Створення об'єктів ---");
        
        Earth earthObj = new Earth(); 
        Planet planetObj = new Moon();

        Reportable_life reportEarth = new Earth();
        Reportable_movement reportMoon = new Moon();
        System.out.println("\n--- Демонстрація роботи об'єктів ---");

        System.out.println("Виклик від типу 'Earth':");
        earthObj.reportAboutLife();
        System.out.println("Гравітація: " + earthObj.getGravity());

        System.out.println("Гравітація: " + planetObj.getGravity());
        
        System.out.println("\nВиклик від типу 'Reportable':");
        reportEarth.reportAboutLife();
        reportMoon.reportAboutMovement();
    }
}