package com.original.dingke.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.original.dingke.R;
import com.original.dingke.adapter.DetailFragmentAdapter;
import com.original.dingke.app.App;
import com.original.dingke.widget.ListenableListView;

import butterknife.ButterKnife;

/**
 * Created by zengjinlong on 15-11-2.
 */
public class DetailFragmentIntro extends DetailBaseFragment {

    private View mView;
    private View mContentView;
    private static boolean mIsFirstCreate = true;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.list_layout, container, false);
        ButterKnife.bind(this, mView);

        mListView = (ListenableListView) mView.findViewById(R.id.list);
        mContentView = inflater.inflate(R.layout.detail_intro_layout, null);
        mContentView.setMinimumHeight(App.sScreenHeight);
        DetailFragmentAdapter adapter = new DetailFragmentAdapter(mActivity);
        adapter.addView(mContentView);
        mListView.initHeaderAndFooterView();
        mListView.setAdapter(adapter);
        if (mIsFirstCreate) {
            mListView.setScrollListener(mListScrollListener);
        }
        return mView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }


}
