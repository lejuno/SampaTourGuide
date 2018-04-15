package com.example.android.sampatourguide.support;

import android.content.Context;

import com.example.android.sampatourguide.Other.Suggestion;
import com.example.android.sampatourguide.R;

import java.util.List;

/**
 * Culture class
 * Used to hold all Culture suggestions
 */
public class Culture {
    /**
     * Initialize Culture List
     *
     * @param list
     * @param context
     */
    public static void initCultureList(List<Suggestion> list, Context context) {
        list.add(new Suggestion(
                context.getString(R.string.culture_masp_name),
                context.getString(R.string.culture_masp_description),
                context.getString(R.string.culture_masp_webpage),
                context.getString(R.string.culture_masp_address),
                context.getString(R.string.culture_masp_phone),
                context.getString(R.string.culture_masp_schedule),
                context.getString(R.string.culture_masp_price),
                R.drawable.img_culture_masp
        ));

        list.add(new Suggestion(
                context.getString(R.string.culture_mac_name),
                context.getString(R.string.culture_mac_description),
                context.getString(R.string.culture_mac_webpage),
                context.getString(R.string.culture_mac_address),
                context.getString(R.string.culture_mac_phone),
                context.getString(R.string.culture_mac_schedule),
                context.getString(R.string.culture_mac_price),
                R.drawable.img_culture_mac
        ));

        list.add(new Suggestion(
                context.getString(R.string.culture_imigracao_japonesa_name),
                context.getString(R.string.culture_imigracao_japonesa_description),
                context.getString(R.string.culture_imigracao_japonesa_webpage),
                context.getString(R.string.culture_imigracao_japonesa_address),
                context.getString(R.string.culture_imigracao_japonesa_phone),
                context.getString(R.string.culture_imigracao_japonesa_schedule),
                null,
                R.drawable.img_culture_imigracao_japonesa
        ));

        list.add(new Suggestion(
                context.getString(R.string.culture_lampada_name),
                context.getString(R.string.culture_lampada_description),
                context.getString(R.string.culture_lampada_webpage),
                context.getString(R.string.culture_lampada_address),
                context.getString(R.string.culture_lampada_phone),
                context.getString(R.string.culture_lampada_schedule),
                null,
                R.drawable.img_culture_lampada
        ));

        list.add(new Suggestion(
                context.getString(R.string.culture_pinacoteca_name),
                context.getString(R.string.culture_pinacoteca_description),
                context.getString(R.string.culture_pinacoteca_webpage),
                context.getString(R.string.culture_pinacoteca_address),
                context.getString(R.string.culture_pinacoteca_phone),
                context.getString(R.string.culture_pinacoteca_schedule),
                context.getString(R.string.culture_pinacoteca_price),
                R.drawable.img_culture_pinacoteca
        ));
    }
}
