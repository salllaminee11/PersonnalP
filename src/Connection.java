import  java.util.Scanner;
public class Connection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = "Lamine";
        int password= 2026;
        String id1;
        int password1;
        int compteur = 0;
        do{
            System.out.println("Entre votre id et votre identifiant: ");
             id1 =sc.nextLine();
             password1 = sc.nextInt();
             sc.nextLine();
             compteur++;
        }while (!(id.equals(id1))  || password != password1);
        if (compteur > 3 ){
            System.out.println("Compte bloqué!");
        }
        else {
            String menu [] = new String[]{"1. Calculer une moy", "2.Nombre pair/impair", "3.quitter"};
            for (int i = 0 ; i < menu.length; i++){
                System.out.println(menu[i]);
            }
        }

    }
}
