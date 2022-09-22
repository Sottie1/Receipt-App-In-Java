package com.LAVAMALL;

	public class PriceBGROUP3
	{
		double PriceShirt,PriceNecklace,PriceCap,PriceWatch,
		PriceSneaker;
		public PriceBGROUP3(){}
		public PriceBGROUP3(double PriceSneaker,double PriceCap,
							double PriceWatch,double PriceShirt,double PriceNecklace){
			this.PriceNecklace=PriceNecklace;
			this.PriceShirt=PriceShirt;
			this.PriceSneaker=PriceSneaker;
			this.PriceCap=PriceCap;
			this.PriceWatch=PriceWatch;
		}
		public void setPricecSneaker(double PriceSneaker){
			this.PriceSneaker=PriceSneaker;
		}
		public double getPriceSneaker(){
			return this.PriceSneaker;
		}
		public void setPriceCap(double cap){
			this.PriceCap=cap;
		}
		public double getPriceCap(){
			return this.PriceCap;
		}
		public void setPriceWatch(double watch){
			this.PriceWatch=watch;
		}
		public double getPriceWatch(){
			return this.PriceWatch;
		}
		public void setPriceShirt(double shirt){
			this.PriceShirt=shirt;
		}
		public double getPriceShirt(){
			return this.PriceShirt;
		}
		public void setPriceNecklace(double necklace){
			this.PriceNecklace=necklace;
		}
		public double getPriceNecklace(){
			return this.PriceNecklace;
		}
	}
	
