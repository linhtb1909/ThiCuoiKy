package TIEULUANCUOIKY;

import java.util.ArrayList;
import java.util.List;

public class DanhSachHangHoa {
    private List<HangHoa> dshangHoa = new ArrayList<>();

    public void them(HangHoa hangHoa) {
        dshangHoa.add(hangHoa);
    }
    //them hang hoa tu ban phim
    public void themTuBP(int loaiHangHoa) {
        if (loaiHangHoa == 1) {
            HangThucPham hangThucPham = new HangThucPham();
            hangThucPham.nhap();
            this.dshangHoa.add(hangThucPham);
        } else if (loaiHangHoa == 2) {
            HangSanhSu hangSanhSu = new HangSanhSu();
            hangSanhSu.nhap();
            this.dshangHoa.add(hangSanhSu);
        } else if (loaiHangHoa == 3) {
            HangDienMay hangDienMay = new HangDienMay();
            hangDienMay.nhap();
            this.dshangHoa.add(hangDienMay);
        }
    }
    //in danh sach hang hoa
    public void inDSHangHoa() {
        for (HangHoa hangHoa : dshangHoa) {
            System.out.println(hangHoa);
        }
    }
    //tim hang hoa theo ma
    public HangHoa timHangHoaTheoMa(String maHH) {
        HangHoa hangHoa = null;
        for (HangHoa hh : dshangHoa) {
            if (hh.getMaHang().equals(maHH)) {
                hangHoa = hh;
            }
        }
        System.out.println(hangHoa);
        return hangHoa;
    }
    // danh gia muc do buon ban
    public HangHoa danhGiaMucDoBuonBan() {
        HangHoa hangHoa = null;
        for (HangHoa hh : dshangHoa) {
            hh.danhGiaMucDoBuonBan();
        }
        return hangHoa;
    }
    //Xoa hang hoa
    public void xoaHangHoa(HangHoa hangHoa) {
        dshangHoa.remove(hangHoa);

    }
    //Tim hang hoa theo vi tri
    public int timHangHoaTheoViTri(HangHoa hangHoa) {
        int viTri = -1;
        viTri = dshangHoa.indexOf(hangHoa);
        return viTri;
    }
    //Sua hang hoa
    public HangHoa suaHangHoa(int viTri, HangHoa hangHoa) {
        timHangHoaTheoViTri(hangHoa);
        dshangHoa.set(viTri, hangHoa);
        hangHoa.nhap();
        return hangHoa;
    }

}