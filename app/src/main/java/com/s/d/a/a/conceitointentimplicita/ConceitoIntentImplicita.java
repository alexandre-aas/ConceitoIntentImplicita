package com.s.d.a.a.conceitointentimplicita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.content.Intent;
import android.view.View;

public class ConceitoIntentImplicita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conceito_intent_implicita);
    }

    public void mostrarPaginaWeb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.devmedia.com.br/?gclid=EAIaIQobChMI3tau_YWL2QIVkA2RCh3aIw5AEAAYASAAEgJ1RfD_BwE"));

        startActivity(intent);
    }
}
