package BaiTapQLTK;

public class AccountList {
	private Account listTK[];
	private int count=0;
	
	public AccountList() {
		super();
		listTK = new Account[10];
	}
	
	public AccountList(int n) {
		if(n>0) listTK=new Account[n];
		else listTK = new Acconut[10];
	}
	
	public String addAcount(Account acc) {
		if(count < listTK.length - 1) {
			listTK[count]=acc;
			count++;
			return "Thêm tài khoản thành công";
		}
		else return "thêm tài khoản thất bại, số phần tử của mảng vượt quá giới hạn"
	}
	
	public void xuatAllphantu() {
		for(int i=0; i <= count ; i++) {
			System.out.println(listTK[i].toString());
		}
	}
}
