import br.com.ebac.tarefa.celular.controller.LigarCelular;
import br.com.ebac.tarefa.celular.models.Celular;

public class main {
    public static void main(String[] args) {
        Celular celular1 = new Celular();
        celular1.setBateria(10);
        celular1.setId(1);
        celular1.setModelo("Iphone 11");
        celular1.setCor("Azul");
        celular1.setEstado("Bom");

        LigarCelular ligarCelular = new LigarCelular();

        ligarCelular.carregarCelular(celular1);
        System.out.println(celular1.getBateria());
        ligarCelular.carregarCelular(celular1);
        System.out.println(celular1.getBateria());
        ligarCelular.carregarCelular(celular1);
        System.out.println(celular1.getBateria());
        celular1.getInfos();

    }
}