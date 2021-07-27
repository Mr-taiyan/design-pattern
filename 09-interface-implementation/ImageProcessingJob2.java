/**
 * ImageProcessingJob2
 */
public class ImageProcessingJob2 {

    private static final String BUCKET_NAME = "ai_images_bucket";
    // ... dismiss unrelated code

    public void process() {
        Image image = new Image();
        ImageStore imageStore = new PrivateImageStore();
        imageStore.upload(image, BUCKET_NAME);
    }

}