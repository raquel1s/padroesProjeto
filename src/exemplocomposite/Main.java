package exemplocomposite;

public class Main {

    public static void main(String[] args) {

        Pasta pastaRaiz = new Pasta("raiz");
        Arquivo readme = new Arquivo("readme.md");
        Pasta java = new  Pasta("java");

        pastaRaiz.adicionar(readme);
        pastaRaiz.adicionar(java);

        java.adicionar(new Arquivo("main.java"));
        java.adicionar(new Arquivo("exemploPastas.java"));

        pastaRaiz.abrir();
    }

}
