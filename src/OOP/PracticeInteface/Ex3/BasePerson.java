package OOP.PracticeInteface.Ex3;

public abstract class BasePerson implements Person{
    protected String name;

    @Override
    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
    @Override

    public abstract String sayHello();
}
