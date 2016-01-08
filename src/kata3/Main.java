
package kata3;

    import java.io.BufferedReader;
    import java.io.FileNotFoundException;
    import java.io.FileReader;
    import java.util.ArrayList;
public class Main {
    

    public static void main(String[] args) throws FileNotFoundException {
        String pathName = "email.txt";
        MailReader dominios = new MailReader(pathName);
        ArrayList<String> domis = dominios.getDominiosArray();
        Histogram<String> histograma = DominiosHistogramBuilder.execute(domis);
        HistogramDisplay histo = new HistogramDisplay(histograma);
        histo.execute();
    }   
}
