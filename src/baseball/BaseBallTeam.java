package baseball;

public class BaseBallTeam {
    //フィールド
    private String name; //チーム名
    private int win; //勝ち数
    private int lose; //負け数
    private int draw; //引き分け

    //コンストラクタ
    public BaseBallTeam(){
    }

    //引数ありコンストラクタ
    public BaseBallTeam( String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //勝率計算メソッド
    public double getRate() {
        double rate = (double)this.win / (this.win + this.lose);
        return rate;
    }

    public void report() {
        System.out.println( getName() + "の2022年の成績は" + getWin() + "勝" + getLose() + "負" + getDraw() + "分け、勝率は" + getRate() + "です" );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw =draw;
    }

}
