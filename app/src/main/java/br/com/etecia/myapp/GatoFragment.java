package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

public class GatoFragment extends Fragment {

    ListView lstgato;

//Criar dados

    String nomegato[] = {"Walisson", "Pimenta", "Timão"};

    String descricaogato[] = {

            "Sou o Gato mais lindo, me adote.",
            "Sou o Gato mais inteligente, me adote.",
            "Sou o Gato mais cheiroso, me adote.",
            "Sou o Gato mais Engraçado, me adote. "
    };

    String numgato[] = {"5.0", "8.0", "9.0", "9.5"};

    int imagemgato[] = {
            R.drawable.gato_laranja, R.drawable.gato,
            R.drawable.gato_cinza,
            R.drawable.gato_tricolor
    };




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gato, container, false);
lstgato =view.findViewById(R.id.lstgato);

        AdapterGatos adapterGatos = new AdapterGatos();

lstgato.setAdapter(adapterGatos);

        return view;
    }
}