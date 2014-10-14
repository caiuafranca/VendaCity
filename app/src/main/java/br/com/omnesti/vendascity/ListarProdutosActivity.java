package br.com.omnesti.vendascity;

import android.app.Activity;
import android.opengl.EGLExt;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by caiua on 14/10/14.
 */
public class ListarProdutosActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_produtos);

        String [] p = {"Nome: Produto1 - IMG - R$ Preço - 3 - Comprar",
                       "Nome: Produto2 - IMG - R$ Preço - 2 - Comprar",
                       "Nome: Produto3 - IMG - R$ Preço - 4 - Comprar",
                       "Nome: Produto4 - IMG - R$ Preço - 5 - Comprar"};

        ListView lista = (ListView) findViewById(R.id.lsvProdutos);

        lista.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,p));
    }
}
