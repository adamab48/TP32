package com.example.recyclerview;

import android.os.Bundle;

import com.example.recyclerview.adapter.WordListAdapter;
import com.example.recyclerview.model.Recipe;
import com.example.recyclerview.model.School;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.ui.AppBarConfiguration;

import com.example.recyclerview.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private WordListAdapter mAdapter;

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);





            binding = ActivityMainBinding.inflate(getLayoutInflater());
            setContentView(binding.getRoot());





            String[] schools = getResources().getStringArray(R.array.recipe_titles);
            String[] schoolDesc = getResources().getStringArray(R.array.recipe_descriptions);
            LinkedList<Recipe> schoolsL = new LinkedList<Recipe>();
            for (int i = 0; i < schools.length; i++) {
                String name = schools[i];
                int imageId = getResources().getIdentifier(name.toLowerCase().replaceAll("\\s+",""), "drawable", getPackageName());
                schoolsL.add(new Recipe(schools[i] , schoolDesc[i] , imageId ));
            }


            mAdapter = new WordListAdapter(schoolsL);

            binding.contentMain.recyclerview.setAdapter(mAdapter);

            binding.contentMain.recyclerview.setHasFixedSize(true);


            setSupportActionBar(binding.toolbar);



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


}