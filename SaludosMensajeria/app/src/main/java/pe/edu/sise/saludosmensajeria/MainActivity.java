package pe.edu.sise.saludosmensajeria;

import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    //Declaracion de views
    private CoordinatorLayout coordinatorLayout;
    private String nombres;

    Button btnSaludarToast, btnSnackBarDefault, btnSnackBarAction, btnSnackBarCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);

        btnSaludarToast = (Button) findViewById(R.id.btnSaludarToast);
        btnSnackBarDefault = (Button) findViewById(R.id.btnSnackBarDefault);
        btnSnackBarAction = (Button) findViewById(R.id.btnSnackBarAction);
        btnSnackBarCustom = (Button) findViewById(R.id.btnSnackBarCustom);

        final EditText editNombres = (EditText) findViewById(R.id.editNombres);


        //Acciones para el boton Toast
        btnSaludarToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombres = String.valueOf(editNombres.getText());

                if(nombres.equals("")){
                    Toast.makeText(MainActivity.this, "Ingrese nombres.", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Bienvenido: "+ nombres, Toast.LENGTH_SHORT).show();
                }
            }
        });


        //Acciones para el boton SnackBar Defaul
        btnSnackBarDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nombres.equals("")){
                    Snackbar snackbar = Snackbar.make(coordinatorLayout,"Ingrese nombres.",Snackbar.LENGTH_LONG);
                    snackbar.show();
                }else{
                    Snackbar snackbar = Snackbar.make(coordinatorLayout,"Bienvenido: "+ nombres,Snackbar.LENGTH_LONG);
                    snackbar.show();
                }
            }
        });


        //Acciones para el boton SnackBar Action
        btnSnackBarAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar =Snackbar.make(coordinatorLayout,"Mensaje de Snackbar con acción",Snackbar.LENGTH_LONG)
                        .setAction("Click Aqui", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Toast.makeText(MainActivity.this, "Gracias por hacer click internodavid", Toast.LENGTH_SHORT).show();
                            }
                        });

                snackbar.show();
            }
        });

        //Acciones para el boton SnackBar Custom
        btnSnackBarCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(coordinatorLayout, "Sin conexión de internet!¡", Snackbar.LENGTH_LONG)
                        .setAction("RETROCEDER", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this, "Metodo anidado retroceder", Toast.LENGTH_SHORT).show();
                            }
                        });

                //Personalizo colores a la acción
                snackbar.setActionTextColor(Color.WHITE);

                // Cambiar el color del mensaje de la acción
                View sbView = snackbar.getView();
                TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(Color.YELLOW);

                snackbar.show();
            }
        });

    }






}
