import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ICalcul> num = new ArrayList<>();
        num.add(Factories.createValeurs(3.5));
        num.add(Factories.createOperateurs(EOperateurs.DIVISION));
        num.add(Factories.createValeurs(3.5));
        System.out.println(num);
    }
}
