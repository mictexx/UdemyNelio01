package entities;

public class BookRoom {
	
	private String nome ;
	private String email ;
	private int roomBooked;
	
	
	public BookRoom() {
		
	}
	
	public BookRoom(String nome, String email, int roomBooked) {
		this.nome = nome;
		this.email = email;
		this.roomBooked = roomBooked;
	}


	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	public int getRoomBooked() {
		return roomBooked;
	}


	

}
