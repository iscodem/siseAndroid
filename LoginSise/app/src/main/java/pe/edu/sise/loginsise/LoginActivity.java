package pe.edu.sise.loginsise;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText editUsuario, editPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUsuario= (EditText) findViewById(R.id.editUsuario);
        editPassword= (EditText) findViewById(R.id.editPassword);

        btnLogin = (Button) findViewById(R.id.btnLogin);

    }

    public void ingresar(View v){

        String usuario = editUsuario.getText().toString();
        String password = editPassword.getText().toString();

        if(usuario.equals("")||password.equals("")){
            Toast.makeText(this, "Los datos no pueden ser vacios.", Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(this,MainActivity.class);

            
        }

    }
}
