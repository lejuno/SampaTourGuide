package com.example.android.sampatourguide.support;

import android.content.Context;

import com.example.android.sampatourguide.Other.Suggestion;
import com.example.android.sampatourguide.R;

import java.util.List;

/**
 * Parks class
 * Used to hold all Parks suggestions
 */
public class Parks {
    /**
     * Initialize Parks list
     * @param list
     * @param context
     */
    public static void initParksList(List<Suggestion> list, Context context) {
        list.add(new Suggestion(
                context.getString(R.string.parks_ibirapuera_name),
                context.getString(R.string.parks_ibirapuera_description),
                context.getString(R.string.parks_ibirapuera_webpage),
                context.getString(R.string.parks_ibirapuera_address),
                context.getString(R.string.parks_ibirapuera_phone),
                context.getString(R.string.parks_ibirapuera_schedule),
                null,
                R.drawable.img_parks_ibirapuera
        ));

        list.add(new Suggestion(
                context.getString(R.string.parks_aclimacao_name),
                context.getString(R.string.parks_aclimacao_description),
                context.getString(R.string.parks_aclimacao_webpage),
                context.getString(R.string.parks_aclimacao_address),
                context.getString(R.string.parks_aclimacao_phone),
                context.getString(R.string.parks_aclimacao_schedule),
                null,
                R.drawable.img_parks_aclimacao
        ));

        list.add(new Suggestion(
                context.getString(R.string.parks_carmo_name),
                context.getString(R.string.parks_carmo_description),
                context.getString(R.string.parks_carmo_webpage),
                context.getString(R.string.parks_carmo_address),
                context.getString(R.string.parks_carmo_phone),
                context.getString(R.string.parks_carmo_schedule),
                null,
                R.drawable.img_parks_carmo
        ));

        list.add(new Suggestion(
                context.getString(R.string.parks_juventude_name),
                context.getString(R.string.parks_juventude_description),
                context.getString(R.string.parks_juventude_webpage),
                context.getString(R.string.parks_juventude_address),
                context.getString(R.string.parks_juventude_phone),
                context.getString(R.string.parks_juventude_schedule),
                null,
                R.drawable.img_parks_juventude
        ));

        list.add(new Suggestion(
                context.getString(R.string.parks_trabalhador_name),
                context.getString(R.string.parks_trabalhador_description),
                context.getString(R.string.parks_trabalhador_webpage),
                context.getString(R.string.parks_trabalhador_address),
                context.getString(R.string.parks_trabalhador_phone),
                context.getString(R.string.parks_trabalhador_schedule),
                null,
                R.drawable.img_parks_trabalhador
        ));

        list.add(new Suggestion(
                context.getString(R.string.parks_villalobos_name),
                context.getString(R.string.parks_villalobos_description),
                context.getString(R.string.parks_villalobos_webpage),
                context.getString(R.string.parks_villalobos_address),
                context.getString(R.string.parks_villalobos_phone),
                context.getString(R.string.parks_villalobos_schedule),
                null,
                R.drawable.img_parks_villalobos
        ));
    }
}
