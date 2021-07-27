public class PrivateImageStore implements ImageStore {
    public String upload(Image image, String bucketName) {
        createBucketIfNotExisting(bucketName);
        // ... upload image to private cloud
        // ... return url of image
    }

    public Image download(String url) {
        // ... download from private cloud
    }

    public void createBucketIfNotExisting(String bucketName) {
        // ...create bucket
        // ...throws exeption
    }
}
