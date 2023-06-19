package Bai7Hinhtron;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;
	
	public HinhTron() {
		this.tam = new ToaDo();
		this.banKinh = 1;
	}
	
	public HinhTron(ToaDo tam, double banKinh) {
		this.tam = tam;
		this.banKinh = banKinh;
	}

	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	
	public double tinhChuVi() {
		return 2 * 3.14 * banKinh;
	}
	
	public double tinhDienTich() {
		return 3.14 * banKinh * banKinh;
	}
	
	public String toString() {
		return String.format("Hình tròn có tâm %s với bán kính %f có diện tích và chu vi lần lượt là %f và %f", tam, banKinh, tinhDienTich(), tinhChuVi());
	}
}
