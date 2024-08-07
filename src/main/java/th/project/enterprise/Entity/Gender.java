package th.project.enterprise.Entity;

public enum Gender {
    M(1), F(2), I(3), U (4);

    private final int number;

    // Achtung Konstruktor darf nur "default"
    // oder private sein
    private Gender(int nr) {
        number = nr;
    }

    public int toNumber() {
        return number;
    }

    public String toString() {
        if (number == 1)
            return "male";
        if (number == 2)
            return "female";
        if (number == 3)
            return "intersex";
        else
            return "unknown";
    }

}