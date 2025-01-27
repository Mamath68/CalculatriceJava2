public class Factories {
    public static ICalcul createValeurs(double valeur) {
        return new Valeurs(valeur);
    }

    public static ICalcul createOperateurs(EOperateurs operateurs) {
        return new Operateurs(operateurs);
    }
}
