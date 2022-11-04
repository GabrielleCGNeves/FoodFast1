package br.com.etecia.foodfast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

import java.util.TooManyListenersException;

public class MenuAppBarTop_Activity extends AppCompatActivity {
    //Declarando a variável global do objeto AppBar
    MaterialToolbar idToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_app_bar_top_layout);

        //Apresentando a toolbar xml para o java
        idToolBar = findViewById(R.id.idToolBar);

        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MenuAppBarTop_Activity.this, "oi", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "oi", Toast.LENGTH_SHORT).show();
            }
        });

        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch(item.getItemId()){

                    case R.id.mFavorite:
                        Toast.makeText(getApplicationContext(), "curtiu", Toast.LENGTH_SHORT).show();
                        break;
                }

                return false;
            }
        });

        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()){

                    case R.id.mBusca:
                        Toast.makeText(getApplicationContext(), "buscar", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });

        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch(item.getItemId()){

                    case R.id.mMore:
                        Toast.makeText(getApplicationContext(), "mais opções", Toast.LENGTH_SHORT).show();
                        break;

                }

                return false;
            }
        });
    }
}