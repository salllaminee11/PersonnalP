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

        for ( int i = 0 ; i < N ; i++){
            System.out.println(NOTES[i]);
        }

        int moy;
        int max = NOTES[0];
        int min = NOTES[0]  ;
        int sum = 0 ;
        for ( int i = 0 ; i < N ; i++){
            System.out.println(NOTES[i]);
        }
        // Calcule de la moyenne
        for ( int i = 0 ; i < N ; i++){
            sum += NOTES[i] ;
        }
        System.out.println("La moyenne est : " +sum/ N);
        // Calcule de la note max
        for (int i= 0 ; i < N ; i++){
            if (NOTES[i] > max){
                max = NOTES[i];}
        }
        System.out.println("La notes maximale est de :" +max);
        // Calcule de la note Min
        for ( int j = 0 ; j < N ; j++){
            if (NOTES[j] < min){
                min = NOTES[j];
            }
        }
        System.out.println("La Note min est de: " +min);

    }

}