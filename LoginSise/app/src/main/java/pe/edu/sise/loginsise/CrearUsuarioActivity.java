package pe.edu.sise.loginsise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CrearUsuarioActivity extends AppCompatActivity {

    TextView txtTituloCrearUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_usuario);

        txtTituloCrearUsuario = (TextView) findViewById(R.id.txtTituloCrearUsuario);

        Intent intent = getIntent();

        txtTituloCrearUsuario.setText((String) intent.getExtras().get("titulo"));

    }
}
