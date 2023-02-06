package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam s = new BaseBallTeam( "ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam b = new BaseBallTeam( "DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam t = new BaseBallTeam( "阪神タイガース", 68, 71, 4);
        BaseBallTeam g = new BaseBallTeam( "読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam c = new BaseBallTeam( "広島東洋カープ", 66, 74, 3);
        BaseBallTeam d = new BaseBallTeam( "中日ドラゴンズ", 66, 75, 2);

        s.report();
        b.report();
        t.report();
        g.report();
        c.report();
        d.report();

    }

}
