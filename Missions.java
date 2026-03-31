package Encapsulated_Classes;

public class Missions {

    private String nameMission;
    private MissionsRanks rankingMission;


    //Method to show the information of the missions
    public void showDetails() {
        System.out.println("Mission: " + nameMission);
        System.out.println("Rank: " + rankingMission);
        System.out.println("Description mission level: " + rankingMission.getRankDescription());
        System.out.println("Difficult level: " + rankingMission.getDifficult());

    }

    // Constructors
    public Missions() {
    }

    public Missions(String nameMission, MissionsRanks rankingMission) {
        this.nameMission = nameMission;
        this.rankingMission = rankingMission;
    }


    // Get Methods
    public String getNameMission() {
        return nameMission;
    }

    public MissionsRanks getRankingMission() {
        return rankingMission;
    }

    // Set methods
    public void setNameMission(String nameMission) {
        this.nameMission = nameMission;
    }

    public void setRankingMission(MissionsRanks rankingMission) {
        this.rankingMission = rankingMission;
    }
}
