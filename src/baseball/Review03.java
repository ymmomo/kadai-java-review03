package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam team01 = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        BaseBallTeam team02 = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        BaseBallTeam team03 = new BaseBallTeam("阪神タイガース",68,71,4);
        BaseBallTeam team04 = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        BaseBallTeam team05 = new BaseBallTeam("広島東洋カープ",66,74,3);
        BaseBallTeam team06 = new BaseBallTeam("中日ドラゴンズ",66,75,2);

        BaseBallTeam [] teams = {team01,team02,team03,team04,team05,team06};

        for(BaseBallTeam team : teams ) {
            double rate = team.getRate();
            team.report(rate);
        }
    }

}
