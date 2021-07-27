public class ImageProcessingJob1 {
    private static final String BUCKET_NAME = "ai_images_bucket";

    public void process() {
        Image image = new Image();
        AliyunImageStore imageStore = new AliyunImageStore();
        imageStore.createBucketIfNotExisting(BUCKET_NAME);
        String accessToken = imageStore.generateAccessToken();
        imageStore.uploadToAliyun(image, BUCKET_NAME, accessToken);
    }
}
