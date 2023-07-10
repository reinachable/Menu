package com.example.myapplicationmenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ContextualMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View contextView = findViewById(R.id.ContextualMenu);
        registerForContextMenu(contextView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu2, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_options:
                Toast.makeText(this, "Seleccionaste Ir a Menú Opciones", Toast.LENGTH_SHORT).show();
                openOptionsMenu();
                return true;
            case R.id.menu_popup:
                Toast.makeText(this, "Seleccionaste Ir a Menú Popup", Toast.LENGTH_SHORT).show();
                openPopupMenu();
                return true;
            case R.id.menu_main:
                Toast.makeText(this, "Seleccionaste Regresar al Menú Principal", Toast.LENGTH_SHORT).show();
                finish();
                return true;
            case R.id.menu_exit:
                Toast.makeText(this, "Seleccionaste Salir de la Aplicación", Toast.LENGTH_SHORT).show();
                finishAffinity();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    public void openOptionsMenu() {
        Intent intent = new Intent(this, OptionsMenuActivity.class);
        startActivity(intent);
    }

    private void openPopupMenu() {
        Intent intent = new Intent(this, PopupMenuActivity.class);
        startActivity(intent);
    }
}
