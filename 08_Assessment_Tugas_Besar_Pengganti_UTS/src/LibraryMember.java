import java.util.Date;

public class LibraryMember {
    private String namaLengkap;
    private ContactInfo contactInfo;
    private String jenisKelamin;
    private String kodeAnggota;
    private Date tanggalGabung;
    private boolean statusAktif;
    private String tingkatKeanggotaan;
    private int jumlahBukuDipinjam;
    private int jumlahTerlambat;
    private int jumlahDenda;
    private int poinLoyalitas;
    private String kodeReferal;
    private boolean langgananBuletin;

    public LibraryMember(
        String namaLengkap,
        ContactInfo contactInfo,
        String jenisKelamin,
        String kodeAnggota,
        Date tanggalGabung,
        boolean statusAktif,
        String tingkatKeanggotaan,
        int jumlahBukuDipinjam,
        int jumlahTerlambat,
        int jumlahDenda,
        int poinLoyalitas,
        String kodeReferal,
        boolean langgananBuletin
    ) {
        this.namaLengkap = namaLengkap;
        this.contactInfo = contactInfo;
        this.jenisKelamin = jenisKelamin;
        this.kodeAnggota = kodeAnggota;
        this.tanggalGabung = tanggalGabung;
        this.statusAktif = statusAktif;
        this.tingkatKeanggotaan = tingkatKeanggotaan;
        this.jumlahBukuDipinjam = jumlahBukuDipinjam;
        this.jumlahTerlambat = jumlahTerlambat;
        this.jumlahDenda = jumlahDenda;
        this.poinLoyalitas = poinLoyalitas;
        this.kodeReferal = kodeReferal;
        this.langgananBuletin = langgananBuletin;
    }


    public void cetakProfilLengkap() {
        System.out.println("===== PROFIL ANGGOTA =====");
        System.out.println("Nama          : " + namaLengkap);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Alamat        : " + contactInfo.getAlamat());
        System.out.println("Telepon       : " + contactInfo.getNomorTelepon());
        System.out.println("Email         : " + contactInfo.getEmail());
        System.out.println("Kode Anggota  : " + kodeAnggota);
        System.out.println("Tanggal Gabung: " + tanggalGabung);
        System.out.println("Status Aktif  : " + statusAktif);
        System.out.println("Tingkat       : " + tingkatKeanggotaan);
        System.out.println("Buku Dipinjam : " + jumlahBukuDipinjam);
        System.out.println("Terlambat     : " + jumlahTerlambat);
        System.out.println("Denda         : Rp " + jumlahDenda);
        System.out.println("Poin          : " + poinLoyalitas);
        System.out.println("Kode Referal  : " + kodeReferal);
        System.out.println("Langganan Buletin: " + langgananBuletin);
        System.out.println("Skor Risiko   : " + RiskCalculator.hitung(this));
        System.out.println("Layak Upgrade?: " + periksaKelayakanUpgrade());
        System.out.println("===========================");
    }

    public boolean periksaKelayakanUpgrade() {
        return tingkatKeanggotaan.equalsIgnoreCase("DASAR") && poinLoyalitas > 100;
    }

    // Getters
    public int getJumlahBukuDipinjam() { return jumlahBukuDipinjam; }
    public int getJumlahTerlambat() { return jumlahTerlambat; }
    public int getJumlahDenda() { return jumlahDenda; }
    public String getTingkatKeanggotaan() { return tingkatKeanggotaan; }
    public boolean isStatusAktif() { return statusAktif; }
}
