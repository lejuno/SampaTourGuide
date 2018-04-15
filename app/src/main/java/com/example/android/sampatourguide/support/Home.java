package com.example.android.sampatourguide.support;

import android.content.Context;

import com.example.android.sampatourguide.Other.Suggestion;
import com.example.android.sampatourguide.R;

import java.util.List;

/**
 * Home class
 * Used to hold all Home history items
 */
public class Home {
    /**
     * Initialize Home List
     * @param list
     * @param context
     */
    public static void initHomeList(List<Suggestion> list, Context context) {
        list.add(new Suggestion(
                context.getString(R.string.home_history0_name),
                context.getString(R.string.home_history0_description),
                null,
                null,
                null,
                null,
                null,
                R.drawable.img_home_history0
        ));

        list.add(new Suggestion(
                context.getString(R.string.home_history1_name),
                context.getString(R.string.home_history1_description),
                null,
                null,
                null,
                null,
                null,
                R.drawable.img_home_history1
        ));

        list.add(new Suggestion(
                context.getString(R.string.home_history2_name),
                context.getString(R.string.home_history2_description),
                null,
                null,
                null,
                null,
                null,
                R.drawable.img_home_history2
        ));

        list.add(new Suggestion(
                context.getString(R.string.home_history3_name),
                context.getString(R.string.home_history3_description),
                null,
                null,
                null,
                null,
                null,
                R.drawable.img_home_history3
        ));

        list.add(new Suggestion(
                context.getString(R.string.home_history4_name),
                context.getString(R.string.home_history4_description),
                null,
                null,
                null,
                null,
                null,
                R.drawable.img_home_history4
        ));

        list.add(new Suggestion(
                context.getString(R.string.home_history5_name),
                context.getString(R.string.home_history5_description),
                null,
                null,
                null,
                null,
                null,
                R.drawable.img_home_history5
        ));

        list.add(new Suggestion(
                context.getString(R.string.home_history6_name),
                context.getString(R.string.home_history6_description),
                null,
                null,
                null,
                null,
                null,
                R.drawable.img_home_history6
        ));

        list.add(new Suggestion(
                context.getString(R.string.home_history7_name),
                context.getString(R.string.home_history7_description),
                null,
                null,
                null,
                null,
                null,
                R.drawable.img_home_history7
        ));

        list.add(new Suggestion(
                context.getString(R.string.home_history8_name),
                context.getString(R.string.home_history8_description),
                null,
                null,
                null,
                null,
                null,
                R.drawable.img_home_history8
        ));

        list.add(new Suggestion(
                context.getString(R.string.home_history9_name),
                context.getString(R.string.home_history9_description),
                null,
                null,
                null,
                null,
                null,
                R.drawable.img_home_history9
        ));
    }
}
