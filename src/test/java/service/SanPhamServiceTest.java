package service;

import com.example.KieuMinhNghia.model.SanPham;
import com.example.KieuMinhNghia.service.SanPhamService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SanPhamServiceTest {
    private SanPhamService service;

    @BeforeEach
    public void setUp(){
        service = new SanPhamService();
    }
    @Test
    public void TestSanPham(){
        SanPham sp = new SanPham("PH51", "KieuMinhNghia", 2, 200f, 3, "Khong");
        service.add(sp);
        SanPham sp1 = new SanPham("PH51", "KieuMinhA", 2, 200f, 3, "Khong");
        service.updateSanPham(sp1, "PH51");
        List<SanPham> danhSach = service.getAll();
        Assertions.assertEquals("KieuMinhA", danhSach.get(0).getTen());
    }
    @Test
    public void TestSanPham1(){
        SanPham sp = new SanPham("PH51", "KieuMinhNghia", 2, 200f, 3, "Khong");
        service.add(sp);
        SanPham sp1 = new SanPham("PH51", "KieuMinhNghia", 3, 200f, 3, "Khong");
        service.updateSanPham(sp1, "PH51");
        List<SanPham> danhSach = service.getAll();
        Assertions.assertEquals(3, danhSach.get(0).getNamBaoHanh());
    }
    @Test
    public void TestSanPham2(){
        SanPham sp = new SanPham("PH51", "KieuMinhNghia", 2, 200f, 3, "Khong");
        service.add(sp);
        SanPham sp1 = new SanPham("PH52", "KieuMinhA", 2, 200f, 3, "Khong");
        service.updateSanPham(sp1, "PH51");
        List<SanPham> danhSach = service.getAll();
        Assertions.assertEquals("PH52", danhSach.get(0).getMa());
    }
    @Test
    public void TestSanPham3(){
        SanPham sp = new SanPham("PH54", "KieuMinhNghia", 2, 300f, 3, "Khong");
        service.add(sp);
        SanPham sp1 = new SanPham("PH54", "KieuMinhA", 2, 400f, 3, "Khong");
        service.updateSanPham(sp1, "PH54");
        List<SanPham> danhSach = service.getAll();
        Assertions.assertEquals(400, danhSach.get(0).getGia());
    }
    @Test
    public void TestSanPham4(){
        SanPham sp = new SanPham("PH55", "KieuMinhNghia", 2, 200f, 3, "Khong");
        service.add(sp);
        SanPham sp1 = new SanPham("PH55", "KieuMinhA", 2, 200f, 4, "Khong");
        service.updateSanPham(sp1, "PH55");
        List<SanPham> danhSach = service.getAll();
        Assertions.assertEquals(4, danhSach.get(0).getSoLuong());
    }
}
