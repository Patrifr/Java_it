package EX1_AbstractFactory.Phone;

public class Ireland implements Phone{
    private static final String prefix = "+353";
    private String num;

    public Ireland(String num){
        this.num = num;
    }

    @Override
    public String getNum() {
        return prefix + " " + this.num;
    }
}
