package behavioral1;

public class EconomicNews extends News {
    EconomicNews(String content) {super(content);}

    @Override
    public NewsTopic getTopic() {
        return NewsTopic.ECONOMIC;
    }
}
