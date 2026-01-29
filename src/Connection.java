import  java.util.Scanner;
public class Connection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = "Lamine";
        int password= 2026;
        String id1;
        int password1;
        do{
            System.out.println("Entre votre id et votre identifiant: ");
             id1 =sc.nextLine();
             password1 = sc.nextInt();
             sc.nextLine();
        }while (!(id.equals(id1))  || password != password1);

    }
}
