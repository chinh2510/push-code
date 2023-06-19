package Bai7Hinhtron;

public class ToaDo {
	private String ten;
	private float x;
	private float y;
	
	public ToaDo() {
		this.ten = "O";
		this.x = 0;
		this.y = 0;
	}
	
	public ToaDo(float x, float y) {
		this.ten = "O";
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("%-1s(%f, %f)", ten, x, y);
	}
}
