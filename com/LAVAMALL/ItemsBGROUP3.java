package com.LAVAMALL;
public class ItemsBGROUP3
{
	int QuanSneaker,QuanShirt,QuanWatch,
	QuanNecklace,QuanCap;
	public ItemsBGROUP3(){}

	public ItemsBGROUP3(int shirt,int necklace,int watch,
						int cap,int sneaker){
		this.QuanSneaker= sneaker;
		this.QuanShirt=shirt;
		this.QuanWatch=watch;
		this.QuanCap=cap;
		this.QuanNecklace=necklace;
	}
	public void setQuanSneaker(int sneaker){
		this.QuanSneaker=sneaker;
	}
	public void setQuanShirt(int shirt){
		this.QuanShirt=shirt;
	}
	public void setQuanNecklace(int necklace){
		this.QuanNecklace=necklace;
	}
	public void setQuanCap(int cap){
		this.QuanCap=cap;
	}
	public void setQuanWatch(int watch){
		this.QuanWatch=watch;
	}
	public int getQuanSneaker(){
		return this.QuanSneaker;
	}
	public int getQuanNecklace(){
		return this.QuanNecklace;
	}
	public int getQuanWatch(){
		return this.QuanWatch;
	}
	public int getQuanCap(){
		return this.QuanCap;
	}
	public int getQuanShirt(){
		return this.QuanShirt;
	}
}
