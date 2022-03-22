package alef.bispo.appminhaideia.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import alef.bispo.appminhaideia.R;

public class Splash extends AppCompatActivity {


    String TAG = "APP_MINHA_IDEIA";
    int tempoDeEspera = 1000 * 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.d(TAG, "Tela Splash Carregrando...");
        trocarTela();
    }

    private void trocarTela() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent trocarDeTela = new Intent(Splash.this, MainActivity.class);
                startActivity(trocarDeTela);
                finish();
            }
        }, tempoDeEspera);

    }
}