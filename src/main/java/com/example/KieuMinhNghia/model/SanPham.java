package com.example.KieuMinhNghia.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SanPham {
    private String ma;
    private String ten;
    private Integer namBaoHanh;
    private Float gia;
    private Integer soLuong;
    private String doanhMuc;
}
