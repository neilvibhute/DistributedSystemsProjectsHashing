package ds;

import javax.servlet.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class is the servlet that validates the computation of two kinds of
 * Hashes code and transforming them into Hexadecimal and Base64 representations.
 *
 */
@WebServlet(name = "ComputeHashes",
        urlPatterns = {"/ComputeHashes"})
public class ComputeHashes extends HttpServlet {


    /**
     * This method computes the hash code of the word of chosen method.
     * @param text text to compute
     * @param method method to use (MD5/SHA-1)
     * @return corresponding hash code
     */
    private byte[] computeHash(String text, String method) {
        byte[] digest = null;
        try {
            MessageDigest messageDegist = MessageDigest.getInstance(method);
            messageDegist.update(text.getBytes());
            digest = messageDegist.digest();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ComputeHashes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return digest;
    }
    /**
     * This function transform the hash code into hexadecimal representation.
     * @param b byte array of the hash code
     * @return Hexadecimal hash code
     */
    private String hashValueHexadecimal(byte[] b) {
        String result = "";
        for (int i = 0; i < b.length; i++) {
            result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
        }
        return result;
    }

    /**
     * This function transform the hash code into Base64 representation.
     * @param b byte array of the hash code
     * @return Base64 hash code
     */
    private String hashValueBase64(byte[] b) {
        return Base64.getEncoder().encodeToString(b);
    }
//    private String hashValueBase64(byte[] b) {
//        String result = "";
//        result = (new BASE64Encoder()).encode(b);
//        return result;
//    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    doGet(request, response); // Redirect POST requests to doGet method
}
}


