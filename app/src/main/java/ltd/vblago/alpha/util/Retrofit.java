package ltd.vblago.alpha.util;

import ltd.vblago.alpha.model.AttackDamageReturn;
import ltd.vblago.alpha.model.User;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Query;


public class Retrofit {

    private static final String ENDPOINT = "https://script.google.com/macros/s/AKfycbyeyk3sdfgTrSQYB1VY-NiP8ZdfgsuThDGvPPI9Obknrhxlfy8"; // server get/post url
    private static ApiInterface apiInterface;

    static {
        initialize();
    }

    interface ApiInterface {
        @GET("/exec")
        void setAttack(@Query("id") String id,
                        @Query("latitude") String latitude,
                        @Query("longitude") String longitude,
                        @Query("bearing") String fine,
                        @Query("damage") String good,
                        Callback<AttackDamageReturn> callback);

        void getDamage(@Query("id") String id,
                       @Query("latitude") String latitude,
                       @Query("longitude") String longitude,
                       Callback<AttackDamageReturn> callback);

    }

    private static void initialize() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(ENDPOINT)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        apiInterface = restAdapter.create(ApiInterface.class);
    }

    public static void attackRequest(User user, int damage, Callback<AttackDamageReturn> callback) {
        apiInterface.setAttack(user.getId(),
                user.getLatitude(),
                user.getLongitude(),
                user.getBearing(),
                String.valueOf(damage),
                callback);
    }

    public static void damageRequest(User user, Callback<AttackDamageReturn> callback) {
        apiInterface.getDamage(user.getId(),
                user.getLatitude(),
                user.getLongitude(),
                callback);
    }

}
