package com.yws.memento;

public class GameRole {
	//攻击力
	private int vit;
	//防御力
	private int def;
	public int getVit() {
		return vit;
	}
	public void setVit(int vit) {
		this.vit = vit;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}

	//创建Memento，根据当前的状态得到Memento
	public Memento createMemento() {
		return new Memento(vit, def);
	}
	
	//从备忘录对象恢复GameRole的状态
	public void recoverGameRoleFromMemento(Memento memento) {
		this.vit = memento.getVit();
		this.def = memento.getDef();
	}
	
	public void display() {
		System.out.println("游戏角色当前的攻击力：" + this.vit + " 防御力:" + this.def);
	}
	
	
}
