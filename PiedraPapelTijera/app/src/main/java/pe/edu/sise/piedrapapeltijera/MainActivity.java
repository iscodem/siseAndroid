package pe.edu.sise.piedrapapeltijera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();
    private static final Random rgenerador = new Random();

    //Guarda los IDs de las imagenes en un array de enteros
    private static final Integer[] imagenesID = {R.drawable.piedra, R.drawable.papel, R.drawable.tijera};

    private ImageView imgvPiedra, imgvPapel, imgvTijera, imgvIncognita, imgvUsuario, imgvSistema;
    private Button btnJugar, btnReiniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgvPiedra = (ImageView) findViewById(R.id.imgvPiedra);
        imgvPapel = (ImageView) findViewById(R.id.imgvPapel);
        imgvTijera = (ImageView) findViewById(R.id.imgvTijera);
        //imgvIncognita = (ImageView) findViewById(R.id.imgvIncognita);
        imgvUsuario = (ImageView) findViewById(R.id.imgvUsuario);
        //imgvSistema = (ImageView) findViewById(R.id.imgvSistema);

        Integer q = imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView imgvSistema = (ImageView) findViewById(R.id.imgvSistema);

        //Inicio del juego


        //Metodos para las imagenes
        imgvPiedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgvUsuario.setImageResource(R.drawable.piedra);
            }
        });

        imgvPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgvUsuario.setImageResource(R.drawable.papel);
            }
        });

        imgvTijera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgvUsuario.setImageResource(R.drawable.tijera);
            }
        });

    }
}
