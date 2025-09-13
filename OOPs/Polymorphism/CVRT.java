class Document {
    String title;

    Document setTitle(String title) {
        this.title = title;
        return this;
    }
}

class WordDocument extends Document {
    String wordSpecificFeature;

    @Override
    WordDocument setTitle(String title) {
        super.setTitle(title);
        return this;
    }

    WordDocument setWordSpecificFeature(String feature) {
        this.wordSpecificFeature = feature;
        return this;
    }
}

public class CVRT {
    public static void main(String[] args) {
        WordDocument doc = new WordDocument()
        .setTitle("Report")
        .setWordSpecificFeature("Track Changes enabled");

        System.out.println("Title: " + doc.title);
        System.out.println("Feature: " + doc.wordSpecificFeature);
    }
}
