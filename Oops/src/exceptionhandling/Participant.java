package exceptionhandling;

public class Participant {
	private static int id;
	private String email;

	public Participant(int id, String email) {
		this.setId(id);
		this.setEmail(email);
	}

	public static int getID() {
		// TODO Auto-generated method stub
		return id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Participant [id=" + id + ", email=" + email + "]";
	}

}
