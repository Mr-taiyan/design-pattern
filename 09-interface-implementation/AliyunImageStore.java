public class AliyunImageStore {
    // constructor

    public void createBucketIfNotExisting(String bucketName) {
        // create bucket
        // throw exception if fail
    }

    public String generateAccessToken() {
        // generate access token
        return "";
    }

    public String uploadToAliyun(Image image, String bucketName, String accessToken) {
        // ... upload image to Ali cloud
        // ... return image stored on Ali cload url
    }

    public Image downloadFromAliyun(String url, String accessToken) {
        // ... download image from ali
    }

}
