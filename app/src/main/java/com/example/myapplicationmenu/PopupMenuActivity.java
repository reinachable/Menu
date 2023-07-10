package com.example.myapplicationmenu;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class PopupMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.PopupMenu).setOnClickListener(v -> showPopupMenu(v));
    }

    private void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(item -> {
            switch (item.getItemId()) {
                case R.id.menu_contextual:
                    Toast.makeText(this, "Seleccionaste Ir a Menú Contextual", Toast.LENGTH_SHORT).show();
                    openContextualMenu();
                    return true;
                case R.id.menu_options:
                    Toast.makeText(this, "Seleccionaste Ir a Menú Opciones", Toast.LENGTH_SHORT).show();
                    openOptionsMenu();
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
        });

        popupMenu.inflate(R.menu.menu3);
        popupMenu.show();
    }

    private void openContextualMenu() {
        Intent intent = new Intent(this, ContextualMenuActivity.class);
        startActivity(intent);
    }

    public void openOptionsMenu() {
        Intent intent = new Intent(this, OptionsMenuActivity.class);
        startActivity(intent);
    }
}
