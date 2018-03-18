package series.models;

public class Title {
    private final String id;
    private final String titleType;
    private final String primaryTitle;
    private final String originalTitle;

    public Title(
        String id,
        String titleType,
        String primaryTitle,
        String originalTitle
    ) {
        this.id = id;
        this.titleType = titleType;
        this.primaryTitle = primaryTitle;
        this.originalTitle = originalTitle;
    }

    public String getId () {
        return id;
    }

    public String getTitleType () {
        return titleType;
    }

    public String getPrimaryTitle () {
        return primaryTitle;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }
}
