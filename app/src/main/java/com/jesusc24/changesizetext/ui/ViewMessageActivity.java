package com.jesusc24.changesizetext.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.jesusc24.changesizetext.ChangeSizeApplication;
import com.jesusc24.changesizetext.data.model.Message;
import com.jesusc24.changesizetext.databinding.ActivityViewMessageBinding;

/**
 * Esta clase visualiza un mensaje que se ha inicializado en ChangeSizeTextActivity
 * Se configura el componente TextView con un texto y un tamaño de fuente.
 * @author JesusC24
 * @version 1.0
 */
public class ViewMessageActivity extends AppCompatActivity {

    ActivityViewMessageBinding binding;
    private String TAG = "ChangeSizeProject";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityViewMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //1. Recoger intent
        Intent intent = getIntent();
        //2. Recoger el mensaje
        Message message = (Message) intent.getExtras().getSerializable("message");
        //3. Actualizamos la vista
        binding.tvMessage.setText(message.getMessage());
        binding.tvMessage.setTextSize(message.getSize());
        /*
         * Todas las Activitys tiene acceso a la información de la clase
         * Aplication desde el método getApplication. Se debe realizar un
         * casting explícito.
         */
        Log.d(TAG, ((ChangeSizeApplication)getApplication()).getUser().toString());



    }
}