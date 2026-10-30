public class Condicionais {
    public static void main(String[] args) {
        //== igual
        // != diferente
        //< menor
        //> maior
        //<= menor que
        //>= mmaior que

        //&& E logico
        //|| OU logico
        // ! NÃO logico

        // if sozinho
        int x = 5; 
        if (x < 10){
            System.out.println("Verdade");
        }

        System.out.println(); //pular linha

        //if e o else
        int y = 10;
        if (y <= 10){
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }

        System.out.println(); //pular linha

        //if else elseif if encadeado
        int j = 20;
        if(j > 18){
            System.out.println("Você é maior de idade!");
        }else if(j >= 12){
            System.out.println("Você é adolescente!");            
        }else{
            System.out.println("Você é uma criança!");
        }

        System.out.println(); //pular linha

        //switch case
        int opcao = 5;
        switch (opcao) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

        System.out.println(); //pular linha

        //uso dos operadores lógicos && e ||
        int b = 10;
        int c = 15;
        if (b == 10 && c == 15) {
            System.out.println("Teste do E logico");
        }
        if (b == 10 || c == 15) {
            System.out.println("Teste do OU logico");
        }
    }    
}
