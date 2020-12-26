package com.hubuandroid.androidpaper.adapters;
import android.view.View;
import android.view.ViewGroup;

import com.sunofbeaches.recyclerviewtest.R;
import com.sunofbeaches.recyclerviewtest.beans.ItemBean;

import java.util.List;
public class StaggerAdapter extends RecyclerViewBaseAdapter {

    public StaggerAdapter(List<ItemBean> data) {
        super(data);
    }

    @Override
    protected View getSubView(ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.item_stagger, null);
        return view;
    }
}
