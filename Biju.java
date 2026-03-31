package Encapsulated_Classes;

public enum Biju {

    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi", "Yugito Nii", 2),
    ISOBU("Isbou", "Yagura", 3),
    SON_GOKU("Son Goku", "Roshi", 4),
    KOKUO("Kokuo", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chomei", "Fuu", 7),
    GYUKI("Gyuki", "Kiler Bee", 8),
    KURAMA("Kurama", "Naruto Uzumaki", 9);


    String bijuName;
    String jinchuriki;
    int numOfTails;

    Biju() {
    }

    Biju(String bijuName, String jinchuriki, int numOfTails) {
        this.bijuName = bijuName;
        this.jinchuriki = jinchuriki;
        this.numOfTails = numOfTails;
    }
}
