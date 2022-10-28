package br.com.etecia.foodfast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Inserindo Barra de Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Instanciando uma Classe
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

//    Criar Métodos para Clicar em Icones do Menu


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mEnter:
                Toast.makeText(getApplicationContext(), "Entrar", Toast.LENGTH_LONG).show();
                break;
            case R.id.mLogout:
                Toast.makeText(getApplicationContext(), "Sair", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBack:
                Toast.makeText(getApplicationContext(), "Voltar", Toast.LENGTH_LONG).show();
                break;
            case R.id.mSignIn:
                Toast.makeText(getApplicationContext(), "Cadastrar", Toast.LENGTH_LONG).show();
                break;
            case R.id.mSearch:
                Toast.makeText(getApplicationContext(), "Buscar", Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}