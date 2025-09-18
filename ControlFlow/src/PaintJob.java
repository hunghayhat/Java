public class PaintJob {
    // write code here

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBucket) {
        int buckets = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) return -1;
        else {
            buckets = (int) Math.ceil(width * height / areaPerBucket);
            return buckets - extraBucket;
        }

    }

    public static int getBucketCount (double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;
        int buckets = (int) Math.ceil(area / areaPerBucket);
        return buckets;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
        int buckets = (int) Math.ceil(width * height / areaPerBucket);
        return buckets;
    }

}