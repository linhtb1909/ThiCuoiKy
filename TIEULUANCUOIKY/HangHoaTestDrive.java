package TIEULUANCUOIKY;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class HangHoaTestDrive {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        DanhSachHangHoa dSHangHoa = new DanhSachHangHoa();
        Date date = new Date();

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String sxtp1 = "20/01/2022";
        String hhtp1 = "20/01/2023";
        String sxtp2 = "01/01/2022";
        String hhtp2 = "05/03/2022";
        String sxtp3 = "03/03/2022";
        String hhtp3 = "03/03/2023";
        String sxtp4 = "12/02/2022";
        String hhtp4 = "12/06/2022";
        String ss1 = "15/03/2022";
        String ss2 = "10/04/2022";
        HangHoa hangThucPham1 = new HangThucPham("tp1", "Mi Hảo Hảo", 1000, 3000, format.parse(sxtp1), format.parse(hhtp1),
                "acecook");
        HangHoa hangThucPham2 = new HangThucPham("tp2", "Thit bò", 100, 150000, format.parse(sxtp2), format.parse(hhtp2),
                "dong nai");
        HangHoa hangThucPham3 = new HangThucPham("tp3", "chao", 500, 50000, format.parse(sxtp3),
                format.parse(hhtp3), "long an");
        HangHoa hangThucPham4 = new HangThucPham("tp4", "bột ngọt", 1000, 3000, format.parse(sxtp4), format.parse(hhtp4),
                "acecook");
        HangHoa hangSanhSu1 = new HangSanhSu("ss1", "Bat ", 100, 5000, "bat trang", format.parse(ss1));
        HangHoa hangSanhSu2 = new HangSanhSu("ss2", "Binh hoa", 200, 7000000, "bat trang", format.parse(ss2));
        HangHoa hangDienMay1 = new HangDienMay("dm1", "Nồi Cơm", 1, 500000, 24, 220);
        HangHoa hangDienMay2 = new HangDienMay("dm2", "Tủ lạnh", 2, 5000000, 12, 220);
        HangHoa hangDienMay3 = new HangDienMay("dm3", "Tivi", 5, 8000000, 24, 220);
        HangHoa hangDienMay4 = new HangDienMay("dm4", "Máy giặt", 1, 6000000, 24, 220);
        HangHoa hangDienMay5 = new HangDienMay("dm5", "Mic", 20, 2000000, 24, 10);

        int chon;
        int temp;
        String tim;
        do {
            System.out.println("-------MENU-------");
            System.out.println("\t0.Thoat");
            System.out.println("\t1.Tao hang hoa co san ");
            System.out.println("\t2.Them hang hoa ");
            System.out.println("\t3.Xoa hang hoa ");
            System.out.println("\t4.Sua hang hoa ");
            System.out.println("\t5.In danh sach hang hoa ");
            System.out.println("\t6.Tim kiem hang hoa theo ma ");
            System.out.println("\t7.Danh gia muc do buon ban ");
            System.out.print("Nhap lua chon: ");
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    dSHangHoa.them(hangThucPham1);
                    dSHangHoa.them(hangThucPham2);
                    dSHangHoa.them(hangThucPham3);
                    dSHangHoa.them(hangThucPham4);
                    dSHangHoa.them(hangSanhSu1);
                    dSHangHoa.them(hangSanhSu2);
                    dSHangHoa.them(hangDienMay1);
                    dSHangHoa.them(hangDienMay2);
                    dSHangHoa.them(hangDienMay3);
                    dSHangHoa.them(hangDienMay4);
                    dSHangHoa.them(hangDienMay5);
                    dSHangHoa.inDSHangHoa();
                    break;
                case 2:
                    do {
                        System.out.println("-------MENU-THEM------");
                        System.out.println("\t0.Thoat");
                        System.out.println("\t1.Them hang thuc pham");
                        System.out.println("\t2.Them hang sanh su");
                        System.out.println("\t3.Them hang dien may");
                        System.out.print("Nhap lua chon: ");
                        temp = scanner.nextInt();
                        switch (temp) {
                            case 1:
                                dSHangHoa.themTuBP(1);
                                break;
                            case 2:
                                dSHangHoa.themTuBP(2);
                                break;
                            case 3:
                                dSHangHoa.themTuBP(3);
                                break;
                        }
                    } while (temp != 0);
                    ;
                    break;
                case 3:
                    System.out.println("Nhap ma hang hoa can xoa: ");
                    scanner.nextLine();
                    tim = scanner.nextLine();
                    System.out.println("Hang hoa can xoa !!!");
                    dSHangHoa.xoaHangHoa(dSHangHoa.timHangHoaTheoMa(tim));
                    System.out.println("Danh sach hang hoa sau khi xoa !!!");

                    dSHangHoa.inDSHangHoa();
                    break;
                case 4:
                    dSHangHoa.timHangHoaTheoViTri(hangSanhSu1);
                    dSHangHoa.suaHangHoa(4, hangSanhSu1);
                    break;
                case 5:
                    dSHangHoa.inDSHangHoa();
                    break;
                case 6:
                    System.out.println("Nhap ma hang hoa can tim: ");
                    scanner.nextLine();
                    tim = scanner.nextLine();
                    dSHangHoa.timHangHoaTheoMa(tim);
                    break;
                case 7:
                    dSHangHoa.danhGiaMucDoBuonBan();
                    break;
            }
        } while (chon != 0);
    }

}