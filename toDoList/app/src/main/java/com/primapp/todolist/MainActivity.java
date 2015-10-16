package com.primapp.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<String> misTareasArray;
    private ArrayAdapter<String> adapterMisTareas;
    private EditText agregar;

    private ListView tareaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        misTareasArray = new ArrayList<>() ;

        adapterMisTareas = new ArrayAdapter<String>(
                this, R.layout.act_tarea,R.id.textView,misTareasArray
        );

        tareaList = (ListView) findViewById(R.id.lvTarea);
        tareaList.setAdapter(adapterMisTareas);


        agregar = (EditText) findViewById(R.id.etAgregar);

        //tareaList.setOnClickListener();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick (View view){
        String txt = agregar.getText().toString();
        adapterMisTareas.add(txt);
    }

}
