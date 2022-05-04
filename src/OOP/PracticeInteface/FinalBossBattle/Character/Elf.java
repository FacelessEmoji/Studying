package OOP.PracticeInteface.FinalBossBattle.Character;

import OOP.PracticeInteface.FinalBossBattle.Things.HealthPotion;

public class Elf extends Hero {
    private int arrowsCount;

    public Elf(String username, int level, int health, int arrowsCount) {
        super(username, level, health);
        this.setArrows(arrowsCount);
        System.out.println(this);
    }

    private void setArrows(int arrowsCount) throws IllegalArgumentException {
        if ((arrowsCount < 1) | (arrowsCount > 100)) {
            throw new IllegalArgumentException("Wrong value to elf's arrows count");
        } else this.arrowsCount = arrowsCount;
    }

    private boolean shootArrow() {
        return (this.arrowsCount > 0);
    }

    @Override
    public String action() {
        if (shootArrow()) {
            this.arrowsCount--;
            return username + " shoot arrow[" + arrowsCount + " arrows left]";
        }
        return username + " has no more arrows";
    }

    @Override
    public boolean useItem(int inventoryPlace) {
        if ((inventoryPlace > ITEMS) || (inventoryPlace < 1)) {
            System.out.println("Wrong key");
        }
        if (items[inventoryPlace] == null) {
            System.out.println("Empty slot");
        }
        if (items[inventoryPlace] instanceof HealthPotion) {
            if ((health + items[inventoryPlace].use()) > MAX_HEALTH) {
                health = MAX_HEALTH;
            } else health += items[inventoryPlace].use();
            System.out.println(username + " use HealthPotion");
            return true;
        } else System.out.println(username + " doesn't know how to use "
                + items[inventoryPlace].getClass().getSimpleName());
        return false;
    }

    @Override
    public String toString() {
        return "Elf " + username + "[" + level + " level," + health + " health] is online";
    }
}
