public class ContactInfo {
    private String alamat;
    private String nomorTelepon;
    private String email;

    public ContactInfo(String alamat, String nomorTelepon, String email) {
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getEmail() {
        return email;
    }
}
