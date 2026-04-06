package Encapsulated_Classes;

public enum MissionsRanks {

    // Mission ranks
    D ("Low", 1),
    C ("Low", 2),
    B ("Medium", 3),
    A ("Variable (Medium or High)", 4),
    S ("High", 5),
    SS ("Very high", 6);

    // We use enums for the thins will never change
    // Payment methods, days of week
    // We can't have 2 enums in the same enum class
    // 1 enum will have only 1 functionality

    private String rankDescription;
    private  int difficult;

    MissionsRanks(String rankDescription, int difficult) {
        this.rankDescription = rankDescription;
        this.difficult = difficult;
    }


    // Get methods
    public String getRankDescription() {
        return rankDescription;
    }

    public int getDifficult() {
        return difficult;
    }


    // Set methods
    public void setRankDescription(String rankDescription) {
        this.rankDescription = rankDescription;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }
}
