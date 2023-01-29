import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InokashiraLine {
    public static void main(String[] args) throws Exception {
        Map<String, Boolean> stationMap = new HashMap<>();
        // stationMap.put("駅名", 急行停車駅はtrue/そうでなければfalse);
        stationMap.put("渋谷", true);
        stationMap.put("神泉", false);
        stationMap.put("駒場東大前", false);
        stationMap.put("池ノ上", false);
        stationMap.put("下北沢", true);
        stationMap.put("新代田", false);
        stationMap.put("東松原", false);
        stationMap.put("明大前", true);
        stationMap.put("永福町", true);
        stationMap.put("西永福", false);
        stationMap.put("浜田山", false);
        stationMap.put("高井戸", false);
        stationMap.put("富士見ヶ丘", false);

        List<String> stationsWantToKnow = new ArrayList<>();
        stationsWantToKnow.add("渋谷");
        stationsWantToKnow.add("駒場東大前");
        stationsWantToKnow.add("明大前");
        stationsWantToKnow.add("富士見ヶ丘");
        stationsWantToKnow.add("高井戸");
        stationsWantToKnow.add("下高井戸");

        System.out.println("▼ List の内容を表示します。");
        for (String station : stationsWantToKnow) {
            System.out.println(station);
        }

        System.out.println("\n▼ List の駅名をキーとして Map の値を取得し、急行停車駅かどうかを表示します。");
        for (String station : stationsWantToKnow) {
            try{
                if (stationMap.get(station) == true) {
                  System.out.println(station + "は急行停車駅です。");
                } else {
                    System.out.println(station + "は急行停車駅ではありません。");
                }
            } catch (NullPointerException e) {
                System.out.println("※" + station + "は井の頭線の駅ではありません！");
            }
        }
    }
}
