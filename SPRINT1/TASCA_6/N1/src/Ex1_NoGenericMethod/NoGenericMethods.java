package Ex1_NoGenericMethod;

public class NoGenericMethods<T> {
    private Person person1;
    private Person person2;
    private Person person3;

    public NoGenericMethods(Person person1, Person person2, Person person3) {
        this.person1 = person1;
        this.person2 = person2;
        this.person3 = person3;
    }
    public Person getPerson1() {
        return person1;
    }
    public Person getPerson2() {
        return person2;
    }
    public Person getPerson3() {
        return person3;
    }

    public void setPerson1(Person person1) {
        this.person1 = person1;
    }
    public void setPerson2(Person person2) {
        this.person2 = person2;
    }
    public void setPerson3(Person person3) {
        this.person3 = person3;
    }
    @Override
    public String toString(){
        return "This box contains: " + this.getPerson1() + ", " + this.getPerson2() + " and " +
                this.getPerson3() + ".";
    }
}
