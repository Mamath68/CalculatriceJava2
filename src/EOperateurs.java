public enum EOperateurs {

    ADDITIONS("Plus"),
    SOUSTRACTION("Moins"),
    MULTIPLICATION("fois"),
    DIVISION("Divisé par");

    private final String operateurs;

    EOperateurs(String operateurs) {
        this.operateurs = operateurs;
    }

    public String getOperateurs() {
        return this.operateurs;
    }

    public String toString() {
        return this.getOperateurs();
    }

}
