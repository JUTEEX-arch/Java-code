import java.io.*;
import java.security.*;

public class FileMD5 {
    public static void main(String[] args) throws Exception {
        File file = new File("PC-1-08-14-18-END.E01");
        MessageDigest md = MessageDigest.getInstance("MD5");
        try (InputStream is = new FileInputStream(file);
             DigestInputStream dis = new DigestInputStream(is, md)) {
            while (dis.read() != -1) ; // read entire file
        }
        byte[] digest = md.digest();

        // Convert to hex string
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        System.out.println("MD5 of file: " + sb.toString());
    }
}
