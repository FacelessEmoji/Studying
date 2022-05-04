package OOP.PracticeInteface.FinalBossBattle.Character;

public interface Healthy {
    int MAX_HEALTH = 100;

    int getHealth();

    void recoverHealth(int amount);
}
