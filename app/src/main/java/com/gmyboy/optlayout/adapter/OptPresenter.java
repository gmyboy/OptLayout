package com.gmyboy.optlayout.adapter;

import java.util.EnumSet;

/**
 * Created by GMY on 2016/3/17 16:06.
 * Contact me via email igmyboy@gmail.com.
 */
public interface OptPresenter {
    public enum UpdateFlags {
        NO_IMAGE
    }

    public enum Action {
        REPLY,
        RETWEET,
        FAVOURITE
    }

    public void update(Tweet tweet, EnumSet<UpdateFlags> flags);
}
