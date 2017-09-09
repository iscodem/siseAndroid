package pe.edu.sise.loginsise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        String usuario = (String) intent.getExtras().get("usuario");
        String password = (String) intent.getExtras().get("password");

        Toast.makeText(this, "usuario:"+usuario, Toast.LENGTH_SHORT).show();

    }
}
