package weekFifteen.jsonActivity;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class mlbTeamWriter {
    public static void main(String[] args) {
        try {
            Team teamInfo = new Team("Atlanta Braves", "National", "East");
            Gson gson = new Gson();
            String jsonString = gson.toJson(teamInfo);
            System.out.println(jsonString);
            FileWriter filewrite = new FileWriter("team.json");
            filewrite.write(jsonString);
            filewrite.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
