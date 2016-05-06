package com.yhy.retrofit;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * preference读写工具
 * 
 */
public class PreferencesUtils {


    public static final String LATITUDE  = "latitude";
    public static final String LONGITUDE  = "longitude";

    public static final String IS_SHOW_UPDATE_DIALOG  = "is_show_update_dialog";
    public static final String IS_NEED_UPDATE  = "is_need_update";


    public static final String FORM_BORN_AT = "format_born_at";
    public static final String PREFERENCES_NAME = "info";
	public static final String NEAREST_PLACE = "nearest_place";
	public static final String FIRST_LAT = "first_lat";
	public static final String FIRST_LON = "first_lon";


	public static final String LOCA_PROVINCE = "loca_province";
	public static final String LOCA_CITY = "loca_city";
	public static final String LOCA_DISTRI = "loca_distri";
	public static final String USER_SHIPPING_ADDRESSID = "userShippingAddressId";

	public static final String USER_SHIPPING_NAME = "userShippingName";
	public static final String USER_SHIPPING_MOBILE = "userShippingAddressMobile";
	public static final String USER_SHIPPING_ADDRESS = "userShippingAddress";
	public static final String USER_SHIPPING_ADDRESS_DET = "userShippingAddressDet";
	public static final String HTML_CONTENT = "html_content";
	public static final String CREAT_GUIDE = "creat_guide";
	public static final String TV_NEW = "tv_new";

	public static String getPreferences(Context context, String name){

		SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
		return preferences.getString(name, "");
	}
	public static void setPreferences(Context context, String name, String value){
		if(context!=null&&value!=null){
			Editor sharedata = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE).edit();
			sharedata.putString(name, value);
			sharedata.commit();
		}
	}


	public static int getIntPreferences(Context context, String name){
		SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
		return preferences.getInt(name, 0);
	}
	public static void setIntPreferences(Context context, String name, int value){
		Editor sharedata = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE).edit();
		sharedata.putInt(name, value);
		sharedata.commit();
	}
	public static boolean getBooleanPreferences(Context context, String name){
		 if(context==null){
             return false;
         }
		SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
		return preferences.getBoolean(name, false);
	}
	public static void setBooleanPreferences(Context context, String name, boolean value){
	 if(context!=null){
			Editor sharedata = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE).edit();
			sharedata.putBoolean(name, value);
			sharedata.commit();
	 }
	
	}
	
	public static long getLongPreferences(Context context, String name){
		SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
		return preferences.getLong(name, 0L);
	}
	public static void setLongPreferences(Context context, String name, long value){
		Editor sharedata = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE).edit();
		sharedata.putLong(name, value);
		sharedata.commit();
	}
	//清空数据
	public static void reset(Context context){
		Editor sharedata = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE).edit();
		sharedata.clear().commit();
	}
}
