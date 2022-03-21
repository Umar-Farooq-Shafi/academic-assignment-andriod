package com.example.assignment1.ui.stared;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.assignment1.databinding.FragmentStaredBinding;

public class StaredFragment extends Fragment {

private FragmentStaredBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        StaredViewModel staredViewModel =
                new ViewModelProvider(this).get(StaredViewModel.class);

    binding = FragmentStaredBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textNotifications;
        staredViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}