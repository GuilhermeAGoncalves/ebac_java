public class Main {

    public static void main(String[] args) {
        PF pf = new PF();
        pf.setNome("Guilherme");
        pf.setIdade(21);
        pf.setCpf("111.111.111-11");
        pf.setImposto(1);
        imprimir(pf);

        PJ pj = new PJ();
        pj.setNome("EBAC");
        pj.setIdade(9999);
        pj.setCnpj("11.111.111/0001-11");
        pj.setImposto(2);
        imprimir(pj);
    }

    private static void imprimir(Pessoa pessoa){
        if(pessoa instanceof PF) {
            PF pf = (PF) pessoa;
            System.out.println(pessoa.getNome() + "inscrita no CPF " + pf.getCpf() + " paga " + pessoa.getImposto() + "% de imposto");
        }else if(pessoa instanceof PJ) {
            PJ pj = (PJ) pessoa;
            System.out.println(pessoa.getNome() + "inscrita no CNPJ " + pj.getCnpj() + " paga " + pessoa.getImposto() + "% de imposto");
        }
    }

}
