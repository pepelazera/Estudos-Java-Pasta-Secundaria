package Study_Records;

public record RegisterRecords(String name, int id) {

    public void infoRegister() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
}
