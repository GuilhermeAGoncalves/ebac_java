import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE)
public @interface Tabela {
    String value();

    int code();

    String country() default "Brasil";
}
