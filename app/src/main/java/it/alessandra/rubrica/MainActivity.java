package it.alessandra.rubrica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView intro;
    private ListView contact;
    private TextView nome;
    private TextView cognome;
    private TextView telefono;
    private Rubrica rubrica;
    private Button elimina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rubrica = new Rubrica();
        rubrica.init();
        contact = (ListView) findViewById(R.id.listcontact);
        nome = findViewById(R.id.nome);
        cognome = findViewById(R.id.cognome);
        telefono = findViewById(R.id.telefono);
        elimina = findViewById(R.id.button);


        final CustomAdapter customAdapter = new CustomAdapter(this, R.layout.itempersona, rubrica.getContatti());
        contact.setAdapter(customAdapter);

        elimina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customAdapter.deleteByName("Serena");
                customAdapter.notifyDataSetChanged();
            }
        });
    }


}


