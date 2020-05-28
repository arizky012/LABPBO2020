
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    static UKMDetails details = new UKMDetails();
    static PengurusInti intiBoards;
    static KoordDanStaff koordBoards;
    static String bUsg, bPosition, bName, bMajor, bNIM;
    static int bBatch;
    static Scanner sm = new Scanner(System.in);

    public static void main(String[] args) {

        try {

            boolean cont = true;

            while (cont) {

                System.out.println("\n===== UKM PROGRAMMER UNHAS =====");
                System.out.println("1. Member Information");
                System.out.println("2. Add Data");
                System.out.println("3. Remove Data");
                System.out.println("4. Exit");

                int input = sm.nextInt();
                int index;

                switch (input) {
                    case 1:
                        if (details.emptyList()) {
                            System.out.println("The system haven't receive any data.");

                            break;
                        }
                        details.showBoards();
                        System.out.println("\nSelect board position");
                        index = sm.nextInt();
                        details.boardDetails(index);

                        break;
                    case 2:
                        System.out.println("\nSelect which data do you want to add");
                        System.out.println("1. Pengurus Inti");
                        System.out.println("2. Koordinator dan Staff");
                        int key = sm.nextInt();
                        sm.nextLine();
                        switch (key) {
                            case 1:
                                PengurusIntiDetails();
                                details = new UKMDetails(bPosition, bName, bNIM, bMajor, bBatch);
                                intiBoards = new PengurusInti(bPosition, bName, bNIM, bMajor, bBatch);
                                details.addPengurusInti(intiBoards);
                               
                                break;
                            case 2:
                                KoordDanStaffDetails();
                                details = new UKMDetails(bPosition, bName, bNIM, bMajor, bBatch);
                                koordBoards = new KoordDanStaff(bUsg, bPosition, bName, bNIM, bMajor, bBatch);
                                details.addKoordDanStaff(koordBoards);
                                break;

                            default:
                                System.out.println("No Such Entry");
                                break;
                        }
                        break;
                    case 3:
                        if(details.emptyList()){
                            System.out.println("The system haven't receive any data.");
                            break;
                            
                        }
                        details.showBoards();
                        System.out.println("\nSelect which data do you want to remove");
                        index = sm.nextInt();
                        details.removeMember(index);


                        break;
                    case 4:
                        cont = false;
                        break;
                    default:
                        System.out.println("No such entry");
                        break;
                }

            }
        } catch (Exception e) {
            System.out.println("No such entry");
            // TODO: handle exception
        }

    }

 

    static void PengurusIntiDetails() {

        System.out.print("Position : ");
        bPosition = sm.nextLine();
        System.out.print("Name : ");
        bName = sm.nextLine();
        System.out.print("NIM : ");
        bNIM = sm.nextLine();
        System.out.print("Major : ");
        bMajor = sm.nextLine();
        System.out.print("Batch : ");
        bBatch = sm.nextInt();

    }

    static void KoordDanStaffDetails() {
        System.out.print("Department : ");
        bUsg = sm.nextLine();
        System.out.print("Position : ");
        bPosition = sm.nextLine();
        System.out.print("Name : ");
        bName = sm.nextLine();
        System.out.print("NIM : ");
        bNIM = sm.nextLine();
        System.out.print("Major : ");
        bMajor = sm.nextLine();
        System.out.print("Batch : ");
        bBatch = sm.nextInt();

    }

}