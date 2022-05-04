package OOP.PracticeInteface.Ex3;

public class Russian extends BasePerson {
    public Russian(String name) {
        this.setName(name);
    }

    @Override
    public String sayHello() {
        return "Привет!";
    }
}
