package kata3;

public class Control {

    private String filename;

    public Control(String filename) {
        this.filename = filename;
    }
    
    public void execute(){
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        builder.calculate(MailReader.readDomains(filename));
        HistogramViewer<String> viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
}
