package uk.co.mandilee.welcometo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ExperiencesFragment extends Fragment {

    public ExperiencesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<Image> images = new ArrayList<>();
        images.add(new Image(R.drawable.scenery_4));
        images.add(new Image(R.drawable.scenery_7));
        images.add(new Image(R.drawable.scenery_8));
        images.add(new Image(R.drawable.scenery_9));

        ImageAdapter adapter = new ImageAdapter(getActivity(), images);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
