package TestOnePiece;
public class Character {

    private String name;
    private int age;
    private String socialStatus;

    public Character() {
    }

    public Character(String name, int age, String socialStatus) {
        this.name = name;
        this.age = age;
        this.socialStatus = socialStatus;
    }


    // Getters methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSocialStatus() {
        return socialStatus;
    }

    // Setters Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSocialStatus(String socialStatus) {
        this.socialStatus = socialStatus;
    }

}
