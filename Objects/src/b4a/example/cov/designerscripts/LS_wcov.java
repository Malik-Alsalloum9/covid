package b4a.example.cov.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_wcov{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
((anywheresoftware.b4a.keywords.LayoutBuilder.DesignerTextSizeMethod)views.get("lblsource1").vw).setTextSize((float)(18d));
((anywheresoftware.b4a.keywords.LayoutBuilder.DesignerTextSizeMethod)views.get("lblsource").vw).setTextSize((float)(17d));
views.get("lblsource1").vw.setLeft((int)((4d / 100 * width)));
views.get("lblsource1").vw.setWidth((int)((30d / 100 * width) - ((4d / 100 * width))));
views.get("lblsource1").vw.setTop((int)((10d / 100 * height)));
views.get("lblsource1").vw.setHeight((int)((25d / 100 * height) - ((10d / 100 * height))));
views.get("lblsource").vw.setLeft((int)((32d / 100 * width)));
views.get("lblsource").vw.setWidth((int)((95d / 100 * width) - ((32d / 100 * width))));
views.get("lblsource").vw.setTop((int)((9d / 100 * height)));
views.get("lblsource").vw.setHeight((int)((30d / 100 * height) - ((9d / 100 * height))));
views.get("label1").vw.setLeft((int)((2d / 100 * width)));
views.get("label1").vw.setWidth((int)((65d / 100 * width) - ((2d / 100 * width))));
views.get("label1").vw.setTop((int)((35d / 100 * height)));
views.get("label1").vw.setHeight((int)((45d / 100 * height) - ((35d / 100 * height))));
views.get("label2").vw.setLeft((int)((67d / 100 * width)));
views.get("label2").vw.setWidth((int)((98d / 100 * width) - ((67d / 100 * width))));
views.get("label2").vw.setTop((int)((35d / 100 * height)));
views.get("label2").vw.setHeight((int)((45d / 100 * height) - ((35d / 100 * height))));
views.get("label3").vw.setLeft((int)((2d / 100 * width)));
views.get("label3").vw.setWidth((int)((65d / 100 * width) - ((2d / 100 * width))));
views.get("label3").vw.setTop((int)((48d / 100 * height)));
views.get("label3").vw.setHeight((int)((58d / 100 * height) - ((48d / 100 * height))));
views.get("label4").vw.setLeft((int)((67d / 100 * width)));
views.get("label4").vw.setWidth((int)((98d / 100 * width) - ((67d / 100 * width))));
views.get("label4").vw.setTop((int)((48d / 100 * height)));
views.get("label4").vw.setHeight((int)((58d / 100 * height) - ((48d / 100 * height))));
views.get("label5").vw.setLeft((int)((2d / 100 * width)));
views.get("label5").vw.setWidth((int)((65d / 100 * width) - ((2d / 100 * width))));
views.get("label5").vw.setTop((int)((61d / 100 * height)));
views.get("label5").vw.setHeight((int)((71d / 100 * height) - ((61d / 100 * height))));
views.get("label6").vw.setLeft((int)((67d / 100 * width)));
views.get("label6").vw.setWidth((int)((98d / 100 * width) - ((67d / 100 * width))));
views.get("label6").vw.setTop((int)((61d / 100 * height)));
views.get("label6").vw.setHeight((int)((71d / 100 * height) - ((61d / 100 * height))));
views.get("imageview1").vw.setLeft((int)((0d / 100 * width)));
views.get("imageview1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("imageview1").vw.setTop((int)((87d / 100 * height)));
views.get("imageview1").vw.setHeight((int)((98d / 100 * height) - ((87d / 100 * height))));

}
}