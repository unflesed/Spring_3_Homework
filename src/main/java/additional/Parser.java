package additional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;

import java.net.URL;
import java.util.Random;

public class Parser {
    public static String getRandomCourse() throws IOException {
        GsonBuilder sb = new GsonBuilder().setPrettyPrinting();

        Gson gson = sb.create();

        JsonReader jsonReader;

        jsonReader = new JsonReader(new InputStreamReader(new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json").openStream()));

        Rate[] rates = gson.fromJson(jsonReader, Rate[].class);

        int rnd = new Random().nextInt(rates.length);

        return  gson.toJson(rates[rnd]);
    }

    public static String getParticularRate(String currency) throws IOException {
        GsonBuilder sb = new GsonBuilder().setPrettyPrinting();

        Gson gson = sb.create();

        JsonReader jsonReader;

        jsonReader = new JsonReader(new InputStreamReader(new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json").openStream()));

        Rate[] rates = gson.fromJson(jsonReader, Rate[].class);

        for (Rate rate: rates) {
            if (rate.getCurrency().equals(currency)) {
                return gson.toJson(rate);
            }
        }
        return "Wrong input!";
    }
}
