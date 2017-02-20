package com.looklook.xinghongfei.looklook.presenter.implView;

import com.looklook.xinghongfei.looklook.bean.meizi.Gank;
import com.looklook.xinghongfei.looklook.bean.meizi.Meizi;

import java.util.ArrayList;

/**
 * Created by xinghongfei on 16/8/20.
 */
public interface IMeiziFragment extends IBaseFragment {
     void updateMeiziData(ArrayList<Meizi> list);//更新妹子图片
     void updateVedioData(ArrayList<Gank> list);
}
