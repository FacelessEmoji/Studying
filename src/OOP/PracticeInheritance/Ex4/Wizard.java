package OOP.PracticeInheritance.Ex4;

public class Wizard extends Hero {
    private int mana;
    private int spellPower;

    public Wizard(String username, int level, int mana, int spellPower) {
        super(username, level);
        if ((mana < 1) | (mana > 100)) {
            throw new IllegalArgumentException("Wrong value to wizard's mana");
        } else this.setMana(mana);
        if ((spellPower < 1) | (spellPower > this.mana)) {
            throw new IllegalArgumentException("Wrong value to wizard's spell power");
        } else this.setSpellPower(spellPower);
    }

    private void setMana(int mana) {
        this.mana = mana;
    }

    private void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    private boolean spell() {
        return (this.mana >= this.spellPower);
    }

    @Override
    String action() {
        if (spell()) {
            this.mana -= this.spellPower;
            return username + " spell with the power " + spellPower;
        }
        return username + " has no more mana";
    }

    @Override
    public String toString() {
        return "Wizard " + username + "[" + level + " level] is ";
    }
}
