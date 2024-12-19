import java.util.ArrayList;

public class Person implements Cloneable {
    private String name;
    private int age;
    private ArrayList<String> hobbies;

    Person() {
        this("Jane", 30);
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public void removeHobby(String hobby) {
        if(hobbies.contains(hobby))
            hobbies.remove(hobby);
        else
            System.out.println("No hobby found!");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clone = (Person)super.clone();

        clone.hobbies = new ArrayList<>(hobbies);

        return clone;
    }

    @Override
    public String toString() {
        return  "Hi, this is " + name + ". This person is " + age +
                " years old with hobbies such as " + hobbies;
    }
}
