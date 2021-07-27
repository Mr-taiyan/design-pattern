public class NewAliyunImageStore implements ImageStore {
    public String upload(Image image, String bucketName) {
        createBucketIfNotExisting(bucketName);
        String accessToken = generateAccessToken();
        // ...upload image to aliyun
        // ...return url on aliyun
    }

    public Image download(String url) {
        String accessToken = generateAccessToken();
        // download image from aliyun
    }

    private void createBucketIfNotExisting(String bucketName) {
        // ...create bucket
        // ...throw exception if fail
    }

    private String generateAccessToken() {
        // generate access token
    }
}
