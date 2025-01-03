package kr.co.greenart.coffee;

public class Coffee {
	private int pk;
	private String menuName;
	private int menuPrice;
	
	public Coffee() {}
	
	public Coffee(String menuName, int menuPrice) {
		super();
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}

	public Coffee(int pk, String menuName, int menuPrice) {
		super();
		this.pk = pk;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}

	public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}

	@Override
	public String toString() {
		return "Coffee [pk=" + pk + ", menuName=" + menuName + ", menuPrice=" + menuPrice + "]";
	}
}
