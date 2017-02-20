package com.looklook.xinghongfei.looklook.presenter.implPresenter;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.looklook.xinghongfei.looklook.api.ApiManage;
import com.looklook.xinghongfei.looklook.bean.meizi.GankData;
import com.looklook.xinghongfei.looklook.presenter.IVedioPresenter;
import com.looklook.xinghongfei.looklook.presenter.implView.IVedioFragment;
import com.looklook.xinghongfei.looklook.util.CacheUtil;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by fengye on 2016/9/10.
 */
public class VedioPresenterImpol extends BasePresenterImpl implements IVedioPresenter {
    private IVedioFragment mVedioFragment;
    private CacheUtil mCacheUtil;
    private Gson gson = new Gson();

    public VedioPresenterImpol(Context context,IVedioFragment vedioFragment) {
       this. mVedioFragment = vedioFragment;
        mCacheUtil=CacheUtil.get(context);
    }

    @Override
    public void getVedioData(int t) {
        int year=t/10000;
        int mooth=(t-year*10000)/100;
        int day=t-year*10000-mooth*100;
        mVedioFragment.showProgressDialog();
        Log.i("TAG", "initlialView: "+year+"_"+mooth+"_"+day);
        Subscription subscription= ApiManage.getInstence().getGankService()
                .getGankData(year,mooth,day)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GankData>() {
                    @Override
                    public void onCompleted() {
                        Log.i("TAG", "onNext: "+"completed");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("TAG", "onNext: "+e);
                    }

                    @Override
                    public void onNext(GankData data) {
                        Log.i("TAG", "onNext: "+data.toString());
                      /*  mVedioFragment.hidProgressDialog();
                        mVedioFragment.updateVedioData(data.getResults());*/
                    }
                });
        addSubscription(subscription);
    }


}
