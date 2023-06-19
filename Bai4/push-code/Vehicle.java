package TranChinh_BaiTapVehicle;

public class Vehicle {
	private int dungTich;
	private double triGia;
	private String chuXe,tenXe;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String tenXe, int dungTich, double triGia, String chuXe) {
		super();
		this.tenXe = tenXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
		this.chuXe = chuXe;
	
	}
	
	public double thueTruocBa;{
		double thue;
		if(dungTich < 100) thue=(1f/100)*triGia;
		else if(dungTich < 200) thue=(3f/100)*triGia;
		else thue=(5f/100)*triGia;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [tenXe=" + tenXe + ", dungTich=" + dungTich + ", triGia=" + triGia + ", chuXe=" + chuXe
				+ ", thueTruocBa=" + thueTruocBa + "]";
	}

	
	public String getTenXe() {
		return tenXe;
	}

	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public double getTriGia() {
		return triGia;
	}

	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}

	public String getChuXe() {
		return chuXe;
	}

	public void setChuXe(String chuXe) {
		this.chuXe = chuXe;
	}
	
	

}
