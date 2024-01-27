package basic.reflection;

public class Example {

    @CustomAnnotation("this is custom annotation")
//    @CustomAnnotation
    public void testMethod() {
        System.out.println("method executed");
    }
}
