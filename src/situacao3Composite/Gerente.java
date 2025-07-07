package situacao3Composite;

import exemplocomposite.Documento;

import java.util.ArrayList;

public class Gerente implements Empresa{

    private String nome;
    private ArrayList<Empresa> funcionarios;

    public Gerente(String nome){
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionaFuncionario(Empresa f){
        funcionarios.add(f);
    }

    @Override
    public void contratar() {
        System.out.println("Gerente: " + this.nome);
        for(Empresa f : funcionarios){
            f.contratar();
        }
    }
}
