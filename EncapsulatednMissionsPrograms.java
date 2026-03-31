package Encapsulated_Classes;

public class EncapsulatednMissionsPrograms {
    public static void main(String[] args) {

        Missions mission1 = new Missions("Rescue dog", MissionsRanks.D);
        mission1.showDetails();

        System.out.println();

        Missions mission2 = new Missions("Capture renegade ninja", MissionsRanks.A);
        mission2.showDetails();

    }
}
