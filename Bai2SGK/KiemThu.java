package tuan07;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class KiemThu {
	
	static Scanner sc = new Scanner(System.in);
	static String maSach, xacnhan;
	static int luachon = 0;

	static void menu() {
		System.out.println("=============Menu=============");
		System.out.println("1. Thêm sách");
		System.out.println("2. Tìm sách giáo khoa");
		System.out.println("3. Xóa sách");
		System.out.println("4. Sửa thông tin sách");
		System.out.println("5. Xuất danh sách sach giáo khoa");
		System.out.println("6. Xuất danh sách sach tham khảo");
		System.out.println("7. Tông tiền của từng sách");
		System.out.println("8. Tiền sách cao nhất");
		System.out.println("0. Thoát");
	}

	static void nhapCung(DSSach dsSach) {
		Sach sgk1 = new SachGiaoKhoa("1", "09/10/2002", 100000, 400, "Đinh Trần Anh Quân", true);
		dsSach.addSach(sgk1);
		Sach sgk2 = new SachGiaoKhoa("2", "04/10/2021", 50000, 222, "Lê Văn Đạt", true);
		dsSach.addSach(sgk2);
		Sach sgk3 = new SachGiaoKhoa("3", "05/11/2005", 20000, 400, "Nguyễn Văn Hậu", false);
		dsSach.addSach(sgk3);
		Sach stk1 = new SachThamKhao("4", "12/12/2021", 30000, 900, "Trần Nam Anh", 100);
		dsSach.addSach(stk1);
		Sach stk2 = new SachThamKhao("5", "25/01/2012", 50000, 100, "Lê Thị Hợi", 200);
		dsSach.addSach(stk2);
		Sach stk3 = new SachThamKhao("6", "05/05/2019", 8000, 50, "Vũ Quang Đạt", 300);
		dsSach.addSach(stk3);
	}

	static Sach nhapMem() {
		Sach sach;
		String maSach, ngayNhap, nhaXuatBan;
		double donGia, thue;
		int soLuong;
		boolean tinhTrang;

		System.out.println("Nhập mã sách: ");
		maSach = sc.nextLine();
		System.out.println("Nhập ngày nhập: ");
		ngayNhap = sc.nextLine();
		System.out.println("Nhập đơn giá: ");
		donGia = sc.nextDouble();
		sc.nextLine();
		System.out.println("Nhập số lượng: ");
		soLuong = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập nhà xuất bản: ");
		nhaXuatBan = sc.nextLine();
		System.out.println("Bạn muốn nhập sach giáo khoa (1) hay sách tham khảo (2)? ");
		luachon = sc.nextInt();
		sc.nextLine();
		if (luachon == 1) {
			System.out.println("Nhập tình trạng");
			xacnhan = sc.nextLine();
			if (xacnhan.equalsIgnoreCase("moi"))
				tinhTrang = true;
			else
				tinhTrang = false;
			sach = new SachGiaoKhoa(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, tinhTrang);
		} else {
			System.out.println("Nhập thuế: ");
			thue = sc.nextDouble();
			sc.nextLine();
			sach = new SachThamKhao(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, thue);
		}
		return sach;
	}

	static void xuatSGK(DSSach objDsSach) {
		ArrayList<Sach> dsSach = objDsSach.getSGK();
		for (Sach sach : dsSach) {
			System.out.println(sach);
		}
	}

	static boolean xuatTimSGK(DSSach objDsSach) {
		ArrayList<Sach> dsSach = objDsSach.getSGK();

		for (Sach sach : dsSach) {
			System.out.println(tieuDeSGK());
			System.out.println(sach);
			return true;
		}
		return false;
	}

	static void xuatSTK(DSSach objDsSach) {
		ArrayList<Sach> dsSach = objDsSach.getSTK();
		for (Sach sach : dsSach) {
			System.out.println(sach);
		}
	}

	static String tieuDeSGK() {
		return String.format("|%-15s|%-15s|%-15s|%-15s|%-20s|%-15s|%-15s|", "Mã Sách", "Ngày Nhập", "Đơn giá",
				"Số Lượng", "NXB", "Tình Trạng", "Thành Tiền");
	}

	static String tieuDeSTK() {
		return String.format("|%-15s|%-15s|%-15s|%-15s|%-20s|%-15s|%-15s|", "Mã Sách", "Ngày Nhập", "Đơn giá",
				"Số Lượng", "NXB", "Thuế", "Thành Tiền");
	}

	static void xuatDSSach(DSSach dsSach) {
		System.out.println("Danh sách sách giáo khoa");
		System.out.println(tieuDeSGK());
		xuatSGK(dsSach);
		System.out.println("Danh sách sách tham khảo");
		System.out.println(tieuDeSTK());
		xuatSTK(dsSach);
	}

	static DSSach suaThongTin(DSSach dsSach) {
		System.out.println("Nhập mã sách cần sửa");
		maSach = sc.nextLine();
		Sach tmps = dsSach.search(maSach);
		if (tmps == null) {
			System.out.println("Mã sách không tồn tại");
			return dsSach;
		}
		String maSachMoi;
		int lc = 0;
		do {
			System.out.println("Nhập thông tin muốn sửa:");
			System.out.println("1. Mã sách");
			System.out.println("2. Ngày nhập");
			System.out.println("3. Đơn giá");
			System.out.println("4. Số lượng");
			System.out.println("5. Nhà xuất bản");
			if (tmps instanceof SachGiaoKhoa) {
				System.out.println("6. Tình trạng");
			} else {
				System.out.println("6. Thuế");
			}
			System.out.println("0. Thoát");
			lc = sc.nextInt();
			sc.nextLine();
			switch (lc) {
			case 1:
				System.out.println("Nhập mã sách mới");
				maSachMoi = sc.nextLine();
				if (dsSach.search(maSachMoi) != null || dsSach.search(maSachMoi) != tmps) {
					tmps.setMaSach(maSachMoi);
				}
				if (dsSach.search(maSachMoi) == tmps) {
					System.out.println("Bạn không thể nhập trùng với mã " + maSach + " mà bạn vừa nhập");
					tmps.setMaSach(maSach);
				}
				break;
			case 2:
				System.out.println("Nhập ngày nhập");
				tmps.setNgayNhap(sc.nextLine());
				break;
			case 3:
				System.out.println("Nhập đơn giá");
				tmps.setDonGia(sc.nextDouble());
				break;
			case 4:
				System.out.println("Nhập số lượng");
				tmps.setSoLuong(sc.nextInt());
				break;
			case 5:
				System.out.println("Nhập nhà xuất bản");
				tmps.setNhaXuatBan(sc.nextLine());
				break;
			case 6:
				if (tmps instanceof SachGiaoKhoa) {
					System.out.println("Nhập tình trạng");
					xacnhan = sc.nextLine();
					if (xacnhan.equalsIgnoreCase("moi"))
						((SachGiaoKhoa) tmps).setTinhTrang(true);
					else
						((SachGiaoKhoa) tmps).setTinhTrang(false);
				} else {
					System.out.println("Nhập thuế");
					((SachThamKhao) tmps).setThue(sc.nextDouble());
				}
				break;
			default:
				break;
			}
		} while (lc != 0);

		dsSach.suaSach(tmps);
		return dsSach;
	}

	public static void main(String[] args) {
		DSSach dsSach = new DSSach();
		DecimalFormat df = new DecimalFormat("#,###.0");
		nhapCung(dsSach);
		xuatDSSach(dsSach);
		do {
			menu();
			System.out.println("Nhập lựa chọn");
			luachon = sc.nextInt();
			sc.nextLine();
			switch (luachon) {
			case 1:
				System.out.println("Thêm sách");
				if (dsSach.addSach(nhapMem()) == false) {
					System.out.println("Thêm thất bại");
				} else {
					System.out.println("Thêm thành công");
					xuatDSSach(dsSach);
				}
				break;
			case 2:
				System.out.println("Tìm sách giáo khoa");
				System.out.println(tieuDeSGK());
				xuatSGK(dsSach);
				System.out.println("Nhập mã sách giáo khoa");
				maSach = sc.nextLine();
				if (xuatTimSGK(dsSach.timSGK(maSach)) == true) {
					System.out.println("Tìm thấy");
				} else
					System.out.println("Tìm không thấy");
				break;
			case 3:
				System.out.println("Xóa sách");
				xuatDSSach(dsSach);
				System.out.println("Nhập mã sách cần xóa");
				maSach = sc.nextLine();
				System.out.println("Bạn có chắc chắn muốn xóa không (Có/Không)");
				xacnhan = sc.nextLine();
				if (xacnhan.equalsIgnoreCase("co")) {
					if (dsSach.xoa(maSach) == false) {
						System.out.println("Xóa không thành công");
					} else {
						System.out.println("Xóa thành công");
					}
					xuatDSSach(dsSach);
				}
				break;
			case 4:
				System.out.println("Sửa thông tin sách");
				dsSach = suaThongTin(dsSach);
				break;
			case 5:
				System.out.println("Danh sách sách giáo khoa");
				System.out.println(tieuDeSGK());
				xuatSGK(dsSach);
				break;
			case 6:
				System.out.println("Danh sách sách tham khảo");
				System.out.println(tieuDeSTK());
				xuatSTK(dsSach);
				break;
			case 7:
				System.out.println("Tổng tiền sách giáo khoa: " + df.format(dsSach.tongTienSachGiaoKhoa()));
				System.out.println("Tổng tiền sách tham khảo: " + df.format(dsSach.tongTienSachThamKhao()));
				break;
			case 8:
				System.out.println("Tiền sách cao nhất: " + df.format(dsSach.tienCaoNhat()));

				break;
			default:
				break;
			}
		} while (luachon != 0);
	}

}



