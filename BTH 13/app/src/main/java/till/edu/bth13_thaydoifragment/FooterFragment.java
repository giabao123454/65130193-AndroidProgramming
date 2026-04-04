package till.edu.bth13_thaydoifragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FooterFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_footer, container, false);

        Button btnOne = view.findViewById(R.id.btnOne);
        Button btnTwo = view.findViewById(R.id.btnTwo);
        Button btnThree = view.findViewById(R.id.btnThree);

        FragmentManager fragmentManager = getParentFragmentManager();

        btnOne.setOnClickListener(v -> fragmentManager.beginTransaction()
                .replace(R.id.frameContentHolder, new FragmentOne())
                .commit());

        btnTwo.setOnClickListener(v -> fragmentManager.beginTransaction()
                .replace(R.id.frameContentHolder, new FragmentTwo())
                .commit());

        btnThree.setOnClickListener(v -> fragmentManager.beginTransaction()
                .replace(R.id.frameContentHolder, new FragmentThree())
                .commit());

        return view;
    }
}