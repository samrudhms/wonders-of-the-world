
class Wonder {

    void displayInfo() {
        System.out.println("This is one of the Seven Wonders of the World.");
    }
}

class GreatWallOfChina extends Wonder {

    void displayInfo() {
        System.out.println(" Great Wall of China China");
    }
}

class Petra extends Wonder {

    void displayInfo() {
        System.out.println(" Petra Jordan");
    }
}

class ChristTheRedeemer extends Wonder {

    void displayInfo() {
        System.out.println("Christ the Redeemer Brazil");
    }
}

class MachuPicchu extends Wonder {

    void displayInfo() {
        System.out.println(" Machu Picchu Peru");
    }
}

class ChichenItza extends Wonder {

    void displayInfo() {
        System.out.println(" Chichen Itza Mexico");
    }
}

class RomanColosseum extends Wonder {

    void displayInfo() {
        System.out.println(" Roman Colosseum Italy");
    }
}

class TajMahal extends Wonder {

    void displayInfo() {
        System.out.println(" Taj Mahal India");
    }
}

public class SevenWonders {

    public static void main(String[] args) {
        Wonder[] wonders = {
            new GreatWallOfChina(),
            new Petra(),
            new ChristTheRedeemer(),
            new MachuPicchu(),
            new ChichenItza(),
            new RomanColosseum(),
            new TajMahal()
        };

        System.out.println(" The Seven Wonders of the World:");
        for (Wonder w : wonders) {
            w.displayInfo();
        }
    }
}
