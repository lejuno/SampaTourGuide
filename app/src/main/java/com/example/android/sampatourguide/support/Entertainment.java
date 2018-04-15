package com.example.android.sampatourguide.support;

import android.content.Context;

import com.example.android.sampatourguide.Other.Suggestion;
import com.example.android.sampatourguide.R;

import java.util.List;

/**
 * Entertainment class
 * Used to hold all Entertainment suggestions
 */
public class Entertainment {
    /**
     * Initialize Entertainment list
     *
     * @param list
     * @param context
     */
    public static void initEntertainmentList(List<Suggestion> list, Context context) {
        list.add(new Suggestion(
                context.getString(R.string.entertainment_igrejinha_name),
                context.getString(R.string.entertainment_igrejinha_description),
                context.getString(R.string.entertainment_igrejinha_webpage),
                context.getString(R.string.entertainment_igrejinha_address),
                context.getString(R.string.entertainment_igrejinha_phone),
                context.getString(R.string.entertainment_igrejinha_schedule),
                null,
                R.drawable.img_entertainment_igrejinha
        ));

        list.add(new Suggestion(
                context.getString(R.string.entertainment_lereve_name),
                context.getString(R.string.entertainment_lereve_description),
                context.getString(R.string.entertainment_lereve_webpage),
                context.getString(R.string.entertainment_lereve_address),
                context.getString(R.string.entertainment_lereve_phone),
                context.getString(R.string.entertainment_lereve_schedule),
                null,
                R.drawable.img_entertainment_lereve
        ));

        list.add(new Suggestion(
                context.getString(R.string.entertainment_tubaina_name),
                context.getString(R.string.entertainment_tubaina_description),
                context.getString(R.string.entertainment_tubaina_webpage),
                context.getString(R.string.entertainment_tubaina_address),
                context.getString(R.string.entertainment_tubaina_phone),
                context.getString(R.string.entertainment_tubaina_schedule),
                null,
                R.drawable.img_entertainment_tubaina
        ));

        list.add(new Suggestion(
                context.getString(R.string.entertainment_carniceria_name),
                context.getString(R.string.entertainment_carniceria_description),
                context.getString(R.string.entertainment_carniceria_webpage),
                context.getString(R.string.entertainment_carniceria_address),
                context.getString(R.string.entertainment_carniceria_phone),
                context.getString(R.string.entertainment_carniceria_schedule),
                null,
                R.drawable.img_entertainment_carniceria
        ));

        list.add(new Suggestion(
                context.getString(R.string.entertainment_mono_name),
                context.getString(R.string.entertainment_mono_description),
                context.getString(R.string.entertainment_mono_webpage),
                context.getString(R.string.entertainment_mono_address),
                context.getString(R.string.entertainment_mono_phone),
                context.getString(R.string.entertainment_mono_schedule),
                null,
                R.drawable.img_entertainment_mono
        ));

        list.add(new Suggestion(
                context.getString(R.string.entertainment_rocknrollburger_name),
                context.getString(R.string.entertainment_rocknrollburger_description),
                context.getString(R.string.entertainment_rocknrollburger_webpage),
                context.getString(R.string.entertainment_rocknrollburger_address),
                context.getString(R.string.entertainment_rocknrollburger_phone),
                context.getString(R.string.entertainment_rocknrollburger_schedule),
                null,
                R.drawable.img_entertainment_rocknrollburger
        ));
    }
}
