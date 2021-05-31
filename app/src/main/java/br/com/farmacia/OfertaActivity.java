package br.com.farmacia;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OfertaActivity extends AppCompatActivity {

    ActionBar barra;
    Button atualizar_bt, suporte_bt, xa;
    Context context;
    String contact, url, chamada;
    Intent abresuporte, oferta, vaixa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oferta);

        //chama bt whatsapp
        suporte_bt = (Button)findViewById(R.id.suporte_bt);

        //evento do bt de whatsapp

        suporte_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abre_suporte();
            }
        });

        //chama bt de atualizar
        atualizar_bt = (Button)findViewById(R.id.atualizar_bt);

        //evento do bt de atualizar

        atualizar_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refreshOferta();
            }
        });

        xa = (Button)findViewById(R.id.xa);

        xa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    xa();
            }
        });
    }

    public void abre_suporte()
    {
        contact = "+5511997761865"; // use country code with your phone number
        url = "https://api.whatsapp.com/send?phone=" + contact;
            chamada = url + contact;
            abresuporte = new Intent(Intent.ACTION_VIEW);
            abresuporte.setData(Uri.parse(url));
            startActivity(abresuporte);

    }

    public void refreshOferta()
    {
        oferta = getIntent();
        finish();
        startActivity(oferta);
    }

    public void xa()
    {
        vaixa = new Intent(this, VisulizarProdutoActivity.class);
        startActivity(vaixa);
        //finish();

    }
}