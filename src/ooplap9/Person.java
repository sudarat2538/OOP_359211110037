package ooplap9;

public class Person {
    private String name;
    private String personId;
    private Address addrese;
    private Job job;

    public Person(String name, String personId, Address addrese, Job job) {
        this.name = name;
        this.personId = personId;
        this.addrese = addrese;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId='" + personId + '\'' +
                ", addrese=" + addrese +
                ", job=" + job +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Address getAddrese() {
        return addrese;
    }

    public void setAddrese(Address addrese) {
        this.addrese = addrese;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}//class
