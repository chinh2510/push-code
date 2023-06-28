package tuan07;

import java.util.ArrayList;

public class DSSach {

	public class DSSach {
		ArrayList<Sach> dsSach;

		public DSSach() {
			dsSach = new ArrayList<Sach>();
		}

		public boolean addSach(Sach sach) {
			if (sach == null)
				return false;
			if (dsSach.contains(sach))
				return false;
			dsSach.add(sach);
			return true;
		}

		public DSSach timSGK(String maSach) {
			DSSach sgk = new DSSach();
			for (Sach sach : dsSach) {
				if (sach.getMaSach().equalsIgnoreCase(maSach)) {
					sgk.addSach(sach);
				}
			}
			return sgk;
		}

		public Sach search(String masach) {
			for (Sach sach : dsSach) {

				if (sach.getMaSach().compareToIgnoreCase(masach) == 0)
					return sach;
			}
			return null;
		}

		public boolean xoa(String maSach) {
			for (Sach sach : dsSach) {
				if (sach.getMaSach().equalsIgnoreCase(maSach)) {
					dsSach.remove(sach);
					return true;
				}
			}
			return false;
		}

		public void suaSach(Sach sach) {
			int viTri = dsSach.indexOf(sach);
			dsSach.set(viTri, sach);
		}

		public double tongTienSachGiaoKhoa() {
			double tongTienSachGiaoKhoa = 0;
			for (Sach sach : dsSach) {
				if (sach instanceof SachGiaoKhoa)
					tongTienSachGiaoKhoa += sach.thanhTien();
			}
			return tongTienSachGiaoKhoa;
		}

		public double tongTienSachThamKhao() {
			double tongTienSachThamKhao = 0;
			for (Sach sach : dsSach) {
				if (sach instanceof SachThamKhao)
					tongTienSachThamKhao += sach.thanhTien();
			}
			return tongTienSachThamKhao;
		}

		public double tienCaoNhat() {
			double tienCaoNhat = dsSach.get(0).thanhTien();
			for (Sach sach : dsSach) {
				if (sach.thanhTien() > tienCaoNhat)
					tienCaoNhat = sach.thanhTien();
			}
			return tienCaoNhat;
		}

		public ArrayList<Sach> getHet() {
			return dsSach;
		}

		public ArrayList<Sach> getSGK() {
			ArrayList<Sach> sachGiaoKhoa = new ArrayList<Sach>();
			for (Sach sach : dsSach) {
				if (sach instanceof SachGiaoKhoa)
					sachGiaoKhoa.add(sach);
			}
			return sachGiaoKhoa;
		}

		public ArrayList<Sach> getSTK() {
			ArrayList<Sach> sachThamKhao = new ArrayList<Sach>();
			for (Sach sach : dsSach) {
				if (sach instanceof SachThamKhao)
					sachThamKhao.add(sach);
			}
			return sachThamKhao;
		}
	}

}
