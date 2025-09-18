class Person {
    private String name;
    private int age;
    private Person bestFriend;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setBestFriend(Person bestFriend) {
        this.bestFriend = bestFriend;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person getBestFriend() {
        return bestFriend;
    }
}

public class ObjectSerializer {

    public String serialize(Person person) {
        if (person == null) {
            return "";
        }
        return "{name:" + person.getName() + ",Age:" + person.getAge() + ",BestFriend:" + serialize(person.getBestFriend()) + "}";
    }

    public static void main(String[] args) {
        Person alice = new Person("Alice", 30);
        Person bob = new Person("Bob", 28);
        Person charlie = new Person("Charlie", 32);

        alice.setBestFriend(bob);
        bob.setBestFriend(charlie);

        ObjectSerializer serializer = new ObjectSerializer();
        String serializedAlice = serializer.serialize(alice);
        System.out.println(serializedAlice);

    }
}
