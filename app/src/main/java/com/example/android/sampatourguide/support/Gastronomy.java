package com.example.android.sampatourguide.support;

import android.content.Context;

import com.example.android.sampatourguide.Other.Suggestion;
import com.example.android.sampatourguide.R;

import java.util.List;

/**
 * Created by nomot on 14/04/2018.
 */

public class Gastronomy {
    public static void initFoodsList(List<Suggestion> list, Context context) {

        list.add(new Suggestion(
                context.getString(R.string.food_genki_name),
                context.getString(R.string.food_genki_description),
                null,
                context.getString(R.string.food_genki_address),
                context.getString(R.string.food_genki_phone),
                context.getString(R.string.food_genki_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.food_genki_sushi
        ));

        list.add(new Suggestion(
                context.getString(R.string.food_wako_name),
                context.getString(R.string.food_wako_description),
                null,
                context.getString(R.string.food_wako_address),
                context.getString(R.string.food_wako_phone),
                context.getString(R.string.food_wako_schedule),
                context.getString(R.string.food_price_two),
                R.drawable.food_tonkatsu_wako
        ));

        list.add(new Suggestion(
                context.getString(R.string.food_kisoji_name),
                context.getString(R.string.food_kisoji_description),
                null,
                context.getString(R.string.food_kisoji_address),
                context.getString(R.string.food_kisoji_phone),
                context.getString(R.string.food_kisoji_schedule),
                context.getString(R.string.food_price_four),
                R.drawable.food_kisoji_shabushabu
        ));

        list.add(new Suggestion(
                context.getString(R.string.food_gogo_name),
                context.getString(R.string.food_gogo_description),
                null,
                context.getString(R.string.food_gogo_address),
                context.getString(R.string.food_gogo_phone),
                context.getString(R.string.food_gogo_schedule),
                context.getString(R.string.food_price_one),
                R.drawable.food_gogo_curry
        ));

        list.add(new Suggestion(
                context.getString(R.string.food_tenya_name),
                context.getString(R.string.food_tenya_description),
                null,
                context.getString(R.string.food_tenya_address),
                context.getString(R.string.food_tenya_phone),
                context.getString(R.string.food_tenya_schedule),
                context.getString(R.string.food_price_one),
                R.drawable.food_tenya
        ));

        list.add(new Suggestion(
                context.getString(R.string.food_shibukatsu_name),
                context.getString(R.string.food_shibukatsu_description),
                null,
                context.getString(R.string.food_shibukatsu_address),
                context.getString(R.string.food_shibukatsu_phone),
                context.getString(R.string.food_shibukatsu_schedule),
                context.getString(R.string.food_price_one),
                R.drawable.food_shibukatsu
        ));
    }
}
