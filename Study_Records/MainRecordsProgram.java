package Study_Records;

public class MainRecordsProgram {
    public static void main(String[] args) {

        RegisterNinja registerNinja = new RegisterNinja(
                "Naruto Uzumaki",
                "naruto@konoha.com",
                989898);

        System.out.println("Register with no records" + registerNinja);
        System.out.println("Register name: " + registerNinja.getName());

        // Sasuke record object
        NinjaRecord registerUsingRecord = new NinjaRecord(
                "Sasuke Uchiha",
                "sasuke@konoha.com",
                118902);

        // With records, I have the same that I constructed in another 50 lines, but in 1 line
        System.out.println("\nRegister using records: " + registerUsingRecord);
        System.out.println("Email in caps lock: " + registerUsingRecord.emailCapsLock());
        System.out.println("Register name: " + registerUsingRecord.name());
    }
}
