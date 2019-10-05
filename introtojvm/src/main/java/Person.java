public class Person {
    public Person(int pid, String name) {
        this.pid = pid;
        this.name = name;
    }

    int pid;
    String name;

    // constructor, setters/getters
}

class Driver {
    public static void main(String[] args) {
        int id = 23;
        String pName = "Jon";
        Person p = null;
        p = new Person(id, pName);
    }
}