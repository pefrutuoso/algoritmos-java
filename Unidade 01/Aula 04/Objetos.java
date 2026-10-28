public class Objetos {
    //Atruibutos
    private String nome;
    private int idade;
    private float peso;

    //Construtor
    public Objetos(String nome, int idade, float peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    //Métodos
    public void exibirInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }

    public static void main(String[] args) {
        Objetos pessoa = new Objetos("Pedro", 26, 65.5f);
        Objetos pessoa2 = new Objetos("Amanda", 30, 50.5f);
        System.out.println();
        System.out.println(pessoa.nome);
        System.out.println(pessoa2.nome);
        System.out.println();

        pessoa.exibirInfos();
        System.out.println();
        pessoa2.exibirInfos();
    }
}
