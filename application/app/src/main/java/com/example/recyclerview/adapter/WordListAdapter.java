package com.example.recyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.RecipeActivity;
import com.example.recyclerview.model.Recipe;
import com.example.recyclerview.model.School;

import java.util.LinkedList;

public class WordListAdapter extends  RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private final LinkedList<Recipe> mSchoolList;


    public WordListAdapter(LinkedList<Recipe> mSchoolList) {
        this.mSchoolList = mSchoolList;
    }




    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View adapterLayout = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.wordlist, parent, false);

        return new WordViewHolder(adapterLayout, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {

        Recipe sCurrent = mSchoolList.get(position);
        //Word mCurrent = mWordList.get(position);
        holder.sTitle.setText(sCurrent.getrTitle());
        holder.sDesc.setText(sCurrent.getsDesc());


    }

    @Override
    public int getItemCount() {
        return mSchoolList.size();
    }


    public class WordViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener {

        public final TextView sTitle;
        public final TextView sDesc;



        final WordListAdapter mAdapter;
        public WordViewHolder(@NonNull View itemView, WordListAdapter mAdapter) {
            super(itemView);
            this.sTitle  = itemView.findViewById(R.id.stitle);
            this.sDesc  = itemView.findViewById(R.id.sDesc);

            this.mAdapter = mAdapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Context context = v.getContext();

            System.out.println(context);
            int mPosition = getLayoutPosition();
            Recipe recipe = mSchoolList.get(mPosition);

            Intent intent = new Intent(context , RecipeActivity.class);
            intent.putExtra("title", recipe.getrTitle());
            intent.putExtra("description", recipe.getsDesc());
            intent.putExtra("img", recipe.getsPhoto());

            context.startActivity(intent);

        }
    }

}



