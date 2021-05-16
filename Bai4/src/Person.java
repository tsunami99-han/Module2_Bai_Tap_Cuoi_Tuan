public class Person {
    private String name;
    private int age;
    private String job;
    private int peopleID;

    public Person(String name, int age, String job, int peopleID) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.peopleID = peopleID;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getPeopleID() {
        return peopleID;
    }

    public void setPeopleID(int peopleID) {
        this.peopleID = peopleID;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name: " + name + '\'' +
                ", age: " + age +
                ", job: '" + job + '\'' +
                ", id: " + peopleID +
                '}';
    }
}
