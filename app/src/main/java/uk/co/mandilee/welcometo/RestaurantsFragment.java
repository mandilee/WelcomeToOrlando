package uk.co.mandilee.welcometo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.string.item_restaurants, R.string.attr_rest_red_lobster, R.string.attr_rest_red_lobster_description, R.drawable.attr_rest_red_lobster));
        items.add(new Item(R.string.item_restaurants, R.string.attr_rest_black_angus, R.string.attr_rest_black_angus_description, R.drawable.attr_rest_black_angus));
        items.add(new Item(R.string.item_snacks, R.string.attr_rest_dunkin_donuts, R.string.attr_rest_dunkin_donuts_description, R.drawable.attr_rest_dunkin_donuts));

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
