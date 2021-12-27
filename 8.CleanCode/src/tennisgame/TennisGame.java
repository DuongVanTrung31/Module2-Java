package tennisgame;

public class TennisGame {


    public static String getScore(String player1Name, String player2Name, int firstScore, int secondScore) {
        String score = "";
        int tempScore = 0;
        if (firstScore == secondScore) {
            score = deuceCondition(firstScore);
        } else if (firstScore >= 4 || secondScore >= 4) {
            score = winCondition(firstScore, secondScore);
        } else {
            score = duelCondition(firstScore, secondScore);
        }
        return score;
    }

    private static String duelCondition(int firstScore, int secondScore) {
        int tempScore = 0;
        String score = "";
        for (int currentPlayer = 1; currentPlayer < 3; currentPlayer++) {
            if (currentPlayer == 1) {
                tempScore = firstScore;
            } else {
                score += "-";
                tempScore = secondScore;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String winCondition(int firstScore, int secondScore) {
        String score = "";
        int minusResult = firstScore - secondScore;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String deuceCondition(int firstScore) {
        String score = "";
        switch (firstScore) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }
}