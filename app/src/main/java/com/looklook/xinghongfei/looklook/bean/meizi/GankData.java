/*
 * Copyright (C) 2015 Drakeet <drakeet.me@gmail.com>
 *
 * This file is part of Meizhi
 *
 * Meizhi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Meizhi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Meizhi.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.looklook.xinghongfei.looklook.bean.meizi;

import java.util.List;

/**
 * Created by drakeet on 8/11/15.
 */
public class GankData extends BaseData {
    private ResultsBean results;
    /**
     * category : ["Android","前端","iOS","福利","休息视频"]
     * results : {"Android":[{"_id":"57d00af0421aa90d312ebefd","createdAt":"2016-09-07T20:41:20.725Z","desc":"渐变的下载按钮，发现不少小伙伴要做类似效果的","publishedAt":"2016-09-12T11:34:31.135Z","source":"web","type":"Android","url":"https://github.com/cctanfujun/ProgressRoundButton","used":true,"who":"谈釜君"},{"_id":"57d25a49421aa90d312ebf12","createdAt":"2016-09-09T14:44:25.906Z","desc":"阴影背景生成器，再也不用依赖CardView 了","publishedAt":"2016-09-12T11:34:31.135Z","source":"web","type":"Android","url":"http://inloop.github.io/shadow4android/","used":true,"who":"pcyan"},{"_id":"57d3b90d421aa90d3bea4a4b","createdAt":"2016-09-10T15:41:01.481Z","desc":"Android 代码高亮 View","publishedAt":"2016-09-12T11:34:31.135Z","source":"web","type":"Android","url":"https://github.com/Softwee/codeview-android","used":true,"who":"drakeet"},{"_id":"57d5de2c421aa9097d64b7a1","createdAt":"2016-09-12T06:43:56.6Z","desc":"Android 6.0 运行时权限管理最佳实践","publishedAt":"2016-09-12T11:34:31.135Z","source":"web","type":"Android","url":"http://blog.csdn.net/yanzhenjie1003/article/details/52503533","used":true,"who":"严振杰"},{"_id":"57d5ea17421aa909895ffa5e","createdAt":"2016-09-12T07:34:47.843Z","desc":"视差效果的 Item 滑动变大","publishedAt":"2016-09-12T11:34:31.135Z","source":"chrome","type":"Android","url":"https://github.com/iielse/RetailMeNotList","used":true,"who":"代码家"},{"_id":"57d5ea52421aa9098db8ee67","createdAt":"2016-09-12T07:35:46.446Z","desc":"Android 版本的 Day & Night Switcher！之前 Gank 发布过 iOS 版本的。","publishedAt":"2016-09-12T11:34:31.135Z","source":"chrome","type":"Android","url":"https://github.com/BaymaxTong/SwitchButton","used":true,"who":"代码家"}],"iOS":[{"_id":"57d50dcd421aa909815394e8","createdAt":"2016-09-11T15:54:53.65Z","desc":"iOS 输入智能提示","publishedAt":"2016-09-12T11:34:31.135Z","source":"chrome","type":"iOS","url":"https://github.com/EurekaCommunity/TokenRow","used":true,"who":"带马甲"},{"_id":"57d51226421aa909815394ef","createdAt":"2016-09-11T16:13:26.75Z","desc":"为 React 开发的动画引擎库","publishedAt":"2016-09-12T11:34:31.135Z","source":"chrome","type":"iOS","url":"https://github.com/stelatech/react-anime","used":true,"who":"daimajia"},{"_id":"57d5ee61421aa909895ffa61","createdAt":"2016-09-12T07:53:05.940Z","desc":"iOS Chat 聊天页面引擎","publishedAt":"2016-09-12T11:34:31.135Z","source":"chrome","type":"iOS","url":"https://github.com/eBay/NMessenger","used":true,"who":"奥卢比"}],"休息视频":[{"_id":"57d61b67421aa909815394f9","createdAt":"2016-09-12T11:05:11.184Z","desc":"性苦闷者的呐喊","publishedAt":"2016-09-12T11:34:31.135Z","source":"chrome","type":"休息视频","url":"http://v.youku.com/v_show/id_XMTcxODMzMjU2MA==.html?beta&","used":true,"who":"代码家"}],"前端":[{"_id":"57d37a25421aa90d312ebf16","createdAt":"2016-09-10T11:12:37.400Z","desc":"dva 1.0 - 基于 react 和 redux 的轻量级框架","publishedAt":"2016-09-12T11:34:31.135Z","source":"web","type":"前端","url":"https://github.com/sorrycc/blog/issues/10","used":true,"who":"chencheng (云谦)"}],"福利":[{"_id":"57d5ed65421aa909895ffa5f","createdAt":"2016-09-12T07:48:53.693Z","desc":"9 - 12","publishedAt":"2016-09-12T11:34:31.135Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f7qgschtz8j20hs0hsac7.jpg","used":true,"who":"代码家"}]}
     */

