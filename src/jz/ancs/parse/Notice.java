package jz.ancs.parse;
/**
 * a notice from iPhone ANCS<br>
 * */
public class Notice {
	/** the unique identifier (UID) for the iOS notification
	 */
	public int uid;
	/** title for the iOS notification*/
	public String title;
	/** subtitle  for the iOS notification*/
	public String subtitle;
	/** message(content) for the iOS notification*/
	public String message;
	/** size (how many byte) of message*/
	public String messageSize;
	/** the time  for the iOS notification */
	public String date;
	public Notice(){}
	public Notice(String t, String s, String m, String ms, String d) {
		title = t;
		subtitle = s;
		message = m;
		messageSize = ms;
		date = d;
	}

	boolean isAllInit(){
		return title != null && subtitle != null && message != null
				&& messageSize != null && date != null;
	}
	
	static void log(String s){
//		android.util.Log.i("sw2df",s);
	} 
	static void logw(String s){
		android.util.Log.w("sw2df",s);
	} 
	static void loge(String s){
		android.util.Log.e("sw2df",s);
	} 
}