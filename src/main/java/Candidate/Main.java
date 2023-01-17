package Candidate;

import java.util.ArrayList;

 public class Main {
    public static void main(String[] args) {

        Candidate candidate = new Candidate("Lise", "SF", 30);
        Candidate candidate1 = new Candidate("Malou", "Radikale", 500);
        Candidate candidate2 = new Candidate("Line", "Radikale", 80);
        Candidate candidate3 = new Candidate("Heval", "SF", 300);

        ArrayList<Candidate> candidates = new ArrayList<>();
        candidates.add(candidate);
        candidates.add(candidate1);
        candidates.add(candidate2);
        candidates.add(candidate3);

        Election election = new Election(candidates);
        System.out.println("Total votes: " + election.getTotalVotes());

        ArrayList<Candidate> radikaleCandidates = election.getCandidatesFromParty("Radikale");
        System.out.println("Kandidaterne: ");
        System.out.println("Radikale: ");
        for (Candidate getCandidates : radikaleCandidates){
            System.out.println(getCandidates.getName() + " - " + getCandidates.getNumberOfVotes());
        }

        ArrayList<Candidate> sfCandidates = election.getCandidatesFromParty("SF");
        System.out.println("Kandidaterne: ");
        System.out.println("SF: ");
        for (Candidate getSF : sfCandidates){
            System.out.println(getSF.getName() + " - " + getSF.getNumberOfVotes());
        }
    }
}

