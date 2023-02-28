public class Main {
    public static void main(String[] args) {

        TaschenrechnerBackend calculator = new TaschenrechnerBackend();

        try {
            double result = calculator.add(0.5, 2);
            System.out.println("Das Ergebnis ist: "+ result);

            result = calculator.subtract(3,1);
            System.out.println("Das Ergebnis ist: "+result);

            result = calculator.multiply(2, 5);
            System.out.println( "Das Ergebnis ist: "+result);
        }

        catch (Exception e) {
            System.out.println("Irgendwas ist falsch." + e.getMessage());
        }

    }
}