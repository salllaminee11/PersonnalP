import java.util.Scanner;

public class NombreMystere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Entres le nombre de notes a saisir: ");
        int N = sc.nextInt();
        int NOTES [] = new int[N];
        for ( int i = 0 ; i < N ; i++){
            NOTES[i] = sc.nextInt();
            while (NOTES[i] < 0 || NOTES[i] > 20) {
                System.out.println("stp entres un nmbre compris entre 0 et 20");
                NOTES[i] = sc.nextInt();
            } ;

        }
    }
}
