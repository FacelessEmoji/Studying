package OOP.Practice.Ex7;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) {
        if ((!name.isEmpty())&&(!name.trim().equals(""))){
            this.name = name;
        } else{
            System.out.println("Name cannot be empty.");
            System.exit(0);
        }
    }

    private void setAge(int age) {
        if ((age>0)&&(age<16)){
            this.age = age;
        } else{
            System.out.println("Age should be between 0 and 15.");
            System.exit(0);
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double ProductPerDay(){
        return  CalculateProductPerDay();
    }

    private double CalculateProductPerDay(){
        if(this.age < 7){
            return 2;
        } else if ((this.age>6)&&(this.age<13)){
            return 1;
        } else{
            return 0.75;
        }
    }
}
