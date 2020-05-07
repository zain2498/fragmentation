package com.example.fragmenttask;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 *
 */
public class secondFragment extends Fragment {

        Button showBtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.fragment_second, container, false);

           showBtn = rootView.findViewById(R.id.showBtn);

            showBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(),secondFragment.class.getSimpleName(),Toast.LENGTH_LONG).show();
                }
            });


        return rootView;
    }
}
