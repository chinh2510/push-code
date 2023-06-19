package bai5;

import java.time.LocalDate;

public class MainTP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HangThucPham htp1 = new HangThucPham();
		HangThucPham htp2 = new HangThucPham();
		HangThucPham htp3 = new HangThucPham();
		LocalDate ngay = LocalDate.of(2018, 07, 10);
		LocalDate ngay1 = LocalDate.of(2025, 03, 01);
		LocalDate ngay2 = LocalDate.of(2018, 9, 01);
		LocalDate ngay3 = LocalDate.of(2017, 03, 01);
		LocalDate ngay4 = LocalDate.of(2024, 03, 01);

		System.out.println("Mã_Hàng   Tên_Hàng         Đơn_Giá   Ngày_Sản_Xuất    Ngày_Hết_Hạn         Ghi_Chú");
		System.out.println("----------------------------------------------------------------------------------");
		try {
			htp1.HangThucPham("001", "Gạo", 100000, ngay, ngay);
			htp2.HangThucPham("002", "", 5000, ngay1, ngay2);
			htp3.HangThucPham("003", "Nước", 10000, ngay3, ngay4);

			System.out.println(htp1.toString());
			System.out.println(htp2.toString());
			System.out.println(htp3.toString());
			
			htp1.HangThucPham("", "", 100000, ngay, ngay);
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			System.out.println("Kết thúc chương trình!");
		}
	}
}
