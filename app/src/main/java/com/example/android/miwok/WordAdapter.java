package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by neil on 11/22/16.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    //constructor
    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //MAIN GOAL: Get listItemView, either from recycling, or from by inflating a new one
        //second input param is a recycled view ^^^.  If one is passed, it means it can be recycled
        View listItemView = convertView;
        //if null, means no recycled views to be used yet.  None passed to this method
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false); //create new listItemView
        }

        Word currentWord = getItem(position);

        //set miwok word in display
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        nameTextView.setText(currentWord.getMiwokWord());

        //set default word in display
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        numberTextView.setText(currentWord.getDefaultWord());

        //return the view
        return listItemView;
    }
}
