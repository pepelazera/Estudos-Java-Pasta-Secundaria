package Study_Records;

public record NinjaRecord(String name, String email, int telephone) {

    // All the attributes is FINAL automatically
    // Records don't have setters, so, I can, change what I put before

    public String emailCapsLock() {
        return email.toUpperCase();
    }

    // When I create Getters on records, I don't have the preposition 'get', I just have the name
    @Override
    public String name() {
        return name;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public int telephone() {
        return telephone;
    }
}
