package ExceptionHandling;

public class CustomException1 {
    int roll;
    String name;
    public CustomException1(int roll, String name) throws NameCanNotBeNullException {
        if (roll<=0){
            throw new NameCanNotBeNullException();
        }
        this.roll = roll;
        this.name = name;
    }
    public int getA() {
        return roll;
    }
    public void setA(int a) {
        this.roll = a;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "roll=" + roll +
                ", name='" + name + '\'';
    }
}
