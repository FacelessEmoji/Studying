package OOP.PracticeInteface.FinalBossBattle.Equipment;


public class Clothes implements Armor {
    protected int durability;

    protected Clothes(int durability) {
        this.durability = durability;
    }

    protected void setDurability(int durability) throws IllegalArgumentException {
        if (durability < 1 | durability > 5) {
            throw new IllegalArgumentException("Incorrect value for durability");
        } else this.durability = durability;
    }

    /**
     *
     * @param damage
     * @return remaining durability
     */
    @Override
    public int destroy(int damage) {
        if (damage <= this.durability) {
            this.durability -= damage;
        } else {
            this.durability = 0;
        }
        return this.durability;
    }

    @Override
    public boolean isBroken() {
        return durability <= 0;
    }
}
