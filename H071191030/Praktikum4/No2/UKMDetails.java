
import java.util.ArrayList;

import java.util.List;

/**
 * UKMDetails
 */
public class UKMDetails {

    static List<PengurusInti> inti = new ArrayList<>();
    static List<KoordDanStaff> koordStaff = new ArrayList<>();

    // HashMap<Integer,PengurusInti> inti = new HashMap<>();
    // HashMap<Integer, KoordDanStaff> koordStaff = new HashMap<>();

    String position;
    String name;
    String nim;
    String major;
    int batch;

    public UKMDetails(String position, String name, String nim, String major, int batch) {
        this.name = name;
        this.nim = nim;
        this.major = major;
        this.position = position;
        this.batch = batch;
    }

    public UKMDetails() {

    }

    public void addPengurusInti(PengurusInti boards) {
        inti.add(new PengurusInti(boards.position, boards.name, boards.nim, boards.major, boards.batch));
    }

    public void addKoordDanStaff(KoordDanStaff boards) {
        koordStaff.add(
                new KoordDanStaff(boards.usg, boards.position, boards.name, boards.nim, boards.major, boards.batch));
    }

    public void showBoards() {

        if (inti.size() != 0) {
            System.out.println("===== PENGURUS INTI =====");
            for (int i = 0; i < inti.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, inti.get(i).position);

            }
        }
        if (koordStaff.size() != 0) {
            System.out.println("===== KOORDINATOR DAN STAFF =====");
            for (int i = 0; i < koordStaff.size(); i++) {
                System.out.printf("%d. %s %s\n", inti.size() + i + 1, koordStaff.get(i).position,
                        koordStaff.get(i).usg);

            }

        }

    }

    public void boardDetails(int index) {
        if (index <= inti.size()) {
            System.out.printf("\n%s\n", inti.get(index - 1).position);
            System.out.printf("Nama     : %s\n", inti.get(index - 1).name);
            System.out.printf("NIM      : %s\n", inti.get(index - 1).nim);
            System.out.printf("Prodi    : %s\n", inti.get(index - 1).major);
            System.out.printf("Batch    : %s\n", inti.get(index - 1).batch);
        } else {
            System.out.printf("\n%s %s\n", koordStaff.get(index - inti.size() - 1).position,
                    koordStaff.get(index - inti.size() - 1).usg);
            System.out.printf("Nama     : %s\n", koordStaff.get(index - inti.size() - 1).name);
            System.out.printf("NIM      : %s\n", koordStaff.get(index - inti.size() - 1).nim);
            System.out.printf("Prodi    : %s\n", koordStaff.get(index - inti.size() - 1).major);
            System.out.printf("Batch    : %s\n", koordStaff.get(index - inti.size() - 1).batch);

        }

    }

    public boolean emptyList() {
        if (inti.isEmpty() && koordStaff.isEmpty()) {
            return true;
        }
        return false;
    }

    public void removeMember(int index) {
        if (index <= inti.size()) {
            System.out.println("\nRemoved " + inti.get(index - 1).position);
            inti.remove(index - 1);
        } else {
            System.out.println("\nRemoved " + koordStaff.get(index - inti.size() - 1).position + " "
                    + koordStaff.get(index - inti.size() - 1).usg);
            koordStaff.remove(index - inti.size() - 1);
        }
    }

}