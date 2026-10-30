public class Lacos {
    public static void main(String[] args) {
        // laço for, repete número determinado de vezes
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }


        // laço while, repete N vezes até que não seja mais verdadeiro(condição)
        int x = 1;
        while (x <= 5){
            System.out.println(x);
            x++;
        }

        // laço do while, repete N vezes até que não seja mais verdadeiro(condição), mas acontecee pelo menos uma vez devido ao print vir primeiro
        int j = 1;
        do{
            System.out.println(j);
            j++;
        }while (j <= 5);
    }
}