import java.util.Scanner;

public class Distributeur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctUserCode = 1111;
        int correctSecretCode = 2222;
        int userCode;
        int secretCode;
        int attempt = 0 ;
        double solde = 1000;

            do {
                System.out.println("Enter you user code: ");
                userCode = sc.nextInt();
                sc.nextLine(); // nettoyer le buffer
                System.out.println("Entre ton code secret:");
                secretCode = sc.nextInt();
                sc.nextLine();
                attempt++;
            } while ((userCode != correctUserCode || secretCode != correctSecretCode) && attempt<3 );
            if (userCode != correctUserCode || secretCode != correctSecretCode){
                System.out.println("Carte Bloque");
            } else {
                System.out.println("======Menu==========");
                System.out.println("1.Consulter le Solde");
                System.out.println("2.Retirer de l'argent");
                System.out.println("3.Deposer de l'argent");
                System.out.println("4.Quitter");
                System.out.print("Veillez entrer votre choix: ");
                int choix = sc.nextInt();
                switch (choix){
                    case 1:
                        System.out.println("Votre Solde est de "+solde);
                        break;
                    case 2:
                        System.out.print("Entrer le montant que vous voulez retirer: ");
                        double montantRetire =sc.nextDouble();
                        if (montantRetire > solde){
                            System.out.println("Solde insuffisant!");
                        }
                        else {
                            solde -=montantRetire;
                            System.out.println("Vous avez retire "+montantRetire+ " Votre solde est de "+solde);
                        }
                        break;
                    case 3:
                        System.out.print("entre le montant a deposer: ");
                        double montantDeposer = sc.nextDouble();
                        if(montantDeposer < 0 ){
                            System.out.println("Entrer un montant valide");
                        }else {
                            solde += montantDeposer;
                            System.out.println("Votre solde est de "+solde);
                        }
                        break;
                    case 4:
                        System.out.println("Bye");
                        break;
                    default:
                        System.out.println("entrer un nombre valide");
                        break;
                }
                sc.close();

            }

    }
}
