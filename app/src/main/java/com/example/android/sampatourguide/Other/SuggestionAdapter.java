package com.example.android.sampatourguide.Other;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.sampatourguide.R;

import java.util.List;

/**
 * Suggestion adapter to support on adding a card view for each suggestion
 */
public class SuggestionAdapter extends ArrayAdapter<Suggestion> {

    /**
     * Constructor
     *
     * @param context
     * @param resources
     * @param suggestionsList
     */
    public SuggestionAdapter(Context context, int resources, List<Suggestion> suggestionsList) {
        super(context, 0, suggestionsList);
    }

    /**
     * getView()
     * Build each suggestion as a card view.
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Suggestion currentSuggestion = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Title View
        TextView nameTitleTextView = (TextView) listItemView.findViewById(R.id.titleTextView);
        nameTitleTextView.setText(currentSuggestion.getName());

        // Description View
        TextView descriptionTextView = (TextView)
                listItemView.findViewById(R.id.descriptionTextView);
        descriptionTextView.setText(currentSuggestion.getDescription());

        // Web Page view
        TextView webpageTextView = (TextView)
                listItemView.findViewById(R.id.webpageTextView);
        webpageTextView.setText(currentSuggestion.getWebpage());

        // Address View
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.addressTextView);
        addressTextView.setText(currentSuggestion.getAddress());

        // Schedule View
        TextView scheduleTextView = (TextView) listItemView.findViewById(R.id.scheduleTextView);
        scheduleTextView.setText(currentSuggestion.getSchedule());

        // Price View
        TextView priceTextView = (TextView) listItemView.findViewById(R.id.priceTextView);
        priceTextView.setText(currentSuggestion.getPrice());

        // Contact View
        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phoneTextView);
        phoneTextView.setText(currentSuggestion.getPhone());

        // Image View
        ImageView photoImageView = (ImageView) listItemView.findViewById(R.id.photoImageView);

        // Check if Suggestion has image.
        if (currentSuggestion.hasImage()) {
            photoImageView.setImageResource(currentSuggestion.getImageResourceId());
            photoImageView.setVisibility(View.VISIBLE);
        } else {
            photoImageView.setVisibility(View.GONE);
        }

        // Check if suggestion has web page
        if(currentSuggestion.hasWebpage()) {
            webpageTextView.setVisibility(View.VISIBLE);
        } else {
            webpageTextView.setVisibility(View.GONE);
        }

        // Check if suggestion has price
        if (currentSuggestion.hasPrice()) {
            priceTextView.setVisibility(View.VISIBLE);
        } else {
            priceTextView.setVisibility(View.GONE);
        }

        // Check if suggestion has schedule
        if (currentSuggestion.hasSchedule()) {
            scheduleTextView.setVisibility(View.VISIBLE);
        } else {
            scheduleTextView.setVisibility(View.GONE);
        }

        // Check if suggestion has address
        if (currentSuggestion.hasAddress()) {
            addressTextView.setVisibility(View.VISIBLE);
        } else {
            addressTextView.setVisibility(View.GONE);
        }

        // Check if suggestion has contact
        if (currentSuggestion.hasPhone()) {
            phoneTextView.setVisibility(View.VISIBLE);
        } else {
            phoneTextView.setVisibility(View.GONE);
        }

        // Return list item
        return listItemView;
    }


}

