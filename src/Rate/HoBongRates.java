package Rate;

import java.util.HashMap;
import java.util.Map;

public enum HoBongRates {
    First(1, 650000),
    Second(2, 680000),
    Third(3, 700000),
    Fourth(4, 720000),
    Fifth(5, 750000);

    private final int hoBong;
    private final int gross;

    HoBongRates (int hoBong, int gross) {
        this.hoBong = hoBong;
        this.gross = gross;
    }

    public int getGross() {
        return gross;
    }

    private static final Map<Integer, HoBongRates> map;
    static {
        map = new HashMap<>();
        for (HoBongRates v : HoBongRates.values()) {
            map.put(v.hoBong, v);
        }
    }
    public static HoBongRates findById(int i) {
        return map.get(i);
    }
}
