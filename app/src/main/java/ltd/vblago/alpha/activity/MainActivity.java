package ltd.vblago.alpha.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import ltd.vblago.alpha.R;
import ltd.vblago.alpha.model.AttackDamageReturn;
import ltd.vblago.alpha.model.User;
import ltd.vblago.alpha.util.Retrofit;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit.attackRequest(new User(), 100, new Callback<AttackDamageReturn>() {
            @Override
            public void success(AttackDamageReturn attackDamageReturn, Response response) {
                //attackDamageReturn.state;
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }
}
