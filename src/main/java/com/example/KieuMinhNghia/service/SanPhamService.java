package com.example.KieuMinhNghia.service;

import com.example.KieuMinhNghia.model.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> list ;

    public SanPhamService(){
        list = new ArrayList<>();
    }
    public List<SanPham> getAll(){
        return list;
    }
    public void add(SanPham sanPham){
        list.add(sanPham);
    }
    public void updateSanPham(SanPham sanPham, String id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getMa().equals(id)){
                list.set(i, sanPham);
            }
        }
    }
}
