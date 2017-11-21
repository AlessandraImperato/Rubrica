package it.alessandra.rubrica;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by utente7.academy on 20/11/2017.
 */

public class CustomAdapter extends ArrayAdapter<Persona> {

    private int resource;
    private LayoutInflater inflater;
    private List<Persona> persone;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<Persona> objects) {
        super(context, resource, objects);
        this.resource = resource;
        this.persone = objects;
        this.inflater = LayoutInflater.from(context);
    }

    public void deleteByName(String name){
        Persona p = new Persona();
        for(Persona temp : persone){
            if(temp.getNome().equals(name)){
                p = temp;
                break;
            }
        }
        persone.remove(p);
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Nullable
    @Override
    public Persona getItem(int position) {
        return super.getItem(position);

    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View v, @NonNull ViewGroup parent) {
        if(v == null){
           /// Log.d("DEBUG","Inflating view");
            v = inflater.inflate(R.layout.itempersona,null);
        }
        Persona p = getItem(position);
        TextView nome;
        TextView cognome;
        TextView telefono;

        nome = (TextView)v.findViewById(R.id.nome);
        cognome = (TextView)v.findViewById(R.id.cognome);
        telefono = (TextView)v.findViewById(R.id.telefono);

        nome.setText(p.getNome());
        cognome.setText(p.getCognome());
        telefono.setText(p.getTelefono());

        return v;
    }
}

