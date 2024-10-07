package EX1_AbstractFactory.Phone;

public class Korean implements Phone{
    private static final String prefixPh = "+81";
    private String num;

    public Korean(String num){
        this.num = num;
    }

    @Override
    public String getNum() {
        return prefixPh + " " + this.num;
    }
}
