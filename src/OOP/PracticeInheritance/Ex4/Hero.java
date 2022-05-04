package OOP.PracticeInheritance.Ex4;

public abstract class Hero {
    protected String username;
    protected int level;

    public Hero(String username, int level) throws IllegalArgumentException{
        if (username.length() < 5){
            throw new IllegalArgumentException("Wrong value to hero's username");
        } else this.setUsername(username);
        if (level < 0){
            throw new IllegalArgumentException("Wrong value to hero's level");
        } else this.setLevel(level);

    }

    protected void setUsername(String username) {
        this.username = username;
    }

    protected void setLevel(int level) {
        this.level = level;
    }

    abstract String action();
}
