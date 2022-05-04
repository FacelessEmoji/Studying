package OOP.PracticeInteface.FinalBossBattle;

import OOP.PracticeInteface.FinalBossBattle.Arming.Sword;
import OOP.PracticeInteface.FinalBossBattle.Character.Elf;
import OOP.PracticeInteface.FinalBossBattle.Character.Hero;
import OOP.PracticeInteface.FinalBossBattle.Character.Knight;
import OOP.PracticeInteface.FinalBossBattle.Character.Wizard;
import OOP.PracticeInteface.FinalBossBattle.Things.HealthPotion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Hero> players = new ArrayList<>();
        Hero legolas = new Elf("Legolas",1,70,1);
        Hero merlin = new Wizard("Merlin",100,70,100,80);
        Hero arthur = new Knight("Arthur",35,70,100,12);

        legolas.put(new HealthPotion(5),1);
        legolas.useItem(1);

        System.out.println(legolas.toString());
        arthur.change(new Sword(2.5));
        merlin.change(new Sword(2.5));
        merlin.put(null,2);

        merlin.levelUp();

        players.add(legolas);
        players.add(merlin);
        players.add(arthur);

        for (Hero hero: players){
            System.out.println(hero.action());
            System.out.println(hero.action());
        }
    }
}
