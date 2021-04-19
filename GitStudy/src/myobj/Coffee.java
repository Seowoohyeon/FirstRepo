package myobj;

public class Coffee {
	
	private static class CoffeeCode{
		int code;
		String name;
		
		private CoffeeCode(int code, String name) {
			this.code = code;
			this.name = name;
		}
		
		public int getCode() {
			return code;
		}
		public String getName() {
			return name;
		}
		
	}
	private static class OriginCode{
		int o_code;
		String o_name;
		
		private OriginCode(int o_code, String o_name) {
			this.o_code = o_code;
			this.o_name = o_name;
		}
		
	}

	public final static CoffeeCode AMERICANO = new CoffeeCode(0, "아메리카노");
	public final static CoffeeCode CAFE_LATTE = new CoffeeCode(1, "카페라떼");;
	public final static CoffeeCode CAFE_MOCHA = new CoffeeCode(2, "카페모카");;
	public final static CoffeeCode CARAMEL_MACCHIATO = new CoffeeCode(3, "캬라멜마끼야또");
	
	public final static OriginCode COLOMBIA = new OriginCode(0, "콜롬비아");
	public final static OriginCode BRAZIL = new OriginCode(1, "브라질");;
	public final static OriginCode ETHIOPIA = new OriginCode(2, "에티오피아");;
	public final static OriginCode KENYA = new OriginCode(3, "케냐");
	
	CoffeeCode coffee;
	int price;
	int caffeine;
	OriginCode origin;
	
	boolean hot;
	
	public Coffee(CoffeeCode coffee, int price, int caffeine, OriginCode origin) {
		this.coffee = coffee;
		this.price = price;
		this.caffeine = caffeine;
		this.origin = origin;
		this.hot = true;
	}
	
	public String getOriginName() {
		/*System.out.println(origin.o_name);
		return this.origin;*/
		return origin.o_name;
	}
	public int getOriginCode() {
		return origin.o_code;
	}
	
	public String getCoffeeName() {
	/*	System.out.println(coffee.name);
		return this.coffee;*/
		return coffee.name;
	}
	public int getCoffeeCode() {
		return coffee.code;
	}
	
	public static void main(String[] args) {
		Coffee coffee = new Coffee(Coffee.AMERICANO, 1500, 10, Coffee.COLOMBIA);
		Coffee coffee1 = new Coffee(Coffee.CAFE_LATTE, 1800, 15, Coffee.BRAZIL);
		Coffee coffee2 = new Coffee(Coffee.CAFE_MOCHA, 2500, 20, Coffee.ETHIOPIA);
		Coffee coffee3 = new Coffee(Coffee.CARAMEL_MACCHIATO, 3500, 5, Coffee.KENYA);
		coffee.getOriginName();
		coffee.getCoffeeName();
		
	}
}
