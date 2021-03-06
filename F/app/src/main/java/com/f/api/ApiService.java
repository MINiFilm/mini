package com.f.api;

import com.f.bean.ChoiceBean;
import com.f.bean.CommandBean;
import com.f.bean.DetailsBean;
import com.f.bean.FindBean;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dell-pc on 2017/12/13.
 */

public interface ApiService {

    /**
     *  首页  专题
     *   http://api.svipmovie.com/front/homePageApi/homePage.do
     */
    @GET("front/homePageApi/homePage.do")
    Flowable<ChoiceBean> getChoiceData();

    /**
     * 发现
     * http://api.svipmovie.com/front/columns/getVideoList.do?catalogId=402834815584e463015584e539330016&pnum=9
     */
    @GET("columns/getVideoList.do")
    Flowable<FindBean> getFindData(@Query("catalogId") String catalogId, @Query("pnum") String pnum);

    /**
     * 评论列表
     * http://api.svipmovie.com/front/Commentary/getCommentList.do?mediaId=CMCC_00000000000000001_621653189
     */
    @GET("Commentary/getCommentList.do")
    Flowable<CommandBean> getCommantData(@Query("mediaId") String mediaId);

    /**
     * 详情
     */
    @GET("videoDetailApi/videoDetail.do")
    Flowable<DetailsBean> getDetailsData(@Query("mediaId") String mediaId);

    /**
     * 搜索
     */
//    @GET("searchKeyWordApi/getVideoListByKeyWord.do")
//    Flowable<> getSearchData(@Query("keyword")String keyword,@Query("pnum") String pnum);

}
