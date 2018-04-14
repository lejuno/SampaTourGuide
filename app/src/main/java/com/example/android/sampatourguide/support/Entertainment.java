package com.example.android.sampatourguide.support;

import android.content.Context;

import com.example.android.sampatourguide.Other.Suggestion;
import com.example.android.sampatourguide.R;

import java.util.List;

/**
 * Created by nomot on 14/04/2018.
 */

public class Entertainment {
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
    }
}
