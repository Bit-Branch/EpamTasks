package entity;

public enum Position {
    JUNIOR, MIDDLE, SENIOR;

    @Override
    public String toString() {
        return "Position: " + name().toLowerCase();
    }
}