    private List<String> category;

    public ResultsBean getResults() {
        return results;
    }

    public void setResults(ResultsBean results) {
        this.results = results;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public static class ResultsBean {
        /**
         * _id : 57d00af0421aa90d312ebefd
         * createdAt : 2016-09-07T20:41:20.725Z
         * desc : 渐变的下载按钮，发现不少小伙伴要做类似效果的
         * publishedAt : 2016-09-12T11:34:31.135Z
         * source : web
         * type : Android
         * url : https://github.com/cctanfujun/ProgressRoundButton
         * used : true
         * who : 谈釜君
         */

        private List<AndroidBean> Android;
        /**
         * _id : 57d50dcd421aa909815394e8
         * createdAt : 2016-09-11T15:54:53.65Z
         * desc : iOS 输入智能提示
         * publishedAt : 2016-09-12T11:34:31.135Z
         * source : chrome
         * type : iOS
         * url : https://github.com/EurekaCommunity/TokenRow
         * used : true
         * who : 带马甲
         */

        private List<IOSBean> iOS;
        /**
         * _id : 57d61b67421aa909815394f9
         * createdAt : 2016-09-12T11:05:11.184Z
         * desc : 性苦闷者的呐喊
         * publishedAt : 2016-09-12T11:34:31.135Z
         * source : chrome
         * type : 休息视频
         * url : http://v.youku.com/v_show/id_XMTcxODMzMjU2MA==.html?beta&
         * used : true
         * who : 代码家
         */

        private List<休息视频Bean> 休息视频;
        /**
         * _id : 57d37a25421aa90d312ebf16
         * createdAt : 2016-09-10T11:12:37.400Z
         * desc : dva 1.0 - 基于 react 和 redux 的轻量级框架
         * publishedAt : 2016-09-12T11:34:31.135Z
         * source : web
         * type : 前端
         * url : https://github.com/sorrycc/blog/issues/10
         * used : true
         * who : chencheng (云谦)
         */

        private List<前端Bean> 前端;
        /**
         * _id : 57d5ed65421aa909895ffa5f
         * createdAt : 2016-09-12T07:48:53.693Z
         * desc : 9 - 12
         * publishedAt : 2016-09-12T11:34:31.135Z
         * source : chrome
         * type : 福利
         * url : http://ww1.sinaimg.cn/large/610dc034jw1f7qgschtz8j20hs0hsac7.jpg
         * used : true
         * who : 代码家
         */

        private List<福利Bean> 福利;

        public List<AndroidBean> getAndroid() {
            return Android;
        }

        public void setAndroid(List<AndroidBean> Android) {
            this.Android = Android;
        }

        public List<IOSBean> getIOS() {
            return iOS;
        }

        public void setIOS(List<IOSBean> iOS) {
            this.iOS = iOS;
        }

        public List<休息视频Bean> get休息视频() {
            return 休息视频;
        }

        public void set休息视频(List<休息视频Bean> 休息视频) {
            this.休息视频 = 休息视频;
        }

        public List<前端Bean> get前端() {
            return 前端;
        }

        public void set前端(List<前端Bean> 前端) {
            this.前端 = 前端;
        }

        public List<福利Bean> get福利() {
            return 福利;
        }

        public void set福利(List<福利Bean> 福利) {
            this.福利 = 福利;
        }

        public static class AndroidBean {
            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }

        public static class IOSBean {
            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }

        public static class 休息视频Bean {
            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }

        public static class 前端Bean {
            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }

        public static class 福利Bean {
            private String _id;
            private String createdAt;
            private String desc;
            private String publishedAt;
            private String source;
            private String type;
            private String url;
            private boolean used;
            private String who;

            public String get_id() {
                return _id;
            }

            public void set_id(String _id) {
                this._id = _id;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getPublishedAt() {
                return publishedAt;
            }

            public void setPublishedAt(String publishedAt) {
                this.publishedAt = publishedAt;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public boolean isUsed() {
                return used;
            }

            public void setUsed(boolean used) {
                this.used = used;
            }

            public String getWho() {
                return who;
            }

            public void setWho(String who) {
                this.who = who;
            }
        }
    }

    /*public Result results;
    public List<String> category;

    public class Result {
        @SerializedName("Android") public ArrayList<Gank> androidList;
        @SerializedName("休息视频") public List<Gank> 休息视频List;
        @SerializedName("iOS") public List<Gank> iOSList;
        @SerializedName("福利") public List<Gank> 妹纸List;
        @SerializedName("拓展资源") public List<Gank> 拓展资源List;
        @SerializedName("瞎推荐") public List<Gank> 瞎推荐List;
        @SerializedName("App") public List<Gank> appList;
    }*/


}
