public class Valeurs implements ICalcul {

    private final EType type = EType.VALEURS;
    private final double valeurs;

    public Valeurs(double valeur) {
        this.valeurs = valeur;
    }

    @Override
    public EType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "" + this.valeurs;
    }
}
