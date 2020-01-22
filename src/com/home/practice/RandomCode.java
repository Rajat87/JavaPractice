package com.home.practice;

import com.home.practice.RandomCode.Listener;

class MainActivity implements Listener{

	@Override
	public void itemClick() {
		
		
	}
	
}
public class RandomCode {
Listener listener;
	public static void main(String[] args) {
		RandomCode code=new RandomCode();
		MainActivity activity=new MainActivity();
		code.onAttach(activity);

	}

	interface Listener{
		void itemClick();
	}
	
	 void onAttach(MainActivity mainActivity) {
		this.listener=mainActivity;
	}
}
