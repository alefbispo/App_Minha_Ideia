package alef.bispo.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import alef.bispo.appminhaideia.R;
import alef.bispo.appminhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {

    String TAG = "APP_MINHA_IDEIA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: Tela Principal carregada...");

        Bundle bundle = getIntent().getExtras();
        Log.d(TAG, "onCreate: Nome..."+bundle.getString("Nome"));
        Log.d(TAG, "onCreate: Email..."+bundle.getString("Email"));

    }
}