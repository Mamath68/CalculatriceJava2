public class Valeurs implements ICalcul {

    private final EType type = EType.VALEURS;
    private double valeurs;

    public Valeurs(double valeur) {
        this.valeurs = valeur;
    }

    @Override
    public EType getType() {
        return this.type;
    }

    public double getValeurs() {
        return this.valeurs;
    }

    public void setValeurs(double valeurs) {
        this.valeurs = valeurs;
    }
}
