// Question 8: Interface example

interface Filterable {

    void apply_filter(String filter_type);

    void reset_filter();
}

class ImageProcessor implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to image.");
    }

    public void reset_filter() {
        System.out.println("Image filters reset.");
    }
}

class DataAnalyzer implements Filterable {

    public void apply_filter(String filter_type) {
        System.out.println("Applying " + filter_type + " filter to dataset.");
    }

    public void reset_filter() {
        System.out.println("Data filters reset.");
    }
}

public class FilterExample {

    public static void main(String[] args) {

        ImageProcessor img = new ImageProcessor();
        DataAnalyzer data = new DataAnalyzer();

        img.apply_filter("Blur");
        img.reset_filter();

        data.apply_filter("Noise Reduction");
        data.reset_filter();
    }
}