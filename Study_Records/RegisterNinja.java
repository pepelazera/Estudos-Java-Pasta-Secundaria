package Study_Records;

import java.util.Objects;

public class RegisterNinja {

    private final String name;
    private final String email;
    private final int telephone;

    // I can't create a void constructor when I have final classes
    // And final classes can receive setters, because they can't change their values

    public RegisterNinja(String name, String email, int telephone) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getTelephone() {
        return telephone;
    }

    // Core Class on the next classes
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RegisterNinja that = (RegisterNinja) o;
        return telephone == that.telephone && Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, telephone);
    }

    @Override
    public String toString() {
        return "RegisterNinja{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                '}';
    }
}
