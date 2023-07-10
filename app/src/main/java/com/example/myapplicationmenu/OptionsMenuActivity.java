package com.example.myapplicationmenu;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class OptionsMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_contextual:
                Toast.makeText(this, "Seleccionaste Ir a Menú Contextual", Toast.LENGTH_SHORT).show();
                openContextualMenu();
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
                return super.onOptionsItemSelected(item);
        }
    }

    private void openContextualMenu() {
        Intent intent = new Intent(this, ContextualMenuActivity.class);
        startActivity(intent);
    }

    private void openPopupMenu() {
        Intent intent = new Intent(this, PopupMenuActivity.class);
        startActivity(intent);
    }
}
