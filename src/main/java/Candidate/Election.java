package Candidate;


import java.util.ArrayList;

public class Election {
    ArrayList<Candidate> candidates = new ArrayList<>();

    public Election(ArrayList<Candidate> candidates){
        this.candidates = candidates;
    }

    public int getTotalVotes(){
        int totalVotes = 0;
        for (Candidate candidate : candidates){
            totalVotes += candidate.getNumberOfVotes();
        } return totalVotes;
    }

    public ArrayList<Candidate> getCandidatesFromParty(String party){
        ArrayList<Candidate> partyCandidates = new ArrayList<>();
        for (Candidate candidate : candidates) {
            if (candidate.getParty().equals(party)) {
                partyCandidates.add(candidate);
            }
        } return partyCandidates;
    }

    @Override
    public String toString() {
        return candidates + "";
    }
}


