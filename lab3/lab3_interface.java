package lab3;
interface Planet {
    void ReportAboutLife();
    void ReportAboutMovement();
}

class Earth implements Planet{
    public void ReportAboutLife(){
        System.out.println("Here're plenty of people!");
    }
    public void ReportAboutMovement(){
        System.out.println("The Earth is moving around Sun.");
    }
}

class Moon implements Planet{
    public void ReportAboutLife(){
        System.out.println("Here're no anyone.");
    }
    public void ReportAboutMovement(){
        System.out.println("The Moon is moving around Earth.");
    }
}

public class lab3_interface {
    public static void main(String[] args) {
        Planet earth = new Earth();
        Planet moon = new Moon();

        System.out.println("The Earth: ");
        earth.ReportAboutLife();
        earth.ReportAboutMovement();

        System.out.println("The Moon: ");
        moon.ReportAboutLife();
        moon.ReportAboutMovement();
    }
}
