import java.util.Objects;

public class Person {


    /***
     * “If two objects are equal according to equals() method then they must have same hashcode() value.
     * But, reverse is not always true.”
     */


    String firstName;

    String lastName;

    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Person person=(Person) obj;
        return this.firstName.equals(person.firstName) && this.lastName.equals(person.lastName) &&
                this.age==person.age;
    }

    @Override
    public int hashCode() {
        int hashcode=0;
        hashcode+=firstName.hashCode();
        hashcode+=lastName.hashCode();
        hashcode+=Integer.toString(age).hashCode();
        return hashcode;
    }


    public static void main(String[] args) {


        Person p1 = new Person("Robin", "Smith", 42);

        Person p2 = new Person("Robin", "Smith", 42);

        System.out.println(p1.equals(p2));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        System.identityHashCode(p1);

    }

}
