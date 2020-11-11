package com.yws.memento;


public class CareTaker {
	//如果只保存一次对象
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

	
	//对GameRole保存多次状态
	//private ArrayList<Memento> mementos;
	//对多个游戏角色保存多次状态
	//private HashMap<String, ArrayList<Memento>> rolesMementos;
	
	
}
