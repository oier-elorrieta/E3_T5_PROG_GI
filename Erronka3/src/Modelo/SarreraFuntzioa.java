package Modelo;

import java.util.ArrayList;
import java.util.List;

public class SarreraFuntzioa {
    private static SarreraFuntzioa instance;
    private List<Sarrera> sarrerakList;

    private SarreraFuntzioa() {
        sarrerakList = new ArrayList<>();
    }

    public static SarreraFuntzioa getInstance() {
        if (instance == null) {
            instance = new SarreraFuntzioa();
        }
        return instance;
    }

    public List<Sarrera> getSarrerakList() {
        return sarrerakList;
    }

    public void reiniciarSarrerakList() {
        sarrerakList.clear();
    }
}
