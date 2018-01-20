package ua.com.v4vlviv.carmanager.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import ua.com.v4vlviv.carmanager.fragment.BdayFragment;
import ua.com.v4vlviv.carmanager.fragment.HistoryFragment;
import ua.com.v4vlviv.carmanager.fragment.IdeasFragment;
import ua.com.v4vlviv.carmanager.fragment.TodoFragment;
import ua.com.v4vlviv.carmanager.fragment.AbstractTabFragment;

/**
 * Created by Evey on 28.07.2017.
 */

public class TabsFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer, AbstractTabFragment> tabs;
    private Context contex;

    public TabsFragmentAdapter(Context context, FragmentManager fm)
    {
        super(fm);
        this.contex = context;
        initTabsMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }



    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BdayFragment.getInstance(context));
    }
}
