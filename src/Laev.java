import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evelin.Jogi on 29.01.2016.
 */
public class Laev {
    List raidur = new ArrayList();
    private String laev;

    public Laev(String laevaNimi) {
        laev = laevaNimi;


    }

    public void lisaReisija(String s) {
        raidur.add(s);

    }

    public void eemaldaReisija(String s) {
        raidur.remove(s);

    }

    public String votaReisijad() {
        System.out.println(raidur);
        return raidur.toString();
    }

    public String reisijateArv() {
        return Integer.toString(raidur.size());
    }

    public String misNimi() {
        return laev;
    }

    public void kalaHammustasKummipaatiAugu() {
        raidur.clear();

    }
}
