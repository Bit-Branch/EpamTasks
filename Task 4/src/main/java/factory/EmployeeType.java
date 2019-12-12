package factory;

public enum EmployeeType {
    MANAGER("Manager"), TESTER("Tester"), DEVELOPER("Developer");
    private String text;

    EmployeeType(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static EmployeeType fromString(String text) {
        for (EmployeeType emp : EmployeeType.values()) {
            if (emp.text.equalsIgnoreCase(text)) {
                return emp;
            }
        }
        return null;
    }
}
