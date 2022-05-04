package OOP.PracticeInteface.FinalBossBattle.Character;

import OOP.PracticeInteface.FinalBossBattle.Arming.Weapon;
import OOP.PracticeInteface.FinalBossBattle.Equipment.Clothes;

public interface Armed {
    int CLOTHES = 3;

    boolean change(Weapon weapon);

    boolean dress(Clothes clothes, int inventoryPlace);

    String action();
}
