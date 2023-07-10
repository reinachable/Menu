package com.example.myapplicationmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openOptionsMenu(View view) {
        Toast.makeText(this, "Seleccionaste Menú Opciones", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, OptionsMenuActivity.class);
        startActivity(intent);
    }

    public void openContextualMenu(View view) {
        Toast.makeText(this, "Seleccionaste Menú Contextual", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ContextualMenuActivity.class);
        startActivity(intent);
    }

    public void openPopupMenu(View view) {
        Toast.makeText(this, "Seleccionaste Menú Popup", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, PopupMenuActivity.class);
        startActivity(intent);
    }
}
