import java.util.ArrayList;
import java.util.HashMap;

public class VoteProcessor {
	String calculateElectionWinner(ArrayList<String> votes){
		int pope = 0;
		int edward = 0;
		
		String p = "pope francis";
		String e = "edward snowden";
		
		String vote;
		for(int i = 0; i < votes.size(); i++) {
			vote = votes.get(i);
			if(vote.equalsIgnoreCase(p)) {
				pope ++;
			}else if(vote.equalsIgnoreCase(e)) {
				edward ++;
			}
		}
		
		if(pope > edward) {
			return "pope francis";
		}else if(edward > pope) {
			return "edward snowden";
		}else {
			return"TIE";
		}
	}
}
