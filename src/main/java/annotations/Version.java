package annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
    int value();
    Date creationDate();
    String author();
    Class<?> previous() default Void.class;
}