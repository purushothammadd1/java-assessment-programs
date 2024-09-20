package exceptionhandling;

public class OnlineVotingSystem {
	// public static void main(String[] args) {

	private Participant[] participants = new Participant[10];
	// static variable
	private static int PartiCount;
	
	public Participant[] getParticipants() {
		return participants;
	}
	public static int getCount() {
		return PartiCount;
	}
	public Participant getParticipantbyId(int pId) {
		for(int i=0;i<getCount();i++) {
			if(participants[i].getId()==pId) {
				return participants[i];
			}
		}
		return null;
	}
public Participant[] getParticipant() {
	return participants;
}
public void addParticipant(Participant newParticipant) {
	participants[PartiCount]=newParticipant;
	PartiCount++;
}
	

	
}
