package alef.bispo.appminhaideia.view;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import alef.bispo.appminhaideia.R;
import alef.bispo.appminhaideia.model.Cliente;

public class Splash extends AppCompatActivity {


    String TAG = "APP_MINHA_IDEIA";
    int tempoDeEspera = 1000 * 5;
    Cliente objCliente;

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

                objCliente = new Cliente("Alef",
                        "teste@gmail.com",
                        "999461376",
                        28,
                        true);

                Log.d(TAG, "TrocarTela: Mudando de tela...");

                Intent trocarDeTela = new Intent(Splash.this, MainActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("Nome",objCliente.getNome());
                bundle.putString("Email",objCliente.getEmail());

                trocarDeTela.putExtras(bundle);

                startActivity(trocarDeTela);
                finish();
            }
        }, tempoDeEspera);

    }
}