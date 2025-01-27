public enum EType {
    VALEURS("Valeurs"), OPERATEURS("Operateurs");

    private final String type;

    EType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return this.getType();
    }
}
