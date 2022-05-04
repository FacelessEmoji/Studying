package OOP.PracticeInheritance.Ex4;

public class Knight extends Hero {
    private int strength;
    private int impactForce;

    public Knight(String username, int level, int strength, int impactForce) {
        super(username, level);
        if ((strength < 1) | (strength > 100)) {
            throw new IllegalArgumentException("Wrong value to knight's strength");
        } else this.setStrength(strength);
        if ((impactForce < 1) | (impactForce > this.strength)) {
            throw new IllegalArgumentException("Wrong value to knight's force impact");
        } else this.setImpactForce(impactForce);
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    private void setImpactForce(int impactForce) {
        this.impactForce = impactForce;
    }

    private boolean fight() {
        return (this.strength >= this.impactForce);
    }

    @Override
    String action() {
        if (fight()) {
            this.strength -= this.impactForce;
            return username + " fight with force " + impactForce;
        }
        return username + " has no more strength";
    }

    @Override
    public String toString() {
        return "Knight " + username + "[" + level + " level] is ";
    }
}