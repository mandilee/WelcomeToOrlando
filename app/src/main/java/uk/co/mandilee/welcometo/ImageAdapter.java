package uk.co.mandilee.welcometo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class ImageAdapter extends ArrayAdapter<Image> {

    public ImageAdapter(Context context, ArrayList<Image> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View listImageView = convertView;

        if (listImageView == null) {
            listImageView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_content_images, parent, false);
        }

        Image currentImage = getItem(position);

        ImageView imageView = (ImageView) listImageView.findViewById(R.id.itemImage);
        imageView.setImageResource(currentImage != null ? currentImage.getImageResId() : 0);

        return listImageView;
    }
}