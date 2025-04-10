package ctp;//rtp program

public class OnlineShoppingApp {

	void order() {
		System.out.println("ordering Product");
	}

}

class Amazon extends  OnlineShoppingApp{

	@Override
	void order()
	{
		System.out.println("ordering laptop from amazon");
	}


}

class Flipkart extends OnlineShoppingApp{
	@Override
	void order()
	{
		System.out.println("ordering laptop from flipkart");
	}

}

class Myntra extends OnlineShoppingApp{
	@Override
	void order()
	{
		System.out.println("ordering laptop from myntra");
	}
}
