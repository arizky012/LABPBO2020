package app;

import java.util.*;

public class MataKuliahDB {
    
    HashMap<String, String> matkulData = new HashMap<>();
    HashMap<String, Integer> matkulSKS = new HashMap<>();

    MataKuliahDB() {
        matkulData.put("Bahasa Inggris", "Sukmawati Marzuki");
        matkulData.put("Matematika Dasar 2", "Dr. Eng. Armin Lawi, M.Eng & Dr. Diaraya M.Ak");
        matkulData.put("Wawasan IPTEKS", "Dr. Sri Suryani, DEA");
        matkulData.put("Aljabar Linier", "Dr. Budi Nurwahyu, MS");
        matkulData.put("Pemrograman Berorientasi Objek", "Dr. Eng. Armin Lawi, M.Eng & Supri Bin Hj Amir, S.Si., M.Eng");
        matkulData.put("Metode Statistika", "Sitti Sahriman, S.Si.,M.Si. & Dr. Nurtiti Sunusi, S.Si., M.Si");
        matkulData.put("Logika Komputer", "NUR ERAWATY, S.Si, M.Si & Dr. Diaraya M.Ak");
        matkulData.put("Kewarganegaraan", "Irham");
        matkulData.put("Technopreunership", "Dr. Diaraya M.Ak & Dr. Muhammad Hasbi, M.Sc");

        matkulSKS.put("Bahasa Inggris", 2);
        matkulSKS.put("Matematika Dasar 2", 3);
        matkulSKS.put("Wawasan IPTEKS", 2);
        matkulSKS.put("Aljabar Linier", 3);
        matkulSKS.put("Pemrograman Berorientasi Objek", 3);
        matkulSKS.put("Metode Statistika", 3);
        matkulSKS.put("Logika Komputer", 3);
        matkulSKS.put("Kewarganegaraan", 2);
        matkulSKS.put("Technopreunership", 3);
    }

    public String getDosen(String key) {
        return matkulData.get(key);
    }

    public Integer getSKS(String key) {
        return matkulSKS.get(key);
    }
}