package uk.co.mandilee.welcometo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_content, parent, false);

        }

        Item currentItem = getItem(position);

        TextView typeTextView = (TextView) listItemView.findViewById(R.id.itemType);
        typeTextView.setText(currentItem != null ? currentItem.getTypeResId() : 0);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.itemName);
        nameTextView.setText(currentItem.getNameResId());

        TextView tvDescription = (TextView) listItemView.findViewById(R.id.itemDescription);
        tvDescription.setText(currentItem.getDescriptionResId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.itemImage);
        if (currentItem.hasImage()) {
            imageView.setImageResource(currentItem.getImageResId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        return listItemView;
    }

}