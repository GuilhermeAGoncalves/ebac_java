public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private String sexo;

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return nome + " " + sexo;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.sexo.compareTo(pessoa.getSexo());

    }
}
