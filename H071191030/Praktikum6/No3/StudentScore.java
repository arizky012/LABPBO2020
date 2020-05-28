class StudentScore {

    double scoreUTS, scoreUAS;
    double finalScore;

    public StudentScore(double scoreUTS, double scoreUAS) {
        this.scoreUTS = scoreUTS;
        this.scoreUAS = scoreUAS;

    }

    public double getFinalScore() {
        double finalScore = (scoreUTS + scoreUAS) / 2;
        return finalScore;
    }

    public char getGrade() {
     
        if (getFinalScore() >= 80 && getFinalScore() <= 100) {
            return 'A';
        } else if (getFinalScore() >= 65 && getFinalScore() <= 79) {
            return 'B';
        } else if (getFinalScore() >= 50 && getFinalScore() <= 64) {
            return 'C';
        } else if (getFinalScore() >= 40 && getFinalScore() <= 49) {
            return 'D';
        } else
            return 'E';

    }

}
