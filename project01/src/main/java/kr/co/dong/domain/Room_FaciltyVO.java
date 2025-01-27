package kr.co.dong.domain;

public class Room_FaciltyVO {
	
	private int ro_num;
	private int fac_id;
	
	public Room_FaciltyVO() {}

	public Room_FaciltyVO(int ro_num, int fac_id) {
		this.ro_num = ro_num;
		this.fac_id = fac_id;
	}

	public int getRo_num() {
		return ro_num;
	}

	public void setRo_num(int ro_num) {
		this.ro_num = ro_num;
	}

	public int getFac_id() {
		return fac_id;
	}

	public void setFac_id(int fac_id) {
		this.fac_id = fac_id;
	}

	@Override
	public String toString() {
		return "ROOM_FACILITY [ro_num=" + ro_num + ", fac_id=" + fac_id + "]";
	}
	//=======================
}
