package GServicesManager;

import java.util.ArrayList;
import java.util.List;

public class Gmail {

    public List<GUser> getMails() {

        List<GUser> gmails = new ArrayList<>();

        gmails.add(new GUser(1, "İbrahim", "Usta", "ibo@gmail.com", "b3nb1r.IPr0dutcdal"));

        gmails.add(new GUser(2, "Fatih", "Kayan", "egoistfatih@gmail.com", "egOBenim.1s1m"));

        gmails.add(new GUser(3, "Umut", "Kuş", "umut@gmail.com", "banaAb1.de"));
        return gmails;
    }
}