package quiz;

public class C08_FiveDice {
	
	private int value;
		
		public C08_FiveDice() {
			value=0;
		}
		
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value=value;
		}
		public int roll() {
			value=(int)(Math.random() * 6) + 1;
			return value;
		}
		
		public static void main(String[] args) {
			C08_FiveDice dice1=new C08_FiveDice();
			C08_FiveDice dice2=new C08_FiveDice();
			C08_FiveDice dice3=new C08_FiveDice();
			C08_FiveDice dice4=new C08_FiveDice();
			C08_FiveDice dice5=new C08_FiveDice();
			int count = 0;
			
				dice1.setValue(dice1.roll());
				dice2.setValue(dice2.roll());
				dice3.setValue(dice2.roll());
				dice4.setValue(dice2.roll());
				dice5.setValue(dice2.roll());
				System.out.println("주사위 1 = "+dice1.getValue()+"\t주사위 2 = "+ dice2.getValue()
				+ "\t주사위 3 = " + dice3.getValue() + "\t주사위 4 = " + dice4.getValue() +
				"\t주사위 5 = " + dice5.getValue());
		}
	}