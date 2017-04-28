package uk.co.mandilee.welcometo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.item_list, container, false);

        final ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(R.string.item_shopping, R.string.attr_shop_florida_mall, R.string.attr_shop_florida_mall_description, R.drawable.attr_shop_florida_mall));
        items.add(new Item(R.string.item_shopping, R.string.attr_shop_zales, R.string.attr_shop_zales_description, R.drawable.attr_shop_zales));
        items.add(new Item(R.string.item_shopping, R.string.attr_shop_publix, R.string.attr_shop_publix_description, R.drawable.attr_shop_publix));

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
