package pe.edu.sise.loginsise;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pe.edu.sise.loginsise.model.UsuarioBean;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = LoginActivity.class.getName();

    EditText editUsuario, editPassword;
    Button btnLogin;
    UsuarioBean usuarioBean = new UsuarioBean();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUsuario= (EditText) findViewById(R.id.editUsuario);
        editPassword= (EditText) findViewById(R.id.editPassword);

        btnLogin = (Button) findViewById(R.id.btnLogin);

        Log.d(TAG, ">>> Antes de cargar usuarios");
        this.cargarUsuario();

    }

    private void cargarUsuario() {
        //Setear usuarios a un array de UsuarioBean
        usuarioBean = new UsuarioBean("David Paul","Porras Cordova",40,"dporrasc","123");
    }

    public void ingresar(View v){

        String usuario = editUsuario.getText().toString();
        String password = editPassword.getText().toString();

        Log.d(TAG, ">>>USUARIO: "+usuario);

        if(this.validarUsuario(usuario, password)){
            Intent intent = new Intent(this,MainActivity.class);

            intent.putExtra("usuario",usuario);
            intent.putExtra("password",password);

            startActivity(intent);
        }else{
           Toast.makeText(this, "El usuario no existe.", Toast.LENGTH_SHORT).show();
        };

    }

    private boolean validarUsuario(String user, String password) {
        Log.d(TAG, ">>>estoy en validarUsuario");

        boolean rpta=false;
        String tipoError="";
        String mensaje="";

        Log.d(TAG, ">>>USUARIO: "+user);

        if("".equals(user)){
            tipoError="1";
            mensaje="Debe ingresar un usuario";
        }else if("".equals(password)){
            tipoError="2";
            mensaje="Debe ingresar password.";
        }else if(user.equals(usuarioBean.getUser())){
            rpta=true;
        }

        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
        return rpta;
    }


    public void crearUsuario(View v){
        //Toast.makeText(this, "Nuevo usuario", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,CrearUsuarioActivity.class);

        intent.putExtra("titulo","Crear usuario");

        startActivity(intent);
    }
}
