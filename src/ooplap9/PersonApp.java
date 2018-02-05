package ooplap9;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person(
                "sudarat",
                "1111111",
                new Address("229",
                        "Nakor",
                        "80180"),
                new Job("Teacher",
                        20000));

        System.out.println(person.toString());
    }
}
