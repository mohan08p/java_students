package com.practice.chapter1.strategy;

public abstract class Duck {
	
	QuackBehaviour quackBehaviour;
	FlyBehaviour flyBehaviour;
	
	public Duck(){
	}
	public abstract void display();
	
	public void performFly(){
		flyBehaviour.fly();
	}
	
	public void performQuack(){
		quackBehaviour.quack();
	}
	
	public void setFlyBehaviour(FlyBehaviour fb){
		flyBehaviour = fb;
	}
	
	public void setQuackBehaviour(QuackBehaviour qb){
		quackBehaviour = qb;
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys.!");
	}
}