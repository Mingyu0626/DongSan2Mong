package com.example.dongsan2mong.api

import retrofit2.Call
import retrofit2.http.*


interface RetrofitService {

    //Member
    @GET("member/{memberId}")
    fun getMemberInfo(@Path("memberId") number: Int): Call<memberInfo>

    @POST("member")
    fun addMemberInfo()

    @PUT("member/{memberId}")
    fun modifyMemberInfo()


    //Region


    //WishList
    @GET("wishList/recentHome/{memberId}")
    fun getRecentHomeList(@Path("memberId") number: Int): Call<ResponseData>

    @GET("wishList/zzimHome/{memberId}")
    fun getZzimHomeList(@Path("memberId") number: Int): Call<ResponseData>


    //RealEstateDetail
    @GET("RealEstateDetail/{RealEstate_id}")
    fun getRealEstateDetail(@Path("RealEstate_id") number: Int): Call<ResponseData>


    //RealEstate
    @GET("RealEstate/{RealEstate_id}")
    fun getRealEstate(@Path("RealEstate_id") number: Int): Call<ResponseData>


    //SearchPreset
    @GET("preset/find/{member_id}")
    fun getPresetList(@Path("member_id") number: Int): Call<ResponseData>

    @GET("preset/find/{member_id}/{preset_id}")
    fun getPreset(
        @Path("member_id") number: Int,
        @Path("preset_id") presetId: Int
    ): Call<ResponseData>


    //Map


    // Example
    /*@POST("user/register")
    fun postUser(@Body params: HashMap<String, String>): Call<UserInfo>

    @GET("user/initNang/{userNo}")
    fun getNang(@Path("userNo") number: Int): Call<ResponseBody>

    @GET("dialog/open/{userNo}")
    fun getOpening(@Path("userNo") number: Int): Call<ResponseBody>

    @GET("dialog/isCreate/{userNo}")
    fun getOK(@Path("userNo") number: Int): Call<ResponseBody>*/
}