import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> map = new HashMap<>();

        String data = new String(Files.readAllBytes(Paths.get("./instructors.json")));

        JSONArray jsonArray = new JSONArray(data);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            String firstName = jsonObject.getString("first_name");
            String lastName = jsonObject.getString("last_name");
            String fullName = firstName + " " + lastName;
            int id = jsonObject.getInt("id");

            map.put(id, fullName);
        }

        map.entrySet().stream().forEach(n -> System.out.println(n.getKey() + ": " + n.getValue()));
    }
}
