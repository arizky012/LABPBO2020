//Modul no.3

import java.util.Scanner;


public class MainSystem {

    static String name, subject, lectureName;
    static boolean wrongSubject;
    static int sks;
    static double finalScore;
    static char grade;

    public static void main(String[] args) {

        Scanner sm = new Scanner(System.in);

        System.out.print("Nama: ");
        String name = sm.nextLine();
        System.out.print("NIM: ");
        String nim = sm.nextLine();
        System.out.print("Kelas: ");
        String class_ = sm.nextLine();
        System.out.print("Mata Kuliah: ");
        String subject = sm.nextLine();
        System.out.print("Nilai UTS: ");
        double scoreUTS = sm.nextDouble();
        System.out.print("Nilai UAS: ");
        double scoreUAS = sm.nextDouble();

 
        subjectData(subject);
        studentScore(scoreUTS, scoreUAS);
        
        if (wrongSubject == true) {
            System.out.println("\nSistem akademik");
            System.out.println("----------------------------------------------------------------");
            System.out.println("Error!");
            System.out.println("Invalid input, can not found subject");
            System.out.println("----------------------------------------------------------------");
        } else {

            System.out.println("\nSistem akademik");
            System.out.println("----------------------------------------------------------------");
            System.out.println("NIM         : " + nim);
            System.out.println("Nama        : " + name);
            System.out.println("Kelas       : " + class_);
            System.out.println("Mata kuliah : " + subject);
            System.out.println("SKS         : " + sks);
            System.out.println("Dosen       : " + lectureName);
            System.out.println("Nilai UTS   : " + scoreUTS);
            System.out.println("Nilai UAS   : " + scoreUAS);
            System.out.println("Nilai Akhir : " + finalScore);
            System.out.println("Angka Mutu  : " + grade);
            System.out.println("----------------------------------------------------------------");
        }

        sm.close();
    }

    static void subjectData(String subject) {
        if (subject.equalsIgnoreCase("Bahasa Inggris")) {
            SubjectDetails details = new BahasaInggris();
            subject = details.getSubject();
            sks = details.getSks();
            lectureName = details.getLectureName();

        } else if (subject.equalsIgnoreCase("Matematika Dasar II")) {
            SubjectDetails details = new Matdas2();
            subject = details.getSubject();
            sks = details.getSks();
            lectureName = details.getLectureName();

        } else if (subject.equalsIgnoreCase("Wawasan IPTEKS")) {
            SubjectDetails details = new Wipteks();
            subject = details.getSubject();
            sks = details.getSks();
            lectureName = details.getLectureName();

        } else if (subject.equalsIgnoreCase("Pemrograman Berorientasi Objek")) {
            SubjectDetails details = new PBO();
            subject = details.getSubject();
            sks = details.getSks();
            lectureName = details.getLectureName();
        } else if (subject.equalsIgnoreCase("Kewarganegaraan")) {
            SubjectDetails details = new Kewarganegaraan();
            subject = details.getSubject();
            sks = details.getSks();
            lectureName = details.getLectureName();

        } else if (subject.equalsIgnoreCase("Aljabar Linear")) {
            SubjectDetails details = new AljabarLinear();
            subject = details.getSubject();
            sks = details.getSks();
            lectureName = details.getLectureName();

        } else if (subject.equalsIgnoreCase("Metode Statistika")) {
            SubjectDetails details = new MetStatistika();
            subject = details.getSubject();
            sks = details.getSks();
            lectureName = details.getLectureName();

        } else if (subject.equalsIgnoreCase("Logika Komputer")) {
            SubjectDetails details = new Logkom();
            subject = details.getSubject();
            sks = details.getSks();
            lectureName = details.getLectureName();

        } else if (subject.equalsIgnoreCase("Technopreneurship")) {
            SubjectDetails details = new Technopreneurship();
            subject = details.getSubject();
            sks = details.getSks();
            lectureName = details.getLectureName();

        } else {
            wrongSubject = true;

        }

    }

    static void studentScore(double scoreUTS, double scoreUAS){
        StudentScore score = new StudentScore(scoreUTS, scoreUAS);
        finalScore = score.getFinalScore();
        grade = score.getGrade();

    } 

}