package src;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ContactInfo contact = new ContactInfo("Jl. Merdeka", "08123456789", "kholifah@example.com");

        LibraryMember member = new LibraryMember(
            "Kholifahdina", contact, "Perempuan", "AGT001", new Date(), true,
            "DASAR", 5, 2, 5000, 120, "REF123", true
        );

        member.cetakProfilLengkap();
    }
}
