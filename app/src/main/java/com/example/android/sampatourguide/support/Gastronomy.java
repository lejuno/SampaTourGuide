package com.example.android.sampatourguide.support;

import android.content.Context;

import com.example.android.sampatourguide.Other.Suggestion;
import com.example.android.sampatourguide.R;

import java.util.List;

/**
 * Gastronomy class
 * Used to hold all Gastronomy suggestions
 */
public class Gastronomy {
    /**
     * Initialize Gastronomy List
     * @param list
     * @param context
     */
    public static void initGastronomyList(List<Suggestion> list, Context context) {
        list.add(new Suggestion(
                context.getString(R.string.gastronomy_mocoto_name),
                context.getString(R.string.gastronomy_mocoto_description),
                context.getString(R.string.gastronomy_mocoto_webpage),
                context.getString(R.string.gastronomy_mocoto_address),
                context.getString(R.string.gastronomy_mocoto_phone),
                context.getString(R.string.gastronomy_mocoto_schedule),
                context.getString(R.string.gastronomy_mocoto_price),
                R.drawable.img_gastronomy_mocoto
        ));

        list.add(new Suggestion(
                context.getString(R.string.gastronomy_vicolo_name),
                context.getString(R.string.gastronomy_vicolo_description),
                context.getString(R.string.gastronomy_vicolo_webpage),
                context.getString(R.string.gastronomy_vicolo_address),
                context.getString(R.string.gastronomy_vicolo_phone),
                context.getString(R.string.gastronomy_vicolo_schedule),
                context.getString(R.string.gastronomy_vicolo_price),
                R.drawable.img_gastronomy_vicolo
        ));

        list.add(new Suggestion(
                context.getString(R.string.gastronomy_onca_name),
                context.getString(R.string.gastronomy_onca_description),
                context.getString(R.string.gastronomy_onca_webpage),
                context.getString(R.string.gastronomy_onca_address),
                context.getString(R.string.gastronomy_onca_phone),
                context.getString(R.string.gastronomy_onca_schedule),
                context.getString(R.string.gastronomy_onca_price),
                R.drawable.img_gastronomy_onca
        ));

        list.add(new Suggestion(
                context.getString(R.string.gastronomy_fogochao_name),
                context.getString(R.string.gastronomy_fogochao_description),
                context.getString(R.string.gastronomy_fogochao_webpage),
                context.getString(R.string.gastronomy_fogochao_address),
                context.getString(R.string.gastronomy_fogochao_phone),
                context.getString(R.string.gastronomy_fogochao_schedule),
                context.getString(R.string.gastronomy_fogochao_price),
                R.drawable.img_gastronomy_fogochao
        ));

        list.add(new Suggestion(
                context.getString(R.string.gastronomy_fasano_name),
                context.getString(R.string.gastronomy_fasano_description),
                context.getString(R.string.gastronomy_fasano_webpage),
                context.getString(R.string.gastronomy_fasano_address),
                context.getString(R.string.gastronomy_fasano_phone),
                context.getString(R.string.gastronomy_fasano_schedule),
                context.getString(R.string.gastronomy_fasano_price),
                R.drawable.img_gastronomy_fasano
        ));

        list.add(new Suggestion(
                context.getString(R.string.gastronomy_eataly_name),
                context.getString(R.string.gastronomy_eataly_description),
                context.getString(R.string.gastronomy_eataly_webpage),
                context.getString(R.string.gastronomy_eataly_address),
                context.getString(R.string.gastronomy_eataly_phone),
                context.getString(R.string.gastronomy_eataly_schedule),
                context.getString(R.string.gastronomy_eataly_price),
                R.drawable.img_gastronomy_eataly
        ));

        list.add(new Suggestion(
                context.getString(R.string.gastronomy_turmamonica_name),
                context.getString(R.string.gastronomy_turmamonica_description),
                context.getString(R.string.gastronomy_turmamonica_webpage),
                context.getString(R.string.gastronomy_turmamonica_address),
                context.getString(R.string.gastronomy_turmamonica_phone),
                context.getString(R.string.gastronomy_turmamonica_schedule),
                context.getString(R.string.gastronomy_turmamonica_price),
                R.drawable.img_gastronomy_turmamonica
        ));

        list.add(new Suggestion(
                context.getString(R.string.gastronomy_cantinapalestra_name),
                context.getString(R.string.gastronomy_cantinapalestra_description),
                context.getString(R.string.gastronomy_cantinapalestra_webpage),
                context.getString(R.string.gastronomy_cantinapalestra_address),
                context.getString(R.string.gastronomy_cantinapalestra_phone),
                context.getString(R.string.gastronomy_cantinapalestra_schedule),
                context.getString(R.string.gastronomy_cantinapalestra_price),
                R.drawable.img_gastronomy_cantinapalestra
        ));
    }
}
