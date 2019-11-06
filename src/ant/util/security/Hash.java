package ant.util.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Hash {
    private static byte[] computeHash(String algorithm, byte[] data) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            return messageDigest.digest(data);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String computeBase64MD5(byte[] data) {
        byte[] md5 = computeHash("MD5", data);
        return Base64.getEncoder().encodeToString(md5);
    }

    public static String computeBase64MD5(String data) {
        byte[] rawData = data.getBytes();
        byte[] md5 = computeHash("MD5", rawData);

        return Base64.getEncoder().encodeToString(md5);
    }

    public static String computeBase64SHA1(byte[] data) {
        byte[] sha1 = computeHash("SHA-1", data);
        return Base64.getEncoder().encodeToString(sha1);
    }

    public static String computeBase64SHA1(String data) {
        byte[] rawData = data.getBytes();
        byte[] sha1 = computeHash("SHA-1", rawData);
        return Base64.getEncoder().encodeToString(sha1);
    }

    public static String computeBase64SHA256(byte[] data) {
        byte[] sha256 = computeHash("SHA-256", data);
        return Base64.getEncoder().encodeToString(sha256);
    }

    public static String computeBase64SHA256(String data) {
        byte[] rawData = data.getBytes();
        byte[] sha256 = computeHash("SHA-256", rawData);
        return Base64.getEncoder().encodeToString(sha256);
    }
}
