package aulas.colecoes.gui.ebac.com;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String classe;
    private Integer nota;
    private String curso;

    public Aluno(String nome, String classe, String curso){
        this.nome = nome;
        this.classe = classe;
        this.curso = curso;
    }
    public Aluno(String nome, String classe, String curso,  Integer nota){
        this(nome, classe, curso);
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }

}


