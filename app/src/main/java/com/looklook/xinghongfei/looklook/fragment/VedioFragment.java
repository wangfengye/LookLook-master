package com.looklook.xinghongfei.looklook.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.looklook.xinghongfei.looklook.R;
import com.looklook.xinghongfei.looklook.adapter.VedioAdapter;
import com.looklook.xinghongfei.looklook.api.ApiManage;
import com.looklook.xinghongfei.looklook.bean.meizi.Meizi;
import com.looklook.xinghongfei.looklook.bean.meizi.MeiziData;
import com.looklook.xinghongfei.looklook.presenter.implPresenter.VedioPresenterImpol;
import com.looklook.xinghongfei.looklook.presenter.implView.IVedioFragment;

import java.util.ArrayList;
import java.util.Calendar;

import butterknife.ButterKnife;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by fengye on 2016/9/12.
 */
public class VedioFragment extends BaseFragment implements IVedioFragment {


    private VedioPresenterImpol presenter;
    private VedioAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vedio_fragment, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
       // initilalDate();
        //initlialView();
        Button btn= (Button) view.findViewById(R.id.get);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApiManage.getInstence().getGankService().getMeizhiData(1)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Observer<MeiziData>() {
                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {
                                Log.i("meiziImp", "onError: ");
                            }

                            @Override
                            public void onNext(MeiziData meiziData) {
                                Log.i("meiziImp", "onNext: "+meiziData.getResults().get(1).getDesc());
                            }
                        });
            }
        });
        super.onViewCreated(view, savedInstanceState);
    }

    private void initlialView() {
         adapter=new VedioAdapter(getContext());
       /* mVedioRecyclcler.setLayoutManager(new LinearLayoutManager(getContext()));
        mVedioRecyclcler.setAdapter(adapter);
        mVedioRecyclcler.setItemAnimator(new DefaultItemAnimator());*/

        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH)+1;
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        int t=year*10000+month*100+day;
        Log.i("TAG", "initlialView: "+t);
        presenter.getVedioData(t);
    }

    private void initilalDate() {
        presenter = new VedioPresenterImpol(getContext(), this);
    }

    @Override
    public void updateVedioData(ArrayList<Meizi> list) {
        Meizi m=new Meizi();
        m.setDesc("eee");
        list.add(m);
        Log.i("TAG", "updateVedioData: "+list.size());
         adapter.addItems(list);
    }

    @Override
    public void showProgressDialog() {

    }

    @Override
    public void hidProgressDialog() {

    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
