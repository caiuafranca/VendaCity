package br.com.omnesti.vendascity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

    private EditText edtNomeUsuario;
    private EditText edtSenhaUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logar(View v){
        if (verificarUsuario()){
            startActivity(new Intent(getBaseContext(), PrincipalActivity.class));
        }
    }

    public boolean verificarUsuario(){
        EditText nome = (EditText)findViewById(R.id.edtName);
        EditText senha = (EditText) findViewById(R.id.edtSenha);

        if (nome.getText().toString().equals("caiua") && senha.getText().toString().equals("123")){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
