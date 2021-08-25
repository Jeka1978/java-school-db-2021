package reflection_examples;

/**
 * @author Evgeny Borisov
 */
public class PersonTest {


    public PersonTest() {
        System.out.println("person test object was created");
    }


    @TestMethod(numberOfInvocations = 5)
    public void anotherTest() {
        System.out.println("TTTTTTTTTTTTTTT");
    }

    public void testMyPerson() {
        System.out.println("person test1");
    }

    public void testMyPerson2() {
        System.out.println("person test2");
    }


    public void xxx(){
        System.out.println("XXX");
    }
}
