public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person a = new Person("Diamond", 20);
        a.addHobby("Coding");
        a.addHobby("Eating");
        a.addHobby("Sleeping");

        Person b = (Person) a.clone();

        a.removeHobby("Coding");

        System.out.println(a);
        System.out.println(b);

        House mountkiara = new House(5, 10);
        House impianemas = (House) mountkiara.clone();

        impianemas.setNumRoom(5);
        impianemas.setAddress(new Address("Jln Bukit Impian", "Impian Emas", "Johor"));

        System.out.println(mountkiara);
        System.out.println(impianemas);

        b.setName("Ruby");
        b.setAge(17);

        if(a.compareTo(b) > 0)
            System.out.println(a.getName() + " is older than " + b.getName());
        else if(a.compareTo(b) < 0)
            System.out.println(a.getName() + " is younger than " + b.getName());
        else
            System.out.println(a.getName() + " is the same age with " + b.getName());
    }
}