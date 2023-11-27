package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;

import com.example.recyclerview.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.recyclerview.databinding.ActivityRecipeBinding;

public class RecipeActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityRecipeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityRecipeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");
        int fullRecipe = intent.getIntExtra("img" , 1);


        TextView desc = findViewById(R.id.recipeText);
        ImageView recipeImg = findViewById(R.id.recipeImg);

        System.out.println(desc);

        System.out.println(recipeImg);

        recipeImg.setImageResource(fullRecipe);
        desc.setText(description);


    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_recipe);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}