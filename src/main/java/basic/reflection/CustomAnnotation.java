package basic.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomAnnotation {

    String value() default "default value";

    //todo retention means that annotation will be available at runtime
    // 2 @Target(ElementType.METHOD) annotation can be used only on methods
    // 3  String value() default "default value" -> is an element of annotation with default value
}
