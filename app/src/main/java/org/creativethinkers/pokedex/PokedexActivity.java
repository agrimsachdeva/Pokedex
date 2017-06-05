package org.creativethinkers.pokedex;


import android.os.Bundle;
import android.view.*;
import android.widget.*;
import stanford.androidlib.*;

public class PokedexActivity extends SimpleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokedex);
    }

    /*
     * Called when the user clicks on any of the Pokemon image buttons.
     * Displays a DetailsActivity when in portrait mode, and
     * displays a DetailsFragment when in landscape mode.
     */
    public void pokemonClick(View view) {
        ImageButton button = (ImageButton) view;
        String tag = button.getTag().toString();

        // launch DetailsActivity
        startActivity(DetailsActivity.class, "pokemon_name", tag);
    }
}
