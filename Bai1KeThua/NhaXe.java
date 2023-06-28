package Bai1KeThua;
import java.util.ArrayList;
public class NhaXe {
	private String tenNhaXe;
	private ArrayList<ChuyenXe> listChuyenXe;
	public NhaXe(String tenNhaXe, ArrayList<ChuyenXe> listChuyenXe) {
		super();
		this.tenNhaXe = tenNhaXe;
	}
	
	public void themChuyenXe(ChuyenXe chyen) {
		if(listChuyenXe.contains(chyen)) listChuyenXe.add(chyen);
		else System.out.println("Them that bai. chuyen xe da ton tai!");
	}
	
	public void xoaChuyenXe(ChuyenXe xe) {
		if(listChuyenXe.contains(xe)) listChuyenXe.remove(xe);
		else System.out.println("Them that bai. chuyen xe khong ton tai!");
	}
	
	public void xuatChuyenXe(int loai) {
		//loai == 0: xuat tat ca
		if(loai == 0) {
			for(ChuyenXe xe: listChuyeXe) {
				System.out.println(xe.toString());
			}
		}
		//loai == 1: xuat noi thanh
		if(loai == 1) {
			for(ChuyenXe xe: listChuyeXe) {
				if(xe instanceof ChuyenXeNoiThanh ) System.out.printf(xe.toString());
			}
	} 
		//loai == 9: xuat ngoai thanh
		if(loai == 9) {
		for(ChuyenXe xe: listChuyenXe) {
			if(xe instanceof ChuyenXeNgoaiThanh) System.out.println(xe.toString());
			}
		}
	}
	
	
	public void tinhDoanhThu(int loai) {
		double tongDoanhThu = 0;
		//loai == 0: xuat tat ca
		if(loai == 0) {
			for(ChuyenXe xe: listChuyeXe) {
				tongDoanhThu += xe.getDoanhThu();
			}
			System.out.println("Tong doanh thu:" + tongDoanhThu);
		}
		//loai == 1: xuat noi thanh
		if(loai == 1) {
			for(ChuyenXe xe: listChuyeXe) {
				if(xe instanceof ChuyenXeNoiThanh ) tongDoanhThu += xe.getDoanhThu();
			}
			System.out.println("Tong doanh thu chuyen xe noi thanh:" + tongDoanhThu);
	} 
		//loai == 9: xuat ngoai thanh
		if(loai == 9) {
		for(ChuyenXe xe: listChuyenXe) {
			if(xe instanceof ChuyenXeNgoaiThanh) tongDoanhThu += xe.getDoanhThu();
			}
		System.out.println("Tong doanh thu chuyen xe ngoai thanh:" + tongDoanhThu);
		}
	}
	
	public String getTenNhaXe() {
		return tenNhaXe;
	}
	public void setTenNhaXe(String tenNhaXe) {
		this.tenNhaXe = tenNhaXe;
	}
}
