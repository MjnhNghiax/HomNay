package util;

import com.example.KieuMinhNghia.util.ChanLe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChanLeTest {
    ChanLe tinhToan = new ChanLe();


   @Test
    public void TestSoLe(){
        Assertions.assertEquals("n la so le", tinhToan.soChan(2));
    }
    @Test
    public void TestSoLe1(){
        Assertions.assertEquals("n la so chan", tinhToan.soChan(3));
    }
    @Test
    public void TestSoLe2(){
        Assertions.assertEquals("n la so le", tinhToan.soChan(4));
    }
    @Test
    public void TestSoLe3(){
        Assertions.assertEquals("n la so chan", tinhToan.soChan(13));
    }
    @Test
    public void TestSoLe4(){
        Assertions.assertEquals("n la so le", tinhToan.soChan(6));
    }

}
