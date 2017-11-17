
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import com.youtu.*;

public class Demo {

	// appid, secretid secretkey请到http://open.youtu.qq.com/获取
	// 请正确填写把下面的APP_ID、SECRET_ID和SECRET_KEY
	public static final String APP_ID = "10084856";
	public static final String SECRET_ID = "AKIDpkn8Z4o2FQRH0n5xITTIxTq471kHv5KT";
	public static final String SECRET_KEY = "KKShwFXklbR8g2HNODrJZvMlz2ubLGmF";
	public static final String USER_ID = "";

	public static void main(String[] args) {

		try {
			Youtu faceYoutu = new Youtu(APP_ID, SECRET_ID, SECRET_KEY,Youtu.API_YOUTU_END_POINT,USER_ID);
			JSONObject respose;
//			respose= faceYoutu.FaceCompareUrl("http://open.youtu.qq.com/content/img/slide-1.jpg","http://open.youtu.qq.com/content/img/slide-1.jpg");
//			respose = faceYoutu.DetectFace("D:\\Workspaces\\MyEclipse2014\\java_sdk-master\\test.jpg",1);
			respose = faceYoutu.GetGroupIds();
//			List<String> groupids = new ArrayList<String>();
//			groupids.add("111111");
					
//			respose = faceYoutu.NewPerson("D:\\Workspaces\\MyEclipse2014\\java_sdk-master\\test.jpg", "1232", groupids);
			//{"session_id":"","person_id":"1232","group_ids":["111111"],"errormsg":"OK","face_id":"2102554403583070589","suc_group":1,"errorcode":0,"suc_face":1}

			//get respose
			System.out.println(respose);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
