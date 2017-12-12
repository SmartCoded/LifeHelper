package com.ns.yc.lifehelper.ui.other.zhihu.contract;


import com.ns.yc.lifehelper.base.BasePresenter;
import com.ns.yc.lifehelper.base.BaseView;
import com.ns.yc.lifehelper.ui.other.zhihu.model.bean.ZhiHuCommentBean;

/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2017/12/1
 * 描    述：知乎评论
 * 修订历史：
 * ================================================
 */
public interface ZhiHuCommentContract {

    //View(activity/fragment)继承，需要实现的方法
    interface View extends BaseView {
        void showContent(ZhiHuCommentBean zhiHuCommentBean);
    }

    //Presenter控制器
    interface Presenter extends BasePresenter {
        void getCommentData(int id, int kind);
    }


}
