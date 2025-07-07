package situacao3Composite;

public class Funcionario implements Empresa{

    private String nome;

    public Funcionario(String nome){
        this.nome = nome;
    }

    @Override
    public void contratar() {
        System.out.println("Funcionário: " + this.nome );
    }
}
