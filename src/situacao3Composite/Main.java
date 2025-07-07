package situacao3Composite;

import exemplocomposite.Arquivo;
import exemplocomposite.Pasta;

public class Main {

    public static void main(String[] args) {
//        Situação 3: Estrutura Organizacional de Empresa (Composite)
//        Você precisa exibir a hierarquia de uma empresa, onde gerentes podem ter subordinados
//        (funcionários ou outros gerentes). Como representar essa estrutura de forma recursiva
//        com uma interface única e tratamento uniforme?


        Gerente gerenteMaster = new Gerente("Kuba");
        Funcionario funcionario = new Funcionario("Luana");
        Gerente gerente = new  Gerente("Sidnei");

        gerenteMaster.adicionaFuncionario(funcionario);
        gerenteMaster.adicionaFuncionario(gerente);

        gerente.adicionaFuncionario(new Funcionario("Raquel"));
        gerente.adicionaFuncionario(new Funcionario("Julia"));

        //gerenteMaster.contratar();
        gerente.contratar();
    }
}
