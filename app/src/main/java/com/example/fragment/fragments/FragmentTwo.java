package com.example.fragment.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.example.fragment.R;
import com.example.fragment.activites.MyData;
import com.example.fragment.activites.User;
import com.google.android.material.snackbar.Snackbar;

public class FragmentTwo extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public FragmentTwo() {
        // Required empty public constructor
    }

    public static FragmentTwo newInstance(String param1, String param2) {
        FragmentTwo fragment = new FragmentTwo();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, container, false);

        Button button = view.findViewById(R.id.buttonGo);
        EditText signupUsername = view.findViewById(R.id.regUsername);
        EditText signupPassword = view.findViewById(R.id.regPassword);
        EditText signupPhoneNumber = view.findViewById(R.id.regTelephone);

        button.setOnClickListener(v -> {
            String username = signupUsername.getText().toString();
            String password = signupPassword.getText().toString();
            String phoneNumber = signupPhoneNumber.getText().toString();

            if (MyData.userDetails.containsKey(username)) {
                Snackbar.make(v, "This Username is already taken", Snackbar.LENGTH_LONG)
                        .setAction("Close", v1 -> {}).show();
            } else {
                User usr = new User(password, phoneNumber); // Ensure this matches your User constructor
                MyData.userDetails.put(username, usr);
                Bundle bundle = new Bundle();
                bundle.putString("userName", username);
                Navigation.findNavController(v).navigate(R.id.action_fragmentTwo_to_fragmentThree, bundle);
            }
        });

        return view;
    }
}