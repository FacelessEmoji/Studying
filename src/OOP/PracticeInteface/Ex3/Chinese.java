package OOP.PracticeInteface.Ex3;

public class Chinese extends BasePerson{
    public Chinese(String name){
        this.setName(name);
    }
    @Override
    public String sayHello() {
        return "Ni Hao!";
    }
}
