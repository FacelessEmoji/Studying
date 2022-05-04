package OOP.PracticeInteface.FinalBossBattle.Character;

import OOP.PracticeInteface.FinalBossBattle.Arming.Bow;
import OOP.PracticeInteface.FinalBossBattle.Arming.Staff;
import OOP.PracticeInteface.FinalBossBattle.Arming.Sword;
import OOP.PracticeInteface.FinalBossBattle.Arming.Weapon;
import OOP.PracticeInteface.FinalBossBattle.Equipment.Clothes;
import OOP.PracticeInteface.FinalBossBattle.Things.Item;

public abstract class Hero extends Player implements Healthy, Armed, Inventory {
    protected int health;
    protected Weapon weapon;
    protected Clothes[] clothes = new Clothes[CLOTHES];
    protected Item[] items = new Item[ITEMS];

    public Hero(String username, int level, int health) {
        super(username, level);
        this.setHealth(health);
    }

    protected void setHealth(int health) {
        if ((health < 1) | (health > 100)) {
            throw new IllegalArgumentException("Wrong value to hero's health");
        } else this.health = health;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void recoverHealth(int amount) {
        health += amount;
    }

    public abstract String action();

    public abstract boolean useItem(int inventoryPlace);


    @Override
    public boolean change(Weapon arm) {
        if ((arm != null) && (
                (arm instanceof Bow && this instanceof Elf) ||
                        (arm instanceof Staff && this instanceof Wizard) ||
                        (arm instanceof Sword && this instanceof Knight)
        )) {
            weapon = arm;
            System.out.println(this.getUsername() + " change weapon");
            return true;
        } else System.out.println("Wrong weapon");
        return false;
    }

    @Override
    public boolean dress(Clothes clothing, int inventoryPlace) {
        if ((inventoryPlace > CLOTHES) || (inventoryPlace < 1)) {
            System.out.println("Wrong key");
            return false;
        }
        for (Clothes cloth : clothes) {
            if (cloth != null) {
                if (clothing.getClass().getSimpleName().equals(cloth.getClass().getSimpleName())) {
                    System.out.println("No more then one" + clothing.getClass().getSimpleName());
                    return false;
                }
            }
        }
        clothes[inventoryPlace] = clothing;
        System.out.println(username + " dress " + clothing.getClass().getSimpleName());
        return true;
    }


    @Override
    public boolean put(Item thing, int inventoryPlace) {
        if ((thing == null) || (inventoryPlace > ITEMS) || (inventoryPlace < 1)) {
            System.out.println("Wrong key");
            return false;
        }
        items[inventoryPlace] = thing;
        System.out.println(username + " put " + thing.getClass().getSimpleName());
        return true;
    }


    protected Weapon getWeapon() {
        return weapon;
    }

    protected Clothes getClothes(int inventoryPlace) {
        return clothes[inventoryPlace];
    }

    protected Item getItems(int inventoryPlace) {
        return items[inventoryPlace];
    }
}
