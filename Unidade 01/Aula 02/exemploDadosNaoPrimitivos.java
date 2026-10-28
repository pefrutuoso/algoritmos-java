public class exemploDadosNaoPrimitivos {
    public static void main(String[] args) {
        //tipos caracter PRIMITIVO
        char caracter = 'A';

        //tipos caracter NÃO PRIMITIVOS
        String nome = "Pedro";
        nome = "Pedro Frutuoso";

        //tipo Enum
        enum DiaDaSemana{
            DOMINGO, SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO
        }
        DiaDaSemana sexta = DiaDaSemana.SEXTA;

        //tipo array
        int[] numeros = {1,2,3,4,5,6,7};
     
        System.out.println();
        System.out.println(caracter);
        System.out.println(nome);
        System.out.println(sexta);
        System.out.println(numeros[0]);
        System.out.println();
    }
}
