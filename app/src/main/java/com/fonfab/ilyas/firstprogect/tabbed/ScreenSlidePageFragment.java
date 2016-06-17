package com.fonfab.ilyas.firstprogect.tabbed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fonfab.ilyas.firstprogect.R;

/**
 * Created by Ilyas on 17.06.2016.
 */
public class ScreenSlidePageFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    public static ScreenSlidePageFragment newInstance(int sectionNumber) {
        ScreenSlidePageFragment  fragment = new ScreenSlidePageFragment ();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_screen_slide_page, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));

        return rootView;
    }
}
