package till.edu.baith9_recyclerview;

public class Landscape {
    private String imageFileName;
    private String landscapeCaption;

    public Landscape(String imageFileName, String landscapeCaption) {
        this.imageFileName = imageFileName;
        this.landscapeCaption = landscapeCaption;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public String getLandscapeCaption() {
        return landscapeCaption;
    }
}