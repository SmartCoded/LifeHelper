package com.ns.yc.lifehelper.ui.other.vtex.view.adapter;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.ns.yc.lifehelper.R;
import com.ns.yc.lifehelper.ui.other.vtex.model.bean.TopicListBean;
import com.ns.yc.lifehelper.utils.ImageUtils;

public class WTexPagerAdapter extends RecyclerArrayAdapter<TopicListBean> {

    public WTexPagerAdapter(Activity activity) {
        super(activity);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new ExpressDeliveryViewHolder(parent);
    }

    private class ExpressDeliveryViewHolder extends BaseViewHolder<TopicListBean> {

        ImageView iv_topic_face;
        TextView tv_topic_name , tv_topic_tips ,tv_topic_comment , tv_topic_node ,tv_topic_title;

        ExpressDeliveryViewHolder(ViewGroup parent) {
            super(parent, R.layout.item_wtex_news);
            iv_topic_face = $(R.id.iv_topic_face);
            tv_topic_name = $(R.id.tv_topic_name);
            tv_topic_tips = $(R.id.tv_topic_tips);
            tv_topic_comment = $(R.id.tv_topic_comment);
            tv_topic_node = $(R.id.tv_topic_node);
            tv_topic_title = $(R.id.tv_topic_title);
        }

        @Override
        public void setData(TopicListBean data) {
            super.setData(data);
            ImageUtils.loadImgByPicasso(getContext(),data.getImgUrl(),R.drawable.image_default,iv_topic_face);
            tv_topic_name.setText(data.getName());
            tv_topic_tips.setText(data.getUpdateTime() + " • 最后回复 " + data.getLastUser());
            tv_topic_comment.setText(String.valueOf(data.getCommentNum()));
            tv_topic_node.setText(data.getNode());
            tv_topic_title.setText(data.getTitle());
        }
    }
}
