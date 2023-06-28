package Bai1KeThua;

public class Demo {
	public static void main(String[] args) throws Exception {
		NhaXe nhaXe1 = new NhaXe("Nha xe Mien Dong");
		
		ChuyenXeNoiThanh chuyenNoiThanh1 = new ChuyenXeNoiThanh("NT1","Chinh","49A1-12345",600000,21,10);
		ChuyenXeNoiThanh chuyenNoiThanh2 = new ChuyenXeNoiThanh("NT2","Duc","49A1-34567",600000,21,10);
		
		ChuyenXeNgoaiThanh chuyenNgoaiThanh1 = new ChuyenXeNgoaiThanh("NT3","Kien","59A1-34567",1300000,"Da Lat",3);
		ChuyenXeNgoaiThanh chuyenNgoaiThanh2 = new ChuyenXeNgoaiThanh("NT4","Vu","59A1-56178",2100000,"Nha Trang",4);

		nhaXe1.themChuyenXe(chuyenNgoaiThanh1);
		nhaXe1.themChuyenXe(chuyenNgoaiThanh2);
		nhaXe1.themChuyenXe(chuyenNoiThanh1);
		nhaXe1.themChuyenXe(chuyenNoiThanh2);
		
		System.out.println("--Xuat tat ca--");
		nhaXe1.xuatChuyenXe(0);
		System.out.println("--Xuat noi thanh--");
		nhaXe1.xuatChuyenXe(1);
		System.out.println("--Xuat ngoai thanh--");
		nhaXe1.xuatChuyenXe(9);
		
		System.out.println("--Tong doanh thu--");
		nhaXe1.tinhDoanhThu(0);
		System.out.println("--Doanh thu noi thanh--");
		nhaXe1.tinhDoanhThu(1);
		System.out.println("--Doanh thu ngoai thanh--");
		nhaXe1.tinhDoanhThu(9);
	}
}
