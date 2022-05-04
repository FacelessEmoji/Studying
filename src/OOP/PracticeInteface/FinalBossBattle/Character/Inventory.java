package OOP.PracticeInteface.FinalBossBattle.Character;

import OOP.PracticeInteface.FinalBossBattle.Things.Item;

public interface Inventory {
    int ITEMS = 5;

    boolean put(Item item, int inventoryPlace);

    boolean useItem(int inventoryPlace);
}
