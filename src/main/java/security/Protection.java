package security;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Protection {
    private String encode;
    private byte[] decode;
    public String encrypt(String password) throws UnsupportedEncodingException {
        encode = Base64.getEncoder().encodeToString(password.getBytes("UTF-8"));
        return  encode;
    }
    public String decrypt(String pass) throws UnsupportedEncodingException {
        decode = Base64.getDecoder().decode(pass);
        String decodeTest =  new String(decode,"UTF-8");
        return decodeTest;

    }
    //

    public String login(LoginUser pass){
        BCryptPasswordEncoder encode =  new BCryptPasswordEncoder();
        String passEncod =  encode.encode(pass.getPassword());
        return  passEncod;

    }


}
