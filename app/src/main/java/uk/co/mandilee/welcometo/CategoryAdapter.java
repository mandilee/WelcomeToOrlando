package uk.co.mandilee.welcometo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurantsFragment();
        } else if (position == 1) {
            return new ThemeparksFragment();
        } else if (position == 2) {
            return new ShoppingFragment();
        } else {
            return new ExperiencesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.item_restaurants_short);
        } else if (position == 1) {
            return mContext.getString(R.string.item_themepark_short);
        } else if (position == 2) {
            return mContext.getString(R.string.item_shopping_short);
        } else {
            return mContext.getString(R.string.item_experiences_short);
        }
    }
}
