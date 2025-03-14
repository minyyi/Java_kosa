package kosa.cart;

public class Phone implements Product {
//	private String no;
	private String name;
	private int price;
	private int dc_price;
	private String maker;
	
	
	private Phone() {}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("상품이름: " + name);
		System.out.println("원가: " + price);
		System.out.println("상품할인된 가격: " + dc_price);
		System.out.println("제조사: " + maker);
//		System.out.println(this.no+ "\t" +this.name+ "\t" +this.price+ "\t" +this.dis+ "\t");
	}

	@Override
	public void discountApply() {
		// TODO Auto-generated method stub
		dc_price = (int)( price * 0.8);
//		System.out.println(this.price * (100 - this.dis * 0.01));
	}
	

	
	public Phone(String name, int price, String maker) {
		super();
		this.name = name;
		this.price = price;
//		this.dc_price = dc_price;
		this.maker = maker;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDc_price() {
		return dc_price;
	}

	public void setDc_price(int dc_price) {
		this.dc_price = dc_price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	
}
