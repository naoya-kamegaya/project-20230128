import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InokashiraLine {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> stationMap = new HashMap<>();
        // stationMap.put("駅名", 急行停車駅は1/そうでなければ0);
        stationMap.put("渋谷", 1);
        stationMap.put("神泉", 0);
        stationMap.put("駒場東大前", 0);
        stationMap.put("池ノ上", 0);
        stationMap.put("下北沢", 1);
        stationMap.put("新代田", 0);
        stationMap.put("東松原", 0);
        stationMap.put("明大前", 1);
        stationMap.put("永福町", 1);
        stationMap.put("西永福", 0);
        stationMap.put("浜田山", 0);
        stationMap.put("高井戸", 0);
        stationMap.put("富士見ヶ丘", 0);
        stationMap.put("久我山", 1);
        stationMap.put("三鷹台", 0);
        stationMap.put("井の頭公園", 0);
        stationMap.put("吉祥寺", 1);

        List<String> stationsWantToKnow = new ArrayList<>();
        stationsWantToKnow.add("渋谷");
        stationsWantToKnow.add("駒場東大前");
        stationsWantToKnow.add("明大前");
        stationsWantToKnow.add("富士見ヶ丘");
        stationsWantToKnow.add("高井戸");
        stationsWantToKnow.add("下高井戸");

        System.out.println("▼ List の内容を表示します。");
        for (String str : stationsWantToKnow) {
            System.out.println(str);
        }

        System.out.println("\n▼ List の駅名をキーとして Map の値を取得し、急行停車駅かどうかを表示します。");
        for (String str2 : stationsWantToKnow) {
            try{
                if (stationMap.get(str2) == 1) {
                  System.out.println(str2 + "は急行停車駅です。");
                } else {
                    System.out.println(str2 + "は急行停車駅ではありません。");
                }
            } catch (NullPointerException e) {
                System.out.println("※" + str2 + "は井の頭線の駅ではありません！");
            }
        }
    }
}
