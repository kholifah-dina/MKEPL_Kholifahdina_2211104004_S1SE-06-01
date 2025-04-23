package src;
public class RiskCalculator {
    public static double hitung(LibraryMember member) {
        double skor = 0;
        skor += member.getJumlahTerlambat() * 1.5;
        skor += member.getJumlahDenda() * 0.1;
        if (!member.isStatusAktif()) skor += 5;
        if (member.getTingkatKeanggotaan().equalsIgnoreCase("DASAR")) skor += 2;
        if (member.getJumlahBukuDipinjam() > 50) skor -= 1.5;
        return skor;
    }
}
