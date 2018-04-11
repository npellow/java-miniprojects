public class ContinentsAndCities {
    public static void main(String[] args) {
        int continent = 5;

        switch(continent) {
            case 1: System.out.println("North America: New York City, USA");
            break;
            case 2: System.out.println("South America: Sao Paulo, Brazil");
            break;
            case 3: System.out.println("Europe: Istanbul, Turkey");
            break;
            case 4: System.out.println("Africa: Lagos, Nigeria");
            break;
            case 5: System.out.println("Asia: Tokyo, Japan");
            break;
            case 6: System.out.println("Australia: Sydney, Australia");
            break;
            case 7: System.out.println("Antarctica: McMurdo Station (US research center)");
            break;
            default: System.out.println("Undefined continent!");
            break;
        }
    }
}

// 2nd mini-project from Learn Java course; exercise in switch statements
