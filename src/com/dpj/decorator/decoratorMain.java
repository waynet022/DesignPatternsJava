package com.dpj.decorator;

public class decoratorMain {
    public static void main(String[] args){
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-1234");
    }
}
