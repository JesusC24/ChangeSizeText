package com.jesusc24.changesizetext.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.jesusc24.changesizetext.ChangeSizeApplication;
import com.jesusc24.changesizetext.data.model.Message;
import com.jesusc24.changesizetext.databinding.ActivityChangeSizeTextBinding;

/**
 * Clase que pide al usuario un texto y un tamaño mediante el comoponente SeekBar.
 * Posteriormente se inicliaza un TextView @see {@link ViewMessageActivity#onCreate(Bundle)}
 * @author JesusC24
 * @version 1.0
 */
public class ChangeSizeTextActivity extends AppCompatActivity {

    private static final String TAG = "ChangeSizeTextActivity";

    ActivityChangeSizeTextBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityChangeSizeTextBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.btSend.setOnClickListener(view -> {
            //1. Crear objeto bundle
            Bundle bundle = new Bundle();
            //2. Añadir mensaje al bundle
            Message message = new Message(((ChangeSizeApplication)getApplication()).getUser(), binding.edMessage.getText().toString(), binding.skSize.getProgress());
            bundle.putSerializable("message", message);
            //3. Enviar intent con el Bundle
            Intent intent = new Intent(this, ViewMessageActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);

        });
        Log.d(TAG, "ChangeSizeText -> OnCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ChangeSizeText -> OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ChangeSizeText -> OnResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ChangeSizeText -> OnPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ChangeSizeText -> OnStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ChangeSizeText -> OnDestroy()");
    }

}