package lab3;
abstract class Planet{
    public void ReportAboutLife(){};
    public void ReportAboutMovement(){};
    public void Population(){};
    public void Gravity(){};
}
class Earth extends Planet{
    public void ReportAboutLife(){
        System.out.println("Here're plenty of people!");
    }
    public void ReportAboutMovement(){
        System.out.println("The Earth is moving around Sun.");
    }
    public void Population(){
        System.out.println("Here're 8.2 billion people");
    }
    public void Gravity(){
        System.out.println("The gravity on The Earth is 9.8");
    }
}

class Moon extends Planet{
    public void ReportAboutLife(){
        System.out.println("Here're no anyone.");
    }
    public void ReportAboutMovement(){
        System.out.println("The Moon is moving around Earth.");
    }
    public void Population(){
        System.out.println("There's nobody");
    }
    public void Gravity(){
        System.out.println("The gravity on The Moon is 1.62");
    }
}


public class lab3_abstract {
    public static void main(String[] args) {
        Planet earth = new Earth();
        Planet moon = new Moon();

        System.out.println("The Earth:");
        earth.ReportAboutLife();
        earth.ReportAboutMovement();
        earth.Population();
        earth.Gravity();

        System.out.println("\nThe Moon:");
        moon.ReportAboutLife();
        moon.ReportAboutMovement();
        moon.Population();
        moon.Gravity();
    }
}
