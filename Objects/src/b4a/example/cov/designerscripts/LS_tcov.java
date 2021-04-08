package b4a.example.cov.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_tcov{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("edittext1").vw.setLeft((int)((2d / 100 * width)));
views.get("edittext1").vw.setWidth((int)((65d / 100 * width) - ((2d / 100 * width))));
views.get("edittext1").vw.setTop((int)((18d / 100 * height)));
views.get("edittext1").vw.setHeight((int)((26d / 100 * height) - ((18d / 100 * height))));
views.get("button1").vw.setLeft((int)((70d / 100 * width)));
views.get("button1").vw.setWidth((int)((95d / 100 * width) - ((70d / 100 * width))));
views.get("button1").vw.setTop((int)((18d / 100 * height)));
views.get("button1").vw.setHeight((int)((26d / 100 * height) - ((18d / 100 * height))));
views.get("label1").vw.setLeft((int)((2d / 100 * width)));
views.get("label1").vw.setWidth((int)((65d / 100 * width) - ((2d / 100 * width))));
views.get("label1").vw.setTop((int)((31d / 100 * height)));
views.get("label1").vw.setHeight((int)((38d / 100 * height) - ((31d / 100 * height))));
views.get("label2").vw.setLeft((int)((67d / 100 * width)));
views.get("label2").vw.setWidth((int)((98d / 100 * width) - ((67d / 100 * width))));
views.get("label2").vw.setTop((int)((31d / 100 * height)));
views.get("label2").vw.setHeight((int)((38d / 100 * height) - ((31d / 100 * height))));
views.get("label3").vw.setLeft((int)((2d / 100 * width)));
views.get("label3").vw.setWidth((int)((65d / 100 * width) - ((2d / 100 * width))));
views.get("label3").vw.setTop((int)((40d / 100 * height)));
views.get("label3").vw.setHeight((int)((47d / 100 * height) - ((40d / 100 * height))));
views.get("label4").vw.setLeft((int)((67d / 100 * width)));
views.get("label4").vw.setWidth((int)((98d / 100 * width) - ((67d / 100 * width))));
views.get("label4").vw.setTop((int)((40d / 100 * height)));
views.get("label4").vw.setHeight((int)((47d / 100 * height) - ((40d / 100 * height))));
views.get("label5").vw.setLeft((int)((2d / 100 * width)));
views.get("label5").vw.setWidth((int)((65d / 100 * width) - ((2d / 100 * width))));
views.get("label5").vw.setTop((int)((49d / 100 * height)));
views.get("label5").vw.setHeight((int)((56d / 100 * height) - ((49d / 100 * height))));
views.get("label6").vw.setLeft((int)((67d / 100 * width)));
views.get("label6").vw.setWidth((int)((98d / 100 * width) - ((67d / 100 * width))));
//BA.debugLineNum = 29;BA.debugLine="Label6.SetTopAndBottom(49%y,56%y)"[tcov/General script]
views.get("label6").vw.setTop((int)((49d / 100 * height)));
views.get("label6").vw.setHeight((int)((56d / 100 * height) - ((49d / 100 * height))));
//BA.debugLineNum = 32;BA.debugLine="Label7.SetLeftAndRight(2%x,65%x)"[tcov/General script]
views.get("label7").vw.setLeft((int)((2d / 100 * width)));
views.get("label7").vw.setWidth((int)((65d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 33;BA.debugLine="Label7.SetTopAndBottom(58%y,65%y)"[tcov/General script]
views.get("label7").vw.setTop((int)((58d / 100 * height)));
views.get("label7").vw.setHeight((int)((65d / 100 * height) - ((58d / 100 * height))));
//BA.debugLineNum = 35;BA.debugLine="Label8.SetLeftAndRight(67%x,98%x)"[tcov/General script]
views.get("label8").vw.setLeft((int)((67d / 100 * width)));
views.get("label8").vw.setWidth((int)((98d / 100 * width) - ((67d / 100 * width))));
//BA.debugLineNum = 36;BA.debugLine="Label8.SetTopAndBottom(58%y,65%y)"[tcov/General script]
views.get("label8").vw.setTop((int)((58d / 100 * height)));
views.get("label8").vw.setHeight((int)((65d / 100 * height) - ((58d / 100 * height))));
//BA.debugLineNum = 39;BA.debugLine="Label9.SetLeftAndRight(2%x,65%x)"[tcov/General script]
views.get("label9").vw.setLeft((int)((2d / 100 * width)));
views.get("label9").vw.setWidth((int)((65d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 40;BA.debugLine="Label9.SetTopAndBottom(67%y,74%y)"[tcov/General script]
views.get("label9").vw.setTop((int)((67d / 100 * height)));
views.get("label9").vw.setHeight((int)((74d / 100 * height) - ((67d / 100 * height))));
//BA.debugLineNum = 42;BA.debugLine="Label10.SetLeftAndRight(67%x,98%x)"[tcov/General script]
views.get("label10").vw.setLeft((int)((67d / 100 * width)));
views.get("label10").vw.setWidth((int)((98d / 100 * width) - ((67d / 100 * width))));
//BA.debugLineNum = 43;BA.debugLine="Label10.SetTopAndBottom(67%y,74%y)"[tcov/General script]
views.get("label10").vw.setTop((int)((67d / 100 * height)));
views.get("label10").vw.setHeight((int)((74d / 100 * height) - ((67d / 100 * height))));
//BA.debugLineNum = 45;BA.debugLine="Label11.SetLeftAndRight(2%x,65%x)"[tcov/General script]
views.get("label11").vw.setLeft((int)((2d / 100 * width)));
views.get("label11").vw.setWidth((int)((65d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 46;BA.debugLine="Label11.SetTopAndBottom(76%y,83%y)"[tcov/General script]
views.get("label11").vw.setTop((int)((76d / 100 * height)));
views.get("label11").vw.setHeight((int)((83d / 100 * height) - ((76d / 100 * height))));
//BA.debugLineNum = 48;BA.debugLine="Label12.SetLeftAndRight(67%x,98%x)"[tcov/General script]
views.get("label12").vw.setLeft((int)((67d / 100 * width)));
views.get("label12").vw.setWidth((int)((98d / 100 * width) - ((67d / 100 * width))));
//BA.debugLineNum = 49;BA.debugLine="Label12.SetTopAndBottom(76%y,83%y)"[tcov/General script]
views.get("label12").vw.setTop((int)((76d / 100 * height)));
views.get("label12").vw.setHeight((int)((83d / 100 * height) - ((76d / 100 * height))));
//BA.debugLineNum = 51;BA.debugLine="Label13.SetLeftAndRight(2%x,65%x)"[tcov/General script]
views.get("label13").vw.setLeft((int)((2d / 100 * width)));
views.get("label13").vw.setWidth((int)((65d / 100 * width) - ((2d / 100 * width))));
//BA.debugLineNum = 52;BA.debugLine="Label13.SetTopAndBottom(85%y,92%y)"[tcov/General script]
views.get("label13").vw.setTop((int)((85d / 100 * height)));
views.get("label13").vw.setHeight((int)((92d / 100 * height) - ((85d / 100 * height))));
//BA.debugLineNum = 54;BA.debugLine="Label14.SetLeftAndRight(67%x,98%x)"[tcov/General script]
views.get("label14").vw.setLeft((int)((67d / 100 * width)));
views.get("label14").vw.setWidth((int)((98d / 100 * width) - ((67d / 100 * width))));
//BA.debugLineNum = 55;BA.debugLine="Label14.SetTopAndBottom(85%y,92%y)"[tcov/General script]
views.get("label14").vw.setTop((int)((85d / 100 * height)));
views.get("label14").vw.setHeight((int)((92d / 100 * height) - ((85d / 100 * height))));

}
}