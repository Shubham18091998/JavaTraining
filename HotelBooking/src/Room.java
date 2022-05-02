
public class Room {
	private int roomNumber;
	private String type;
	private int rate;
	
	Room(){
		roomNumber=0;
		type="";
		rate=0;
	}
	
	Room(int roomNumber,String type,int rate){
		this.roomNumber=roomNumber;
		this.type=type;
		this.rate=rate;
	}
	
	void showRoomDetails() {
		System.out.println("Room number:"+roomNumber);
		System.out.println("Room Type:"+type);
		System.out.println("Room rate:"+rate);
	}


}
