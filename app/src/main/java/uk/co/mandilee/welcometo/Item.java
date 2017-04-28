package uk.co.mandilee.welcometo;

public class Item {

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mTypeResId;
    private int mNameResId;
    private int mDescriptionResId;
    private int mImageResId = NO_IMAGE_PROVIDED;

    public Item(int typeResId, int nameResId, int descriptionResId, int imageResId) {
        mNameResId = nameResId;
        mTypeResId = typeResId;
        mDescriptionResId = descriptionResId;
        mImageResId = imageResId;
    }

    public int getNameResId() {
        return mNameResId;
    }

    public int getTypeResId() {
        return mTypeResId;
    }

    public int getDescriptionResId() {
        return mDescriptionResId;
    }

    public int getImageResId() {
        return mImageResId;
    }

    public boolean hasImage() {
        return mImageResId != NO_IMAGE_PROVIDED;
    }

}