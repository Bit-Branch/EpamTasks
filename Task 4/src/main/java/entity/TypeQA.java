package entity;

public enum TypeQA {
    AUTOMATED("Automated"), MANUAL("Manual");
    private String typeQA;

    TypeQA(String typeQA) {
        this.typeQA = typeQA;
    }

    public String getTypeQA() {
        return typeQA;
    }

    public static TypeQA fromString(String text) {
        for (TypeQA type : TypeQA.values()) {
            if (type.typeQA.equalsIgnoreCase(text)) {
                return type;
            }
        }
        return null;
    }
}
