package pe.edu.sise.mensajeria;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    EditText editNombres;
    Button btnMensajeToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(TAG,"Acabo de ingresar al metodo: onCreate()");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNombres = (EditText) findViewById(R.id.editNombres);
        btnMensajeToast = (Button) findViewById(R.id.btnMensajeToast);
    }

    public void mensajeToast(View v){
        Log.d(TAG,"Acabo de ingresar al metodo: mensajeToast()");

        String nombres = editNombres.getText().toString();
        Toast.makeText(this, "Hola "+nombres, Toast.LENGTH_LONG).show();

    }

    public void mensajeSnackBar(View v){
        String nombres = editNombres.getText().toString();
        Snackbar.make(findViewById(android.R.id.content), "Hola "+nombres, Snackbar.LENGTH_LONG)
                .show();
    }


    public void enviar(View v){
        Intent intent = new Intent(this,OtroActivity.class);
        startActivity(intent);

    }






}
