package OOP.PracticeInheritance.Ex4;

public class Elf extends Hero {
    private int arrowsCount;

    public Elf(String username, int level, int arrowsCount) {
        super(username, level);
        if ((arrowsCount < 1) | (arrowsCount > 100)) {
            throw new IllegalArgumentException("Wrong value to elf's arrows count");
        } else this.setArrowsCount(arrowsCount);
    }

    private void setArrowsCount(int arrowsCount) {
        this.arrowsCount = arrowsCount;
    }

    private boolean shootArrow() {
        return (this.arrowsCount > 0);
    }

    @Override
    public String action() {
        if (shootArrow()) {
            this.arrowsCount--;
            return username + " shoot arrow";
        }
        return username + " has no more arrows";
    }

    @Override
    public String toString() {
        return "Elf " + username + "[" + level + " level] is ";
    }
}
