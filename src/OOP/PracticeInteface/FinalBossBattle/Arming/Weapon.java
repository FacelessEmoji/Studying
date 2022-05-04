package OOP.PracticeInteface.FinalBossBattle.Arming;

public class Weapon implements Arming {
    protected double ability;

    protected Weapon(double ability) {
        this.setAbility(ability);
    }

    protected void setAbility(double ability) throws IllegalArgumentException {
        if (ability < 1 | ability > 5) {
            throw new IllegalArgumentException("Incorrect value for ability");
        } else this.ability = ability;
    }

    @Override
    public double getAbility() {
        return ability;
    }
}
