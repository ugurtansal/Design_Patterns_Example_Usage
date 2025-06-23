package Social_Media_App;

public class SharedImage implements Image {
    private String fileName;

    public SharedImage(String fileName) {
        this.fileName = fileName;
    }

    public void display(String context) {
        System.out.println("🖼️ Image: " + fileName + " used → " + context);
    }
}
