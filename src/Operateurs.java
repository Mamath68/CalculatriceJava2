public class Operateurs implements ICalcul {

    private final EType type = EType.OPERATEURS;
    private final EOperateurs operateurs;

    public Operateurs(EOperateurs operateurs) {
        this.operateurs = operateurs;
    }

    @Override
    public EType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "" + this.operateurs;
    }
}
