package enumm;

public enum MyColors {
	

	Black(1000),Red(1500), White(2000),purple(2500);

			public String toString() {
			return super.name().toLowerCase()+price;
		}
			private int price;
			
				private MyColors(int price)
			{
					this.price=price;		
			}
			
				public int getPrice()
			{
				return price;
			}
				public void setPrice(int Price)
			{
				this.price=price;
			}
			
		


}
