package b4a.example.cov.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_main{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[main/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 5;BA.debugLine="Label7.SetLeftAndRight(4%x,30%x)"[main/General script]
views.get("label7").vw.setLeft((int)((4d / 100 * width)));
views.get("label7").vw.setWidth((int)((30d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 6;BA.debugLine="Label7.SetTopAndBottom(10%y,25%y)"[main/General script]
views.get("label7").vw.setTop((int)((10d / 100 * height)));
views.get("label7").vw.setHeight((int)((25d / 100 * height) - ((10d / 100 * height))));
//BA.debugLineNum = 7;BA.debugLine="Label7.TextSize = 18"[main/General script]
((anywheresoftware.b4a.keywords.LayoutBuilder.DesignerTextSizeMethod)views.get("label7").vw).setTextSize((float)(18d));
//BA.debugLineNum = 8;BA.debugLine="lblSource.TextSize = 17"[main/General script]
((anywheresoftware.b4a.keywords.LayoutBuilder.DesignerTextSizeMethod)views.get("lblsource").vw).setTextSize((float)(17d));
//BA.debugLineNum = 9;BA.debugLine="lblSource.SetLeftAndRight(32%x,95%x)"[main/General script]
views.get("lblsource").vw.setLeft((int)((32d / 100 * width)));
views.get("lblsource").vw.setWidth((int)((95d / 100 * width) - ((32d / 100 * width))));
//BA.debugLineNum = 10;BA.debugLine="lblSource.SetTopAndBottom(8%y,29%y)"[main/General script]
views.get("lblsource").vw.setTop((int)((8d / 100 * height)));
views.get("lblsource").vw.setHeight((int)((29d / 100 * height) - ((8d / 100 * height))));
//BA.debugLineNum = 15;BA.debugLine="Button1.SetLeftAndRight(4%x,96%x)"[main/General script]
views.get("button1").vw.setLeft((int)((4d / 100 * width)));
views.get("button1").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 16;BA.debugLine="Button1.SetTopAndBottom(30%y,40%y)"[main/General script]
views.get("button1").vw.setTop((int)((30d / 100 * height)));
views.get("button1").vw.setHeight((int)((40d / 100 * height) - ((30d / 100 * height))));
//BA.debugLineNum = 19;BA.debugLine="Button2.SetLeftAndRight(4%x,96%x)"[main/General script]
views.get("button2").vw.setLeft((int)((4d / 100 * width)));
views.get("button2").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 20;BA.debugLine="Button2.SetTopAndBottom(43%y,53%y)"[main/General script]
views.get("button2").vw.setTop((int)((43d / 100 * height)));
views.get("button2").vw.setHeight((int)((53d / 100 * height) - ((43d / 100 * height))));
//BA.debugLineNum = 22;BA.debugLine="Button3.SetLeftAndRight(4%x,96%x)"[main/General script]
views.get("button3").vw.setLeft((int)((4d / 100 * width)));
views.get("button3").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 23;BA.debugLine="Button3.SetTopAndBottom(56%y,66%y)"[main/General script]
views.get("button3").vw.setTop((int)((56d / 100 * height)));
views.get("button3").vw.setHeight((int)((66d / 100 * height) - ((56d / 100 * height))));
//BA.debugLineNum = 25;BA.debugLine="Button4.SetLeftAndRight(4%x,96%x)"[main/General script]
views.get("button4").vw.setLeft((int)((4d / 100 * width)));
views.get("button4").vw.setWidth((int)((96d / 100 * width) - ((4d / 100 * width))));
//BA.debugLineNum = 26;BA.debugLine="Button4.SetTopAndBottom(69%y,79%y)"[main/General script]
views.get("button4").vw.setTop((int)((69d / 100 * height)));
views.get("button4").vw.setHeight((int)((79d / 100 * height) - ((69d / 100 * height))));
//BA.debugLineNum = 29;BA.debugLine="ImageView1.SetLeftAndRight(0%x,100%x)"[main/General script]
views.get("imageview1").vw.setLeft((int)((0d / 100 * width)));
views.get("imageview1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 30;BA.debugLine="ImageView1.SetTopAndBottom(87%y,98%y)"[main/General script]
views.get("imageview1").vw.setTop((int)((87d / 100 * height)));
views.get("imageview1").vw.setHeight((int)((98d / 100 * height) - ((87d / 100 * height))));

}
}