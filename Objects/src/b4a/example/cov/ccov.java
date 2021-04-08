package b4a.example.cov;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class ccov extends Activity implements B4AActivity{
	public static ccov mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example.cov", "b4a.example.cov.ccov");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (ccov).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example.cov", "b4a.example.cov.ccov");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.cov.ccov", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (ccov) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (ccov) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return ccov.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (ccov) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            ccov mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (ccov) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label10 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label12 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label14 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1 = null;
public giuseppe.salvi.icos.library.TTs _tts = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.cov.main _main = null;
public b4a.example.cov.starter _starter = null;
public b4a.example.cov.wcov _wcov = null;
public b4a.example.cov.intro _intro = null;
public b4a.example.cov.ranking _ranking = null;
public b4a.example.cov.dohmap _dohmap = null;
public b4a.example.cov.httputils2service _httputils2service = null;
public b4a.example.cov.b4xcollections _b4xcollections = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"tcov\")";
mostCurrent._activity.LoadLayout("tcov",mostCurrent.activityBA);
 //BA.debugLineNum = 26;BA.debugLine="tts.InitializeTTs(\"tts\")";
mostCurrent._tts.InitializeTTs(mostCurrent.activityBA,"tts");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub Button1_Click";
 //BA.debugLineNum = 91;BA.debugLine="ProgressDialogShow2(\"waiting...\",False)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("waiting..."),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 92;BA.debugLine="covid";
_covid();
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public static void  _covid() throws Exception{
ResumableSub_covid rsub = new ResumableSub_covid(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_covid extends BA.ResumableSub {
public ResumableSub_covid(b4a.example.cov.ccov parent) {
this.parent = parent;
}
b4a.example.cov.ccov parent;
b4a.example.cov.httpjob _cov1 = null;
float _pp = 0f;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _cases = 0;
int _active = 0;
int _deaths = 0;
int _todaycases = 0;
int _todaydeaths = 0;
int _recovered = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 44;BA.debugLine="Dim cov1 As HttpJob";
_cov1 = new b4a.example.cov.httpjob();
 //BA.debugLineNum = 45;BA.debugLine="Dim pp As Float";
_pp = 0f;
 //BA.debugLineNum = 46;BA.debugLine="cov1.Initialize(\"GetAddress\", Me)";
_cov1._initialize /*String*/ (processBA,"GetAddress",ccov.getObject());
 //BA.debugLineNum = 47;BA.debugLine="cov1.Download(\"https://coronavirus-19-api.herokua";
_cov1._download /*String*/ ("https://coronavirus-19-api.herokuapp.com/countries/"+parent.mostCurrent._edittext1.getText());
 //BA.debugLineNum = 48;BA.debugLine="Wait For (cov1) JobDone(cov1 As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_cov1));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_cov1 = (b4a.example.cov.httpjob) result[0];
;
 //BA.debugLineNum = 49;BA.debugLine="If cov1.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_cov1._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 50;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 51;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 52;BA.debugLine="parser.Initialize(cov1.GetString)";
_parser.Initialize(_cov1._getstring /*String*/ ());
 //BA.debugLineNum = 53;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
 //BA.debugLineNum = 56;BA.debugLine="Dim cases As Int = root.Get(\"cases\")";
_cases = (int)(BA.ObjectToNumber(_root.Get((Object)("cases"))));
 //BA.debugLineNum = 58;BA.debugLine="Dim active As Int = root.Get(\"active\")";
_active = (int)(BA.ObjectToNumber(_root.Get((Object)("active"))));
 //BA.debugLineNum = 60;BA.debugLine="Dim deaths As Int = root.Get(\"deaths\")";
_deaths = (int)(BA.ObjectToNumber(_root.Get((Object)("deaths"))));
 //BA.debugLineNum = 61;BA.debugLine="Dim todayCases As Int = root.Get(\"todayCases\")";
_todaycases = (int)(BA.ObjectToNumber(_root.Get((Object)("todayCases"))));
 //BA.debugLineNum = 62;BA.debugLine="Dim todayDeaths As Int = root.Get(\"todayDeaths\")";
_todaydeaths = (int)(BA.ObjectToNumber(_root.Get((Object)("todayDeaths"))));
 //BA.debugLineNum = 63;BA.debugLine="Dim recovered As Int = root.Get(\"recovered\")";
_recovered = (int)(BA.ObjectToNumber(_root.Get((Object)("recovered"))));
 //BA.debugLineNum = 66;BA.debugLine="Label2.Text=cases";
parent.mostCurrent._label2.setText(BA.ObjectToCharSequence(_cases));
 //BA.debugLineNum = 67;BA.debugLine="label4.Text=todayCases";
parent.mostCurrent._label4.setText(BA.ObjectToCharSequence(_todaycases));
 //BA.debugLineNum = 68;BA.debugLine="label6.Text=deaths";
parent.mostCurrent._label6.setText(BA.ObjectToCharSequence(_deaths));
 //BA.debugLineNum = 69;BA.debugLine="label8.Text=todayDeaths";
parent.mostCurrent._label8.setText(BA.ObjectToCharSequence(_todaydeaths));
 //BA.debugLineNum = 70;BA.debugLine="label10.Text=active";
parent.mostCurrent._label10.setText(BA.ObjectToCharSequence(_active));
 //BA.debugLineNum = 71;BA.debugLine="label12.text = recovered";
parent.mostCurrent._label12.setText(BA.ObjectToCharSequence(_recovered));
 //BA.debugLineNum = 73;BA.debugLine="pp = (deaths/cases) * 100";
_pp = (float) ((_deaths/(double)_cases)*100);
 //BA.debugLineNum = 74;BA.debugLine="label14.Text = NumberFormat(pp,0,2) &\"%\"";
parent.mostCurrent._label14.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat(_pp,(int) (0),(int) (2))+"%"));
 //BA.debugLineNum = 76;BA.debugLine="tts.Speaking = \"total number of cases in the \" &";
parent.mostCurrent._tts.setSpeaking("total number of cases in the "+parent.mostCurrent._edittext1.getText()+" are "+BA.NumberToString(_cases));
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 80;BA.debugLine="cov1.Release";
_cov1._release /*String*/ ();
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(b4a.example.cov.httpjob _cov1) throws Exception{
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private Button1 As Button";
mostCurrent._button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private Label2,label4,label6,label8,label10,label";
mostCurrent._label2 = new anywheresoftware.b4a.objects.LabelWrapper();
mostCurrent._label4 = new anywheresoftware.b4a.objects.LabelWrapper();
mostCurrent._label6 = new anywheresoftware.b4a.objects.LabelWrapper();
mostCurrent._label8 = new anywheresoftware.b4a.objects.LabelWrapper();
mostCurrent._label10 = new anywheresoftware.b4a.objects.LabelWrapper();
mostCurrent._label12 = new anywheresoftware.b4a.objects.LabelWrapper();
mostCurrent._label14 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private EditText1 As EditText";
mostCurrent._edittext1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim tts As ICOSTextToSpeech";
mostCurrent._tts = new giuseppe.salvi.icos.library.TTs();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
}
