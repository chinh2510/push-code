package TranChinh_BaiTapVehicle;

public class VehicleDemo {
	public static void main(String[] args) {
		Vehicle xe1 = new Vehicle("sh",350, 285000000, "Trần Chính");
		Vehicle	xe2 = new Vehicle("wave",100, 15000000, "Trần A");
		Vehicle xe3 = new Vehicle("sirius",110, 19000000, "Trần B");
		
		VehicleList listXe = new VehicleList(3);
		
		listXe.addVehicle(xe1);
		listXe.addVehicle(xe2);
		listXe.addVehicle(xe3);
		
		
		System.out.println(String.format("%-20s %-20s %12s %20s %20s","Tên chủ xe", "Tên xe","Dung tích","Trị giá","Thuế trước bạ" ));
		System.out.println("================================================================================================");
		//System.out.println(xe1.toString());
		listXe.xuatTatcacxe();
	}

}
