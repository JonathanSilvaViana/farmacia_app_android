package br.com.farmacia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class VisulizarProdutoActivity extends AppCompatActivity {

    String titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visulizar_produto);

        titulo = getString(R.string.product);

        setTitle(titulo);

    }
}