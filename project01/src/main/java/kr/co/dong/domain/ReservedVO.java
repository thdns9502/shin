package kr.co.dong.domain;

public class ReservedVO {
	
	private int bo_num;
	
	public ReservedVO() {}

	public ReservedVO(int bo_num) {
		this.bo_num = bo_num;
	}

	public int getBo_num() {
		return bo_num;
	}

	public void setBo_num(int bo_num) {
		this.bo_num = bo_num;
	}

	@Override
	public String toString() {
		return "RESERVED [bo_num=" + bo_num + "]";
	}
	//-------------------
}
