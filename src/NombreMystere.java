import java.util.Random;
import java.util.Scanner;

public class NombreMystere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // genere le nombre secret
        int nombreSecret = new Random().nextInt(100) + 1;
        System.out.println(nombreSecret);
        System.out.print("Entre le nombre secret: ");
        int randomNumber = sc.nextInt();
        int attempt= 1;
        while (randomNumber != nombreSecret) {
            if (randomNumber < nombreSecret) {
                System.out.println("Trop petit!");
            }
            else
            {
                System.out.println("Trop grand!");
            }
            System.out.print("Entre encore le nombre secret: ");
            randomNumber = sc.nextInt();
            attempt++;
        }
        System.out.println("le nombre de tentatoive est de "+attempt);
        if (attempt <= 5){
            System.out.println("C'est exellent!");
        } else if (attempt <=10) {
            System.out.println("C'est bien!");

        }
        else {
            System.out.println("TU PEUX MIEUX FAIRE, TOI AUSSI");
        }
    }
}
