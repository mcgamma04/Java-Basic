package security;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.*;

class ProtectionTest {
    @Test
    public void encryptionTest() throws UnsupportedEncodingException {
        var sec =  new Protection();
        assertEquals("QWRlYmF5bw==",sec.encrypt("Adebayo"));
    }
   @Test
    public void decryptTest() throws UnsupportedEncodingException {
        var sec = new Protection();
        assertEquals("noble2020",sec.decrypt("bm9ibGUyMDIw"));
   }
   @Test
    public  void BCryptPasswordEncoder(){
        var sec = new Protection();
          LoginUser user =  new LoginUser();
          String p  = "$2a$10$kO/PG7MvLDb9y.Rhw5hMseOq6LfsCJtm6viMSKiWY5nvntZtbmnGC";
        user.setPassword(p);
        assertEquals(p,user.getPassword());
   }
}