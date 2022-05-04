package OOP.PracticeInteface.Ex3;

public class European extends BasePerson{
    public European(String name){
        this.setName(name);
    }
    @Override
    public String sayHello() {
        return "Hello!";
    }
}
