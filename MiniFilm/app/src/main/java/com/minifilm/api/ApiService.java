package com.minifilm.api;

import com.minifilm.bean.ChoiceBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dell-pc on 2017/12/13.
 */

public interface ApiService {

    /**
     *  首页
     */
    @GET("front/homePageApi/homePage.do")
    Flowable<ChoiceBean> getChoiceData();

    /**
     * 频道列表
     */
    @GET("columns/getVideoList.do")
    Flowable<> getPinDaoData(@Query("catalogId")String catalogId,@Query("pnum")String pnum);

}
