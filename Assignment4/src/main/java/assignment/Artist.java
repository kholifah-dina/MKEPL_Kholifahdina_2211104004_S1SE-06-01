package assignment;

public class Artist {
    private String name;
    private String alias;
    private String imageURL;

    public Artist(String name, String alias, String imageURL) {
        this.name = name;
        this.alias = alias;
        this.imageURL = imageURL;
    }

    public void printInfo() {
        System.out.println("Artist name: " + name);
        if (!alias.isEmpty()) {
            System.out.println("Also known as: " + alias);
        }
    }
}
