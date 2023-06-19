package BaiTapQLTK;

public class AccountDemo {
	 public static void main(String[] args) {
		 Account tk1= new Account ();
		 Account tk2= new Account(9999,"Duc",100000000);
		 Account tk3= new Account(12345,"Chinh",50000);
		 
		 AccountList listTK = new Acconut(5);
		 listTK.addAcount(tk1);
		 listTK.addAcount(tk2);
		 listTK.addAcount(tk3);
		 
		 System.out.println(String.format("%-15s |%-20s |%20s |%-50s|","Số TK",
				 "Tên tài khoản","Số tiền","Trạng thái"));
		 
		 listTK.xuatAllphantu();
		 
	 }
}
