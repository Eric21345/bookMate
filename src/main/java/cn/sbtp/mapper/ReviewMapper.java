package cn.sbtp.mapper;


import cn.sbtp.model.Review;

import java.util.List;

public interface ReviewMapper {

    //获取评论列表
    List<Review> getReviewListByBookId();
    //获取该用户的所有评论
    List<Review> getReviewListByUserId();
}
