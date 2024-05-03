import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        System.out.println(getName(Cliente.class));
    }

    public static String getName(Class entity) {

        for (Annotation annotation : entity.getAnnotations()){
            if(annotation instanceof Tabela) {
                Tabela tableAnnotation = (Tabela) annotation;
                String value = tableAnnotation.value();

                return "Valor da @Tabela: " + value;
            }
        }
        return "Não foi encontrado valor da @Tabela";
    };
}
