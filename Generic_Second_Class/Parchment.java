package Generic_Second_Class;

public class Parchment {

    private String content;

    public Parchment(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Content's parchment: " + content;
    }
}
