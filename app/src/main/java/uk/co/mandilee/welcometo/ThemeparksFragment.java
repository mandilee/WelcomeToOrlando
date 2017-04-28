package uk.co.mandilee.welcometo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ThemeparksFragment extends Fragment {

    public ThemeparksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.string.item_themepark, R.string.attr_park_seaworld, R.string.attr_park_seaworld_description, R.drawable.attr_park_seaworld));
        items.add(new Item(R.string.item_themepark, R.string.attr_park_animal_kingdom, R.string.attr_park_animal_kingdom_description, R.drawable.attr_park_animal_kingdom));
        items.add(new Item(R.string.item_themepark, R.string.attr_park_busch_gardens, R.string.attr_park_busch_gardens_description, R.drawable.attr_park_busch_gardens));
        items.add(new Item(R.string.item_experiences, R.string.attr_exp_boggy_creek, R.string.attr_exp_boggy_creek_description, R.drawable.attr_exp_boggy_creek));
        items.add(new Item(R.string.item_experiences, R.string.attr_exp_ripleys, R.string.attr_exp_ripleys_description, R.drawable.attr_exp_ripleys));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO make this open details and features in a new fragment?
            }
        });

        return rootView;
    }
}
