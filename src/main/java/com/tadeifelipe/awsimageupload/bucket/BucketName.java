package com.tadeifelipe.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("tadeifelipe-image-upload-1");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
