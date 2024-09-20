package exceptionhandling;

import java.util.Scanner;

public class VoteSystem {
	public static void main(String[] args) {
		// throw kw
		// throw new CustomException("message")
		// where ever this exception is to be thrown
		OnlineVotingSystem ovs = new OnlineVotingSystem();
		Participant[] participants = ovs.getParticipants();
		Participant p1 = new Participant(1, "purushotham");
		Participant p2 = new Participant(2, "Harish");
		ovs.addParticipant(p1);
		ovs.addParticipant(p2);
		System.out.println("Enter the Id:");
		Scanner sc = new Scanner(System.in);
		int PId = sc.nextInt();
		if (ovs.getParticipantbyId(PId) != null) {
			System.out.println("Participant is allowed to vote.");
		} else {
			try {
				throw new InvalidParticipantException("This participant is not allowed to vote");
			} catch (InvalidParticipantException exc) {
				System.err.println("Error:participant not found ");
				exc.printStackTrace();
			}
		}
	}
}
