public class Person {
    private String name;
    private int Age;


    public Person() {
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if (age<=0)
        {
            throw new IllegalArgumentException("The value of age should be positive.");
        }
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
