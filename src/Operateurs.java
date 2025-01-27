public class Operateurs implements ICalcul {

    private final EType type = EType.OPERATEURS;
    private EOperateurs operateurs;

    public Operateurs(EOperateurs operateurs) {
        this.operateurs = operateurs;
    }
    @Override
    public EType getType() {
        return this.type;
    }
}
