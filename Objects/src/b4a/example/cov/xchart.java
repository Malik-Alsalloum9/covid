package b4a.example.cov;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class xchart extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.cov.xchart");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.cov.xchart.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xbase = null;
public anywheresoftware.b4a.objects.B4XCanvas _xcvsgraph = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnlvalues = null;
public anywheresoftware.b4a.objects.B4XCanvas _xcvsvalues = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnlcursor = null;
public anywheresoftware.b4a.objects.B4XCanvas _xcvscursor = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XPath _pthgrid = null;
public b4a.example.cov.xchart._scaledata[] _scale = null;
public b4a.example.cov.xchart._scaledatalog[] _scalelog = null;
public int _sy = 0;
public int _sx = 0;
public anywheresoftware.b4a.objects.collections.List _items = null;
public anywheresoftware.b4a.objects.collections.List _points = null;
public b4a.example.cov.xchart._chartdata _graph = null;
public b4a.example.cov.xchart._textdata _texts = null;
public b4a.example.cov.xchart._legenddata _legend = null;
public b4a.example.cov.xchart._valuesdata _values = null;
public double[] _minmaxmeanvalues = null;
public b4a.example.cov.xchart._numberformats _bmvnf = null;
public boolean _bmvnfused = false;
public boolean _barwidth0 = false;
public int _mpiepercentagenbfractions = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.cov.main _main = null;
public b4a.example.cov.starter _starter = null;
public b4a.example.cov.wcov _wcov = null;
public b4a.example.cov.ccov _ccov = null;
public b4a.example.cov.intro _intro = null;
public b4a.example.cov.ranking _ranking = null;
public b4a.example.cov.dohmap _dohmap = null;
public b4a.example.cov.httputils2service _httputils2service = null;
public b4a.example.cov.b4xcollections _b4xcollections = null;
public static class _chartdata{
public boolean IsInitialized;
public String Title;
public String Subtitle;
public String XAxisName;
public String YAxisName;
public int Left;
public int Right;
public int Top;
public int Bottom;
public int Width;
public int Height;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect Rect;
public int YInterval;
public int XInterval;
public int XOffset;
public int BarWidth;
public String ChartType;
public int BarSubWidth;
public boolean IncludeBarMeanLine;
public boolean IncludeValues;
public int ChartBackgroundColor;
public int GridFrameColor;
public int GridColor;
public int GridColorDark;
public String XScaleTextOrientation;
public int PieGapDegrees;
public boolean PieAddPerentage;
public boolean GradientColors;
public int GradientColorsAlpha;
public double Rotation;
public boolean DrawOuterFrame;
public boolean IncludeMinLine;
public boolean IncludeMaxLine;
public int MinLineColor;
public int MaxLineColor;
public boolean IncludeMeanLine;
public int MeanLineColor;
public String BarValueOrientation;
public boolean Error;
public String ErrorText;
public void Initialize() {
IsInitialized = true;
Title = "";
Subtitle = "";
XAxisName = "";
YAxisName = "";
Left = 0;
Right = 0;
Top = 0;
Bottom = 0;
Width = 0;
Height = 0;
Rect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
YInterval = 0;
XInterval = 0;
XOffset = 0;
BarWidth = 0;
ChartType = "";
BarSubWidth = 0;
IncludeBarMeanLine = false;
IncludeValues = false;
ChartBackgroundColor = 0;
GridFrameColor = 0;
GridColor = 0;
GridColorDark = 0;
XScaleTextOrientation = "";
PieGapDegrees = 0;
PieAddPerentage = false;
GradientColors = false;
GradientColorsAlpha = 0;
Rotation = 0;
DrawOuterFrame = false;
IncludeMinLine = false;
IncludeMaxLine = false;
MinLineColor = 0;
MaxLineColor = 0;
IncludeMeanLine = false;
MeanLineColor = 0;
BarValueOrientation = "";
Error = false;
ErrorText = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _pointdata{
public boolean IsInitialized;
public String X;
public double[] XArray;
public double[] YArray;
public boolean ShowTick;
public void Initialize() {
IsInitialized = true;
X = "";
XArray = new double[0];
;
YArray = new double[0];
;
ShowTick = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _itemdata{
public boolean IsInitialized;
public String Name;
public int Color;
public float Value;
public int StrokeWidth;
public boolean DrawLine;
public String PointType;
public boolean Filled;
public int PointColor;
public anywheresoftware.b4a.objects.collections.List YXArray;
public void Initialize() {
IsInitialized = true;
Name = "";
Color = 0;
Value = 0f;
StrokeWidth = 0;
DrawLine = false;
PointType = "";
Filled = false;
PointColor = 0;
YXArray = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _scaledata{
public boolean IsInitialized;
public double Scale;
public double MinVal;
public double MaxVal;
public double MinManu;
public double MaxManu;
public double IntervalManu;
public double MinAuto;
public double MaxAuto;
public double IntervalAuto;
public double Interval;
public int NbIntervals;
public boolean Automatic;
public double Exp;
public boolean YZeroAxis;
public String ScaleValues;
public boolean Logarithmic;
public void Initialize() {
IsInitialized = true;
Scale = 0;
MinVal = 0;
MaxVal = 0;
MinManu = 0;
MaxManu = 0;
IntervalManu = 0;
MinAuto = 0;
MaxAuto = 0;
IntervalAuto = 0;
Interval = 0;
NbIntervals = 0;
Automatic = false;
Exp = 0;
YZeroAxis = false;
ScaleValues = "";
Logarithmic = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _scaledatalog{
public boolean IsInitialized;
public double Scale;
public int MantMin;
public int MantMax;
public double LogMin;
public int LogMinIndex;
public double LogMax;
public double[] Logs;
public double[] Vals;
public int NbDecades;
public String ScaleValues;
public void Initialize() {
IsInitialized = true;
Scale = 0;
MantMin = 0;
MantMax = 0;
LogMin = 0;
LogMinIndex = 0;
LogMax = 0;
Logs = new double[0];
;
Vals = new double[0];
;
NbDecades = 0;
ScaleValues = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _textdata{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TitleFont;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont SubtitleFont;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont AxisFont;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont ScaleFont;
public boolean AutomaticTextSizes;
public float TitleTextSize;
public float SubtitleTextSize;
public int TitleTextColor;
public int SubtitleTextColor;
public int AxisTextColor;
public float AxisTextSize;
public float ScaleTextSize;
public int ScaleTextColor;
public int TitleTextHeight;
public int SubtitleTextHeight;
public int AxisTextHeight;
public int ScaleTextHeight;
public void Initialize() {
IsInitialized = true;
TitleFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
SubtitleFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
AxisFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
ScaleFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
AutomaticTextSizes = false;
TitleTextSize = 0f;
SubtitleTextSize = 0f;
TitleTextColor = 0;
SubtitleTextColor = 0;
AxisTextColor = 0;
AxisTextSize = 0f;
ScaleTextSize = 0f;
ScaleTextColor = 0;
TitleTextHeight = 0;
SubtitleTextHeight = 0;
AxisTextHeight = 0;
ScaleTextHeight = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _legenddata{
public boolean IsInitialized;
public String IncludeLegend;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TextFont;
public float TextSize;
public int TextHeight;
public int Height;
public int LineNumber;
public anywheresoftware.b4a.objects.collections.List LineNumbers;
public anywheresoftware.b4a.objects.collections.List LineChange;
public void Initialize() {
IsInitialized = true;
IncludeLegend = "";
TextFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextSize = 0f;
TextHeight = 0;
Height = 0;
LineNumber = 0;
LineNumbers = new anywheresoftware.b4a.objects.collections.List();
LineChange = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _valuesdata{
public boolean IsInitialized;
public boolean Show;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TextFont;
public float TextSize;
public int TextColor;
public int TextHeight;
public int Left;
public int Top;
public int Width;
public int Height;
public int MidPont;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect rectRight;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect rectCursor;
public int MaxDigits;
public String Position;
public void Initialize() {
IsInitialized = true;
Show = false;
TextFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextSize = 0f;
TextColor = 0;
TextHeight = 0;
Left = 0;
Top = 0;
Width = 0;
Height = 0;
MidPont = 0;
rectRight = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
rectCursor = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
MaxDigits = 0;
Position = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _numberformats{
public boolean IsInitialized;
public int MinimumIntegers;
public int MaximumFractions;
public int MinimumFractions;
public boolean GroupingUsed;
public void Initialize() {
IsInitialized = true;
MinimumIntegers = 0;
MaximumFractions = 0;
MinimumFractions = 0;
GroupingUsed = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addbar(String _name,int _barcolor) throws Exception{
b4a.example.cov.xchart._itemdata _id = null;
 //BA.debugLineNum = 594;BA.debugLine="Public Sub AddBar(Name As String, BarColor As Int)";
 //BA.debugLineNum = 595;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 596;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 599;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 600;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 601;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 602;BA.debugLine="ID.Color = BarColor";
_id.Color /*int*/  = _barcolor;
 //BA.debugLineNum = 603;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 604;BA.debugLine="End Sub";
return "";
}
public String  _addbarmultiplepoint(String _x,double[] _yarray) throws Exception{
b4a.example.cov.xchart._pointdata _pd = null;
 //BA.debugLineNum = 608;BA.debugLine="Public Sub AddBarMultiplePoint (X As String, YArra";
 //BA.debugLineNum = 609;BA.debugLine="If Points.IsInitialized = False Then";
if (_points.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 610;BA.debugLine="Points.Initialize";
_points.Initialize();
 };
 //BA.debugLineNum = 612;BA.debugLine="Dim PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 613;BA.debugLine="PD.Initialize";
_pd.Initialize();
 //BA.debugLineNum = 614;BA.debugLine="PD.X = X";
_pd.X /*String*/  = _x;
 //BA.debugLineNum = 615;BA.debugLine="PD.YArray = YArray";
_pd.YArray /*double[]*/  = _yarray;
 //BA.debugLineNum = 616;BA.debugLine="PD.ShowTick = True";
_pd.ShowTick /*boolean*/  = __c.True;
 //BA.debugLineNum = 617;BA.debugLine="Points.Add(PD)";
_points.Add((Object)(_pd));
 //BA.debugLineNum = 618;BA.debugLine="End Sub";
return "";
}
public String  _addbarpointdata(String _x,double _y) throws Exception{
b4a.example.cov.xchart._pointdata _pd = null;
double[] _yarray = null;
 //BA.debugLineNum = 622;BA.debugLine="Public Sub AddBarPointData (X As String, Y As Doub";
 //BA.debugLineNum = 623;BA.debugLine="If Points.IsInitialized = False Then";
if (_points.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 624;BA.debugLine="Points.Initialize";
_points.Initialize();
 };
 //BA.debugLineNum = 626;BA.debugLine="Dim PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 627;BA.debugLine="PD.Initialize";
_pd.Initialize();
 //BA.debugLineNum = 628;BA.debugLine="PD.X = X";
_pd.X /*String*/  = _x;
 //BA.debugLineNum = 629;BA.debugLine="Private YArray(1) As Double";
_yarray = new double[(int) (1)];
;
 //BA.debugLineNum = 630;BA.debugLine="YArray(0) = Y";
_yarray[(int) (0)] = _y;
 //BA.debugLineNum = 631;BA.debugLine="PD.YArray = YArray";
_pd.YArray /*double[]*/  = _yarray;
 //BA.debugLineNum = 632;BA.debugLine="PD.ShowTick = True";
_pd.ShowTick /*boolean*/  = __c.True;
 //BA.debugLineNum = 633;BA.debugLine="Points.Add(PD)";
_points.Add((Object)(_pd));
 //BA.debugLineNum = 634;BA.debugLine="End Sub";
return "";
}
public String  _addline(String _name,int _linecolor) throws Exception{
b4a.example.cov.xchart._itemdata _id = null;
 //BA.debugLineNum = 638;BA.debugLine="Public Sub AddLine(Name As String, LineColor As In";
 //BA.debugLineNum = 639;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 640;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 642;BA.debugLine="If LineColor = 0 Then LineColor = xui.Color_RGB(R";
if (_linecolor==0) { 
_linecolor = _xui.Color_RGB(__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)));};
 //BA.debugLineNum = 644;BA.debugLine="Dim ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 645;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 646;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 647;BA.debugLine="ID.Color = LineColor";
_id.Color /*int*/  = _linecolor;
 //BA.debugLineNum = 648;BA.debugLine="ID.StrokeWidth = 2dip";
_id.StrokeWidth /*int*/  = __c.DipToCurrent((int) (2));
 //BA.debugLineNum = 649;BA.debugLine="ID.PointType = \"NONE\"";
_id.PointType /*String*/  = "NONE";
 //BA.debugLineNum = 650;BA.debugLine="ID.Filled = False";
_id.Filled /*boolean*/  = __c.False;
 //BA.debugLineNum = 651;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 652;BA.debugLine="End Sub";
return "";
}
public String  _addline2(String _name,int _linecolor,int _strokewidth,String _pointtype,boolean _filled,int _pointcolor) throws Exception{
b4a.example.cov.xchart._itemdata _id = null;
 //BA.debugLineNum = 658;BA.debugLine="Public Sub AddLine2(Name As String, LineColor As I";
 //BA.debugLineNum = 659;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 660;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 662;BA.debugLine="If LineColor = 0 Then LineColor = xui.Color_RGB(R";
if (_linecolor==0) { 
_linecolor = _xui.Color_RGB(__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)));};
 //BA.debugLineNum = 664;BA.debugLine="Dim ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 665;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 666;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 667;BA.debugLine="ID.Color = LineColor";
_id.Color /*int*/  = _linecolor;
 //BA.debugLineNum = 668;BA.debugLine="ID.StrokeWidth = StrokeWidth";
_id.StrokeWidth /*int*/  = _strokewidth;
 //BA.debugLineNum = 669;BA.debugLine="ID.PointType = PointType";
_id.PointType /*String*/  = _pointtype;
 //BA.debugLineNum = 670;BA.debugLine="ID.Filled = Filled";
_id.Filled /*boolean*/  = _filled;
 //BA.debugLineNum = 671;BA.debugLine="ID.PointColor = PointColor";
_id.PointColor /*int*/  = _pointcolor;
 //BA.debugLineNum = 672;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 673;BA.debugLine="End Sub";
return "";
}
public String  _addlinemultiplepoints(String _x,double[] _yarray,boolean _showtick) throws Exception{
b4a.example.cov.xchart._pointdata _pd = null;
 //BA.debugLineNum = 678;BA.debugLine="Public Sub AddLineMultiplePoints(X As String, YArr";
 //BA.debugLineNum = 679;BA.debugLine="If Points.IsInitialized = False Then Points.Initi";
if (_points.IsInitialized()==__c.False) { 
_points.Initialize();};
 //BA.debugLineNum = 680;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 681;BA.debugLine="PD.Initialize";
_pd.Initialize();
 //BA.debugLineNum = 682;BA.debugLine="PD.X = X";
_pd.X /*String*/  = _x;
 //BA.debugLineNum = 683;BA.debugLine="PD.YArray = YArray";
_pd.YArray /*double[]*/  = _yarray;
 //BA.debugLineNum = 684;BA.debugLine="PD.ShowTick = ShowTick";
_pd.ShowTick /*boolean*/  = _showtick;
 //BA.debugLineNum = 685;BA.debugLine="Points.Add(PD)";
_points.Add((Object)(_pd));
 //BA.debugLineNum = 686;BA.debugLine="If xpnlValues.Visible = True Then";
if (_xpnlvalues.getVisible()==__c.True) { 
 //BA.debugLineNum = 687;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 //BA.debugLineNum = 688;BA.debugLine="xcvsCursor.ClearRect(Values.rectCursor)";
_xcvscursor.ClearRect(_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ );
 //BA.debugLineNum = 689;BA.debugLine="xcvsCursor.Invalidate";
_xcvscursor.Invalidate();
 };
 //BA.debugLineNum = 691;BA.debugLine="End Sub";
return "";
}
public String  _addlinepointdata(String _x,double _y,boolean _showtick) throws Exception{
b4a.example.cov.xchart._pointdata _pd = null;
double[] _yarray = null;
 //BA.debugLineNum = 696;BA.debugLine="Public Sub AddLinePointData (X As String, Y As Dou";
 //BA.debugLineNum = 697;BA.debugLine="If Points.IsInitialized = False Then Points.Initi";
if (_points.IsInitialized()==__c.False) { 
_points.Initialize();};
 //BA.debugLineNum = 698;BA.debugLine="Dim PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 699;BA.debugLine="PD.Initialize";
_pd.Initialize();
 //BA.debugLineNum = 700;BA.debugLine="PD.X = X";
_pd.X /*String*/  = _x;
 //BA.debugLineNum = 701;BA.debugLine="Private YArray(1) As Double";
_yarray = new double[(int) (1)];
;
 //BA.debugLineNum = 702;BA.debugLine="YArray(0) = Y";
_yarray[(int) (0)] = _y;
 //BA.debugLineNum = 703;BA.debugLine="PD.YArray = YArray";
_pd.YArray /*double[]*/  = _yarray;
 //BA.debugLineNum = 704;BA.debugLine="PD.ShowTick = ShowTick";
_pd.ShowTick /*boolean*/  = _showtick;
 //BA.debugLineNum = 705;BA.debugLine="Points.Add(PD)";
_points.Add((Object)(_pd));
 //BA.debugLineNum = 706;BA.debugLine="If xpnlValues.Visible = True Then";
if (_xpnlvalues.getVisible()==__c.True) { 
 //BA.debugLineNum = 707;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 //BA.debugLineNum = 708;BA.debugLine="xcvsCursor.ClearRect(Values.rectCursor)";
_xcvscursor.ClearRect(_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ );
 //BA.debugLineNum = 709;BA.debugLine="xcvsCursor.Invalidate";
_xcvscursor.Invalidate();
 };
 //BA.debugLineNum = 711;BA.debugLine="End Sub";
return "";
}
public String  _addpie(String _name,float _value,int _color) throws Exception{
b4a.example.cov.xchart._itemdata _id = null;
 //BA.debugLineNum = 716;BA.debugLine="Public Sub AddPie(Name As String, Value As Float,";
 //BA.debugLineNum = 717;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 718;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 720;BA.debugLine="If Color = 0 Then Color = xui.Color_RGB(Rnd(0, 25";
if (_color==0) { 
_color = _xui.Color_RGB(__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)));};
 //BA.debugLineNum = 721;BA.debugLine="Dim ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 722;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 723;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 724;BA.debugLine="ID.Value = Value";
_id.Value /*float*/  = _value;
 //BA.debugLineNum = 725;BA.debugLine="ID.Color = Color";
_id.Color /*int*/  = _color;
 //BA.debugLineNum = 726;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 727;BA.debugLine="End Sub";
return "";
}
public String  _addyxline(String _name,int _linecolor,int _strokewidth) throws Exception{
b4a.example.cov.xchart._itemdata _id = null;
 //BA.debugLineNum = 731;BA.debugLine="Public Sub AddYXLine(Name As String, LineColor As";
 //BA.debugLineNum = 732;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 733;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 735;BA.debugLine="If LineColor = 0 Then LineColor = xui.Color_RGB(R";
if (_linecolor==0) { 
_linecolor = _xui.Color_RGB(__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)));};
 //BA.debugLineNum = 737;BA.debugLine="Dim ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 738;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 739;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 740;BA.debugLine="ID.Color = LineColor";
_id.Color /*int*/  = _linecolor;
 //BA.debugLineNum = 741;BA.debugLine="ID.StrokeWidth = StrokeWidth";
_id.StrokeWidth /*int*/  = _strokewidth;
 //BA.debugLineNum = 742;BA.debugLine="ID.DrawLine = True";
_id.DrawLine /*boolean*/  = __c.True;
 //BA.debugLineNum = 743;BA.debugLine="ID.PointType = \"NONE\"";
_id.PointType /*String*/  = "NONE";
 //BA.debugLineNum = 744;BA.debugLine="ID.Filled = False";
_id.Filled /*boolean*/  = __c.False;
 //BA.debugLineNum = 745;BA.debugLine="ID.YXArray.Initialize";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 746;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 747;BA.debugLine="End Sub";
return "";
}
public String  _addyxline2(String _name,int _linecolor,int _strokewidth,boolean _drawline,String _pointtype,boolean _filled,int _pointcolor) throws Exception{
b4a.example.cov.xchart._itemdata _id = null;
 //BA.debugLineNum = 755;BA.debugLine="Public Sub AddYXLine2(Name As String, LineColor As";
 //BA.debugLineNum = 756;BA.debugLine="If Items.IsInitialized = False Then";
if (_items.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 757;BA.debugLine="Items.Initialize";
_items.Initialize();
 };
 //BA.debugLineNum = 759;BA.debugLine="If LineColor = 0 Then LineColor = xui.Color_RGB(R";
if (_linecolor==0) { 
_linecolor = _xui.Color_RGB(__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)),__c.Rnd((int) (0),(int) (255)));};
 //BA.debugLineNum = 761;BA.debugLine="Dim ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 762;BA.debugLine="ID.Initialize";
_id.Initialize();
 //BA.debugLineNum = 763;BA.debugLine="ID.Name = Name";
_id.Name /*String*/  = _name;
 //BA.debugLineNum = 764;BA.debugLine="ID.Color = LineColor";
_id.Color /*int*/  = _linecolor;
 //BA.debugLineNum = 765;BA.debugLine="ID.StrokeWidth = StrokeWidth";
_id.StrokeWidth /*int*/  = _strokewidth;
 //BA.debugLineNum = 766;BA.debugLine="ID.DrawLine = DrawLine";
_id.DrawLine /*boolean*/  = _drawline;
 //BA.debugLineNum = 767;BA.debugLine="ID.PointType = PointType";
_id.PointType /*String*/  = _pointtype;
 //BA.debugLineNum = 768;BA.debugLine="ID.Filled = Filled";
_id.Filled /*boolean*/  = _filled;
 //BA.debugLineNum = 769;BA.debugLine="ID.PointColor = PointColor";
_id.PointColor /*int*/  = _pointcolor;
 //BA.debugLineNum = 770;BA.debugLine="ID.YXArray.Initialize";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 771;BA.debugLine="If DrawLine = False Then";
if (_drawline==__c.False) { 
 //BA.debugLineNum = 772;BA.debugLine="ID.Color = ID.PointColor";
_id.Color /*int*/  = _id.PointColor /*int*/ ;
 };
 //BA.debugLineNum = 774;BA.debugLine="Items.Add(ID)";
_items.Add((Object)(_id));
 //BA.debugLineNum = 775;BA.debugLine="End Sub";
return "";
}
public String  _addyxpoint(int _lineindex,double _x,double _y) throws Exception{
b4a.example.cov.xchart._itemdata _id = null;
double[] _yx = null;
 //BA.debugLineNum = 778;BA.debugLine="Public Sub AddYXPoint(LineIndex As Int, X As Doubl";
 //BA.debugLineNum = 779;BA.debugLine="If LineIndex < 0 Or LineIndex > Items.Size Then";
if (_lineindex<0 || _lineindex>_items.getSize()) { 
 //BA.debugLineNum = 780;BA.debugLine="Log(\"Index out of range\")";
__c.LogImpl("94980738","Index out of range",0);
 //BA.debugLineNum = 781;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 784;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 785;BA.debugLine="Private YX(2) As Double";
_yx = new double[(int) (2)];
;
 //BA.debugLineNum = 786;BA.debugLine="YX(0) = X";
_yx[(int) (0)] = _x;
 //BA.debugLineNum = 787;BA.debugLine="YX(1) = Y";
_yx[(int) (1)] = _y;
 //BA.debugLineNum = 788;BA.debugLine="ID = Items.Get(LineIndex)";
_id = (b4a.example.cov.xchart._itemdata)(_items.Get(_lineindex));
 //BA.debugLineNum = 789;BA.debugLine="If ID.YXArray.IsInitialized = False Then";
if (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==__c.False) { 
 //BA.debugLineNum = 790;BA.debugLine="ID.YXArray.Initialize";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
 //BA.debugLineNum = 792;BA.debugLine="ID.YXArray.Add(YX)";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_yx));
 //BA.debugLineNum = 793;BA.debugLine="End Sub";
return "";
}
public void  _base_resize(double _width,double _height) throws Exception{
ResumableSub_Base_Resize rsub = new ResumableSub_Base_Resize(this,_width,_height);
rsub.resume(ba, null);
}
public static class ResumableSub_Base_Resize extends BA.ResumableSub {
public ResumableSub_Base_Resize(b4a.example.cov.xchart parent,double _width,double _height) {
this.parent = parent;
this._width = _width;
this._height = _height;
}
b4a.example.cov.xchart parent;
double _width;
double _height;
int _i = 0;
int _n = 0;
b4a.example.cov.xchart._itemdata _id = null;
int step12;
int limit12;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 358;BA.debugLine="xcvsGraph.Resize(Width, Height)";
parent._xcvsgraph.Resize((float) (_width),(float) (_height));
 //BA.debugLineNum = 359;BA.debugLine="xpnlCursor.Width = Width";
parent._xpnlcursor.setWidth((int) (_width));
 //BA.debugLineNum = 360;BA.debugLine="xpnlCursor.Height = Height";
parent._xpnlcursor.setHeight((int) (_height));
 //BA.debugLineNum = 361;BA.debugLine="xcvsCursor.Resize(Width, Height)";
parent._xcvscursor.Resize((float) (_width),(float) (_height));
 //BA.debugLineNum = 362;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
 //BA.debugLineNum = 363;BA.debugLine="If Points.Size > 0 Or Graph.ChartType = \"PIE\" The";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._points.getSize()>0 || (parent._graph.ChartType /*String*/ ).equals("PIE")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 364;BA.debugLine="DrawChart";
parent._drawchart();
 if (true) break;
;
 //BA.debugLineNum = 366;BA.debugLine="If Graph.ChartType = \"YX_CHART\" And Items.Size >";

case 4:
//if
this.state = 18;
if ((parent._graph.ChartType /*String*/ ).equals("YX_CHART") && parent._items.getSize()>0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 367;BA.debugLine="Private i, n As Int";
_i = 0;
_n = 0;
 //BA.debugLineNum = 368;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 370;BA.debugLine="For i = 0 To Items.Size - 1";
if (true) break;

case 7:
//for
this.state = 14;
step12 = 1;
limit12 = (int) (parent._items.getSize()-1);
_i = (int) (0) ;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 14;
if ((step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12)) this.state = 9;
if (true) break;

case 21:
//C
this.state = 20;
_i = ((int)(0 + _i + step12)) ;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 371;BA.debugLine="ID = Items.Get(i)";
_id = (b4a.example.cov.xchart._itemdata)(parent._items.Get(_i));
 //BA.debugLineNum = 372;BA.debugLine="If ID.YXArray.Size > 0 Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 373;BA.debugLine="n = 1";
_n = (int) (1);
 if (true) break;

case 13:
//C
this.state = 21;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 376;BA.debugLine="If n = 1 Then";

case 14:
//if
this.state = 17;
if (_n==1) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 377;BA.debugLine="DrawChart";
parent._drawchart();
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public int  _calcdarkcolor(int _color) throws Exception{
b4a.example.bitmapcreator _bmpcreate = null;
b4a.example.bitmapcreator._argbcolor _argbcol = null;
 //BA.debugLineNum = 516;BA.debugLine="Private Sub CalcDarkColor(Color As Int) As Int";
 //BA.debugLineNum = 517;BA.debugLine="Private BmpCreate As BitmapCreator";
_bmpcreate = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 518;BA.debugLine="Private ARGBCol As ARGBColor";
_argbcol = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 520;BA.debugLine="BmpCreate.Initialize(1, 1)";
_bmpcreate._initialize(ba,(int) (1),(int) (1));
 //BA.debugLineNum = 521;BA.debugLine="BmpCreate.ColorToARGB(Color, ARGBCol)";
_bmpcreate._colortoargb(_color,_argbcol);
 //BA.debugLineNum = 522;BA.debugLine="ARGBCol.r = ARGBCol.r / 2";
_argbcol.r = (int) (_argbcol.r/(double)2);
 //BA.debugLineNum = 523;BA.debugLine="ARGBCol.g = ARGBCol.g / 2";
_argbcol.g = (int) (_argbcol.g/(double)2);
 //BA.debugLineNum = 524;BA.debugLine="ARGBCol.b = ARGBCol.b / 2";
_argbcol.b = (int) (_argbcol.b/(double)2);
 //BA.debugLineNum = 526;BA.debugLine="Return BmpCreate.ARGBToColor(ARGBCol)";
if (true) return _bmpcreate._argbtocolor(_argbcol);
 //BA.debugLineNum = 527;BA.debugLine="End Sub";
return 0;
}
public String  _calcscaleauto(int _axis) throws Exception{
double _scalelogarithm = 0;
double _scalemant = 0;
double _scaledelta = 0;
double _valdiff = 0;
double _scalemin = 0;
double _scalemax = 0;
double _valmax = 0;
int _nbmin = 0;
int _nbusedintervals = 0;
int _nbusedintervalstop = 0;
int _nbusedintervalsbottom = 0;
int _nbintervalstomove = 0;
double[] _valminmax = null;
boolean _scaleok = false;
 //BA.debugLineNum = 1014;BA.debugLine="Private Sub CalcScaleAuto(Axis As Int)";
 //BA.debugLineNum = 1015;BA.debugLine="Private ScaleLogarithm, ScaleMant, ScaleDelta, Va";
_scalelogarithm = 0;
_scalemant = 0;
_scaledelta = 0;
_valdiff = 0;
_scalemin = 0;
_scalemax = 0;
_valmax = 0;
 //BA.debugLineNum = 1017;BA.debugLine="Private nbMin, NbUsedIntervals, NbUsedIntervalsTo";
_nbmin = 0;
_nbusedintervals = 0;
_nbusedintervalstop = 0;
_nbusedintervalsbottom = 0;
_nbintervalstomove = 0;
 //BA.debugLineNum = 1018;BA.debugLine="Private ValMinMax(3) As Double";
_valminmax = new double[(int) (3)];
;
 //BA.debugLineNum = 1020;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"LINE","YX_CHART")) {
case 0: 
case 1: {
 //BA.debugLineNum = 1022;BA.debugLine="ValMinMax = GetLinePointsMinMaxMeanValues(Axis)";
_valminmax = _getlinepointsminmaxmeanvalues(_axis);
 //BA.debugLineNum = 1023;BA.debugLine="If Scale(Axis).YZeroAxis = True And ValMinMax(0";
if (_scale[_axis].YZeroAxis /*boolean*/ ==__c.True && _valminmax[(int) (0)]>=0 && _valminmax[(int) (1)]>0) { 
 //BA.debugLineNum = 1024;BA.debugLine="ValMinMax(0) = 0";
_valminmax[(int) (0)] = 0;
 };
 //BA.debugLineNum = 1026;BA.debugLine="If Scale(Axis).YZeroAxis = True And ValMinMax(0";
if (_scale[_axis].YZeroAxis /*boolean*/ ==__c.True && _valminmax[(int) (0)]<0 && _valminmax[(int) (1)]<=0) { 
 //BA.debugLineNum = 1027;BA.debugLine="ValMinMax(1) = 0";
_valminmax[(int) (1)] = 0;
 };
 break; }
default: {
 //BA.debugLineNum = 1030;BA.debugLine="ValMinMax = GetBarPointsMinMaxValues";
_valminmax = _getbarpointsminmaxvalues();
 break; }
}
;
 //BA.debugLineNum = 1034;BA.debugLine="If ValMinMax(0) = ValMinMax(1) Then";
if (_valminmax[(int) (0)]==_valminmax[(int) (1)]) { 
 //BA.debugLineNum = 1035;BA.debugLine="If ValMinMax(0) = 0 Then";
if (_valminmax[(int) (0)]==0) { 
 //BA.debugLineNum = 1036;BA.debugLine="Scale(Axis).MinAuto = 0";
_scale[_axis].MinAuto /*double*/  = 0;
 //BA.debugLineNum = 1037;BA.debugLine="Scale(Axis).MaxAuto = 1";
_scale[_axis].MaxAuto /*double*/  = 1;
 //BA.debugLineNum = 1038;BA.debugLine="Scale(Axis).IntervalAuto = 1 / Scale(sY).NbInte";
_scale[_axis].IntervalAuto /*double*/  = 1/(double)_scale[_sy].NbIntervals /*int*/ ;
 //BA.debugLineNum = 1039;BA.debugLine="Scale(Axis).MinVal = Scale(Axis).MinAuto";
_scale[_axis].MinVal /*double*/  = _scale[_axis].MinAuto /*double*/ ;
 //BA.debugLineNum = 1040;BA.debugLine="Scale(Axis).MaxVal = Scale(Axis).MaxAuto";
_scale[_axis].MaxVal /*double*/  = _scale[_axis].MaxAuto /*double*/ ;
 //BA.debugLineNum = 1041;BA.debugLine="Scale(Axis).Interval = Scale(Axis).IntervalAuto";
_scale[_axis].Interval /*double*/  = _scale[_axis].IntervalAuto /*double*/ ;
 //BA.debugLineNum = 1042;BA.debugLine="Graph.Error = True";
_graph.Error /*boolean*/  = __c.True;
 //BA.debugLineNum = 1043;BA.debugLine="Graph.ErrorText = \"Min and max values = \" & Val";
_graph.ErrorText /*String*/  = "Min and max values = "+BA.NumberToString(_valminmax[(int) (0)])+" are the same !";
 //BA.debugLineNum = 1044;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 1046;BA.debugLine="Scale(Axis).IntervalAuto = 1";
_scale[_axis].IntervalAuto /*double*/  = 1;
 //BA.debugLineNum = 1047;BA.debugLine="Scale(Axis).MinAuto = Floor(ValMinMax(0)) - Sca";
_scale[_axis].MinAuto /*double*/  = __c.Floor(_valminmax[(int) (0)])-_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ /(double)2;
 //BA.debugLineNum = 1048;BA.debugLine="Scale(Axis).MaxAuto = Scale(Axis).MinAuto + Sca";
_scale[_axis].MaxAuto /*double*/  = _scale[_axis].MinAuto /*double*/ +_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ ;
 //BA.debugLineNum = 1049;BA.debugLine="Scale(Axis).MinVal = Scale(Axis).MinAuto";
_scale[_axis].MinVal /*double*/  = _scale[_axis].MinAuto /*double*/ ;
 //BA.debugLineNum = 1050;BA.debugLine="Scale(Axis).MaxVal = Scale(Axis).MaxAuto";
_scale[_axis].MaxVal /*double*/  = _scale[_axis].MaxAuto /*double*/ ;
 //BA.debugLineNum = 1051;BA.debugLine="Scale(Axis).Interval = Scale(Axis).IntervalAuto";
_scale[_axis].Interval /*double*/  = _scale[_axis].IntervalAuto /*double*/ ;
 //BA.debugLineNum = 1052;BA.debugLine="If Axis = 0 Then";
if (_axis==0) { 
 //BA.debugLineNum = 1053;BA.debugLine="Scale(Axis).Scale = Graph.Height / (Scale(Axis";
_scale[_axis].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_axis].MaxVal /*double*/ -_scale[_axis].MinVal /*double*/ );
 }else {
 //BA.debugLineNum = 1055;BA.debugLine="Scale(Axis).Scale = Graph.Width / (Scale(Axis)";
_scale[_axis].Scale /*double*/  = _graph.Width /*int*/ /(double)(_scale[_axis].MaxVal /*double*/ -_scale[_axis].MinVal /*double*/ );
 };
 };
 };
 //BA.debugLineNum = 1060;BA.debugLine="Private ScaleOK As Boolean = False";
_scaleok = __c.False;
 //BA.debugLineNum = 1061;BA.debugLine="ValMax = ValMinMax(1)";
_valmax = _valminmax[(int) (1)];
 //BA.debugLineNum = 1062;BA.debugLine="Do Until ScaleOK = True";
while (!(_scaleok==__c.True)) {
 //BA.debugLineNum = 1063;BA.debugLine="ValDiff = ValMax - ValMinMax(0)";
_valdiff = _valmax-_valminmax[(int) (0)];
 //BA.debugLineNum = 1064;BA.debugLine="ScaleDelta = ValDiff / Scale(Axis).NbIntervals";
_scaledelta = _valdiff/(double)_scale[_axis].NbIntervals /*int*/ ;
 //BA.debugLineNum = 1066;BA.debugLine="ScaleLogarithm = Logarithm(ScaleDelta, 10)";
_scalelogarithm = __c.Logarithm(_scaledelta,10);
 //BA.debugLineNum = 1067;BA.debugLine="Scale(Axis).Exp = Floor(ScaleLogarithm)";
_scale[_axis].Exp /*double*/  = __c.Floor(_scalelogarithm);
 //BA.debugLineNum = 1068;BA.debugLine="If ValDiff >= 1 Then";
if (_valdiff>=1) { 
 //BA.debugLineNum = 1069;BA.debugLine="ScaleMant = ScaleLogarithm - Scale(Axis).Exp";
_scalemant = _scalelogarithm-_scale[_axis].Exp /*double*/ ;
 }else {
 //BA.debugLineNum = 1071;BA.debugLine="ScaleMant = Abs(Scale(Axis).Exp) + ScaleLogarit";
_scalemant = __c.Abs(_scale[_axis].Exp /*double*/ )+_scalelogarithm;
 };
 //BA.debugLineNum = 1074;BA.debugLine="ScaleMant = GetScaleMant(ScaleMant, Axis)";
_scalemant = _getscalemant(_scalemant,_axis);
 //BA.debugLineNum = 1076;BA.debugLine="Scale(Axis).IntervalAuto = Power(10, Scale(Axis)";
_scale[_axis].IntervalAuto /*double*/  = __c.Power(10,_scale[_axis].Exp /*double*/ +_scalemant);
 //BA.debugLineNum = 1078;BA.debugLine="If Scale(Axis).YZeroAxis = True And ValMinMax(0)";
if (_scale[_axis].YZeroAxis /*boolean*/ ==__c.True && _valminmax[(int) (0)]<0 && _valminmax[(int) (1)]==0) { 
 //BA.debugLineNum = 1079;BA.debugLine="ScaleMax = 0";
_scalemax = 0;
 //BA.debugLineNum = 1080;BA.debugLine="ScaleMin = -Scale(Axis).IntervalAuto * Scale(Ax";
_scalemin = -_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ ;
 }else {
 //BA.debugLineNum = 1082;BA.debugLine="ScaleMin = Floor(ValMinMax(0) / Scale(Axis).Int";
_scalemin = __c.Floor(_valminmax[(int) (0)]/(double)_scale[_axis].IntervalAuto /*double*/ +0.00000000000001)*_scale[_axis].IntervalAuto /*double*/ ;
 //BA.debugLineNum = 1083;BA.debugLine="ScaleMax = ScaleMin + Scale(Axis).IntervalAuto";
_scalemax = _scalemin+_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ ;
 };
 //BA.debugLineNum = 1087;BA.debugLine="If ScaleMax < ValMinMax(1) Then";
if (_scalemax<_valminmax[(int) (1)]) { 
 //BA.debugLineNum = 1088;BA.debugLine="ValMax = ValMax + Scale(Axis).IntervalAuto";
_valmax = _valmax+_scale[_axis].IntervalAuto /*double*/ ;
 }else {
 //BA.debugLineNum = 1090;BA.debugLine="ScaleOK = True";
_scaleok = __c.True;
 };
 }
;
 //BA.debugLineNum = 1095;BA.debugLine="If ValMinMax(0) < 0 And ValMinMax(1) > 0 Then";
if (_valminmax[(int) (0)]<0 && _valminmax[(int) (1)]>0) { 
 //BA.debugLineNum = 1096;BA.debugLine="NbUsedIntervalsTop = Ceil(ValMinMax(1) / Scale(A";
_nbusedintervalstop = (int) (__c.Ceil(_valminmax[(int) (1)]/(double)_scale[_axis].IntervalAuto /*double*/ -0.00000000000001));
 //BA.debugLineNum = 1097;BA.debugLine="NbUsedIntervalsBottom = Ceil(Abs(ValMinMax(0)) /";
_nbusedintervalsbottom = (int) (__c.Ceil(__c.Abs(_valminmax[(int) (0)])/(double)_scale[_axis].IntervalAuto /*double*/ -0.00000000000001));
 //BA.debugLineNum = 1099;BA.debugLine="If NbUsedIntervalsTop + NbUsedIntervalsBottom >";
if (_nbusedintervalstop+_nbusedintervalsbottom>_scale[_axis].NbIntervals /*int*/ ) { 
 //BA.debugLineNum = 1101;BA.debugLine="ScaleMant = GetScaleMant(ScaleMant, Axis)";
_scalemant = _getscalemant(_scalemant,_axis);
 //BA.debugLineNum = 1103;BA.debugLine="Scale(Axis).IntervalAuto = Power(10, Scale(Axis";
_scale[_axis].IntervalAuto /*double*/  = __c.Power(10,_scale[_axis].Exp /*double*/ +_scalemant);
 };
 };
 //BA.debugLineNum = 1108;BA.debugLine="If Scale(Axis).YZeroAxis = True And ValMinMax(1)";
if (_scale[_axis].YZeroAxis /*boolean*/ ==__c.True && _valminmax[(int) (1)]==0) { 
 //BA.debugLineNum = 1109;BA.debugLine="Scale(Axis).MinAuto = ScaleMin";
_scale[_axis].MinAuto /*double*/  = _scalemin;
 //BA.debugLineNum = 1110;BA.debugLine="Scale(Axis).MaxAuto = 0";
_scale[_axis].MaxAuto /*double*/  = 0;
 }else {
 //BA.debugLineNum = 1112;BA.debugLine="nbMin = Floor(ValMinMax(0) / Scale(Axis).Interva";
_nbmin = (int) (__c.Floor(_valminmax[(int) (0)]/(double)_scale[_axis].IntervalAuto /*double*/ ));
 //BA.debugLineNum = 1113;BA.debugLine="If Abs(ValMinMax(0)) <= 0.000000000001 Then";
if (__c.Abs(_valminmax[(int) (0)])<=0.000000000001) { 
 //BA.debugLineNum = 1114;BA.debugLine="Scale(Axis).MinAuto = 0";
_scale[_axis].MinAuto /*double*/  = 0;
 }else if(_valminmax[(int) (0)]>=0) { 
 //BA.debugLineNum = 1116;BA.debugLine="Scale(Axis).MinAuto = nbMin * Scale(Axis).Inter";
_scale[_axis].MinAuto /*double*/  = _nbmin*_scale[_axis].IntervalAuto /*double*/ ;
 }else if(_valminmax[(int) (0)]<0 && _valminmax[(int) (1)]>0) { 
 //BA.debugLineNum = 1118;BA.debugLine="Scale(Axis).MinAuto = Floor(ValMinMax(0) / Scal";
_scale[_axis].MinAuto /*double*/  = __c.Floor(_valminmax[(int) (0)]/(double)_scale[_axis].IntervalAuto /*double*/ +0.00000000000001)*_scale[_axis].IntervalAuto /*double*/ ;
 }else {
 //BA.debugLineNum = 1120;BA.debugLine="Scale(Axis).MinAuto = Floor(ValMinMax(0) / Scal";
_scale[_axis].MinAuto /*double*/  = __c.Floor(_valminmax[(int) (0)]/(double)_scale[_axis].IntervalAuto /*double*/ +0.00000000000001)*_scale[_axis].IntervalAuto /*double*/ ;
 };
 };
 //BA.debugLineNum = 1130;BA.debugLine="If (Scale(Axis).MinAuto >= 0 And Scale(Axis).YZer";
if ((_scale[_axis].MinAuto /*double*/ >=0 && _scale[_axis].YZeroAxis /*boolean*/ ==__c.False) || (_scale[_axis].MaxAuto /*double*/ <=0 && _scale[_axis].YZeroAxis /*boolean*/ ==__c.False) || (_scale[_axis].MinAuto /*double*/ <0 && _scale[_axis].MaxAuto /*double*/ >0)) { 
 //BA.debugLineNum = 1131;BA.debugLine="If ValMinMax(0) < 0 And ValMinMax(1) > 0 Then";
if (_valminmax[(int) (0)]<0 && _valminmax[(int) (1)]>0) { 
 //BA.debugLineNum = 1132;BA.debugLine="NbUsedIntervalsTop = Ceil(ValMinMax(1) / Scale(";
_nbusedintervalstop = (int) (__c.Ceil(_valminmax[(int) (1)]/(double)_scale[_axis].IntervalAuto /*double*/ -0.00000000000001));
 //BA.debugLineNum = 1133;BA.debugLine="NbUsedIntervalsBottom = Ceil(Abs(ValMinMax(0))";
_nbusedintervalsbottom = (int) (__c.Ceil(__c.Abs(_valminmax[(int) (0)])/(double)_scale[_axis].IntervalAuto /*double*/ -0.00000000000001));
 //BA.debugLineNum = 1134;BA.debugLine="NbUsedIntervals = NbUsedIntervalsTop + NbUsedIn";
_nbusedintervals = (int) (_nbusedintervalstop+_nbusedintervalsbottom);
 //BA.debugLineNum = 1135;BA.debugLine="If NbUsedIntervalsTop - NbUsedIntervalsBottom =";
if (_nbusedintervalstop-_nbusedintervalsbottom==1) { 
 //BA.debugLineNum = 1136;BA.debugLine="NbIntervalsToMove = Scale(Axis).NbIntervals /";
_nbintervalstomove = (int) (_scale[_axis].NbIntervals /*int*/ /(double)2-_nbusedintervalsbottom);
 }else {
 //BA.debugLineNum = 1138;BA.debugLine="NbIntervalsToMove = (Scale(Axis).NbIntervals -";
_nbintervalstomove = (int) ((_scale[_axis].NbIntervals /*int*/ -_nbusedintervals)/(double)2);
 };
 }else {
 //BA.debugLineNum = 1141;BA.debugLine="NbUsedIntervals = Ceil(ValDiff / Scale(Axis).In";
_nbusedintervals = (int) (__c.Ceil(_valdiff/(double)_scale[_axis].IntervalAuto /*double*/ -0.00000000000001));
 //BA.debugLineNum = 1142;BA.debugLine="NbIntervalsToMove = (Scale(Axis).NbIntervals -";
_nbintervalstomove = (int) ((_scale[_axis].NbIntervals /*int*/ -_nbusedintervals)/(double)2);
 };
 //BA.debugLineNum = 1144;BA.debugLine="Scale(Axis).MinAuto = Scale(Axis).MinAuto - Scal";
_scale[_axis].MinAuto /*double*/  = _scale[_axis].MinAuto /*double*/ -_scale[_axis].IntervalAuto /*double*/ *_nbintervalstomove;
 };
 //BA.debugLineNum = 1147;BA.debugLine="If Graph.ChartType = \"BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("BAR")) { 
 //BA.debugLineNum = 1149;BA.debugLine="If 	ValMinMax(0) = 0 And ValMinMax(1) > 0 And Sc";
if (_valminmax[(int) (0)]==0 && _valminmax[(int) (1)]>0 && _scale[_axis].MinAuto /*double*/ <0) { 
 //BA.debugLineNum = 1150;BA.debugLine="Scale(Axis).MinAuto = 0";
_scale[_axis].MinAuto /*double*/  = 0;
 };
 //BA.debugLineNum = 1154;BA.debugLine="If 	ValMinMax(0) < 0 And ValMinMax(1) = 0 And Sc";
if (_valminmax[(int) (0)]<0 && _valminmax[(int) (1)]==0 && _scale[_axis].MinAuto /*double*/ +_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ >0) { 
 //BA.debugLineNum = 1155;BA.debugLine="Scale(Axis).MinAuto = - Scale(Axis).IntervalAut";
_scale[_axis].MinAuto /*double*/  = -_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ ;
 };
 };
 //BA.debugLineNum = 1160;BA.debugLine="Scale(Axis).MaxAuto = Scale(Axis).MinAuto + Scale";
_scale[_axis].MaxAuto /*double*/  = _scale[_axis].MinAuto /*double*/ +_scale[_axis].IntervalAuto /*double*/ *_scale[_axis].NbIntervals /*int*/ ;
 //BA.debugLineNum = 1162;BA.debugLine="Scale(Axis).MinVal = Scale(Axis).MinAuto";
_scale[_axis].MinVal /*double*/  = _scale[_axis].MinAuto /*double*/ ;
 //BA.debugLineNum = 1163;BA.debugLine="Scale(Axis).MaxVal = Scale(Axis).MaxAuto";
_scale[_axis].MaxVal /*double*/  = _scale[_axis].MaxAuto /*double*/ ;
 //BA.debugLineNum = 1164;BA.debugLine="Scale(Axis).Interval = Scale(Axis).IntervalAuto";
_scale[_axis].Interval /*double*/  = _scale[_axis].IntervalAuto /*double*/ ;
 //BA.debugLineNum = 1165;BA.debugLine="End Sub";
return "";
}
public String  _calcscalelogauto(int _axis) throws Exception{
double[] _valminmax = null;
double _valmaxmant = 0;
double _valminmant = 0;
double _valmaxlog = 0;
double _valminlog = 0;
int _i = 0;
 //BA.debugLineNum = 1208;BA.debugLine="Private Sub CalcScaleLogAuto(Axis As Int)";
 //BA.debugLineNum = 1209;BA.debugLine="If Graph.ChartType = \"LINE\" Or Graph.ChartType =";
if ((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("YX_CHART")) { 
 //BA.debugLineNum = 1210;BA.debugLine="Private ValMinMax(3) As Double";
_valminmax = new double[(int) (3)];
;
 //BA.debugLineNum = 1211;BA.debugLine="ValMinMax = GetLinePointsMinMaxMeanValues(Axis)";
_valminmax = _getlinepointsminmaxmeanvalues(_axis);
 }else if((_graph.ChartType /*String*/ ).equals("BAR")) { 
 //BA.debugLineNum = 1213;BA.debugLine="Private ValMinMax(2) As Double";
_valminmax = new double[(int) (2)];
;
 //BA.debugLineNum = 1214;BA.debugLine="ValMinMax = GetBarPointsMinMaxValues";
_valminmax = _getbarpointsminmaxvalues();
 };
 //BA.debugLineNum = 1217;BA.debugLine="If ValMinMax(0) <= 0 Then";
if (_valminmax[(int) (0)]<=0) { 
 //BA.debugLineNum = 1218;BA.debugLine="Graph.Error = True";
_graph.Error /*boolean*/  = __c.True;
 //BA.debugLineNum = 1219;BA.debugLine="Graph.ErrorText = \"Logarithmic scales with value";
_graph.ErrorText /*String*/  = "Logarithmic scales with values less or equal to zero is not allowed !";
 //BA.debugLineNum = 1220;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1223;BA.debugLine="If ValMinMax(0) = ValMinMax(1) Then";
if (_valminmax[(int) (0)]==_valminmax[(int) (1)]) { 
 //BA.debugLineNum = 1224;BA.debugLine="If ValMinMax(0) = 0 Then";
if (_valminmax[(int) (0)]==0) { 
 //BA.debugLineNum = 1225;BA.debugLine="ScaleLog(Axis).MantMin = 0";
_scalelog[_axis].MantMin /*int*/  = (int) (0);
 //BA.debugLineNum = 1226;BA.debugLine="ScaleLog(Axis).MantMax = 1";
_scalelog[_axis].MantMax /*int*/  = (int) (1);
 //BA.debugLineNum = 1227;BA.debugLine="ScaleLog(Axis).NbDecades = 1";
_scalelog[_axis].NbDecades /*int*/  = (int) (1);
 //BA.debugLineNum = 1228;BA.debugLine="Scale(Axis).MinVal = 1";
_scale[_axis].MinVal /*double*/  = 1;
 //BA.debugLineNum = 1229;BA.debugLine="Scale(Axis).MaxVal = 10";
_scale[_axis].MaxVal /*double*/  = 10;
 //BA.debugLineNum = 1230;BA.debugLine="Scale(Axis).Interval = 1";
_scale[_axis].Interval /*double*/  = 1;
 //BA.debugLineNum = 1231;BA.debugLine="Graph.Error = True";
_graph.Error /*boolean*/  = __c.True;
 //BA.debugLineNum = 1232;BA.debugLine="Graph.ErrorText = \"Min and max values = \" & Val";
_graph.ErrorText /*String*/  = "Min and max values = "+BA.NumberToString(_valminmax[(int) (0)])+" are the same !";
 //BA.debugLineNum = 1233;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 1237;BA.debugLine="ScaleLogVals(Axis)";
_scalelogvals(_axis);
 //BA.debugLineNum = 1239;BA.debugLine="Private ValMaxMant, ValMinMant, ValMaxLog, ValMin";
_valmaxmant = 0;
_valminmant = 0;
_valmaxlog = 0;
_valminlog = 0;
 //BA.debugLineNum = 1240;BA.debugLine="ValMinLog = Logarithm(ValMinMax(0), 10)";
_valminlog = __c.Logarithm(_valminmax[(int) (0)],10);
 //BA.debugLineNum = 1241;BA.debugLine="ValMaxLog = Logarithm(ValMinMax(1), 10)";
_valmaxlog = __c.Logarithm(_valminmax[(int) (1)],10);
 //BA.debugLineNum = 1242;BA.debugLine="ValMinMant = Floor(ValMinLog)";
_valminmant = __c.Floor(_valminlog);
 //BA.debugLineNum = 1243;BA.debugLine="ValMaxMant = Floor(ValMaxLog)";
_valmaxmant = __c.Floor(_valmaxlog);
 //BA.debugLineNum = 1244;BA.debugLine="ValMinLog = ValMinLog - ValMinMant";
_valminlog = _valminlog-_valminmant;
 //BA.debugLineNum = 1245;BA.debugLine="ValMaxLog = ValMaxLog - ValMaxMant";
_valmaxlog = _valmaxlog-_valmaxmant;
 //BA.debugLineNum = 1247;BA.debugLine="ScaleLog(Axis).MantMin = ValMinMant";
_scalelog[_axis].MantMin /*int*/  = (int) (_valminmant);
 //BA.debugLineNum = 1248;BA.debugLine="For i = 0 To ScaleLog(Axis).Logs.Length - 2";
{
final int step35 = 1;
final int limit35 = (int) (_scalelog[_axis].Logs /*double[]*/ .length-2);
_i = (int) (0) ;
for (;_i <= limit35 ;_i = _i + step35 ) {
 //BA.debugLineNum = 1249;BA.debugLine="If ValMinLog >= ScaleLog(Axis).Logs(i) And ValMi";
if (_valminlog>=_scalelog[_axis].Logs /*double[]*/ [_i] && _valminlog<_scalelog[_axis].Logs /*double[]*/ [(int) (_i+1)]) { 
 //BA.debugLineNum = 1250;BA.debugLine="ScaleLog(Axis).LogMin = ScaleLog(Axis).Logs(i)";
_scalelog[_axis].LogMin /*double*/  = _scalelog[_axis].Logs /*double[]*/ [_i];
 //BA.debugLineNum = 1251;BA.debugLine="ScaleLog(Axis).LogMinIndex = i";
_scalelog[_axis].LogMinIndex /*int*/  = _i;
 //BA.debugLineNum = 1252;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 1256;BA.debugLine="ScaleLog(Axis).MantMax = ValMaxMant";
_scalelog[_axis].MantMax /*int*/  = (int) (_valmaxmant);
 //BA.debugLineNum = 1257;BA.debugLine="ScaleLog(Axis).LogMax = ValMaxLog";
_scalelog[_axis].LogMax /*double*/  = _valmaxlog;
 //BA.debugLineNum = 1258;BA.debugLine="If ScaleLog(Axis).LogMax <> Abs(0.000000000001) T";
if (_scalelog[_axis].LogMax /*double*/ !=__c.Abs(0.000000000001)) { 
 //BA.debugLineNum = 1259;BA.debugLine="For i = 0 To ScaleLog(Axis).Logs.Length - 2";
{
final int step45 = 1;
final int limit45 = (int) (_scalelog[_axis].Logs /*double[]*/ .length-2);
_i = (int) (0) ;
for (;_i <= limit45 ;_i = _i + step45 ) {
 //BA.debugLineNum = 1260;BA.debugLine="If ValMaxLog > ScaleLog(Axis).Logs(i) And ValMa";
if (_valmaxlog>_scalelog[_axis].Logs /*double[]*/ [_i] && _valmaxlog<=_scalelog[_axis].Logs /*double[]*/ [(int) (_i+1)]) { 
 //BA.debugLineNum = 1261;BA.debugLine="ScaleLog(Axis).LogMax = ScaleLog(Axis).Logs(i";
_scalelog[_axis].LogMax /*double*/  = _scalelog[_axis].Logs /*double[]*/ [(int) (_i+1)];
 //BA.debugLineNum = 1262;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 //BA.debugLineNum = 1267;BA.debugLine="If ScaleLog(Axis).LogMax = 1 Then";
if (_scalelog[_axis].LogMax /*double*/ ==1) { 
 //BA.debugLineNum = 1268;BA.debugLine="ScaleLog(Axis).MantMax = ScaleLog(Axis).MantMax";
_scalelog[_axis].MantMax /*int*/  = (int) (_scalelog[_axis].MantMax /*int*/ +1);
 //BA.debugLineNum = 1269;BA.debugLine="ScaleLog(Axis).LogMax = 0";
_scalelog[_axis].LogMax /*double*/  = 0;
 };
 //BA.debugLineNum = 1271;BA.debugLine="Scale(Axis).MinVal = Power(10, ScaleLog(Axis).Man";
_scale[_axis].MinVal /*double*/  = __c.Power(10,_scalelog[_axis].MantMin /*int*/ +_scalelog[_axis].LogMin /*double*/ );
 //BA.debugLineNum = 1272;BA.debugLine="Scale(Axis).MaxVal = Power(10, ScaleLog(Axis).Man";
_scale[_axis].MaxVal /*double*/  = __c.Power(10,_scalelog[_axis].MantMax /*int*/ +_scalelog[_axis].LogMax /*double*/ );
 //BA.debugLineNum = 1273;BA.debugLine="Scale(Axis).Interval = 1";
_scale[_axis].Interval /*double*/  = 1;
 //BA.debugLineNum = 1274;BA.debugLine="End Sub";
return "";
}
public String  _calcscalelogmanu(int _axis) throws Exception{
double _vallog = 0;
int _i = 0;
 //BA.debugLineNum = 1181;BA.debugLine="Private Sub CalcScaleLogManu(Axis As Int)";
 //BA.debugLineNum = 1182;BA.debugLine="Private ValLog As Double";
_vallog = 0;
 //BA.debugLineNum = 1184;BA.debugLine="ScaleLogVals(Axis)";
_scalelogvals(_axis);
 //BA.debugLineNum = 1186;BA.debugLine="ValLog = Logarithm(Scale(Axis).MaxManu, 10)";
_vallog = __c.Logarithm(_scale[_axis].MaxManu /*double*/ ,10);
 //BA.debugLineNum = 1187;BA.debugLine="ScaleLog(Axis).MantMax = Floor(ValLog)";
_scalelog[_axis].MantMax /*int*/  = (int) (__c.Floor(_vallog));
 //BA.debugLineNum = 1188;BA.debugLine="ScaleLog(Axis).LogMax = ValLog - ScaleLog(Axis).M";
_scalelog[_axis].LogMax /*double*/  = _vallog-_scalelog[_axis].MantMax /*int*/ ;
 //BA.debugLineNum = 1189;BA.debugLine="ValLog = Logarithm(Scale(Axis).MinManu, 10)";
_vallog = __c.Logarithm(_scale[_axis].MinManu /*double*/ ,10);
 //BA.debugLineNum = 1190;BA.debugLine="ScaleLog(Axis).MantMin = Floor(ValLog)";
_scalelog[_axis].MantMin /*int*/  = (int) (__c.Floor(_vallog));
 //BA.debugLineNum = 1191;BA.debugLine="ScaleLog(Axis).LogMin = ValLog - ScaleLog(Axis).M";
_scalelog[_axis].LogMin /*double*/  = _vallog-_scalelog[_axis].MantMin /*int*/ ;
 //BA.debugLineNum = 1193;BA.debugLine="For i = 0 To ScaleLog(Axis).Logs.Length - 2";
{
final int step9 = 1;
final int limit9 = (int) (_scalelog[_axis].Logs /*double[]*/ .length-2);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 1194;BA.debugLine="If Round2(ScaleLog(Axis).LogMin, 14) >= Round2(S";
if (__c.Round2(_scalelog[_axis].LogMin /*double*/ ,(int) (14))>=__c.Round2(_scalelog[_axis].Logs /*double[]*/ [_i],(int) (14)) && __c.Round2(_scalelog[_axis].LogMin /*double*/ ,(int) (14))<__c.Round2(_scalelog[_axis].Logs /*double[]*/ [(int) (_i+1)],(int) (14))) { 
 //BA.debugLineNum = 1195;BA.debugLine="ScaleLog(Axis).LogMin = ScaleLog(Axis).Logs(i)";
_scalelog[_axis].LogMin /*double*/  = _scalelog[_axis].Logs /*double[]*/ [_i];
 //BA.debugLineNum = 1196;BA.debugLine="ScaleLog(Axis).LogMinIndex = i";
_scalelog[_axis].LogMinIndex /*int*/  = _i;
 //BA.debugLineNum = 1197;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 1201;BA.debugLine="If Axis = sX Then";
if (_axis==_sx) { 
 //BA.debugLineNum = 1202;BA.debugLine="ScaleLog(Axis).Scale = Graph.Width / (ScaleLog(A";
_scalelog[_axis].Scale /*double*/  = _graph.Width /*int*/ /(double)(_scalelog[_axis].MantMax /*int*/ +_scalelog[_axis].LogMax /*double*/ -_scalelog[_axis].MantMin /*int*/ -_scalelog[_axis].LogMin /*double*/ );
 }else {
 //BA.debugLineNum = 1204;BA.debugLine="ScaleLog(Axis).Scale = Graph.Height / (ScaleLog(";
_scalelog[_axis].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scalelog[_axis].MantMax /*int*/ +_scalelog[_axis].LogMax /*double*/ -_scalelog[_axis].MantMin /*int*/ -_scalelog[_axis].LogMin /*double*/ );
 };
 //BA.debugLineNum = 1206;BA.debugLine="End Sub";
return "";
}
public String  _calcscalemanu(int _index) throws Exception{
double[] _valminmax = null;
 //BA.debugLineNum = 985;BA.debugLine="Private Sub CalcScaleManu(Index As Int)";
 //BA.debugLineNum = 986;BA.debugLine="Private ValMinMax(3) As Double";
_valminmax = new double[(int) (3)];
;
 //BA.debugLineNum = 988;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"LINE","YX_CHART")) {
case 0: 
case 1: {
 //BA.debugLineNum = 990;BA.debugLine="ValMinMax = GetLinePointsMinMaxMeanValues(sY)";
_valminmax = _getlinepointsminmaxmeanvalues(_sy);
 //BA.debugLineNum = 991;BA.debugLine="If Scale(sY).YZeroAxis = True And ValMinMax(0)";
if (_scale[_sy].YZeroAxis /*boolean*/ ==__c.True && _valminmax[(int) (0)]>=0 && _valminmax[(int) (1)]>0) { 
 //BA.debugLineNum = 992;BA.debugLine="ValMinMax(0) = 0";
_valminmax[(int) (0)] = 0;
 };
 //BA.debugLineNum = 994;BA.debugLine="If Scale(sY).YZeroAxis = True And ValMinMax(0)";
if (_scale[_sy].YZeroAxis /*boolean*/ ==__c.True && _valminmax[(int) (0)]<0 && _valminmax[(int) (1)]<=0) { 
 //BA.debugLineNum = 995;BA.debugLine="ValMinMax(1) = 0";
_valminmax[(int) (1)] = 0;
 };
 break; }
default: {
 //BA.debugLineNum = 998;BA.debugLine="ValMinMax = GetBarPointsMinMaxValues";
_valminmax = _getbarpointsminmaxvalues();
 break; }
}
;
 //BA.debugLineNum = 1001;BA.debugLine="Scale(Index).MaxVal = Scale(Index).MaxManu";
_scale[_index].MaxVal /*double*/  = _scale[_index].MaxManu /*double*/ ;
 //BA.debugLineNum = 1002;BA.debugLine="Scale(Index).MinVal = Scale(Index).MinManu";
_scale[_index].MinVal /*double*/  = _scale[_index].MinManu /*double*/ ;
 //BA.debugLineNum = 1003;BA.debugLine="Scale(Index).IntervalManu = (Scale(Index).MaxVal";
_scale[_index].IntervalManu /*double*/  = (_scale[_index].MaxVal /*double*/ -_scale[_index].MinVal /*double*/ )/(double)_scale[_index].NbIntervals /*int*/ ;
 //BA.debugLineNum = 1004;BA.debugLine="Scale(Index).Interval = Scale(Index).IntervalManu";
_scale[_index].Interval /*double*/  = _scale[_index].IntervalManu /*double*/ ;
 //BA.debugLineNum = 1005;BA.debugLine="Scale(Index).Exp = Floor(Logarithm((Scale(Index).";
_scale[_index].Exp /*double*/  = __c.Floor(__c.Logarithm((_scale[_index].MaxVal /*double*/ -_scale[_index].MinVal /*double*/ )/(double)_scale[_index].NbIntervals /*int*/ ,10));
 //BA.debugLineNum = 1006;BA.debugLine="If Index = sY Then";
if (_index==_sy) { 
 //BA.debugLineNum = 1007;BA.debugLine="Scale(Index).Scale = Graph.Height / (Scale(Index";
_scale[_index].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_index].MaxVal /*double*/ -_scale[_index].MinVal /*double*/ );
 }else {
 //BA.debugLineNum = 1009;BA.debugLine="Scale(Index).Scale = Graph.Width / (Scale(Index)";
_scale[_index].Scale /*double*/  = _graph.Width /*int*/ /(double)(_scale[_index].MaxVal /*double*/ -_scale[_index].MinVal /*double*/ );
 };
 //BA.debugLineNum = 1011;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 210;BA.debugLine="Type ChartData (Title As String, Subtitle As Stri";
;
 //BA.debugLineNum = 211;BA.debugLine="Type PointData (X As String, XArray() As Double,";
;
 //BA.debugLineNum = 212;BA.debugLine="Type ItemData (Name As String, Color As Int, Valu";
;
 //BA.debugLineNum = 213;BA.debugLine="Type ScaleData (Scale As Double, MinVal As Double";
;
 //BA.debugLineNum = 214;BA.debugLine="Type ScaleDataLog(Scale As Double, MantMin As Int";
;
 //BA.debugLineNum = 215;BA.debugLine="Type TextData (TitleFont As B4XFont, SubtitleFont";
;
 //BA.debugLineNum = 216;BA.debugLine="Type LegendData (IncludeLegend As String, TextFon";
;
 //BA.debugLineNum = 217;BA.debugLine="Type ValuesData (Show As Boolean, TextFont As B4X";
;
 //BA.debugLineNum = 218;BA.debugLine="Type NumberFormats(MinimumIntegers As Int, Maximu";
;
 //BA.debugLineNum = 220;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 222;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 223;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 225;BA.debugLine="Public xBase As B4XView";
_xbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 227;BA.debugLine="Private xcvsGraph As B4XCanvas";
_xcvsgraph = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 228;BA.debugLine="Private xpnlValues As B4XView";
_xpnlvalues = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 229;BA.debugLine="Private xcvsValues As B4XCanvas";
_xcvsvalues = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 230;BA.debugLine="Private xpnlCursor As B4XView";
_xpnlcursor = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 231;BA.debugLine="Private xcvsCursor As B4XCanvas";
_xcvscursor = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 232;BA.debugLine="Private pthGrid As B4XPath";
_pthgrid = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 234;BA.debugLine="Private Scale(2) As ScaleData";
_scale = new b4a.example.cov.xchart._scaledata[(int) (2)];
{
int d0 = _scale.length;
for (int i0 = 0;i0 < d0;i0++) {
_scale[i0] = new b4a.example.cov.xchart._scaledata();
}
}
;
 //BA.debugLineNum = 235;BA.debugLine="Private ScaleLog(2) As ScaleDataLog";
_scalelog = new b4a.example.cov.xchart._scaledatalog[(int) (2)];
{
int d0 = _scalelog.length;
for (int i0 = 0;i0 < d0;i0++) {
_scalelog[i0] = new b4a.example.cov.xchart._scaledatalog();
}
}
;
 //BA.debugLineNum = 236;BA.debugLine="Private sY = 0, sX = 1 As Int";
_sy = (int) (0);
_sx = (int) (1);
 //BA.debugLineNum = 237;BA.debugLine="Private Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 238;BA.debugLine="Private Points As List";
_points = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 239;BA.debugLine="Private Graph As ChartData";
_graph = new b4a.example.cov.xchart._chartdata();
 //BA.debugLineNum = 240;BA.debugLine="Private Texts As TextData";
_texts = new b4a.example.cov.xchart._textdata();
 //BA.debugLineNum = 241;BA.debugLine="Private Legend As LegendData";
_legend = new b4a.example.cov.xchart._legenddata();
 //BA.debugLineNum = 242;BA.debugLine="Private Values As ValuesData";
_values = new b4a.example.cov.xchart._valuesdata();
 //BA.debugLineNum = 243;BA.debugLine="Private MinMaxMeanValues(3) As Double";
_minmaxmeanvalues = new double[(int) (3)];
;
 //BA.debugLineNum = 244;BA.debugLine="Private BMVNF As NumberFormats		' Bar Meann Value";
_bmvnf = new b4a.example.cov.xchart._numberformats();
 //BA.debugLineNum = 245;BA.debugLine="Private BMVNFUsed As Boolean			' True if a custom";
_bmvnfused = false;
 //BA.debugLineNum = 246;BA.debugLine="Private BarWidth0 = False As Boolean";
_barwidth0 = __c.False;
 //BA.debugLineNum = 247;BA.debugLine="Private mPiePercentageNbFractions As Int";
_mpiepercentagenbfractions = 0;
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return "";
}
public String  _cleardata() throws Exception{
 //BA.debugLineNum = 2545;BA.debugLine="Public Sub ClearData";
 //BA.debugLineNum = 2546;BA.debugLine="Items.Clear";
_items.Clear();
 //BA.debugLineNum = 2547;BA.debugLine="Points.Clear";
_points.Clear();
 //BA.debugLineNum = 2548;BA.debugLine="End Sub";
return "";
}
public String  _clearpoints() throws Exception{
int _l = 0;
b4a.example.cov.xchart._itemdata _id = null;
 //BA.debugLineNum = 2551;BA.debugLine="Public Sub ClearPoints";
 //BA.debugLineNum = 2552;BA.debugLine="Private l As Int";
_l = 0;
 //BA.debugLineNum = 2553;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 2555;BA.debugLine="Points.Clear";
_points.Clear();
 //BA.debugLineNum = 2556;BA.debugLine="If Graph.ChartType = \"YX_CHART\" And Items.Size >";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART") && _items.getSize()>0) { 
 //BA.debugLineNum = 2557;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit5 ;_l = _l + step5 ) {
 //BA.debugLineNum = 2558;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.cov.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 2559;BA.debugLine="ID.YXArray.Initialize";
_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 }
};
 };
 //BA.debugLineNum = 2562;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 256;BA.debugLine="xBase = Base";
_xbase.setObject((java.lang.Object)(_base));
 //BA.debugLineNum = 258;BA.debugLine="xcvsGraph.Initialize(xBase)";
_xcvsgraph.Initialize(_xbase);
 //BA.debugLineNum = 260;BA.debugLine="Scale(sY).Initialize";
_scale[_sy].Initialize();
 //BA.debugLineNum = 261;BA.debugLine="Scale(sX).Initialize";
_scale[_sx].Initialize();
 //BA.debugLineNum = 262;BA.debugLine="ScaleLog(sY).Initialize";
_scalelog[_sy].Initialize();
 //BA.debugLineNum = 263;BA.debugLine="ScaleLog(sX).Initialize";
_scalelog[_sx].Initialize();
 //BA.debugLineNum = 264;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 265;BA.debugLine="Points.Initialize";
_points.Initialize();
 //BA.debugLineNum = 266;BA.debugLine="Graph.Initialize";
_graph.Initialize();
 //BA.debugLineNum = 267;BA.debugLine="Texts.Initialize";
_texts.Initialize();
 //BA.debugLineNum = 268;BA.debugLine="Legend.Initialize";
_legend.Initialize();
 //BA.debugLineNum = 269;BA.debugLine="Values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 270;BA.debugLine="BMVNF.Initialize";
_bmvnf.Initialize();
 //BA.debugLineNum = 272;BA.debugLine="Legend.LineNumbers.Initialize";
_legend.LineNumbers /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 273;BA.debugLine="Legend.LineChange.Initialize";
_legend.LineChange /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 275;BA.debugLine="Graph.Title = Props.Get(\"Title\")";
_graph.Title /*String*/  = BA.ObjectToString(_props.Get((Object)("Title")));
 //BA.debugLineNum = 276;BA.debugLine="Graph.Subtitle = Props.Get(\"Subtitle\")";
_graph.Subtitle /*String*/  = BA.ObjectToString(_props.Get((Object)("Subtitle")));
 //BA.debugLineNum = 277;BA.debugLine="Graph.XAxisName = Props.Get(\"XAxisName\")";
_graph.XAxisName /*String*/  = BA.ObjectToString(_props.Get((Object)("XAxisName")));
 //BA.debugLineNum = 278;BA.debugLine="Graph.YAxisName = Props.Get(\"YAxisName\")";
_graph.YAxisName /*String*/  = BA.ObjectToString(_props.Get((Object)("YAxisName")));
 //BA.debugLineNum = 279;BA.debugLine="Scale(sY).MaxManu = Props.Get(\"YMaxValue\")";
_scale[_sy].MaxManu /*double*/  = (double)(BA.ObjectToNumber(_props.Get((Object)("YMaxValue"))));
 //BA.debugLineNum = 280;BA.debugLine="Scale(sY).MinManu = Props.Get(\"YMinValue\")";
_scale[_sy].MinManu /*double*/  = (double)(BA.ObjectToNumber(_props.Get((Object)("YMinValue"))));
 //BA.debugLineNum = 281;BA.debugLine="Scale(sY).NbIntervals = Props.Get(\"NbYIntervals\")";
_scale[_sy].NbIntervals /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("NbYIntervals"))));
 //BA.debugLineNum = 282;BA.debugLine="Scale(sY).YZeroAxis = Props.Get(\"YZeroAxis\")";
_scale[_sy].YZeroAxis /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("YZeroAxis")));
 //BA.debugLineNum = 284;BA.debugLine="Scale(sX).MaxManu = Props.Get(\"XMaxValue\")";
_scale[_sx].MaxManu /*double*/  = (double)(BA.ObjectToNumber(_props.Get((Object)("XMaxValue"))));
 //BA.debugLineNum = 285;BA.debugLine="Scale(sX).MinManu = Props.Get(\"XMinValue\")";
_scale[_sx].MinManu /*double*/  = (double)(BA.ObjectToNumber(_props.Get((Object)("XMinValue"))));
 //BA.debugLineNum = 286;BA.debugLine="Scale(sX).NbIntervals = Props.Get(\"NbXIntervals\")";
_scale[_sx].NbIntervals /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("NbXIntervals"))));
 //BA.debugLineNum = 288;BA.debugLine="Graph.ChartType = Props.Get(\"ChartType\")";
_graph.ChartType /*String*/  = BA.ObjectToString(_props.Get((Object)("ChartType")));
 //BA.debugLineNum = 289;BA.debugLine="Graph.ChartBackgroundColor = xui.PaintOrColorToCo";
_graph.ChartBackgroundColor /*int*/  = _xui.PaintOrColorToColor(_props.Get((Object)("ChartBackgroundColor")));
 //BA.debugLineNum = 290;BA.debugLine="If Graph.ChartBackgroundColor = 16777215 Then";
if (_graph.ChartBackgroundColor /*int*/ ==16777215) { 
 //BA.debugLineNum = 291;BA.debugLine="Graph.ChartBackgroundColor = xui.Color_Transpare";
_graph.ChartBackgroundColor /*int*/  = _xui.Color_Transparent;
 };
 //BA.debugLineNum = 293;BA.debugLine="Graph.GridFrameColor = xui.PaintOrColorToColor(Pr";
_graph.GridFrameColor /*int*/  = _xui.PaintOrColorToColor(_props.Get((Object)("GridFrameColor")));
 //BA.debugLineNum = 294;BA.debugLine="Graph.GridColor = xui.PaintOrColorToColor(Props.G";
_graph.GridColor /*int*/  = _xui.PaintOrColorToColor(_props.Get((Object)("GridColor")));
 //BA.debugLineNum = 295;BA.debugLine="Graph.GridColorDark = CalcDarkColor(Graph.GridCol";
_graph.GridColorDark /*int*/  = _calcdarkcolor(_graph.GridColor /*int*/ );
 //BA.debugLineNum = 296;BA.debugLine="Graph.GradientColors = Props.Get(\"GradientColors\"";
_graph.GradientColors /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("GradientColors")));
 //BA.debugLineNum = 297;BA.debugLine="Graph.GradientColorsAlpha = Props.Get(\"GradientCo";
_graph.GradientColorsAlpha /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("GradientColorsAlpha"))));
 //BA.debugLineNum = 298;BA.debugLine="Texts.TitleTextColor = xui.PaintOrColorToColor(Pr";
_texts.TitleTextColor /*int*/  = _xui.PaintOrColorToColor(_props.Get((Object)("TitleTextColor")));
 //BA.debugLineNum = 299;BA.debugLine="Texts.SubtitleTextColor = xui.PaintOrColorToColor";
_texts.SubtitleTextColor /*int*/  = _xui.PaintOrColorToColor(_props.Get((Object)("SubtitleTextColor")));
 //BA.debugLineNum = 300;BA.debugLine="Texts.ScaleTextColor = xui.PaintOrColorToColor(Pr";
_texts.ScaleTextColor /*int*/  = _xui.PaintOrColorToColor(_props.Get((Object)("ScaleTextColor")));
 //BA.debugLineNum = 301;BA.debugLine="Texts.AxisTextColor = xui.PaintOrColorToColor(Pro";
_texts.AxisTextColor /*int*/  = _xui.PaintOrColorToColor(_props.Get((Object)("AxisTextColor")));
 //BA.debugLineNum = 302;BA.debugLine="Texts.TitleTextSize = Props.Get(\"TitleTextSize\")";
_texts.TitleTextSize /*float*/  = (float)(BA.ObjectToNumber(_props.Get((Object)("TitleTextSize"))));
 //BA.debugLineNum = 303;BA.debugLine="Texts.SubtitleTextSize = Props.Get(\"SubtitleTextS";
_texts.SubtitleTextSize /*float*/  = (float)(BA.ObjectToNumber(_props.Get((Object)("SubtitleTextSize"))));
 //BA.debugLineNum = 304;BA.debugLine="Texts.AxisTextSize = Props.Get(\"AxisTextSize\")";
_texts.AxisTextSize /*float*/  = (float)(BA.ObjectToNumber(_props.Get((Object)("AxisTextSize"))));
 //BA.debugLineNum = 305;BA.debugLine="Texts.ScaleTextSize = Props.Get(\"ScaleTextSize\")";
_texts.ScaleTextSize /*float*/  = (float)(BA.ObjectToNumber(_props.Get((Object)("ScaleTextSize"))));
 //BA.debugLineNum = 306;BA.debugLine="Legend.TextSize = Props.Get(\"LegendTextSize\")";
_legend.TextSize /*float*/  = (float)(BA.ObjectToNumber(_props.Get((Object)("LegendTextSize"))));
 //BA.debugLineNum = 307;BA.debugLine="Texts.AutomaticTextSizes = Props.Get(\"AutomaticTe";
_texts.AutomaticTextSizes /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("AutomaticTextSizes")));
 //BA.debugLineNum = 308;BA.debugLine="Scale(sY).Automatic = Props.Get(\"AutomaticScale\")";
_scale[_sy].Automatic /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("AutomaticScale")));
 //BA.debugLineNum = 309;BA.debugLine="If Graph.ChartType = \"YX_CHART\" Then";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART")) { 
 //BA.debugLineNum = 310;BA.debugLine="Scale(sX).Automatic = Props.Get(\"AutomaticScale\"";
_scale[_sx].Automatic /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("AutomaticScale")));
 }else {
 //BA.debugLineNum = 312;BA.debugLine="Scale(sX).Automatic = False";
_scale[_sx].Automatic /*boolean*/  = __c.False;
 };
 //BA.debugLineNum = 314;BA.debugLine="Scale(sY).Logarithmic = Props.Get(\"LogarithmicYSc";
_scale[_sy].Logarithmic /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("LogarithmicYScale")));
 //BA.debugLineNum = 315;BA.debugLine="Scale(sX).Logarithmic = Props.Get(\"LogarithmicXSc";
_scale[_sx].Logarithmic /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("LogarithmicXScale")));
 //BA.debugLineNum = 316;BA.debugLine="Scale(sY).ScaleValues = Props.Get(\"ScaleValues\")";
_scale[_sy].ScaleValues /*String*/  = BA.ObjectToString(_props.Get((Object)("ScaleValues")));
 //BA.debugLineNum = 317;BA.debugLine="ScaleLog(sY).ScaleValues = Props.Get(\"ScaleYValue";
_scalelog[_sy].ScaleValues /*String*/  = BA.ObjectToString(_props.Get((Object)("ScaleYValuesLog")));
 //BA.debugLineNum = 318;BA.debugLine="ScaleLog(sX).ScaleValues = Props.Get(\"ScaleXValue";
_scalelog[_sx].ScaleValues /*String*/  = BA.ObjectToString(_props.Get((Object)("ScaleXValuesLog")));
 //BA.debugLineNum = 319;BA.debugLine="Graph.XScaleTextOrientation = Props.Get(\"XScaleTe";
_graph.XScaleTextOrientation /*String*/  = BA.ObjectToString(_props.Get((Object)("XScaleTextOrientation")));
 //BA.debugLineNum = 320;BA.debugLine="Legend.IncludeLegend = Props.Get(\"IncludeLegend\")";
_legend.IncludeLegend /*String*/  = BA.ObjectToString(_props.Get((Object)("IncludeLegend")));
 //BA.debugLineNum = 321;BA.debugLine="Graph.IncludeValues = Props.Get(\"IncludeValues\")";
_graph.IncludeValues /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("IncludeValues")));
 //BA.debugLineNum = 322;BA.debugLine="Graph.BarValueOrientation = Props.Get(\"BarValueOr";
_graph.BarValueOrientation /*String*/  = BA.ObjectToString(_props.Get((Object)("BarValueOrientation")));
 //BA.debugLineNum = 323;BA.debugLine="Graph.PieAddPerentage = Props.Get(\"PieAddPerentag";
_graph.PieAddPerentage /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("PieAddPerentage")));
 //BA.debugLineNum = 324;BA.debugLine="Graph.PieGapDegrees = Props.Get(\"PieGapDegrees\")";
_graph.PieGapDegrees /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("PieGapDegrees"))));
 //BA.debugLineNum = 325;BA.debugLine="mPiePercentageNbFractions = Props.Get(\"PiePerenta";
_mpiepercentagenbfractions = (int)(BA.ObjectToNumber(_props.Get((Object)("PiePerentageNbFractions"))));
 //BA.debugLineNum = 326;BA.debugLine="mPiePercentageNbFractions = Max(mPiePercentageNbF";
_mpiepercentagenbfractions = (int) (__c.Max(_mpiepercentagenbfractions,0));
 //BA.debugLineNum = 327;BA.debugLine="mPiePercentageNbFractions = Min(mPiePercentageNbF";
_mpiepercentagenbfractions = (int) (__c.Min(_mpiepercentagenbfractions,2));
 //BA.debugLineNum = 328;BA.debugLine="Values.Show = Props.Get(\"ValuesShow\")";
_values.Show /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ValuesShow")));
 //BA.debugLineNum = 329;BA.debugLine="Values.Position = Props.Get(\"ValuesPosition\")";
_values.Position /*String*/  = BA.ObjectToString(_props.Get((Object)("ValuesPosition")));
 //BA.debugLineNum = 330;BA.debugLine="Values.TextSize = Props.Get(\"ValuesTextSize\")";
_values.TextSize /*float*/  = (float)(BA.ObjectToNumber(_props.Get((Object)("ValuesTextSize"))));
 //BA.debugLineNum = 331;BA.debugLine="Values.TextColor = xui.PaintOrColorToColor(Props.";
_values.TextColor /*int*/  = _xui.PaintOrColorToColor(_props.Get((Object)("ValuesTextColor")));
 //BA.debugLineNum = 332;BA.debugLine="Graph.IncludeBarMeanLine = Props.Get(\"IncludeBarM";
_graph.IncludeBarMeanLine /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("IncludeBarMeanLine")));
 //BA.debugLineNum = 333;BA.debugLine="Graph.IncludeMinLine = Props.Get(\"IncludeMinLine\"";
_graph.IncludeMinLine /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("IncludeMinLine")));
 //BA.debugLineNum = 334;BA.debugLine="Graph.IncludeMaxLine = Props.Get(\"IncludeMaxLine\"";
_graph.IncludeMaxLine /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("IncludeMaxLine")));
 //BA.debugLineNum = 335;BA.debugLine="Graph.IncludeMeanLine = Props.Get(\"IncludeMeanLin";
_graph.IncludeMeanLine /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("IncludeMeanLine")));
 //BA.debugLineNum = 336;BA.debugLine="Graph.MinLineColor = xui.PaintOrColorToColor(Prop";
_graph.MinLineColor /*int*/  = _xui.PaintOrColorToColor(_props.Get((Object)("MinLineColor")));
 //BA.debugLineNum = 337;BA.debugLine="Graph.MaxLineColor = xui.PaintOrColorToColor(Prop";
_graph.MaxLineColor /*int*/  = _xui.PaintOrColorToColor(_props.Get((Object)("MaxLineColor")));
 //BA.debugLineNum = 338;BA.debugLine="Graph.MeanLineColor = xui.PaintOrColorToColor(Pro";
_graph.MeanLineColor /*int*/  = _xui.PaintOrColorToColor(_props.Get((Object)("MeanLineColor")));
 //BA.debugLineNum = 339;BA.debugLine="Graph.DrawOuterFrame = Props.Get(\"DrawOuterFrame\"";
_graph.DrawOuterFrame /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("DrawOuterFrame")));
 //BA.debugLineNum = 340;BA.debugLine="xpnlCursor = xui.CreatePanel(\"xpnlCursor\")";
_xpnlcursor = _xui.CreatePanel(ba,"xpnlCursor");
 //BA.debugLineNum = 341;BA.debugLine="xBase.AddView(xpnlCursor, 0, 0, xBase.Width, xBas";
_xbase.AddView((android.view.View)(_xpnlcursor.getObject()),(int) (0),(int) (0),_xbase.getWidth(),_xbase.getHeight());
 //BA.debugLineNum = 342;BA.debugLine="xcvsCursor.Initialize(xpnlCursor)";
_xcvscursor.Initialize(_xpnlcursor);
 //BA.debugLineNum = 344;BA.debugLine="xpnlValues = xui.CreatePanel(\"xpnlValues\")";
_xpnlvalues = _xui.CreatePanel(ba,"xpnlValues");
 //BA.debugLineNum = 345;BA.debugLine="xBase.AddView(xpnlValues, 0, 0, 100dip, 100dip)";
_xbase.AddView((android.view.View)(_xpnlvalues.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (100)));
 //BA.debugLineNum = 346;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 //BA.debugLineNum = 347;BA.debugLine="xcvsValues.Initialize(xpnlValues)";
_xcvsvalues.Initialize(_xpnlvalues);
 //BA.debugLineNum = 349;BA.debugLine="BMVNFUsed = False";
_bmvnfused = __c.False;
 //BA.debugLineNum = 350;BA.debugLine="BMVNF.MinimumIntegers = 1";
_bmvnf.MinimumIntegers /*int*/  = (int) (1);
 //BA.debugLineNum = 351;BA.debugLine="BMVNF.MaximumFractions = 2";
_bmvnf.MaximumFractions /*int*/  = (int) (2);
 //BA.debugLineNum = 352;BA.debugLine="BMVNF.MinimumFractions = 2";
_bmvnf.MinimumFractions /*int*/  = (int) (2);
 //BA.debugLineNum = 353;BA.debugLine="BMVNF.GroupingUsed = False";
_bmvnf.GroupingUsed /*boolean*/  = __c.False;
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return "";
}
public String  _drawbarmeanline() throws Exception{
b4a.example.cov.xchart._pointdata _pd = null;
int _i = 0;
int _smean = 0;
int _smean0 = 0;
int _h = 0;
int _x0 = 0;
int _y0 = 0;
int _yt = 0;
double _total = 0;
double _mean = 0;
String _txt = "";
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rcttext = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rctmean = null;
double _txtw = 0;
double _txth = 0;
 //BA.debugLineNum = 2181;BA.debugLine="Private Sub DrawBarMeanLine";
 //BA.debugLineNum = 2182;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues(1";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0) { 
if (true) return "";};
 //BA.debugLineNum = 2184;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 2185;BA.debugLine="PD = Points.Get(0)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 2187;BA.debugLine="If PD.YArray.Length > 1 Then Return";
if (_pd.YArray /*double[]*/ .length>1) { 
if (true) return "";};
 //BA.debugLineNum = 2189;BA.debugLine="Private i, sMean, sMean0, h, x0, y0, yt As Int";
_i = 0;
_smean = 0;
_smean0 = 0;
_h = 0;
_x0 = 0;
_y0 = 0;
_yt = 0;
 //BA.debugLineNum = 2190;BA.debugLine="Private Total, Mean As Double";
_total = 0;
_mean = 0;
 //BA.debugLineNum = 2191;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 2192;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2193;BA.debugLine="Total = Total + PD.YArray(0)";
_total = _total+_pd.YArray /*double[]*/ [(int) (0)];
 }
};
 //BA.debugLineNum = 2195;BA.debugLine="Mean = Total / Points.Size";
_mean = _total/(double)_points.getSize();
 //BA.debugLineNum = 2196;BA.debugLine="sMean0 = Mean * Scale(sY).Scale";
_smean0 = (int) (_mean*_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2197;BA.debugLine="sMean = Graph.Bottom - (Mean - Scale(sY).MinVal)";
_smean = (int) (_graph.Bottom /*int*/ -(_mean-_scale[_sy].MinVal /*double*/ )*_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2202;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMean, Graph.Right";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smean),(float) (_graph.Right /*int*/ ),(float) (_smean),_graph.MeanLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 2204;BA.debugLine="If Scale(sY).MinVal = 0 And Scale(sY).MaxVal > 0";
if (_scale[_sy].MinVal /*double*/ ==0 && _scale[_sy].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 2205;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 2206;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 2207;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2208;BA.debugLine="h = PD.YArray(0) * Scale(sY).Scale";
_h = (int) (_pd.YArray /*double[]*/ [(int) (0)]*_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2209;BA.debugLine="If sMean0 > h + 0.5 * Texts.ScaleTextHeight The";
if (_smean0>_h+0.5*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 2210;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (i  + 0.5) *";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_i+0.5)*_graph.XInterval /*int*/ );
 //BA.debugLineNum = 2211;BA.debugLine="y0 = sMean - 0.9 * Texts.ScaleTextHeight";
_y0 = (int) (_smean-0.9*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 2212;BA.debugLine="yt = sMean - 0.2 * Texts.ScaleTextHeight";
_yt = (int) (_smean-0.2*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 2213;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else if(_scale[_sy].MinVal /*double*/ <0 && _scale[_sy].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 2217;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step28 = 1;
final int limit28 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
 //BA.debugLineNum = 2218;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 2219;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2220;BA.debugLine="h = -PD.YArray(0) * Scale(sY).Scale";
_h = (int) (-_pd.YArray /*double[]*/ [(int) (0)]*_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2221;BA.debugLine="If -sMean0 > h + 0.2 * Texts.ScaleTextHeight Th";
if (-_smean0>_h+0.2*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 2222;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (i  + 0.5) *";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_i+0.5)*_graph.XInterval /*int*/ );
 //BA.debugLineNum = 2223;BA.debugLine="y0 = sMean + 0.2 * Texts.ScaleTextHeight";
_y0 = (int) (_smean+0.2*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 2224;BA.debugLine="yt = sMean + 0.8 * Texts.ScaleTextHeight";
_yt = (int) (_smean+0.8*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 2225;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else {
 //BA.debugLineNum = 2229;BA.debugLine="If Mean >= 0 Then";
if (_mean>=0) { 
 //BA.debugLineNum = 2230;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step41 = 1;
final int limit41 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit41 ;_i = _i + step41 ) {
 //BA.debugLineNum = 2231;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 2232;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2233;BA.debugLine="h = PD.YArray(0) * Scale(sY).Scale";
_h = (int) (_pd.YArray /*double[]*/ [(int) (0)]*_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2234;BA.debugLine="If Mean >= 0 And sMean0 > h + 0.5 * Texts.Scal";
if (_mean>=0 && _smean0>_h+0.5*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 2235;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (i  + 0.5)";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_i+0.5)*_graph.XInterval /*int*/ );
 //BA.debugLineNum = 2236;BA.debugLine="y0 = sMean - 0.9 * Texts.ScaleTextHeight";
_y0 = (int) (_smean-0.9*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 2237;BA.debugLine="yt = sMean - 0.2 * Texts.ScaleTextHeight";
_yt = (int) (_smean-0.2*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 2238;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }else {
 //BA.debugLineNum = 2242;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step53 = 1;
final int limit53 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit53 ;_i = _i + step53 ) {
 //BA.debugLineNum = 2243;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 2244;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2245;BA.debugLine="h = -PD.YArray(0) * Scale(sY).Scale";
_h = (int) (-_pd.YArray /*double[]*/ [(int) (0)]*_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2246;BA.debugLine="If Mean < 0 And -sMean0 > h + 0.2 * Texts.Scal";
if (_mean<0 && -_smean0>_h+0.2*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 2247;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (i  + 0.5)";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_i+0.5)*_graph.XInterval /*int*/ );
 //BA.debugLineNum = 2248;BA.debugLine="y0 = sMean + 0.2 * Texts.ScaleTextHeight";
_y0 = (int) (_smean+0.2*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 2249;BA.debugLine="yt = sMean + 0.8 * Texts.ScaleTextHeight";
_yt = (int) (_smean+0.8*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 2250;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 };
 //BA.debugLineNum = 2256;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 2257;BA.debugLine="Private rctText, rctMean As B4XRect";
_rcttext = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rctmean = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 2258;BA.debugLine="Private txtW, txtH As Double";
_txtw = 0;
_txth = 0;
 //BA.debugLineNum = 2259;BA.debugLine="If BMVNFUsed = False Then";
if (_bmvnfused==__c.False) { 
 //BA.debugLineNum = 2260;BA.debugLine="txt = NumberFormat3(Mean, 6)";
_txt = _numberformat3(_mean,(int) (6));
 }else {
 //BA.debugLineNum = 2262;BA.debugLine="txt = NumberFormat2(Mean, BMVNF.MinimumIntegers,";
_txt = __c.NumberFormat2(_mean,_bmvnf.MinimumIntegers /*int*/ ,_bmvnf.MaximumFractions /*int*/ ,_bmvnf.MinimumFractions /*int*/ ,_bmvnf.GroupingUsed /*boolean*/ );
 };
 //BA.debugLineNum = 2264;BA.debugLine="rctText = xcvsGraph.MeasureText(txt, Texts.ScaleF";
_rcttext = _xcvsgraph.MeasureText(_txt,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2265;BA.debugLine="txtW = 4dip + rctText.Width";
_txtw = __c.DipToCurrent((int) (4))+_rcttext.getWidth();
 //BA.debugLineNum = 2266;BA.debugLine="txtH = 1.2 * rctText.Height";
_txth = 1.2*_rcttext.getHeight();
 //BA.debugLineNum = 2267;BA.debugLine="rctMean.Initialize(x0 - txtW / 2, y0, x0 + txtW /";
_rctmean.Initialize((float) (_x0-_txtw/(double)2),(float) (_y0),(float) (_x0+_txtw/(double)2),(float) (_y0+_txth));
 //BA.debugLineNum = 2268;BA.debugLine="xcvsGraph.DrawRect(rctMean, Graph.ChartBackground";
_xcvsgraph.DrawRect(_rctmean,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 2269;BA.debugLine="xcvsGraph.DrawText(txt, x0, yt, Texts.ScaleFont,";
_xcvsgraph.DrawText(ba,_txt,(float) (_x0),(float) (_yt),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_graph.MeanLineColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 2271;BA.debugLine="End Sub";
return "";
}
public String  _drawbars() throws Exception{
int _i = 0;
int _j = 0;
int _x0 = 0;
int _x = 0;
int _h = 0;
int _y = 0;
int[] _cols = null;
int[] _acols = null;
String[] _names = null;
b4a.example.cov.xchart._itemdata _id = null;
b4a.example.bitmapcreator._argbcolor _argb = null;
b4a.example.bitmapcreator _bmpcreate = null;
int _myaxis0 = 0;
b4a.example.cov.xchart._pointdata _pd = null;
double[] _py = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rb = null;
b4a.example.bitmapcreator _bmc1 = null;
 //BA.debugLineNum = 2082;BA.debugLine="Private Sub DrawBars";
 //BA.debugLineNum = 2083;BA.debugLine="Private i, j, x0, x, h, y As Int";
_i = 0;
_j = 0;
_x0 = 0;
_x = 0;
_h = 0;
_y = 0;
 //BA.debugLineNum = 2084;BA.debugLine="Private Cols(Items.Size), ACols(Items.Size) As In";
_cols = new int[_items.getSize()];
;
_acols = new int[_items.getSize()];
;
 //BA.debugLineNum = 2085;BA.debugLine="Private Names(Items.Size) As String";
_names = new String[_items.getSize()];
java.util.Arrays.fill(_names,"");
 //BA.debugLineNum = 2087;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 2088;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 2089;BA.debugLine="ID = Items.Get(i)";
_id = (b4a.example.cov.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 2090;BA.debugLine="Cols(i) = ID.Color";
_cols[_i] = _id.Color /*int*/ ;
 //BA.debugLineNum = 2091;BA.debugLine="Private ARGB As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 2092;BA.debugLine="Private BmpCreate As BitmapCreator";
_bmpcreate = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 2093;BA.debugLine="BmpCreate.Initialize(10, 10)";
_bmpcreate._initialize(ba,(int) (10),(int) (10));
 //BA.debugLineNum = 2094;BA.debugLine="BmpCreate.ColorToARGB(Cols(i), ARGB)";
_bmpcreate._colortoargb(_cols[_i],_argb);
 //BA.debugLineNum = 2095;BA.debugLine="ACols(i) = xui.Color_ARGB(Graph.GradientColorsAl";
_acols[_i] = _xui.Color_ARGB(_graph.GradientColorsAlpha /*int*/ ,_argb.r,_argb.g,_argb.b);
 //BA.debugLineNum = 2096;BA.debugLine="Names(i) = ID.Name";
_names[_i] = _id.Name /*String*/ ;
 }
};
 //BA.debugLineNum = 2099;BA.debugLine="If Graph.ChartType = \"BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("BAR")) { 
 //BA.debugLineNum = 2100;BA.debugLine="Private mYAxis0 = Graph.Bottom + Scale(sY).MinVa";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy].MinVal /*double*/ *_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2102;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step17 = 1;
final int limit17 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
 //BA.debugLineNum = 2103;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 2104;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2105;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 2106;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (i  + 0.5) *";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_i+0.5)*_graph.XInterval /*int*/ -_graph.BarWidth /*int*/ /(double)2);
 //BA.debugLineNum = 2107;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 2109;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step23 = 1;
final int limit23 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit23 ;_j = _j + step23 ) {
 //BA.debugLineNum = 2110;BA.debugLine="Private r, rb As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rb = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 2111;BA.debugLine="x = x0 + j * Graph.BarSubWidth";
_x = (int) (_x0+_j*_graph.BarSubWidth /*int*/ );
 //BA.debugLineNum = 2112;BA.debugLine="h = py(j) * Scale(sY).Scale";
_h = (int) (_py[_j]*_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2114;BA.debugLine="If h > 0 Then";
if (_h>0) { 
 //BA.debugLineNum = 2115;BA.debugLine="r.Initialize(x, mYAxis0 - h, x + Graph.BarSub";
_r.Initialize((float) (_x),(float) (_myaxis0-_h),(float) (_x+_graph.BarSubWidth /*int*/ ),(float) (_myaxis0));
 }else {
 //BA.debugLineNum = 2117;BA.debugLine="r.Initialize(x, mYAxis0, x + Graph.BarSubWidt";
_r.Initialize((float) (_x),(float) (_myaxis0),(float) (_x+_graph.BarSubWidth /*int*/ ),(float) (_myaxis0-_h));
 };
 //BA.debugLineNum = 2119;BA.debugLine="If Graph.GradientColors = False Then";
if (_graph.GradientColors /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2120;BA.debugLine="xcvsGraph.DrawRect(r, Cols(j), True, 1dip)";
_xcvsgraph.DrawRect(_r,_cols[_j],__c.True,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 2122;BA.debugLine="Private bmc1 As BitmapCreator";
_bmc1 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 2123;BA.debugLine="rb.Initialize(0, 0, Graph.BarSubWidth, Max(1,";
_rb.Initialize((float) (0),(float) (0),(float) (_graph.BarSubWidth /*int*/ ),(float) (__c.Max(1,__c.Abs(_h))));
 //BA.debugLineNum = 2124;BA.debugLine="bmc1.Initialize(Graph.BarSubWidth, Max(1, Abs";
_bmc1._initialize(ba,_graph.BarSubWidth /*int*/ ,(int) (__c.Max(1,__c.Abs(_h))));
 //BA.debugLineNum = 2125;BA.debugLine="If h > 0 Then";
if (_h>0) { 
 //BA.debugLineNum = 2126;BA.debugLine="bmc1.FillGradient(Array As Int(Cols(j), ACol";
_bmc1._fillgradient(new int[]{_cols[_j],_acols[_j]},_rb,"TOP_BOTTOM");
 }else {
 //BA.debugLineNum = 2128;BA.debugLine="bmc1.FillGradient(Array As Int(Cols(j), ACol";
_bmc1._fillgradient(new int[]{_cols[_j],_acols[_j]},_rb,"BOTTOM_TOP");
 };
 //BA.debugLineNum = 2130;BA.debugLine="xcvsGraph.DrawBitmap(bmc1.Bitmap, r)";
_xcvsgraph.DrawBitmap((android.graphics.Bitmap)(_bmc1._getbitmap().getObject()),_r);
 };
 }
};
 }
};
 //BA.debugLineNum = 2134;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.Ri";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 2136;BA.debugLine="If Graph.IncludeValues = True And PD.YArray.Leng";
if (_graph.IncludeValues /*boolean*/ ==__c.True && _pd.YArray /*double[]*/ .length==1) { 
 //BA.debugLineNum = 2137;BA.debugLine="DrawBarValues";
_drawbarvalues();
 };
 //BA.debugLineNum = 2140;BA.debugLine="If Graph.IncludeBarMeanLine = True Then";
if (_graph.IncludeBarMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 2141;BA.debugLine="DrawBarMeanLine";
_drawbarmeanline();
 };
 }else {
 //BA.debugLineNum = 2144;BA.debugLine="Private mYAxis0 = Graph.Bottom As Int";
_myaxis0 = _graph.Bottom /*int*/ ;
 //BA.debugLineNum = 2146;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step56 = 1;
final int limit56 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit56 ;_i = _i + step56 ) {
 //BA.debugLineNum = 2147;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 2148;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2149;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 2150;BA.debugLine="x0 = Graph.Left + Graph.XOffset + (i  + 0.5) *";
_x0 = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_i+0.5)*_graph.XInterval /*int*/ -_graph.BarWidth /*int*/ /(double)2);
 //BA.debugLineNum = 2151;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 2153;BA.debugLine="y = mYAxis0";
_y = _myaxis0;
 //BA.debugLineNum = 2154;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step63 = 1;
final int limit63 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit63 ;_j = _j + step63 ) {
 //BA.debugLineNum = 2155;BA.debugLine="Private r, rb As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_rb = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 2156;BA.debugLine="h = py(j) * Scale(sY).Scale";
_h = (int) (_py[_j]*_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2157;BA.debugLine="r.Initialize(x0, y - h, x0 + Graph.BarWidth, y";
_r.Initialize((float) (_x0),(float) (_y-_h),(float) (_x0+_graph.BarWidth /*int*/ ),(float) (_y));
 //BA.debugLineNum = 2158;BA.debugLine="If Graph.GradientColors = False Then";
if (_graph.GradientColors /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2159;BA.debugLine="xcvsGraph.DrawRect(r, Cols(j), True, 1dip)";
_xcvsgraph.DrawRect(_r,_cols[_j],__c.True,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 2161;BA.debugLine="rb.Initialize(0, 0, Graph.BarSubWidth, Max(1,";
_rb.Initialize((float) (0),(float) (0),(float) (_graph.BarSubWidth /*int*/ ),(float) (__c.Max(1,__c.Abs(_h))));
 //BA.debugLineNum = 2162;BA.debugLine="Private bmc1 As BitmapCreator";
_bmc1 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 2163;BA.debugLine="bmc1.Initialize(Graph.BarSubWidth, Max(1, Abs";
_bmc1._initialize(ba,_graph.BarSubWidth /*int*/ ,(int) (__c.Max(1,__c.Abs(_h))));
 //BA.debugLineNum = 2164;BA.debugLine="bmc1.FillGradient(Array As Int(Cols(j), ACols";
_bmc1._fillgradient(new int[]{_cols[_j],_acols[_j]},_rb,"TOP_BOTTOM");
 //BA.debugLineNum = 2165;BA.debugLine="xcvsGraph.DrawBitmap(bmc1.Bitmap, r)";
_xcvsgraph.DrawBitmap((android.graphics.Bitmap)(_bmc1._getbitmap().getObject()),_r);
 };
 //BA.debugLineNum = 2167;BA.debugLine="y = y - h";
_y = (int) (_y-_h);
 }
};
 }
};
 //BA.debugLineNum = 2170;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.Ri";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 2173;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Items.Size";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _items.getSize()>0) { 
 //BA.debugLineNum = 2174;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 2177;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 2178;BA.debugLine="End Sub";
return "";
}
public String  _drawbarvalues() throws Exception{
int _i = 0;
int _h = 0;
int _x = 0;
int _xt = 0;
int _dy = 0;
int _y = 0;
int _yt = 0;
int _col = 0;
String _txt = "";
int _myaxis0 = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttext = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _recttextbackground = null;
int _textwidth = 0;
String _localbarvalueorientation = "";
float _localtextsize = 0f;
int _localtextheight = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _localfont = null;
b4a.example.cov.xchart._itemdata _id = null;
b4a.example.cov.xchart._pointdata _pd = null;
double[] _py = null;
String _textalignment = "";
 //BA.debugLineNum = 2274;BA.debugLine="Private Sub DrawBarValues";
 //BA.debugLineNum = 2275;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues(1";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0) { 
if (true) return "";};
 //BA.debugLineNum = 2277;BA.debugLine="Private i, h, x, xt, dy, y, yt As Int";
_i = 0;
_h = 0;
_x = 0;
_xt = 0;
_dy = 0;
_y = 0;
_yt = 0;
 //BA.debugLineNum = 2278;BA.debugLine="Private Col As Int";
_col = 0;
 //BA.debugLineNum = 2279;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 2280;BA.debugLine="Private mYAxis0 = Graph.Bottom + Scale(sY).MinVal";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy].MinVal /*double*/ *_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2281;BA.debugLine="Private rectText, rectTextBackground As B4XRect";
_recttext = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
_recttextbackground = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 2282;BA.debugLine="Private TextWidth As Int";
_textwidth = 0;
 //BA.debugLineNum = 2283;BA.debugLine="Private LocalBarValueOrientation As String";
_localbarvalueorientation = "";
 //BA.debugLineNum = 2284;BA.debugLine="Private LocalTextSize As Float";
_localtextsize = 0f;
 //BA.debugLineNum = 2285;BA.debugLine="Private LocalTextHeight As Int";
_localtextheight = 0;
 //BA.debugLineNum = 2286;BA.debugLine="Private LocalFont As B4XFont";
_localfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 2287;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 2289;BA.debugLine="ID = Items.Get(0)";
_id = (b4a.example.cov.xchart._itemdata)(_items.Get((int) (0)));
 //BA.debugLineNum = 2291;BA.debugLine="LocalBarValueOrientation = Graph.BarValueOrientat";
_localbarvalueorientation = _graph.BarValueOrientation /*String*/ ;
 //BA.debugLineNum = 2292;BA.debugLine="LocalFont = Texts.ScaleFont";
_localfont = _texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 //BA.debugLineNum = 2293;BA.debugLine="LocalTextHeight = Texts.ScaleTextHeight";
_localtextheight = _texts.ScaleTextHeight /*int*/ ;
 //BA.debugLineNum = 2294;BA.debugLine="LocalTextSize = Texts.ScaleTextSize";
_localtextsize = _texts.ScaleTextSize /*float*/ ;
 //BA.debugLineNum = 2296;BA.debugLine="If Graph.BarValueOrientation = \"HORIZONTAL\" Then";
if ((_graph.BarValueOrientation /*String*/ ).equals("HORIZONTAL")) { 
 //BA.debugLineNum = 2297;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step19 = 1;
final int limit19 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit19 ;_i = _i + step19 ) {
 //BA.debugLineNum = 2298;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 2299;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2300;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 2301;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 2302;BA.debugLine="rectText = xcvsGraph.MeasureText(py(0), Texts.S";
_recttext = _xcvsgraph.MeasureText(BA.NumberToString(_py[(int) (0)]),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2303;BA.debugLine="TextWidth = rectText.Width + Texts.ScaleTextHei";
_textwidth = (int) (_recttext.getWidth()+_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 2304;BA.debugLine="If TextWidth + Texts.ScaleTextHeight > Graph.XI";
if (_textwidth+_texts.ScaleTextHeight /*int*/ >_graph.XInterval /*int*/ ) { 
 //BA.debugLineNum = 2305;BA.debugLine="LocalBarValueOrientation = \"VERTICAL\"";
_localbarvalueorientation = "VERTICAL";
 //BA.debugLineNum = 2306;BA.debugLine="Log(\"xChart BarValueOrientation set to VERTICA";
__c.LogImpl("96684704","xChart BarValueOrientation set to VERTICAL",0);
 //BA.debugLineNum = 2307;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 //BA.debugLineNum = 2312;BA.debugLine="If LocalBarValueOrientation = \"VERTICAL\" Then";
if ((_localbarvalueorientation).equals("VERTICAL")) { 
 //BA.debugLineNum = 2313;BA.debugLine="Private TextAlignment As String";
_textalignment = "";
 //BA.debugLineNum = 2316;BA.debugLine="If Texts.ScaleTextHeight - 4dip > Graph.BarWidth";
if (_texts.ScaleTextHeight /*int*/ -__c.DipToCurrent((int) (4))>_graph.BarWidth /*int*/ ) { 
 //BA.debugLineNum = 2317;BA.debugLine="rectText = xcvsGraph.MeasureText(\"10\", Texts.Sc";
_recttext = _xcvsgraph.MeasureText("10",_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 2318;BA.debugLine="LocalTextSize = Texts.ScaleTextSize * Graph.Bar";
_localtextsize = (float) (_texts.ScaleTextSize /*float*/ *_graph.BarWidth /*int*/ /(double)_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 2319;BA.debugLine="LocalFont = xui.CreateFont2(Texts.ScaleFont, Lo";
_localfont = _xui.CreateFont2(_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_localtextsize);
 //BA.debugLineNum = 2320;BA.debugLine="LocalTextHeight = Texts.ScaleTextHeight * Local";
_localtextheight = (int) (_texts.ScaleTextHeight /*int*/ *_localtextsize/(double)_texts.ScaleTextSize /*float*/ );
 //BA.debugLineNum = 2321;BA.debugLine="If LocalTextSize < 10 Then";
if (_localtextsize<10) { 
 //BA.debugLineNum = 2322;BA.debugLine="Log(\"Bar value text size too small\")";
__c.LogImpl("96684720","Bar value text size too small",0);
 //BA.debugLineNum = 2323;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 2327;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step45 = 1;
final int limit45 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit45 ;_i = _i + step45 ) {
 //BA.debugLineNum = 2328;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 2329;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2330;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 2331;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 2332;BA.debugLine="xt = Graph.Left + Graph.XOffset + (i + 0.5) * G";
_xt = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_i+0.5)*_graph.XInterval /*int*/ +0.28*_localtextheight);
 //BA.debugLineNum = 2333;BA.debugLine="x = xt - 0.72 * LocalTextHeight";
_x = (int) (_xt-0.72*_localtextheight);
 //BA.debugLineNum = 2334;BA.debugLine="h = py(0) * Scale(sY).Scale";
_h = (int) (_py[(int) (0)]*_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2335;BA.debugLine="rectText = xcvsGraph.MeasureText(py(0), LocalFo";
_recttext = _xcvsgraph.MeasureText(BA.NumberToString(_py[(int) (0)]),_localfont);
 //BA.debugLineNum = 2336;BA.debugLine="TextWidth = rectText.Width + LocalTextHeight";
_textwidth = (int) (_recttext.getWidth()+_localtextheight);
 //BA.debugLineNum = 2337;BA.debugLine="If Abs(h) > TextWidth Then";
if (__c.Abs(_h)>_textwidth) { 
 //BA.debugLineNum = 2338;BA.debugLine="yt = mYAxis0 - h / 2";
_yt = (int) (_myaxis0-_h/(double)2);
 //BA.debugLineNum = 2339;BA.debugLine="TextAlignment = \"CENTER\"";
_textalignment = "CENTER";
 //BA.debugLineNum = 2340;BA.debugLine="Col = GetContrastColor(ID.Color)";
_col = _getcontrastcolor(_id.Color /*int*/ );
 }else {
 //BA.debugLineNum = 2342;BA.debugLine="y = mYAxis0 - h";
_y = (int) (_myaxis0-_h);
 //BA.debugLineNum = 2343;BA.debugLine="dy = 0.5 * LocalTextHeight";
_dy = (int) (0.5*_localtextheight);
 //BA.debugLineNum = 2344;BA.debugLine="rectTextBackground.Initialize(x, y, x + LocalT";
_recttextbackground.Initialize((float) (_x),(float) (_y),(float) (_x+_localtextheight),(float) (_y+_textwidth));
 //BA.debugLineNum = 2345;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 //BA.debugLineNum = 2346;BA.debugLine="If h = 0 Then";
if (_h==0) { 
 //BA.debugLineNum = 2347;BA.debugLine="If Scale(sY).MinVal < 0 And Scale(sY).MaxVal";
if (_scale[_sy].MinVal /*double*/ <0 && _scale[_sy].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 2348;BA.debugLine="yt = y - dy";
_yt = (int) (_y-_dy);
 //BA.debugLineNum = 2349;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 2350;BA.debugLine="rectTextBackground.Top = y";
_recttextbackground.setTop((float) (_y));
 //BA.debugLineNum = 2351;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 }else {
 //BA.debugLineNum = 2353;BA.debugLine="yt = y - dy";
_yt = (int) (_y-_dy);
 //BA.debugLineNum = 2354;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 2355;BA.debugLine="rectTextBackground.Top = y - TextWidth";
_recttextbackground.setTop((float) (_y-_textwidth));
 //BA.debugLineNum = 2356;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 };
 }else if(_h>0) { 
 //BA.debugLineNum = 2359;BA.debugLine="If Abs(h) + TextWidth > mYAxis0 - Graph.Top T";
if (__c.Abs(_h)+_textwidth>_myaxis0-_graph.Top /*int*/ ) { 
 //BA.debugLineNum = 2360;BA.debugLine="yt = mYAxis0 + dy + 2dip";
_yt = (int) (_myaxis0+_dy+__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 2361;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 2362;BA.debugLine="rectTextBackground.Top = mYAxis0 + 2dip";
_recttextbackground.setTop((float) (_myaxis0+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 2363;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 }else {
 //BA.debugLineNum = 2365;BA.debugLine="yt = y - dy";
_yt = (int) (_y-_dy);
 //BA.debugLineNum = 2366;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 2367;BA.debugLine="rectTextBackground.Top = y - TextWidth";
_recttextbackground.setTop((float) (_y-_textwidth));
 //BA.debugLineNum = 2368;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 };
 }else {
 //BA.debugLineNum = 2371;BA.debugLine="If Abs(h) + TextWidth > Graph.Bottom - mYAxis";
if (__c.Abs(_h)+_textwidth>_graph.Bottom /*int*/ -_myaxis0) { 
 //BA.debugLineNum = 2372;BA.debugLine="yt = mYAxis0 - dy- 2dip";
_yt = (int) (_myaxis0-_dy-__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 2373;BA.debugLine="TextAlignment = \"LEFT\"";
_textalignment = "LEFT";
 //BA.debugLineNum = 2374;BA.debugLine="rectTextBackground.Top = mYAxis0 - TextWidth";
_recttextbackground.setTop((float) (_myaxis0-_textwidth-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 2375;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 }else {
 //BA.debugLineNum = 2377;BA.debugLine="yt = y + dy";
_yt = (int) (_y+_dy);
 //BA.debugLineNum = 2378;BA.debugLine="TextAlignment = \"RIGHT\"";
_textalignment = "RIGHT";
 //BA.debugLineNum = 2379;BA.debugLine="rectTextBackground.Top = y";
_recttextbackground.setTop((float) (_y));
 //BA.debugLineNum = 2380;BA.debugLine="rectTextBackground.Height = TextWidth";
_recttextbackground.setHeight((float) (_textwidth));
 };
 };
 //BA.debugLineNum = 2384;BA.debugLine="Col = GetContrastColor(Graph.ChartBackgroundCo";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 //BA.debugLineNum = 2385;BA.debugLine="xcvsGraph.DrawRect(rectTextBackground, Graph.C";
_xcvsgraph.DrawRect(_recttextbackground,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 2387;BA.debugLine="txt = py(0)";
_txt = BA.NumberToString(_py[(int) (0)]);
 //BA.debugLineNum = 2388;BA.debugLine="xcvsGraph.DrawTextRotated(txt, xt, yt, LocalFon";
_xcvsgraph.DrawTextRotated(ba,_txt,(float) (_xt),(float) (_yt),_localfont,_col,BA.getEnumFromString(android.graphics.Paint.Align.class,_textalignment),(float) (-90));
 }
};
 }else {
 //BA.debugLineNum = 2391;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step108 = 1;
final int limit108 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit108 ;_i = _i + step108 ) {
 //BA.debugLineNum = 2392;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 2393;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2394;BA.debugLine="Private py(PD.YArray.Length) As Double";
_py = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 2395;BA.debugLine="py = PD.YArray";
_py = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 2396;BA.debugLine="x = Graph.Left + Graph.XOffset + (i + 0.5) * Gr";
_x = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_i+0.5)*_graph.XInterval /*int*/ );
 //BA.debugLineNum = 2397;BA.debugLine="h = py(0) * Scale(sY).Scale";
_h = (int) (_py[(int) (0)]*_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2398;BA.debugLine="If Abs(h) > 1.5 * Texts.ScaleTextHeight Then";
if (__c.Abs(_h)>1.5*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 2399;BA.debugLine="y = mYAxis0 - h / 2";
_y = (int) (_myaxis0-_h/(double)2);
 //BA.debugLineNum = 2400;BA.debugLine="If h >= 0 Then";
if (_h>=0) { 
 //BA.debugLineNum = 2401;BA.debugLine="y = y + 0.3 * Texts.ScaleTextHeight";
_y = (int) (_y+0.3*_texts.ScaleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 2403;BA.debugLine="y = y + 0.25 * Texts.ScaleTextHeight";
_y = (int) (_y+0.25*_texts.ScaleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 2405;BA.debugLine="Col = GetContrastColor(ID.Color)";
_col = _getcontrastcolor(_id.Color /*int*/ );
 }else {
 //BA.debugLineNum = 2407;BA.debugLine="y = mYAxis0 - h";
_y = (int) (_myaxis0-_h);
 //BA.debugLineNum = 2408;BA.debugLine="If h = 0 Then";
if (_h==0) { 
 //BA.debugLineNum = 2409;BA.debugLine="If Scale(sY).MinVal < 0 And Scale(sY).MaxVal";
if (_scale[_sy].MinVal /*double*/ <0 && _scale[_sy].MaxVal /*double*/ <=0) { 
 //BA.debugLineNum = 2410;BA.debugLine="y = y + 0.9 * Texts.ScaleTextHeight";
_y = (int) (_y+0.9*_texts.ScaleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 2412;BA.debugLine="y = y - Texts.ScaleTextHeight / 3";
_y = (int) (_y-_texts.ScaleTextHeight /*int*/ /(double)3);
 };
 }else if(_h>0) { 
 //BA.debugLineNum = 2415;BA.debugLine="y = y - Texts.ScaleTextHeight / 3";
_y = (int) (_y-_texts.ScaleTextHeight /*int*/ /(double)3);
 }else {
 //BA.debugLineNum = 2417;BA.debugLine="y = y + 0.9 * Texts.ScaleTextHeight";
_y = (int) (_y+0.9*_texts.ScaleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 2420;BA.debugLine="Col = GetContrastColor(Graph.ChartBackgroundCo";
_col = _getcontrastcolor(_graph.ChartBackgroundColor /*int*/ );
 };
 //BA.debugLineNum = 2422;BA.debugLine="txt = py(0)";
_txt = BA.NumberToString(_py[(int) (0)]);
 //BA.debugLineNum = 2423;BA.debugLine="xcvsGraph.DrawText(txt, x, y, Texts.ScaleFont,";
_xcvsgraph.DrawText(ba,_txt,(float) (_x),(float) (_y),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_col,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
 };
 //BA.debugLineNum = 2426;BA.debugLine="End Sub";
return "";
}
public String  _drawchart() throws Exception{
 //BA.debugLineNum = 1460;BA.debugLine="Public Sub DrawChart";
 //BA.debugLineNum = 1461;BA.debugLine="InitChart";
_initchart();
 //BA.debugLineNum = 1463;BA.debugLine="If Graph.Error = True Then";
if (_graph.Error /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1464;BA.debugLine="DrawError";
_drawerror();
 //BA.debugLineNum = 1465;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1468;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"LINE","BAR","STACKED_BAR","PIE","YX_CHART")) {
case 0: {
 //BA.debugLineNum = 1470;BA.debugLine="GetXIntervals";
_getxintervals();
 //BA.debugLineNum = 1471;BA.debugLine="DrawGrid";
_drawgrid();
 //BA.debugLineNum = 1472;BA.debugLine="If Scale(sY).Logarithmic = True Then";
if (_scale[_sy].Logarithmic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1473;BA.debugLine="DrawLinesLog";
_drawlineslog();
 }else {
 //BA.debugLineNum = 1475;BA.debugLine="DrawLines";
_drawlines();
 };
 break; }
case 1: {
 //BA.debugLineNum = 1478;BA.debugLine="If BarWidth0 = False Then";
if (_barwidth0==__c.False) { 
 //BA.debugLineNum = 1479;BA.debugLine="DrawGrid";
_drawgrid();
 //BA.debugLineNum = 1480;BA.debugLine="DrawBars";
_drawbars();
 };
 break; }
case 2: {
 //BA.debugLineNum = 1483;BA.debugLine="If BarWidth0 = False Then";
if (_barwidth0==__c.False) { 
 //BA.debugLineNum = 1484;BA.debugLine="DrawGrid";
_drawgrid();
 //BA.debugLineNum = 1485;BA.debugLine="DrawBars";
_drawbars();
 };
 break; }
case 3: {
 //BA.debugLineNum = 1488;BA.debugLine="DrawPies";
_drawpies();
 break; }
case 4: {
 //BA.debugLineNum = 1490;BA.debugLine="DrawGrid";
_drawgrid();
 //BA.debugLineNum = 1491;BA.debugLine="DrawYXLines";
_drawyxlines();
 break; }
}
;
 //BA.debugLineNum = 1497;BA.debugLine="End Sub";
return "";
}
public String  _drawemptychart() throws Exception{
 //BA.debugLineNum = 1454;BA.debugLine="Public Sub DrawEmptyChart";
 //BA.debugLineNum = 1455;BA.debugLine="xcvsGraph.ClearRect(xcvsGraph.TargetRect)";
_xcvsgraph.ClearRect(_xcvsgraph.getTargetRect());
 //BA.debugLineNum = 1456;BA.debugLine="xcvsGraph.DrawRect(xcvsGraph.TargetRect, Graph.Ch";
_xcvsgraph.DrawRect(_xcvsgraph.getTargetRect(),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1457;BA.debugLine="End Sub";
return "";
}
public String  _drawerror() throws Exception{
double _x = 0;
double _y = 0;
 //BA.debugLineNum = 1499;BA.debugLine="Private Sub DrawError";
 //BA.debugLineNum = 1500;BA.debugLine="Private x, y As Double";
_x = 0;
_y = 0;
 //BA.debugLineNum = 1501;BA.debugLine="xcvsGraph.ClearRect(xcvsGraph.TargetRect)";
_xcvsgraph.ClearRect(_xcvsgraph.getTargetRect());
 //BA.debugLineNum = 1502;BA.debugLine="xcvsGraph.DrawRect(xcvsGraph.TargetRect, Graph.Ch";
_xcvsgraph.DrawRect(_xcvsgraph.getTargetRect(),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1504;BA.debugLine="x = xcvsGraph.TargetRect.CenterX";
_x = _xcvsgraph.getTargetRect().getCenterX();
 //BA.debugLineNum = 1505;BA.debugLine="y = xcvsGraph.TargetRect.Top + 100";
_y = _xcvsgraph.getTargetRect().getTop()+100;
 //BA.debugLineNum = 1507;BA.debugLine="xcvsGraph.DrawText(\"E R R O R\", x, y, Texts.Title";
_xcvsgraph.DrawText(ba,"E R R O R",(float) (_x),(float) (_y),_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 1508;BA.debugLine="y = y + 40";
_y = _y+40;
 //BA.debugLineNum = 1509;BA.debugLine="xcvsGraph.DrawText(Graph.Title & \"  \" & Graph.Cha";
_xcvsgraph.DrawText(ba,_graph.Title /*String*/ +"  "+_graph.ChartType /*String*/ +" chart",(float) (_x),(float) (_y),_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 1510;BA.debugLine="y = y + 40";
_y = _y+40;
 //BA.debugLineNum = 1511;BA.debugLine="xcvsGraph.DrawText(Graph.ErrorText, x, y, Texts.S";
_xcvsgraph.DrawText(ba,_graph.ErrorText /*String*/ ,(float) (_x),(float) (_y),_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 1512;BA.debugLine="End Sub";
return "";
}
public String  _drawgrid() throws Exception{
int _x1 = 0;
int _y = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rctouter = null;
 //BA.debugLineNum = 1515;BA.debugLine="Private Sub DrawGrid";
 //BA.debugLineNum = 1516;BA.debugLine="Private x1, y As Int";
_x1 = 0;
_y = 0;
 //BA.debugLineNum = 1518;BA.debugLine="xcvsGraph.ClearRect(xcvsGraph.TargetRect)";
_xcvsgraph.ClearRect(_xcvsgraph.getTargetRect());
 //BA.debugLineNum = 1519;BA.debugLine="xcvsGraph.DrawRect(xcvsGraph.TargetRect, Graph.Ch";
_xcvsgraph.DrawRect(_xcvsgraph.getTargetRect(),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1520;BA.debugLine="If Scale(sY).Logarithmic = True And (Graph.ChartT";
if (_scale[_sy].Logarithmic /*boolean*/ ==__c.True && ((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("YX_CHART"))) { 
 //BA.debugLineNum = 1521;BA.debugLine="ScaleLog(sY).Scale = Graph.Height / (ScaleLog(sY";
_scalelog[_sy].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scalelog[_sy].MantMax /*int*/ -_scalelog[_sy].MantMin /*int*/ );
 //BA.debugLineNum = 1522;BA.debugLine="DrawYScaleLog";
_drawyscalelog();
 }else {
 //BA.debugLineNum = 1524;BA.debugLine="Scale(sY).Scale = Graph.Height / (Scale(sY).MaxV";
_scale[_sy].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_sy].MaxVal /*double*/ -_scale[_sy].MinVal /*double*/ );
 //BA.debugLineNum = 1525;BA.debugLine="DrawYScale";
_drawyscale();
 };
 //BA.debugLineNum = 1527;BA.debugLine="If Scale(sX).Logarithmic = True And Graph.ChartTy";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.True && (_graph.ChartType /*String*/ ).equals("YX_CHART")) { 
 //BA.debugLineNum = 1528;BA.debugLine="ScaleLog(sX).Scale = Graph.Width / (ScaleLog(sX)";
_scalelog[_sx].Scale /*double*/  = _graph.Width /*int*/ /(double)(_scalelog[_sx].MantMax /*int*/ +_scalelog[_sx].LogMax /*double*/ -_scalelog[_sx].MantMin /*int*/ -_scalelog[_sx].LogMin /*double*/ );
 //BA.debugLineNum = 1529;BA.debugLine="DrawXScaleLog";
_drawxscalelog();
 }else {
 //BA.debugLineNum = 1531;BA.debugLine="DrawXScale";
_drawxscale();
 };
 //BA.debugLineNum = 1534;BA.debugLine="y = 0.3 * Texts.TitleTextHeight";
_y = (int) (0.3*_texts.TitleTextHeight /*int*/ );
 //BA.debugLineNum = 1535;BA.debugLine="If Graph.Title <> \"\" Then";
if ((_graph.Title /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1536;BA.debugLine="y = y + 0.6 * Texts.TitleTextHeight";
_y = (int) (_y+0.6*_texts.TitleTextHeight /*int*/ );
 //BA.debugLineNum = 1537;BA.debugLine="xcvsGraph.DrawText(Graph.Title, Graph.Left + Gra";
_xcvsgraph.DrawText(ba,_graph.Title /*String*/ ,(float) (_graph.Left /*int*/ +_graph.Width /*int*/ /(double)2),(float) (_y),_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.TitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 //BA.debugLineNum = 1540;BA.debugLine="If Graph.Subtitle <> \"\" Then";
if ((_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1541;BA.debugLine="y = y + Texts.SubtitleTextHeight";
_y = (int) (_y+_texts.SubtitleTextHeight /*int*/ );
 //BA.debugLineNum = 1542;BA.debugLine="xcvsGraph.DrawText(Graph.Subtitle, Graph.Left +";
_xcvsgraph.DrawText(ba,_graph.Subtitle /*String*/ ,(float) (_graph.Left /*int*/ +_graph.Width /*int*/ /(double)2),(float) (_y),_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.SubtitleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 //BA.debugLineNum = 1545;BA.debugLine="y = xcvsGraph.TargetRect.Height - 0.25 * Texts.Ax";
_y = (int) (_xcvsgraph.getTargetRect().getHeight()-0.25*_texts.AxisTextHeight /*int*/ );
 //BA.debugLineNum = 1546;BA.debugLine="If Legend.IncludeLegend = \"BOTTOM\" Then";
if ((_legend.IncludeLegend /*String*/ ).equals("BOTTOM")) { 
 //BA.debugLineNum = 1547;BA.debugLine="y = y - Legend.Height - 0.5 * Legend.TextHeight";
_y = (int) (_y-_legend.Height /*int*/ -0.5*_legend.TextHeight /*int*/ );
 };
 //BA.debugLineNum = 1550;BA.debugLine="If Graph.XAxisName <> \"\" Then";
if ((_graph.XAxisName /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1551;BA.debugLine="xcvsGraph.DrawText(Graph.XAxisName, Graph.Left +";
_xcvsgraph.DrawText(ba,_graph.XAxisName /*String*/ ,(float) (_graph.Left /*int*/ +_graph.Width /*int*/ /(double)2),(float) (_y),_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.AxisTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 //BA.debugLineNum = 1554;BA.debugLine="x1 = Texts.AxisTextHeight";
_x1 = _texts.AxisTextHeight /*int*/ ;
 //BA.debugLineNum = 1555;BA.debugLine="If xui.IsB4i Then x1 = 0.8 * Texts.AxisTextHeight";
if (_xui.getIsB4i()) { 
_x1 = (int) (0.8*_texts.AxisTextHeight /*int*/ );};
 //BA.debugLineNum = 1556;BA.debugLine="If Graph.YAxisName <> \"\" Then";
if ((_graph.YAxisName /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1557;BA.debugLine="xcvsGraph.DrawTextRotated(Graph.YAxisName, x1, G";
_xcvsgraph.DrawTextRotated(ba,_graph.YAxisName /*String*/ ,(float) (_x1),(float) (_graph.Top /*int*/ +_graph.Height /*int*/ /(double)2),_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.AxisTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"),(float) (-90));
 };
 //BA.debugLineNum = 1560;BA.debugLine="xcvsGraph.DrawRect(Graph.Rect, Graph.GridFrameCol";
_xcvsgraph.DrawRect(_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1562;BA.debugLine="If Graph.DrawOuterFrame = True Then";
if (_graph.DrawOuterFrame /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1563;BA.debugLine="Private rctOuter As B4XRect";
_rctouter = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 1564;BA.debugLine="rctOuter.Initialize(0, 0, xpnlCursor.Width, xpnl";
_rctouter.Initialize((float) (0),(float) (0),(float) (_xpnlcursor.getWidth()),(float) (_xpnlcursor.getHeight()));
 //BA.debugLineNum = 1565;BA.debugLine="xcvsGraph.DrawRect(rctOuter, Graph.GridFrameColo";
_xcvsgraph.DrawRect(_rctouter,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (4))));
 };
 //BA.debugLineNum = 1567;BA.debugLine="End Sub";
return "";
}
public String  _drawitemvalues(int _x,int _y) throws Exception{
int _index = 0;
b4a.example.cov.xchart._pointdata _point = null;
int _h = 0;
int _i = 0;
double _total = 0;
int _top = 0;
int _xcursor = 0;
 //BA.debugLineNum = 530;BA.debugLine="Private Sub DrawItemValues(x As Int, y As Int)";
 //BA.debugLineNum = 531;BA.debugLine="If Graph.ChartType <> \"PIE\" Then";
if ((_graph.ChartType /*String*/ ).equals("PIE") == false) { 
 //BA.debugLineNum = 532;BA.debugLine="Private Index As Int";
_index = 0;
 //BA.debugLineNum = 533;BA.debugLine="xcvsValues.ClearRect(Values.rectRight)";
_xcvsvalues.ClearRect(_values.rectRight /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ );
 //BA.debugLineNum = 534;BA.debugLine="xcvsCursor.ClearRect(Values.rectCursor)";
_xcvscursor.ClearRect(_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ );
 //BA.debugLineNum = 535;BA.debugLine="xcvsValues.DrawRect(Values.rectRight, 0xAAFFFFFF";
_xcvsvalues.DrawRect(_values.rectRight /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ,(int) (0xaaffffff),__c.True,(float) (0));
 //BA.debugLineNum = 536;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"BAR","STACKED_BAR","LINE")) {
case 0: 
case 1: {
 //BA.debugLineNum = 538;BA.debugLine="Index =(x - Graph.Left) / Graph.XInterval";
_index = (int) ((_x-_graph.Left /*int*/ )/(double)_graph.XInterval /*int*/ );
 break; }
case 2: {
 //BA.debugLineNum = 540;BA.debugLine="Index = (x - Graph.Left) / Scale(sX).Scale + 0";
_index = (int) ((_x-_graph.Left /*int*/ )/(double)_scale[_sx].Scale /*double*/ +0.5);
 break; }
}
;
 //BA.debugLineNum = 542;BA.debugLine="Index = Min(Index, Points.Size - 1)";
_index = (int) (__c.Min(_index,_points.getSize()-1));
 //BA.debugLineNum = 543;BA.debugLine="Private Point As PointData";
_point = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 544;BA.debugLine="Point = Points.Get(Index)";
_point = (b4a.example.cov.xchart._pointdata)(_points.Get(_index));
 //BA.debugLineNum = 545;BA.debugLine="Private h, i, x, y As Int";
_h = 0;
_i = 0;
_x = 0;
_y = 0;
 //BA.debugLineNum = 546;BA.debugLine="h = Values.TextHeight * 1.2";
_h = (int) (_values.TextHeight /*int*/ *1.2);
 //BA.debugLineNum = 547;BA.debugLine="x = Values.MidPont";
_x = _values.MidPont /*int*/ ;
 //BA.debugLineNum = 548;BA.debugLine="y = 0.8 * Values.TextHeight";
_y = (int) (0.8*_values.TextHeight /*int*/ );
 //BA.debugLineNum = 549;BA.debugLine="xcvsValues.DrawText(Point.X, x, y + 0.2 * h, Val";
_xcvsvalues.DrawText(ba,_point.X /*String*/ ,(float) (_x),(float) (_y+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_values.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 550;BA.debugLine="Private Total = 0 As Double";
_total = 0;
 //BA.debugLineNum = 551;BA.debugLine="Private top As Int";
_top = 0;
 //BA.debugLineNum = 552;BA.debugLine="For i = 0 To Point.YArray.Length - 1";
{
final int step22 = 1;
final int limit22 = (int) (_point.YArray /*double[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
 //BA.debugLineNum = 553;BA.debugLine="top = y + h * (i + 1)";
_top = (int) (_y+_h*(_i+1));
 //BA.debugLineNum = 554;BA.debugLine="xcvsValues.DrawText(NumberFormat3(Point.YArray(";
_xcvsvalues.DrawText(ba,_numberformat3(_point.YArray /*double[]*/ [_i],_values.MaxDigits /*int*/ ),(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_values.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 555;BA.debugLine="Total = Total + Point.YArray(i)";
_total = _total+_point.YArray /*double[]*/ [_i];
 }
};
 //BA.debugLineNum = 557;BA.debugLine="If Graph.ChartType = \"STACKED_BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("STACKED_BAR")) { 
 //BA.debugLineNum = 558;BA.debugLine="top = y + h * (i + 1)";
_top = (int) (_y+_h*(_i+1));
 //BA.debugLineNum = 559;BA.debugLine="xcvsValues.DrawText(NumberFormat3(Total, Values";
_xcvsvalues.DrawText(ba,_numberformat3(_total,_values.MaxDigits /*int*/ ),(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 };
 //BA.debugLineNum = 562;BA.debugLine="If Graph.ChartType = \"LINE\" And Point.YArray.Len";
if ((_graph.ChartType /*String*/ ).equals("LINE") && _point.YArray /*double[]*/ .length==1) { 
 //BA.debugLineNum = 563;BA.debugLine="top = top + 0.2 * h";
_top = (int) (_top+0.2*_h);
 //BA.debugLineNum = 564;BA.debugLine="If Graph.IncludeMaxLine = True Then";
if (_graph.IncludeMaxLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 565;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 566;BA.debugLine="xcvsValues.DrawText(NumberFormat3(MinMaxMeanVa";
_xcvsvalues.DrawText(ba,_numberformat3(_minmaxmeanvalues[(int) (1)],_values.MaxDigits /*int*/ ),(float) (_x),(float) (_top),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 };
 //BA.debugLineNum = 568;BA.debugLine="If Graph.IncludeMeanLine = True Then";
if (_graph.IncludeMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 569;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 570;BA.debugLine="xcvsValues.DrawText(NumberFormat3(MinMaxMeanVa";
_xcvsvalues.DrawText(ba,_numberformat3(_minmaxmeanvalues[(int) (2)],_values.MaxDigits /*int*/ ),(float) (_x),(float) (_top),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 };
 //BA.debugLineNum = 572;BA.debugLine="If Graph.IncludeMinLine = True Then";
if (_graph.IncludeMinLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 573;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 574;BA.debugLine="xcvsValues.DrawText(NumberFormat3(MinMaxMeanVa";
_xcvsvalues.DrawText(ba,_numberformat3(_minmaxmeanvalues[(int) (0)],_values.MaxDigits /*int*/ ),(float) (_x),(float) (_top),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 };
 };
 //BA.debugLineNum = 578;BA.debugLine="Private xCursor As Int";
_xcursor = 0;
 //BA.debugLineNum = 579;BA.debugLine="Select Graph.ChartType";
switch (BA.switchObjectToInt(_graph.ChartType /*String*/ ,"BAR","STACKED_BAR","LINE")) {
case 0: 
case 1: {
 //BA.debugLineNum = 581;BA.debugLine="xCursor = (Index + 0.5) * Graph.XInterval + Gr";
_xcursor = (int) ((_index+0.5)*_graph.XInterval /*int*/ +_graph.Left /*int*/ +_graph.XOffset /*int*/ );
 break; }
case 2: {
 //BA.debugLineNum = 583;BA.debugLine="xCursor = Index * Scale(sX).Scale + Graph.Left";
_xcursor = (int) (_index*_scale[_sx].Scale /*double*/ +_graph.Left /*int*/ );
 break; }
}
;
 //BA.debugLineNum = 585;BA.debugLine="xcvsCursor.DrawLine(xCursor, Graph.Top, xCursor,";
_xcvscursor.DrawLine((float) (_xcursor),(float) (_graph.Top /*int*/ ),(float) (_xcursor),(float) (_graph.Bottom /*int*/ ),_xui.Color_Red,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 586;BA.debugLine="Values.rectCursor.Initialize(xCursor - 2dip, 0,";
_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (_xcursor-__c.DipToCurrent((int) (2))),(float) (0),(float) (_xcursor+__c.DipToCurrent((int) (2))),(float) (_xpnlcursor.getHeight()));
 //BA.debugLineNum = 587;BA.debugLine="xcvsValues.Invalidate";
_xcvsvalues.Invalidate();
 //BA.debugLineNum = 588;BA.debugLine="xcvsCursor.Invalidate";
_xcvscursor.Invalidate();
 };
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return "";
}
public String  _drawlegend() throws Exception{
int _y = 0;
int _y1 = 0;
int _w = 0;
int _x = 0;
int _h = 0;
int _box = 0;
int _textverticaloffset = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
b4a.example.cov.xchart._itemdata _item = null;
String _txt = "";
int _top = 0;
int _y0 = 0;
 //BA.debugLineNum = 2596;BA.debugLine="Private Sub DrawLegend";
 //BA.debugLineNum = 2597;BA.debugLine="Private y As Int = 0.8 * Legend.TextHeight";
_y = (int) (0.8*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 2598;BA.debugLine="Private y1, w, x As Int";
_y1 = 0;
_w = 0;
_x = 0;
 //BA.debugLineNum = 2599;BA.debugLine="Private h As Int = 1.2 * Legend.TextHeight";
_h = (int) (1.2*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 2600;BA.debugLine="Private box As Int = 0.7 * Legend.TextHeight";
_box = (int) (0.7*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 2601;BA.debugLine="Private textVerticalOffset As Int = 0.25 * Legend";
_textverticaloffset = (int) (0.25*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 2602;BA.debugLine="If xui.IsB4i Then textVerticalOffset = 0.3 * Lege";
if (_xui.getIsB4i()) { 
_textverticaloffset = (int) (0.3*_legend.TextHeight /*int*/ );};
 //BA.debugLineNum = 2603;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 2604;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 2606;BA.debugLine="Select Legend.IncludeLegend";
switch (BA.switchObjectToInt(_legend.IncludeLegend /*String*/ ,"TOP_RIGHT","BOTTOM")) {
case 0: {
 //BA.debugLineNum = 2608;BA.debugLine="h = Texts.AxisTextHeight * 0.8";
_h = (int) (_texts.AxisTextHeight /*int*/ *0.8);
 //BA.debugLineNum = 2609;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group12 = _items;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_item = (b4a.example.cov.xchart._itemdata)(group12.Get(index12));
 //BA.debugLineNum = 2610;BA.debugLine="Private txt As String = Item.Name";
_txt = _item.Name /*String*/ ;
 //BA.debugLineNum = 2611;BA.debugLine="If Graph.ChartType = \"PIE\" And Graph.IncludeVa";
if ((_graph.ChartType /*String*/ ).equals("PIE") && _graph.IncludeValues /*boolean*/ ) { 
 //BA.debugLineNum = 2612;BA.debugLine="txt = txt & \" : \" & Item.Value";
_txt = _txt+" : "+BA.NumberToString(_item.Value /*float*/ );
 };
 //BA.debugLineNum = 2614;BA.debugLine="w = Max(w, MeasureTextWidth(txt, Legend.TextFo";
_w = (int) (__c.Max(_w,_measuretextwidth(_txt,_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 }
};
 //BA.debugLineNum = 2616;BA.debugLine="w = w + 2 * box + Texts.AxisTextHeight";
_w = (int) (_w+2*_box+_texts.AxisTextHeight /*int*/ );
 //BA.debugLineNum = 2617;BA.debugLine="x = xcvsGraph.TargetRect.Width - w - 0.5 * box";
_x = (int) (_xcvsgraph.getTargetRect().getWidth()-_w-0.5*_box);
 //BA.debugLineNum = 2618;BA.debugLine="r.Initialize(x - box, y - 0.5 * box, x + w, y +";
_r.Initialize((float) (_x-_box),(float) (_y-0.5*_box),(float) (_x+_w),(float) (_y+_h*_items.getSize()+0.5*_box));
 //BA.debugLineNum = 2619;BA.debugLine="If Graph.ChartBackgroundColor = xui.Color_Trans";
if (_graph.ChartBackgroundColor /*int*/ ==_xui.Color_Transparent) { 
 //BA.debugLineNum = 2620;BA.debugLine="xcvsGraph.DrawRect(r, Graph.ChartBackgroundCol";
_xcvsgraph.DrawRect(_r,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (0));
 }else {
 //BA.debugLineNum = 2622;BA.debugLine="xcvsGraph.DrawRect(r, 0x66FFFFFF, True, 0)";
_xcvsgraph.DrawRect(_r,(int) (0x66ffffff),__c.True,(float) (0));
 };
 //BA.debugLineNum = 2624;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group27 = _items;
final int groupLen27 = group27.getSize()
;int index27 = 0;
;
for (; index27 < groupLen27;index27++){
_item = (b4a.example.cov.xchart._itemdata)(group27.Get(index27));
 //BA.debugLineNum = 2625;BA.debugLine="Private top As Int = y + h * i";
_top = (int) (_y+_h*_i);
 //BA.debugLineNum = 2626;BA.debugLine="r.Initialize(x, top + 0.5 * h - 0.65 * box, x";
_r.Initialize((float) (_x),(float) (_top+0.5*_h-0.65*_box),(float) (_x+_box),(float) (_top+0.5*_h+0.35*_box));
 //BA.debugLineNum = 2627;BA.debugLine="xcvsGraph.DrawRect(r, Item.Color, True, 0)";
_xcvsgraph.DrawRect(_r,_item.Color /*int*/ ,__c.True,(float) (0));
 //BA.debugLineNum = 2628;BA.debugLine="Private txt As String = Item.Name";
_txt = _item.Name /*String*/ ;
 //BA.debugLineNum = 2629;BA.debugLine="If Graph.ChartType = \"PIE\" And Graph.IncludeVa";
if ((_graph.ChartType /*String*/ ).equals("PIE") && _graph.IncludeValues /*boolean*/ ) { 
 //BA.debugLineNum = 2630;BA.debugLine="txt = txt & \" : \" & Item.Value";
_txt = _txt+" : "+BA.NumberToString(_item.Value /*float*/ );
 };
 //BA.debugLineNum = 2632;BA.debugLine="xcvsGraph.DrawText(txt, x + box + box, top + 0";
_xcvsgraph.DrawText(ba,_txt,(float) (_x+_box+_box),(float) (_top+0.5*_h+_textverticaloffset),_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 2633;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
 break; }
case 1: {
 //BA.debugLineNum = 2637;BA.debugLine="Private x, y0, y As Int";
_x = 0;
_y0 = 0;
_y = 0;
 //BA.debugLineNum = 2638;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 2639;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 2641;BA.debugLine="y0  = xcvsGraph.TargetRect.Height - Legend.Heig";
_y0 = (int) (_xcvsgraph.getTargetRect().getHeight()-_legend.Height /*int*/ +0.6*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 2642;BA.debugLine="x = box";
_x = _box;
 //BA.debugLineNum = 2644;BA.debugLine="r.Initialize(0.5 * box, xcvsGraph.TargetRect.He";
_r.Initialize((float) (0.5*_box),(float) (_xcvsgraph.getTargetRect().getHeight()-_legend.Height /*int*/ -0.5*_box),(float) (_xcvsgraph.getTargetRect().getWidth()-0.5*_box),(float) (_xcvsgraph.getTargetRect().getHeight()-0.5*_box));
 //BA.debugLineNum = 2645;BA.debugLine="If Graph.ChartBackgroundColor = xui.Color_Trans";
if (_graph.ChartBackgroundColor /*int*/ ==_xui.Color_Transparent) { 
 //BA.debugLineNum = 2646;BA.debugLine="xcvsGraph.DrawRect(r, Graph.ChartBackgroundCol";
_xcvsgraph.DrawRect(_r,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (0));
 }else {
 //BA.debugLineNum = 2648;BA.debugLine="xcvsGraph.DrawRect(r, 0x66FFFFFF, True, 0)";
_xcvsgraph.DrawRect(_r,(int) (0x66ffffff),__c.True,(float) (0));
 };
 //BA.debugLineNum = 2651;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step50 = 1;
final int limit50 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit50 ;_i = _i + step50 ) {
 //BA.debugLineNum = 2652;BA.debugLine="Private Item As ItemData";
_item = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 2653;BA.debugLine="Item = Items.Get(i)";
_item = (b4a.example.cov.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 2654;BA.debugLine="y = y0 + 1.6 * box * Legend.LineNumbers.Get(i)";
_y = (int) (_y0+1.6*_box*(double)(BA.ObjectToNumber(_legend.LineNumbers /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i))));
 //BA.debugLineNum = 2655;BA.debugLine="Private txt As String = Item.Name";
_txt = _item.Name /*String*/ ;
 //BA.debugLineNum = 2656;BA.debugLine="If Graph.ChartType = \"PIE\" And Graph.IncludeVa";
if ((_graph.ChartType /*String*/ ).equals("PIE") && _graph.IncludeValues /*boolean*/ ) { 
 //BA.debugLineNum = 2657;BA.debugLine="txt = txt & \" : \" & Item.Value";
_txt = _txt+" : "+BA.NumberToString(_item.Value /*float*/ );
 };
 //BA.debugLineNum = 2659;BA.debugLine="If Legend.LineChange.Get(i) = True Then";
if ((_legend.LineChange /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)).equals((Object)(__c.True))) { 
 //BA.debugLineNum = 2660;BA.debugLine="x = box";
_x = _box;
 };
 //BA.debugLineNum = 2663;BA.debugLine="r.Initialize(x, y - box, x + box, y)";
_r.Initialize((float) (_x),(float) (_y-_box),(float) (_x+_box),(float) (_y));
 //BA.debugLineNum = 2664;BA.debugLine="xcvsGraph.DrawRect(r, Item.Color, True, 0)";
_xcvsgraph.DrawRect(_r,_item.Color /*int*/ ,__c.True,(float) (0));
 //BA.debugLineNum = 2665;BA.debugLine="Private txt As String = Item.Name";
_txt = _item.Name /*String*/ ;
 //BA.debugLineNum = 2666;BA.debugLine="If Graph.ChartType = \"PIE\" And Graph.IncludeVa";
if ((_graph.ChartType /*String*/ ).equals("PIE") && _graph.IncludeValues /*boolean*/ ) { 
 //BA.debugLineNum = 2667;BA.debugLine="txt = txt & \" : \" & Item.Value";
_txt = _txt+" : "+BA.NumberToString(_item.Value /*float*/ );
 };
 //BA.debugLineNum = 2671;BA.debugLine="y1 = y '+ 0.1 * box";
_y1 = _y;
 //BA.debugLineNum = 2677;BA.debugLine="xcvsGraph.DrawText(txt, x + 1.5 * box, y1, Leg";
_xcvsgraph.DrawText(ba,_txt,(float) (_x+1.5*_box),(float) (_y1),_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
 //BA.debugLineNum = 2678;BA.debugLine="x = x + 2.5 * box + MeasureTextWidth(txt, Lege";
_x = (int) (_x+2.5*_box+_measuretextwidth(_txt,_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ));
 }
};
 break; }
}
;
 //BA.debugLineNum = 2681;BA.debugLine="End Sub";
return "";
}
public String  _drawlines() throws Exception{
int _i = 0;
int _x0 = 0;
int _x1 = 0;
b4a.example.cov.xchart._pointdata _pd = null;
int[] _cols = null;
int[] _pointcols = null;
int[] _strokewidths = null;
String[] _names = null;
String[] _pointtypes = null;
boolean[] _filled = null;
double _smax = 0;
double _smin = 0;
double _smean = 0;
double[] _py0 = null;
double[] _py1 = null;
double[] _psy0 = null;
double[] _psy1 = null;
b4a.example.cov.xchart._itemdata _id = null;
int _j = 0;
int _myaxis0 = 0;
 //BA.debugLineNum = 1788;BA.debugLine="Private Sub DrawLines";
 //BA.debugLineNum = 1789;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 1790;BA.debugLine="Private x0, x1 As Int";
_x0 = 0;
_x1 = 0;
 //BA.debugLineNum = 1792;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 1793;BA.debugLine="Private Cols(Items.Size), PointCols(Items.Size),";
_cols = new int[_items.getSize()];
;
_pointcols = new int[_items.getSize()];
;
_strokewidths = new int[_items.getSize()];
;
 //BA.debugLineNum = 1794;BA.debugLine="Private Names(Items.Size), PointTypes(Items.Size)";
_names = new String[_items.getSize()];
java.util.Arrays.fill(_names,"");
_pointtypes = new String[_items.getSize()];
java.util.Arrays.fill(_pointtypes,"");
 //BA.debugLineNum = 1795;BA.debugLine="Private Filled(Items.Size) As Boolean";
_filled = new boolean[_items.getSize()];
;
 //BA.debugLineNum = 1797;BA.debugLine="If Items.Size = 1 And (MinMaxMeanValues(0) <> 0 O";
if (_items.getSize()==1 && (_minmaxmeanvalues[(int) (0)]!=0 || _minmaxmeanvalues[(int) (1)]!=0)) { 
 //BA.debugLineNum = 1798;BA.debugLine="Private sMax, sMin, sMean As Double";
_smax = 0;
_smin = 0;
_smean = 0;
 //BA.debugLineNum = 1799;BA.debugLine="If Graph.IncludeMinLine = True Then";
if (_graph.IncludeMinLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1800;BA.debugLine="sMin = Graph.Bottom - (MinMaxMeanValues(0) - Sc";
_smin = _graph.Bottom /*int*/ -(_minmaxmeanvalues[(int) (0)]-_scale[_sy].MinVal /*double*/ )*_scale[_sy].Scale /*double*/ ;
 //BA.debugLineNum = 1801;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMin, Graph.Righ";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smin),(float) (_graph.Right /*int*/ ),(float) (_smin),_graph.MinLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 1803;BA.debugLine="If Graph.IncludeMaxLine = True Then";
if (_graph.IncludeMaxLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1804;BA.debugLine="sMax = Graph.Bottom - (MinMaxMeanValues(1) - Sc";
_smax = _graph.Bottom /*int*/ -(_minmaxmeanvalues[(int) (1)]-_scale[_sy].MinVal /*double*/ )*_scale[_sy].Scale /*double*/ ;
 //BA.debugLineNum = 1805;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMax, Graph.Righ";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smax),(float) (_graph.Right /*int*/ ),(float) (_smax),_graph.MaxLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 1807;BA.debugLine="If Graph.IncludeMeanLine = True Then";
if (_graph.IncludeMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1808;BA.debugLine="sMean = Graph.Bottom - (MinMaxMeanValues(2) - S";
_smean = _graph.Bottom /*int*/ -(_minmaxmeanvalues[(int) (2)]-_scale[_sy].MinVal /*double*/ )*_scale[_sy].Scale /*double*/ ;
 //BA.debugLineNum = 1809;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, sMean, Graph.Rig";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_smean),(float) (_graph.Right /*int*/ ),(float) (_smean),_graph.MeanLineColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 };
 //BA.debugLineNum = 1813;BA.debugLine="PD = Points.Get(0)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 1814;BA.debugLine="x0 = Graph.Left";
_x0 = _graph.Left /*int*/ ;
 //BA.debugLineNum = 1815;BA.debugLine="Private py0(PD.YArray.Length), py1(PD.YArray.Leng";
_py0 = new double[_pd.YArray /*double[]*/ .length];
;
_py1 = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 1816;BA.debugLine="Private psy0(PD.YArray.Length), psy1(PD.YArray.Le";
_psy0 = new double[_pd.YArray /*double[]*/ .length];
;
_psy1 = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 1817;BA.debugLine="py0 = PD.YArray";
_py0 = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 1818;BA.debugLine="For i = 0 To py0.Length - 1";
{
final int step27 = 1;
final int limit27 = (int) (_py0.length-1);
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
 //BA.debugLineNum = 1819;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 1820;BA.debugLine="ID = Items.Get(i)";
_id = (b4a.example.cov.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 1821;BA.debugLine="Cols(i) = ID.Color";
_cols[_i] = _id.Color /*int*/ ;
 //BA.debugLineNum = 1822;BA.debugLine="PointCols(i) = ID.PointColor";
_pointcols[_i] = _id.PointColor /*int*/ ;
 //BA.debugLineNum = 1823;BA.debugLine="Names(i) = ID.Name";
_names[_i] = _id.Name /*String*/ ;
 //BA.debugLineNum = 1824;BA.debugLine="StrokeWidths(i) = ID.StrokeWidth";
_strokewidths[_i] = _id.StrokeWidth /*int*/ ;
 //BA.debugLineNum = 1825;BA.debugLine="PointTypes(i) = ID.PointType";
_pointtypes[_i] = _id.PointType /*String*/ ;
 //BA.debugLineNum = 1826;BA.debugLine="Filled(i) = ID.Filled";
_filled[_i] = _id.Filled /*boolean*/ ;
 //BA.debugLineNum = 1827;BA.debugLine="psy0(i) = Graph.Bottom - (py0(i) - Scale(sY).Min";
_psy0[_i] = _graph.Bottom /*int*/ -(_py0[_i]-_scale[_sy].MinVal /*double*/ )*_scale[_sy].Scale /*double*/ ;
 }
};
 //BA.debugLineNum = 1830;BA.debugLine="xcvsGraph.ClipPath(pthGrid)";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 1831;BA.debugLine="For i = 1 To Points.Size - 1";
{
final int step39 = 1;
final int limit39 = (int) (_points.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit39 ;_i = _i + step39 ) {
 //BA.debugLineNum = 1832;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 1833;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 1834;BA.debugLine="py1 = PD.YArray";
_py1 = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 1835;BA.debugLine="x1 = Graph.Left + i * Scale(sX).Scale";
_x1 = (int) (_graph.Left /*int*/ +_i*_scale[_sx].Scale /*double*/ );
 //BA.debugLineNum = 1836;BA.debugLine="For j = 0 To py1.Length - 1";
{
final int step44 = 1;
final int limit44 = (int) (_py1.length-1);
_j = (int) (0) ;
for (;_j <= limit44 ;_j = _j + step44 ) {
 //BA.debugLineNum = 1837;BA.debugLine="psy1(j) = Graph.Bottom - (py1(j) - Scale(sY).Mi";
_psy1[_j] = _graph.Bottom /*int*/ -(_py1[_j]-_scale[_sy].MinVal /*double*/ )*_scale[_sy].Scale /*double*/ ;
 //BA.debugLineNum = 1838;BA.debugLine="xcvsGraph.DrawLine(x0, psy0(j), x1, psy1(j), Co";
_xcvsgraph.DrawLine((float) (_x0),(float) (_psy0[_j]),(float) (_x1),(float) (_psy1[_j]),_cols[_j],(float) (_strokewidths[_j]));
 //BA.debugLineNum = 1839;BA.debugLine="psy0(j) = psy1(j)";
_psy0[_j] = _psy1[_j];
 }
};
 //BA.debugLineNum = 1841;BA.debugLine="x0 = x1";
_x0 = _x1;
 }
};
 //BA.debugLineNum = 1843;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 1845;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step52 = 1;
final int limit52 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit52 ;_i = _i + step52 ) {
 //BA.debugLineNum = 1846;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 1847;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 1848;BA.debugLine="py1 = PD.YArray";
_py1 = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 1849;BA.debugLine="x1 = Graph.Left + i * Scale(sX).Scale";
_x1 = (int) (_graph.Left /*int*/ +_i*_scale[_sx].Scale /*double*/ );
 //BA.debugLineNum = 1850;BA.debugLine="For j = 0 To py1.Length - 1";
{
final int step57 = 1;
final int limit57 = (int) (_py1.length-1);
_j = (int) (0) ;
for (;_j <= limit57 ;_j = _j + step57 ) {
 //BA.debugLineNum = 1851;BA.debugLine="psy1(j) = Graph.Bottom - (py1(j) - Scale(sY).Mi";
_psy1[_j] = _graph.Bottom /*int*/ -(_py1[_j]-_scale[_sy].MinVal /*double*/ )*_scale[_sy].Scale /*double*/ ;
 //BA.debugLineNum = 1852;BA.debugLine="If PointTypes(j) <> \"NONE\" Then";
if ((_pointtypes[_j]).equals("NONE") == false) { 
 //BA.debugLineNum = 1853;BA.debugLine="DrawPoint(x1, psy1(j), PointCols(j), PointType";
_drawpoint(_x1,(int) (_psy1[_j]),_pointcols[_j],_pointtypes[_j],_filled[_j],_strokewidths[_j]);
 };
 }
};
 }
};
 //BA.debugLineNum = 1859;BA.debugLine="If Scale(sY).MinVal< 0 And Scale(sY).MaxVal > 0 T";
if (_scale[_sy].MinVal /*double*/ <0 && _scale[_sy].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 1860;BA.debugLine="Private mYAxis0 = Graph.Bottom + Scale(sY).MinVa";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy].MinVal /*double*/ *_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 1861;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.Ri";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 1864;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Points.Size";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _points.getSize()>0) { 
 //BA.debugLineNum = 1865;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 1868;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 1869;BA.debugLine="End Sub";
return "";
}
public String  _drawlineslog() throws Exception{
int _i = 0;
int _x0 = 0;
int _x1 = 0;
b4a.example.cov.xchart._pointdata _pd = null;
int[] _cols = null;
int[] _pointcols = null;
int[] _strokewidths = null;
String[] _names = null;
String[] _pointtypes = null;
boolean[] _filled = null;
double[] _py0 = null;
double[] _py1 = null;
double[] _psy0 = null;
double[] _psy1 = null;
b4a.example.cov.xchart._itemdata _id = null;
int _j = 0;
 //BA.debugLineNum = 1872;BA.debugLine="Private Sub DrawLinesLog";
 //BA.debugLineNum = 1873;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 1874;BA.debugLine="Private x0, x1 As Int";
_x0 = 0;
_x1 = 0;
 //BA.debugLineNum = 1876;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 1877;BA.debugLine="Private Cols(Items.Size), PointCols(Items.Size),";
_cols = new int[_items.getSize()];
;
_pointcols = new int[_items.getSize()];
;
_strokewidths = new int[_items.getSize()];
;
 //BA.debugLineNum = 1878;BA.debugLine="Private Names(Items.Size), PointTypes(Items.Size)";
_names = new String[_items.getSize()];
java.util.Arrays.fill(_names,"");
_pointtypes = new String[_items.getSize()];
java.util.Arrays.fill(_pointtypes,"");
 //BA.debugLineNum = 1879;BA.debugLine="Private Filled(Items.Size) As Boolean";
_filled = new boolean[_items.getSize()];
;
 //BA.debugLineNum = 1881;BA.debugLine="PD = Points.Get(0)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 1882;BA.debugLine="x0 = Graph.Left";
_x0 = _graph.Left /*int*/ ;
 //BA.debugLineNum = 1883;BA.debugLine="Private py0(PD.YArray.Length), py1(PD.YArray.Leng";
_py0 = new double[_pd.YArray /*double[]*/ .length];
;
_py1 = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 1884;BA.debugLine="Private psy0(PD.YArray.Length), psy1(PD.YArray.Le";
_psy0 = new double[_pd.YArray /*double[]*/ .length];
;
_psy1 = new double[_pd.YArray /*double[]*/ .length];
;
 //BA.debugLineNum = 1885;BA.debugLine="py0 = PD.YArray";
_py0 = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 1886;BA.debugLine="For i = 0 To py0.Length - 1";
{
final int step12 = 1;
final int limit12 = (int) (_py0.length-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 1887;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 1888;BA.debugLine="ID = Items.Get(i)";
_id = (b4a.example.cov.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 1889;BA.debugLine="Cols(i) = ID.Color";
_cols[_i] = _id.Color /*int*/ ;
 //BA.debugLineNum = 1890;BA.debugLine="PointCols(i) = ID.PointColor";
_pointcols[_i] = _id.PointColor /*int*/ ;
 //BA.debugLineNum = 1891;BA.debugLine="Names(i) = ID.Name";
_names[_i] = _id.Name /*String*/ ;
 //BA.debugLineNum = 1892;BA.debugLine="StrokeWidths(i) = ID.StrokeWidth";
_strokewidths[_i] = _id.StrokeWidth /*int*/ ;
 //BA.debugLineNum = 1893;BA.debugLine="PointTypes(i) = ID.PointType";
_pointtypes[_i] = _id.PointType /*String*/ ;
 //BA.debugLineNum = 1894;BA.debugLine="Filled(i) = ID.Filled";
_filled[_i] = _id.Filled /*boolean*/ ;
 //BA.debugLineNum = 1895;BA.debugLine="psy0(i) = Graph.Bottom - (Logarithm(py0(i), 10)";
_psy0[_i] = _graph.Bottom /*int*/ -(__c.Logarithm(_py0[_i],10)-_scalelog[_sy].MantMin /*int*/ )*_scalelog[_sy].Scale /*double*/ ;
 }
};
 //BA.debugLineNum = 1898;BA.debugLine="xcvsGraph.ClipPath(pthGrid)";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 1899;BA.debugLine="For i = 1 To Points.Size - 1";
{
final int step24 = 1;
final int limit24 = (int) (_points.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
 //BA.debugLineNum = 1900;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 1901;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 1902;BA.debugLine="py1 = PD.YArray";
_py1 = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 1903;BA.debugLine="x1 = Graph.Left + i * Scale(sX).Scale";
_x1 = (int) (_graph.Left /*int*/ +_i*_scale[_sx].Scale /*double*/ );
 //BA.debugLineNum = 1904;BA.debugLine="For j = 0 To py1.Length - 1";
{
final int step29 = 1;
final int limit29 = (int) (_py1.length-1);
_j = (int) (0) ;
for (;_j <= limit29 ;_j = _j + step29 ) {
 //BA.debugLineNum = 1905;BA.debugLine="psy1(j) = Graph.Bottom - (Logarithm(py1(j), 10)";
_psy1[_j] = _graph.Bottom /*int*/ -(__c.Logarithm(_py1[_j],10)-_scalelog[_sy].MantMin /*int*/ )*_scalelog[_sy].Scale /*double*/ ;
 //BA.debugLineNum = 1906;BA.debugLine="xcvsGraph.DrawLine(x0, psy0(j), x1, psy1(j), Co";
_xcvsgraph.DrawLine((float) (_x0),(float) (_psy0[_j]),(float) (_x1),(float) (_psy1[_j]),_cols[_j],(float) (_strokewidths[_j]));
 //BA.debugLineNum = 1907;BA.debugLine="psy0(j) = psy1(j)";
_psy0[_j] = _psy1[_j];
 }
};
 //BA.debugLineNum = 1909;BA.debugLine="x0 = x1";
_x0 = _x1;
 }
};
 //BA.debugLineNum = 1911;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 1913;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Points.Size";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _points.getSize()>0) { 
 //BA.debugLineNum = 1914;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 1917;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 1918;BA.debugLine="End Sub";
return "";
}
public String  _drawpies() throws Exception{
float _total = 0f;
b4a.example.cov.xchart._itemdata _item = null;
int _centerx = 0;
int _centery = 0;
int _titleheight = 0;
float _radius = 0f;
float _radiustext = 0f;
float _startangle = 0f;
float _totalangle = 0f;
float _midangle = 0f;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rectcircle = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _mpath = null;
float _angle = 0f;
b4a.example.bitmapcreator._argbcolor _argb = null;
b4a.example.bitmapcreator _bmpcreate = null;
int _acol = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rb = null;
b4a.example.bitmapcreator _bc1 = null;
float _percentage = 0f;
int _x = 0;
int _y = 0;
String _txt = "";
 //BA.debugLineNum = 2429;BA.debugLine="Private Sub DrawPies";
 //BA.debugLineNum = 2430;BA.debugLine="xcvsGraph.DrawRect(xcvsGraph.TargetRect, Graph.Ch";
_xcvsgraph.DrawRect(_xcvsgraph.getTargetRect(),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 2432;BA.debugLine="Dim Total As Float";
_total = 0f;
 //BA.debugLineNum = 2433;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group3 = _items;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_item = (b4a.example.cov.xchart._itemdata)(group3.Get(index3));
 //BA.debugLineNum = 2434;BA.debugLine="Total = Total + Item.Value";
_total = (float) (_total+_item.Value /*float*/ );
 }
};
 //BA.debugLineNum = 2437;BA.debugLine="Private CenterX, CenterY, TitleHeight As Int";
_centerx = 0;
_centery = 0;
_titleheight = 0;
 //BA.debugLineNum = 2439;BA.debugLine="If Graph.Title <> \"\" Then";
if ((_graph.Title /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 2440;BA.debugLine="TitleHeight = 1.2 * Texts.TitleTextHeight";
_titleheight = (int) (1.2*_texts.TitleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 2442;BA.debugLine="Private Radius As Float = Min(xcvsGraph.TargetRec";
_radius = (float) (__c.Min(_xcvsgraph.getTargetRect().getWidth(),(_graph.Height /*int*/ -_titleheight))/(double)2-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 2444;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" Then";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false) { 
 //BA.debugLineNum = 2445;BA.debugLine="If xcvsGraph.TargetRect.Width > xcvsGraph.Target";
if (_xcvsgraph.getTargetRect().getWidth()>_xcvsgraph.getTargetRect().getHeight()) { 
 //BA.debugLineNum = 2446;BA.debugLine="CenterX = Radius + 10dip";
_centerx = (int) (_radius+__c.DipToCurrent((int) (10)));
 }else {
 //BA.debugLineNum = 2448;BA.debugLine="CenterX = xcvsGraph.TargetRect.Width / 2";
_centerx = (int) (_xcvsgraph.getTargetRect().getWidth()/(double)2);
 };
 }else {
 //BA.debugLineNum = 2451;BA.debugLine="CenterX = xcvsGraph.TargetRect.Width / 2";
_centerx = (int) (_xcvsgraph.getTargetRect().getWidth()/(double)2);
 };
 //BA.debugLineNum = 2454;BA.debugLine="CenterY = Graph.Height - Radius - 10dip";
_centery = (int) (_graph.Height /*int*/ -_radius-__c.DipToCurrent((int) (10)));
 //BA.debugLineNum = 2456;BA.debugLine="If Graph.Title <> \"\" Then";
if ((_graph.Title /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 2457;BA.debugLine="xcvsGraph.DrawText(Graph.Title, xcvsGraph.Target";
_xcvsgraph.DrawText(ba,_graph.Title /*String*/ ,(float) (_xcvsgraph.getTargetRect().getWidth()/(double)2),(float) (0.8*_texts.TitleTextHeight /*int*/ ),_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_xui.Color_Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 //BA.debugLineNum = 2460;BA.debugLine="Private RadiusText As Float = Radius * 0.7";
_radiustext = (float) (_radius*0.7);
 //BA.debugLineNum = 2461;BA.debugLine="Private StartAngle, TotalAngle, MidAngle As Float";
_startangle = 0f;
_totalangle = 0f;
_midangle = 0f;
 //BA.debugLineNum = 2462;BA.debugLine="TotalAngle = 360 - Graph.PieGapDegrees * Items.Si";
_totalangle = (float) (360-_graph.PieGapDegrees /*int*/ *_items.getSize());
 //BA.debugLineNum = 2463;BA.debugLine="Private rectCircle As B4XRect";
_rectcircle = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 2464;BA.debugLine="rectCircle.Initialize(CenterX - Radius, CenterY -";
_rectcircle.Initialize((float) (_centerx-_radius),(float) (_centery-_radius),(float) (_centerx+_radius),(float) (_centery+_radius));
 //BA.debugLineNum = 2466;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group29 = _items;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_item = (b4a.example.cov.xchart._itemdata)(group29.Get(index29));
 //BA.debugLineNum = 2467;BA.debugLine="Private mPath As B4XPath";
_mpath = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 2468;BA.debugLine="Private Angle As Float = Item.Value / Total * To";
_angle = (float) (_item.Value /*float*/ /(double)_total*_totalangle);
 //BA.debugLineNum = 2469;BA.debugLine="If Angle = TotalAngle Then";
if (_angle==_totalangle) { 
 //BA.debugLineNum = 2470;BA.debugLine="If Graph.GradientColors = False Then";
if (_graph.GradientColors /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2471;BA.debugLine="xcvsGraph.DrawCircle(CenterX, CenterY, Radius,";
_xcvsgraph.DrawCircle((float) (_centerx),(float) (_centery),_radius,_item.Color /*int*/ ,__c.True,(float) (0));
 }else {
 };
 }else {
 //BA.debugLineNum = 2475;BA.debugLine="Private ARGB As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
 //BA.debugLineNum = 2476;BA.debugLine="Private BmpCreate As BitmapCreator";
_bmpcreate = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 2477;BA.debugLine="Private Acol As Int";
_acol = 0;
 //BA.debugLineNum = 2478;BA.debugLine="BmpCreate.Initialize(10, 10)";
_bmpcreate._initialize(ba,(int) (10),(int) (10));
 //BA.debugLineNum = 2479;BA.debugLine="BmpCreate.ColorToARGB(Item.Color, ARGB)";
_bmpcreate._colortoargb(_item.Color /*int*/ ,_argb);
 //BA.debugLineNum = 2480;BA.debugLine="Acol = xui.Color_ARGB(Graph.GradientColorsAlpha";
_acol = _xui.Color_ARGB(_graph.GradientColorsAlpha /*int*/ ,_argb.r,_argb.g,_argb.b);
 //BA.debugLineNum = 2482;BA.debugLine="mPath.InitializeArc(CenterX, CenterY, Radius, S";
_mpath.InitializeArc((float) (_centerx),(float) (_centery),_radius,_startangle,_angle);
 //BA.debugLineNum = 2483;BA.debugLine="StartAngle = StartAngle + Angle + Graph.PieGapD";
_startangle = (float) (_startangle+_angle+_graph.PieGapDegrees /*int*/ );
 //BA.debugLineNum = 2484;BA.debugLine="xcvsGraph.ClipPath(mPath)";
_xcvsgraph.ClipPath(_mpath);
 //BA.debugLineNum = 2485;BA.debugLine="If Graph.GradientColors = False Then";
if (_graph.GradientColors /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2486;BA.debugLine="xcvsGraph.DrawCircle(CenterX, CenterY, Radius,";
_xcvsgraph.DrawCircle((float) (_centerx),(float) (_centery),_radius,_item.Color /*int*/ ,__c.True,(float) (0));
 }else {
 //BA.debugLineNum = 2488;BA.debugLine="Private rb As B4XRect";
_rb = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 2489;BA.debugLine="rb.Initialize(0, 0, 2 * Radius, 2 * Radius)";
_rb.Initialize((float) (0),(float) (0),(float) (2*_radius),(float) (2*_radius));
 //BA.debugLineNum = 2490;BA.debugLine="Private bc1 As BitmapCreator";
_bc1 = new b4a.example.bitmapcreator();
 //BA.debugLineNum = 2491;BA.debugLine="bc1.Initialize(2 * Radius, 2 * Radius)";
_bc1._initialize(ba,(int) (2*_radius),(int) (2*_radius));
 //BA.debugLineNum = 2492;BA.debugLine="bc1.FillRadialGradient(Array As Int(Acol, Item";
_bc1._fillradialgradient(new int[]{_acol,_item.Color /*int*/ },_rb);
 //BA.debugLineNum = 2493;BA.debugLine="xcvsGraph.DrawBitmap(bc1.Bitmap, rectCircle)";
_xcvsgraph.DrawBitmap((android.graphics.Bitmap)(_bc1._getbitmap().getObject()),_rectcircle);
 };
 //BA.debugLineNum = 2495;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 };
 }
};
 //BA.debugLineNum = 2499;BA.debugLine="If Graph.PieAddPerentage Then";
if (_graph.PieAddPerentage /*boolean*/ ) { 
 //BA.debugLineNum = 2500;BA.debugLine="Private Percentage As Float";
_percentage = 0f;
 //BA.debugLineNum = 2502;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group62 = _items;
final int groupLen62 = group62.getSize()
;int index62 = 0;
;
for (; index62 < groupLen62;index62++){
_item = (b4a.example.cov.xchart._itemdata)(group62.Get(index62));
 //BA.debugLineNum = 2503;BA.debugLine="Private mPath As B4XPath";
_mpath = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 2504;BA.debugLine="Private Angle As Float = Item.Value / Total * T";
_angle = (float) (_item.Value /*float*/ /(double)_total*_totalangle);
 //BA.debugLineNum = 2505;BA.debugLine="If Angle = TotalAngle Then";
if (_angle==_totalangle) { 
 //BA.debugLineNum = 2506;BA.debugLine="xcvsGraph.DrawCircle(CenterX, CenterY, Radius,";
_xcvsgraph.DrawCircle((float) (_centerx),(float) (_centery),_radius,_item.Color /*int*/ ,__c.True,(float) (0));
 }else {
 //BA.debugLineNum = 2508;BA.debugLine="StartAngle = StartAngle + Angle + Graph.PieGap";
_startangle = (float) (_startangle+_angle+_graph.PieGapDegrees /*int*/ );
 //BA.debugLineNum = 2509;BA.debugLine="Private x, y As Int";
_x = 0;
_y = 0;
 //BA.debugLineNum = 2510;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 2511;BA.debugLine="MidAngle = StartAngle - Angle /2 - Graph.PieGa";
_midangle = (float) (_startangle-_angle/(double)2-_graph.PieGapDegrees /*int*/ );
 //BA.debugLineNum = 2512;BA.debugLine="x = CenterX + RadiusText * CosD(MidAngle)";
_x = (int) (_centerx+_radiustext*__c.CosD(_midangle));
 //BA.debugLineNum = 2513;BA.debugLine="y = CenterY + RadiusText * SinD(MidAngle) + 5d";
_y = (int) (_centery+_radiustext*__c.SinD(_midangle)+__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 2514;BA.debugLine="Percentage = Item.Value / Total * 100";
_percentage = (float) (_item.Value /*float*/ /(double)_total*100);
 //BA.debugLineNum = 2515;BA.debugLine="txt = NumberFormat2(Percentage, 1, mPiePercent";
_txt = __c.NumberFormat2(_percentage,(int) (1),_mpiepercentagenbfractions,_mpiepercentagenbfractions,__c.False)+" %";
 //BA.debugLineNum = 2516;BA.debugLine="xcvsGraph.DrawText(txt, x, y, Texts.AxisFont,";
_xcvsgraph.DrawText(ba,_txt,(float) (_x),(float) (_y),_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_getcontrastcolor(_item.Color /*int*/ ),BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 };
 }
};
 };
 //BA.debugLineNum = 2521;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And Items.Size";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && _items.getSize()>0) { 
 //BA.debugLineNum = 2522;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 2525;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 2526;BA.debugLine="End Sub";
return "";
}
public String  _drawpoint(int _x,int _y,int _color,String _pointtype,boolean _filled,int _strokewidth) throws Exception{
int _dx = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _tripath = null;
 //BA.debugLineNum = 1921;BA.debugLine="Private Sub DrawPoint(X As Int, Y As Int, Color As";
 //BA.debugLineNum = 1922;BA.debugLine="Private dx As Int";
_dx = 0;
 //BA.debugLineNum = 1924;BA.debugLine="If x < Graph.Left Or x > Graph.Right Or Y < Graph";
if (_x<_graph.Left /*int*/  || _x>_graph.Right /*int*/  || _y<_graph.Top /*int*/  || _y>_graph.Bottom /*int*/ ) { 
 //BA.debugLineNum = 1925;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1928;BA.debugLine="dx = Max(4dip, 1.4 * StrokeWidth)";
_dx = (int) (__c.Max(__c.DipToCurrent((int) (4)),1.4*_strokewidth));
 //BA.debugLineNum = 1929;BA.debugLine="Select PointType";
switch (BA.switchObjectToInt(_pointtype,"CIRCLE","SQUARE","TRIANGLE","RHOMBUS","CROSS+","CROSSX","CROSSx")) {
case 0: {
 //BA.debugLineNum = 1931;BA.debugLine="If Filled = False Then";
if (_filled==__c.False) { 
 //BA.debugLineNum = 1932;BA.debugLine="xcvsGraph.DrawCircle(X, Y, dx, Graph.ChartBack";
_xcvsgraph.DrawCircle((float) (_x),(float) (_y),(float) (_dx),_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1933;BA.debugLine="xcvsGraph.DrawCircle(X, Y, dx, Color, Filled,";
_xcvsgraph.DrawCircle((float) (_x),(float) (_y),(float) (_dx),_color,_filled,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 1935;BA.debugLine="xcvsGraph.DrawCircle(X, Y, dx, Color, True, 2d";
_xcvsgraph.DrawCircle((float) (_x),(float) (_y),(float) (_dx),_color,__c.True,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1936;BA.debugLine="xcvsGraph.DrawCircle(X, Y, dx, Color, False, 2";
_xcvsgraph.DrawCircle((float) (_x),(float) (_y),(float) (_dx),_color,__c.False,(float) (__c.DipToCurrent((int) (2))));
 };
 break; }
case 1: {
 //BA.debugLineNum = 1939;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 1940;BA.debugLine="r.Initialize(X - dx, Y - dx, X + dx, Y + dx)";
_r.Initialize((float) (_x-_dx),(float) (_y-_dx),(float) (_x+_dx),(float) (_y+_dx));
 //BA.debugLineNum = 1941;BA.debugLine="If Filled = False Then";
if (_filled==__c.False) { 
 //BA.debugLineNum = 1942;BA.debugLine="xcvsGraph.DrawRect(r, Graph.ChartBackgroundCol";
_xcvsgraph.DrawRect(_r,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1943;BA.debugLine="xcvsGraph.DrawRect(r, Color, Filled, 2dip)";
_xcvsgraph.DrawRect(_r,_color,_filled,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 1945;BA.debugLine="xcvsGraph.DrawRect(r, Color, True, 2dip)";
_xcvsgraph.DrawRect(_r,_color,__c.True,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1946;BA.debugLine="xcvsGraph.DrawRect(r, Color, False, 2dip)";
_xcvsgraph.DrawRect(_r,_color,__c.False,(float) (__c.DipToCurrent((int) (2))));
 };
 break; }
case 2: {
 //BA.debugLineNum = 1949;BA.debugLine="Private triPath As B4XPath";
_tripath = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 1950;BA.debugLine="triPath.Initialize(X - dx, Y + 0.8 * dx)";
_tripath.Initialize((float) (_x-_dx),(float) (_y+0.8*_dx));
 //BA.debugLineNum = 1951;BA.debugLine="triPath.LineTo(X, Y - 1.2 * dx)";
_tripath.LineTo((float) (_x),(float) (_y-1.2*_dx));
 //BA.debugLineNum = 1952;BA.debugLine="triPath.LineTo(X + dx, Y + 0.8 * dx)";
_tripath.LineTo((float) (_x+_dx),(float) (_y+0.8*_dx));
 //BA.debugLineNum = 1953;BA.debugLine="triPath.LineTo(X - dx, Y + 0.8 * dx)";
_tripath.LineTo((float) (_x-_dx),(float) (_y+0.8*_dx));
 //BA.debugLineNum = 1954;BA.debugLine="xcvsGraph.ClipPath(triPath)";
_xcvsgraph.ClipPath(_tripath);
 //BA.debugLineNum = 1955;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 1956;BA.debugLine="r.Initialize(X - dx, Y - dx, X + dx, Y + dx)";
_r.Initialize((float) (_x-_dx),(float) (_y-_dx),(float) (_x+_dx),(float) (_y+_dx));
 //BA.debugLineNum = 1958;BA.debugLine="If Filled = False Then";
if (_filled==__c.False) { 
 //BA.debugLineNum = 1959;BA.debugLine="xcvsGraph.DrawRect(r, Graph.ChartBackgroundCol";
_xcvsgraph.DrawRect(_r,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1960;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 1961;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y + dx, X, Y - dx,";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y+_dx),(float) (_x),(float) (_y-_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1962;BA.debugLine="xcvsGraph.DrawLine(X, Y - dx, X + dx, Y + dx,";
_xcvsgraph.DrawLine((float) (_x),(float) (_y-_dx),(float) (_x+_dx),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1963;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y + dx, X + dx, Y +";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y+_dx),(float) (_x+_dx),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 1965;BA.debugLine="xcvsGraph.DrawRect(r, Color, True, 1dip)";
_xcvsgraph.DrawRect(_r,_color,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1966;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 1967;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y + dx, X, Y - dx,";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y+_dx),(float) (_x),(float) (_y-_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1968;BA.debugLine="xcvsGraph.DrawLine(X, Y - dx, X + dx, Y + dx,";
_xcvsgraph.DrawLine((float) (_x),(float) (_y-_dx),(float) (_x+_dx),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1969;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y + dx, X + dx, Y +";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y+_dx),(float) (_x+_dx),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 };
 break; }
case 3: {
 //BA.debugLineNum = 1972;BA.debugLine="Private triPath As B4XPath";
_tripath = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 1973;BA.debugLine="triPath.Initialize(X - dx, Y)";
_tripath.Initialize((float) (_x-_dx),(float) (_y));
 //BA.debugLineNum = 1974;BA.debugLine="triPath.LineTo(X, Y -  dx)";
_tripath.LineTo((float) (_x),(float) (_y-_dx));
 //BA.debugLineNum = 1975;BA.debugLine="triPath.LineTo(X + dx, Y)";
_tripath.LineTo((float) (_x+_dx),(float) (_y));
 //BA.debugLineNum = 1976;BA.debugLine="triPath.LineTo(X, Y + dx)";
_tripath.LineTo((float) (_x),(float) (_y+_dx));
 //BA.debugLineNum = 1977;BA.debugLine="triPath.LineTo(X - dx, Y)";
_tripath.LineTo((float) (_x-_dx),(float) (_y));
 //BA.debugLineNum = 1978;BA.debugLine="xcvsGraph.ClipPath(triPath)";
_xcvsgraph.ClipPath(_tripath);
 //BA.debugLineNum = 1979;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 1980;BA.debugLine="r.Initialize(X - dx, Y - dx, X + dx, Y + dx)";
_r.Initialize((float) (_x-_dx),(float) (_y-_dx),(float) (_x+_dx),(float) (_y+_dx));
 //BA.debugLineNum = 1982;BA.debugLine="If Filled = False Then";
if (_filled==__c.False) { 
 //BA.debugLineNum = 1983;BA.debugLine="xcvsGraph.DrawRect(r, Graph.ChartBackgroundCol";
_xcvsgraph.DrawRect(_r,_graph.ChartBackgroundColor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1984;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 1985;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y, X, Y - dx, Color";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y),(float) (_x),(float) (_y-_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1986;BA.debugLine="xcvsGraph.DrawLine(X, Y - dx, X + dx, Y, Color";
_xcvsgraph.DrawLine((float) (_x),(float) (_y-_dx),(float) (_x+_dx),(float) (_y),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1987;BA.debugLine="xcvsGraph.DrawLine(X + dx, Y, X, Y + dx, Color";
_xcvsgraph.DrawLine((float) (_x+_dx),(float) (_y),(float) (_x),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1988;BA.debugLine="xcvsGraph.DrawLine(X, Y + dx, X - dx, Y, Color";
_xcvsgraph.DrawLine((float) (_x),(float) (_y+_dx),(float) (_x-_dx),(float) (_y),_color,(float) (__c.DipToCurrent((int) (2))));
 }else {
 //BA.debugLineNum = 1990;BA.debugLine="xcvsGraph.DrawRect(r, Color, True, 1dip)";
_xcvsgraph.DrawRect(_r,_color,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1991;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 1992;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y, X, Y - dx, Color";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y),(float) (_x),(float) (_y-_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1993;BA.debugLine="xcvsGraph.DrawLine(X, Y - dx, X + dx, Y, Color";
_xcvsgraph.DrawLine((float) (_x),(float) (_y-_dx),(float) (_x+_dx),(float) (_y),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1994;BA.debugLine="xcvsGraph.DrawLine(X + dx, Y, X, Y + dx, Color";
_xcvsgraph.DrawLine((float) (_x+_dx),(float) (_y),(float) (_x),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1995;BA.debugLine="xcvsGraph.DrawLine(X, Y + dx, X - dx, Y, Color";
_xcvsgraph.DrawLine((float) (_x),(float) (_y+_dx),(float) (_x-_dx),(float) (_y),_color,(float) (__c.DipToCurrent((int) (2))));
 };
 break; }
case 4: {
 //BA.debugLineNum = 1998;BA.debugLine="dx = dx + 1dip";
_dx = (int) (_dx+__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 1999;BA.debugLine="xcvsGraph.DrawLine(X, Y - dx, X, Y + dx, Color,";
_xcvsgraph.DrawLine((float) (_x),(float) (_y-_dx),(float) (_x),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 2000;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y, X + dx, Y, Color,";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y),(float) (_x+_dx),(float) (_y),_color,(float) (__c.DipToCurrent((int) (2))));
 break; }
case 5: 
case 6: {
 //BA.debugLineNum = 2002;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y + dx, X + dx, Y -";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y+_dx),(float) (_x+_dx),(float) (_y-_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 2003;BA.debugLine="xcvsGraph.DrawLine(X - dx, Y - dx, X + dx, Y +";
_xcvsgraph.DrawLine((float) (_x-_dx),(float) (_y-_dx),(float) (_x+_dx),(float) (_y+_dx),_color,(float) (__c.DipToCurrent((int) (2))));
 break; }
}
;
 //BA.debugLineNum = 2005;BA.debugLine="End Sub";
return "";
}
public String  _drawxscale() throws Exception{
int _i = 0;
int _x = 0;
int _x1 = 0;
int _xinterval = 0;
int _l1 = 0;
String _txt = "";
double _h1 = 0;
double _h2 = 0;
double _h3 = 0;
double _h4 = 0;
double _h5 = 0;
b4a.example.cov.xchart._pointdata _pd = null;
 //BA.debugLineNum = 1632;BA.debugLine="Private Sub DrawXScale";
 //BA.debugLineNum = 1633;BA.debugLine="Private i, x, x1, XInterval, l1 As Int";
_i = 0;
_x = 0;
_x1 = 0;
_xinterval = 0;
_l1 = 0;
 //BA.debugLineNum = 1634;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 1635;BA.debugLine="Private h1, h2, h3, h4, h5 As Double";
_h1 = 0;
_h2 = 0;
_h3 = 0;
_h4 = 0;
_h5 = 0;
 //BA.debugLineNum = 1644;BA.debugLine="h1 = 1.1";
_h1 = 1.1;
 //BA.debugLineNum = 1645;BA.debugLine="h2 = 0.25";
_h2 = 0.25;
 //BA.debugLineNum = 1646;BA.debugLine="h3 = 0.3";
_h3 = 0.3;
 //BA.debugLineNum = 1647;BA.debugLine="h4 = 0.6";
_h4 = 0.6;
 //BA.debugLineNum = 1648;BA.debugLine="h5 = 0.8";
_h5 = 0.8;
 //BA.debugLineNum = 1650;BA.debugLine="l1 = 4dip";
_l1 = __c.DipToCurrent((int) (4));
 //BA.debugLineNum = 1652;BA.debugLine="If Graph.ChartType = \"YX_CHART\" Then";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART")) { 
 //BA.debugLineNum = 1653;BA.debugLine="XInterval = Graph.Width / Scale(sX).NbIntervals";
_xinterval = (int) (_graph.Width /*int*/ /(double)_scale[_sx].NbIntervals /*int*/ );
 //BA.debugLineNum = 1654;BA.debugLine="For i = 0 To Scale(sX).NbIntervals";
{
final int step12 = 1;
final int limit12 = _scale[_sx].NbIntervals /*int*/ ;
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 1655;BA.debugLine="x = Graph.Left + i * XInterval";
_x = (int) (_graph.Left /*int*/ +_i*_xinterval);
 //BA.debugLineNum = 1656;BA.debugLine="txt = NumberFormat3(Scale(sX).MinVal + i * Scal";
_txt = _numberformat3(_scale[_sx].MinVal /*double*/ +_i*_scale[_sx].Interval /*double*/ ,(int) (6));
 //BA.debugLineNum = 1658;BA.debugLine="xcvsGraph.DrawLine(x, Graph.Top, x, Graph.Botto";
_xcvsgraph.DrawLine((float) (_x),(float) (_graph.Top /*int*/ ),(float) (_x),(float) (_graph.Bottom /*int*/ ),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1659;BA.debugLine="Select Graph.XScaleTextOrientation";
switch (BA.switchObjectToInt(_graph.XScaleTextOrientation /*String*/ ,"HORIZONTAL","VERTICAL","45 DEGREES")) {
case 0: {
 //BA.debugLineNum = 1661;BA.debugLine="If (x - x1) > 1.2 * MeasureTextWidth(txt, Tex";
if ((_x-_x1)>1.2*_measuretextwidth(_txt,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )) { 
 //BA.debugLineNum = 1662;BA.debugLine="xcvsGraph.DrawText(txt, x, Graph.Bottom + h1";
_xcvsgraph.DrawText(ba,_txt,(float) (_x),(float) (_graph.Bottom /*int*/ +_h1*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 1663;BA.debugLine="x1 = x";
_x1 = _x;
 };
 break; }
case 1: {
 //BA.debugLineNum = 1666;BA.debugLine="If (x - x1) > 1.2 * Texts.ScaleTextHeight The";
if ((_x-_x1)>1.2*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 1667;BA.debugLine="xcvsGraph.DrawTextRotated(txt, x + h2 * Text";
_xcvsgraph.DrawTextRotated(ba,_txt,(float) (_x+_h2*_texts.ScaleTextHeight /*int*/ ),(float) (_graph.Bottom /*int*/ +_h4*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"),(float) (-90));
 //BA.debugLineNum = 1668;BA.debugLine="x1 = x";
_x1 = _x;
 };
 break; }
case 2: {
 //BA.debugLineNum = 1671;BA.debugLine="If (x - x1) > 1.2 * Texts.ScaleTextHeight The";
if ((_x-_x1)>1.2*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 1672;BA.debugLine="xcvsGraph.DrawTextRotated(txt, x + h3 * Text";
_xcvsgraph.DrawTextRotated(ba,_txt,(float) (_x+_h3*_texts.ScaleTextHeight /*int*/ ),(float) (_graph.Bottom /*int*/ +_h5*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"),(float) (-45));
 //BA.debugLineNum = 1673;BA.debugLine="x1 = x";
_x1 = _x;
 };
 //BA.debugLineNum = 1675;BA.debugLine="xcvsGraph.DrawLine(x, Graph.Bottom, x, Graph.";
_xcvsgraph.DrawLine((float) (_x),(float) (_graph.Bottom /*int*/ ),(float) (_x),(float) (_graph.Bottom /*int*/ +_l1),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 break; }
}
;
 //BA.debugLineNum = 1677;BA.debugLine="x1 = x";
_x1 = _x;
 }
};
 }else {
 //BA.debugLineNum = 1680;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step37 = 1;
final int limit37 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit37 ;_i = _i + step37 ) {
 //BA.debugLineNum = 1681;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 1682;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 1683;BA.debugLine="If Graph.ChartType = \"LINE\" Then";
if ((_graph.ChartType /*String*/ ).equals("LINE")) { 
 //BA.debugLineNum = 1684;BA.debugLine="x = Graph.Left + i * Scale(sX).Scale";
_x = (int) (_graph.Left /*int*/ +_i*_scale[_sx].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 1686;BA.debugLine="x = Graph.Left + Graph.XOffset + (i + 0.5) * G";
_x = (int) (_graph.Left /*int*/ +_graph.XOffset /*int*/ +(_i+0.5)*_graph.XInterval /*int*/ );
 };
 //BA.debugLineNum = 1688;BA.debugLine="If PD.ShowTick = True Then";
if (_pd.ShowTick /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1690;BA.debugLine="xcvsGraph.DrawLine(x, Graph.Top, x, Graph.Bott";
_xcvsgraph.DrawLine((float) (_x),(float) (_graph.Top /*int*/ ),(float) (_x),(float) (_graph.Bottom /*int*/ ),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1691;BA.debugLine="Select Graph.XScaleTextOrientation";
switch (BA.switchObjectToInt(_graph.XScaleTextOrientation /*String*/ ,"HORIZONTAL","VERTICAL","45 DEGREES")) {
case 0: {
 //BA.debugLineNum = 1693;BA.debugLine="If (x - x1) > 1.2 * MeasureTextWidth(PD.X, T";
if ((_x-_x1)>1.2*_measuretextwidth(_pd.X /*String*/ ,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )) { 
 //BA.debugLineNum = 1694;BA.debugLine="xcvsGraph.DrawText(PD.X, x, Graph.Bottom +";
_xcvsgraph.DrawText(ba,_pd.X /*String*/ ,(float) (_x),(float) (_graph.Bottom /*int*/ +_h1*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 1695;BA.debugLine="x1 = x";
_x1 = _x;
 //BA.debugLineNum = 1696;BA.debugLine="xcvsGraph.DrawLine(x, Graph.Bottom, x, Grap";
_xcvsgraph.DrawLine((float) (_x),(float) (_graph.Bottom /*int*/ ),(float) (_x),(float) (_graph.Bottom /*int*/ +_l1),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 break; }
case 1: {
 //BA.debugLineNum = 1699;BA.debugLine="If (x - x1) > 1.2 * Texts.ScaleTextHeight Th";
if ((_x-_x1)>1.2*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 1700;BA.debugLine="xcvsGraph.DrawTextRotated(PD.X, x + h2 * Te";
_xcvsgraph.DrawTextRotated(ba,_pd.X /*String*/ ,(float) (_x+_h2*_texts.ScaleTextHeight /*int*/ ),(float) (_graph.Bottom /*int*/ +_h4*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"),(float) (-90));
 //BA.debugLineNum = 1701;BA.debugLine="x1 = x";
_x1 = _x;
 //BA.debugLineNum = 1702;BA.debugLine="xcvsGraph.DrawLine(x, Graph.Bottom, x, Grap";
_xcvsgraph.DrawLine((float) (_x),(float) (_graph.Bottom /*int*/ ),(float) (_x),(float) (_graph.Bottom /*int*/ +_l1),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 break; }
case 2: {
 //BA.debugLineNum = 1705;BA.debugLine="If (x - x1) > 1.2 * Texts.ScaleTextHeight Th";
if ((_x-_x1)>1.2*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 1706;BA.debugLine="xcvsGraph.DrawTextRotated(PD.X, x + h3 * Te";
_xcvsgraph.DrawTextRotated(ba,_pd.X /*String*/ ,(float) (_x+_h3*_texts.ScaleTextHeight /*int*/ ),(float) (_graph.Bottom /*int*/ +_h5*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"),(float) (-45));
 //BA.debugLineNum = 1707;BA.debugLine="x1 = x";
_x1 = _x;
 //BA.debugLineNum = 1708;BA.debugLine="xcvsGraph.DrawLine(x, Graph.Bottom, x, Grap";
_xcvsgraph.DrawLine((float) (_x),(float) (_graph.Bottom /*int*/ ),(float) (_x),(float) (_graph.Bottom /*int*/ +_l1),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 break; }
}
;
 };
 }
};
 };
 //BA.debugLineNum = 1714;BA.debugLine="End Sub";
return "";
}
public String  _drawxscalelog() throws Exception{
int _xi = 0;
int _x0 = 0;
int _xn = 0;
int _manti = 0;
int _logi = 0;
int _l1 = 0;
String _txt = "";
double _val0 = 0;
double _h1 = 0;
double _h2 = 0;
double _h3 = 0;
double _h4 = 0;
double _h5 = 0;
 //BA.debugLineNum = 1717;BA.debugLine="Private Sub DrawXScaleLog";
 //BA.debugLineNum = 1718;BA.debugLine="Private xi, x0, xn, Manti, Logi, l1 As Int";
_xi = 0;
_x0 = 0;
_xn = 0;
_manti = 0;
_logi = 0;
_l1 = 0;
 //BA.debugLineNum = 1719;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 1720;BA.debugLine="Private Val0 As Double";
_val0 = 0;
 //BA.debugLineNum = 1721;BA.debugLine="Private h1, h2, h3, h4, h5 As Double";
_h1 = 0;
_h2 = 0;
_h3 = 0;
_h4 = 0;
_h5 = 0;
 //BA.debugLineNum = 1730;BA.debugLine="h1 = 1.1";
_h1 = 1.1;
 //BA.debugLineNum = 1731;BA.debugLine="h2 = 0.25";
_h2 = 0.25;
 //BA.debugLineNum = 1732;BA.debugLine="h3 = 0.3";
_h3 = 0.3;
 //BA.debugLineNum = 1733;BA.debugLine="h4 = 0.6";
_h4 = 0.6;
 //BA.debugLineNum = 1734;BA.debugLine="h5 = 0.8";
_h5 = 0.8;
 //BA.debugLineNum = 1736;BA.debugLine="l1 = 4dip";
_l1 = __c.DipToCurrent((int) (4));
 //BA.debugLineNum = 1745;BA.debugLine="x0 = Graph.Left - (ScaleLog(sX).MantMin + ScaleLo";
_x0 = (int) (_graph.Left /*int*/ -(_scalelog[_sx].MantMin /*int*/ +_scalelog[_sx].LogMin /*double*/ )*_scalelog[_sx].Scale /*double*/ );
 //BA.debugLineNum = 1746;BA.debugLine="Val0 = -1";
_val0 = -1;
 //BA.debugLineNum = 1747;BA.debugLine="Manti = ScaleLog(sX).MantMin";
_manti = _scalelog[_sx].MantMin /*int*/ ;
 //BA.debugLineNum = 1748;BA.debugLine="Logi = ScaleLog(sX).LogMinIndex";
_logi = _scalelog[_sx].LogMinIndex /*int*/ ;
 //BA.debugLineNum = 1749;BA.debugLine="Do While Val0 < Scale(sX).MaxVal";
while (_val0<_scale[_sx].MaxVal /*double*/ ) {
 //BA.debugLineNum = 1750;BA.debugLine="xi = x0 + (ScaleLog(sX).Logs(Logi) + Manti) * Sc";
_xi = (int) (_x0+(_scalelog[_sx].Logs /*double[]*/ [_logi]+_manti)*_scalelog[_sx].Scale /*double*/ );
 //BA.debugLineNum = 1751;BA.debugLine="xcvsGraph.DrawLine(xi, Graph.Bottom - 4dip, xi,";
_xcvsgraph.DrawLine((float) (_xi),(float) (_graph.Bottom /*int*/ -__c.DipToCurrent((int) (4))),(float) (_xi),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1752;BA.debugLine="If ScaleLog(sX).Logs(Logi) <> 0 Then";
if (_scalelog[_sx].Logs /*double[]*/ [_logi]!=0) { 
 //BA.debugLineNum = 1753;BA.debugLine="xcvsGraph.DrawLine(xi, Graph.Top, xi, Graph.Bot";
_xcvsgraph.DrawLine((float) (_xi),(float) (_graph.Top /*int*/ ),(float) (_xi),(float) (_graph.Bottom /*int*/ ),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 1755;BA.debugLine="xcvsGraph.DrawLine(xi, Graph.Top, xi, Graph.Bot";
_xcvsgraph.DrawLine((float) (_xi),(float) (_graph.Top /*int*/ ),(float) (_xi),(float) (_graph.Bottom /*int*/ ),_graph.GridColorDark /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 1757;BA.debugLine="Val0 = Power(10, ScaleLog(sX).Logs(Logi) + Manti";
_val0 = __c.Power(10,_scalelog[_sx].Logs /*double[]*/ [_logi]+_manti);
 //BA.debugLineNum = 1758;BA.debugLine="txt = NumberFormat3(Val0, 6)";
_txt = _numberformat3(_val0,(int) (6));
 //BA.debugLineNum = 1760;BA.debugLine="Select Graph.XScaleTextOrientation";
switch (BA.switchObjectToInt(_graph.XScaleTextOrientation /*String*/ ,"HORIZONTAL","VERTICAL","45 DEGREES")) {
case 0: {
 //BA.debugLineNum = 1762;BA.debugLine="If (xi - xn) > 1.2 * MeasureTextWidth(txt, Tex";
if ((_xi-_xn)>1.2*_measuretextwidth(_txt,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )) { 
 //BA.debugLineNum = 1763;BA.debugLine="xcvsGraph.DrawText(txt, xi, Graph.Bottom + h1";
_xcvsgraph.DrawText(ba,_txt,(float) (_xi),(float) (_graph.Bottom /*int*/ +_h1*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 1764;BA.debugLine="xn = xi";
_xn = _xi;
 };
 break; }
case 1: {
 //BA.debugLineNum = 1767;BA.debugLine="If (xi - xn) > 1.2 * Texts.ScaleTextHeight The";
if ((_xi-_xn)>1.2*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 1768;BA.debugLine="xcvsGraph.DrawTextRotated(txt, xi + h2 * Text";
_xcvsgraph.DrawTextRotated(ba,_txt,(float) (_xi+_h2*_texts.ScaleTextHeight /*int*/ ),(float) (_graph.Bottom /*int*/ +_h4*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"),(float) (-90));
 //BA.debugLineNum = 1769;BA.debugLine="xn = xi";
_xn = _xi;
 };
 break; }
case 2: {
 //BA.debugLineNum = 1772;BA.debugLine="If (xi - xn) > 1.2 * Texts.ScaleTextHeight The";
if ((_xi-_xn)>1.2*_texts.ScaleTextHeight /*int*/ ) { 
 //BA.debugLineNum = 1773;BA.debugLine="xcvsGraph.DrawTextRotated(txt, xi + h3 * Text";
_xcvsgraph.DrawTextRotated(ba,_txt,(float) (_xi+_h3*_texts.ScaleTextHeight /*int*/ ),(float) (_graph.Bottom /*int*/ +_h5*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"),(float) (-45));
 //BA.debugLineNum = 1774;BA.debugLine="xn = xi";
_xn = _xi;
 };
 //BA.debugLineNum = 1776;BA.debugLine="xcvsGraph.DrawLine(xi, Graph.Bottom, xi, Graph";
_xcvsgraph.DrawLine((float) (_xi),(float) (_graph.Bottom /*int*/ ),(float) (_xi),(float) (_graph.Bottom /*int*/ +_l1),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 break; }
}
;
 //BA.debugLineNum = 1779;BA.debugLine="Logi = Logi + 1";
_logi = (int) (_logi+1);
 //BA.debugLineNum = 1780;BA.debugLine="If Logi = ScaleLog(sX).Logs.Length - 1 Then";
if (_logi==_scalelog[_sx].Logs /*double[]*/ .length-1) { 
 //BA.debugLineNum = 1781;BA.debugLine="Logi = 0";
_logi = (int) (0);
 //BA.debugLineNum = 1782;BA.debugLine="Manti = Manti + 1";
_manti = (int) (_manti+1);
 };
 }
;
 //BA.debugLineNum = 1785;BA.debugLine="End Sub";
return "";
}
public String  _drawyscale() throws Exception{
int _i = 0;
int _y = 0;
String _txt = "";
 //BA.debugLineNum = 1570;BA.debugLine="Private Sub DrawYScale";
 //BA.debugLineNum = 1571;BA.debugLine="Private i, y As Int";
_i = 0;
_y = 0;
 //BA.debugLineNum = 1572;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 1574;BA.debugLine="For i = 0 To Scale(sY).NbIntervals";
{
final int step3 = 1;
final int limit3 = _scale[_sy].NbIntervals /*int*/ ;
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 1575;BA.debugLine="y = Graph.Top + i * Graph.YInterval";
_y = (int) (_graph.Top /*int*/ +_i*_graph.YInterval /*int*/ );
 //BA.debugLineNum = 1576;BA.debugLine="xcvsGraph.DrawLine(Graph.Left - 4dip, y, Graph.L";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ -__c.DipToCurrent((int) (4))),(float) (_y),(float) (_graph.Left /*int*/ ),(float) (_y),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1577;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, y, Graph.Right, y";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_y),(float) (_graph.Right /*int*/ ),(float) (_y),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 1578;BA.debugLine="If MinMaxMeanValues(0) = 0 And MinMaxMeanValues(";
if (_minmaxmeanvalues[(int) (0)]==0 && _minmaxmeanvalues[(int) (1)]==0) { 
 //BA.debugLineNum = 1579;BA.debugLine="txt = \"\"";
_txt = "";
 }else {
 //BA.debugLineNum = 1581;BA.debugLine="txt = NumberFormat3(Scale(sY).MaxVal - i * Scal";
_txt = _numberformat3(_scale[_sy].MaxVal /*double*/ -_i*_scale[_sy].Interval /*double*/ ,(int) (6));
 };
 //BA.debugLineNum = 1585;BA.debugLine="xcvsGraph.DrawText(txt, Graph.Left - 0.5 * Texts";
_xcvsgraph.DrawText(ba,_txt,(float) (_graph.Left /*int*/ -0.5*_texts.ScaleTextHeight /*int*/ ),(float) (_y+0.35*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 }
};
 //BA.debugLineNum = 1592;BA.debugLine="End Sub";
return "";
}
public String  _drawyscalelog() throws Exception{
int _yi = 0;
int _y0 = 0;
int _manti = 0;
int _logi = 0;
String _txt = "";
double _val0 = 0;
 //BA.debugLineNum = 1595;BA.debugLine="Private Sub DrawYScaleLog";
 //BA.debugLineNum = 1596;BA.debugLine="Private yi, y0, Manti, Logi As Int";
_yi = 0;
_y0 = 0;
_manti = 0;
_logi = 0;
 //BA.debugLineNum = 1597;BA.debugLine="Private txt As String";
_txt = "";
 //BA.debugLineNum = 1598;BA.debugLine="Private Val0 As Double";
_val0 = 0;
 //BA.debugLineNum = 1600;BA.debugLine="ScaleLog(sY).Scale = Graph.Height / (ScaleLog(sY)";
_scalelog[_sy].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scalelog[_sy].MantMax /*int*/ +_scalelog[_sy].LogMax /*double*/ -_scalelog[_sy].MantMin /*int*/ -_scalelog[_sy].LogMin /*double*/ );
 //BA.debugLineNum = 1601;BA.debugLine="y0 = Graph.Bottom + (ScaleLog(sY).MantMin + Scale";
_y0 = (int) (_graph.Bottom /*int*/ +(_scalelog[_sy].MantMin /*int*/ +_scalelog[_sy].LogMin /*double*/ )*_scalelog[_sy].Scale /*double*/ );
 //BA.debugLineNum = 1602;BA.debugLine="Val0 = -1";
_val0 = -1;
 //BA.debugLineNum = 1603;BA.debugLine="Manti = ScaleLog(sY).MantMin";
_manti = _scalelog[_sy].MantMin /*int*/ ;
 //BA.debugLineNum = 1604;BA.debugLine="Logi = ScaleLog(sY).LogMinIndex";
_logi = _scalelog[_sy].LogMinIndex /*int*/ ;
 //BA.debugLineNum = 1605;BA.debugLine="Do While Val0 < Scale(sY).MaxVal";
while (_val0<_scale[_sy].MaxVal /*double*/ ) {
 //BA.debugLineNum = 1606;BA.debugLine="yi = y0 - (ScaleLog(sY).Logs(Logi) + Manti) * Sc";
_yi = (int) (_y0-(_scalelog[_sy].Logs /*double[]*/ [_logi]+_manti)*_scalelog[_sy].Scale /*double*/ );
 //BA.debugLineNum = 1607;BA.debugLine="xcvsGraph.DrawLine(Graph.Left - 4dip, yi, Graph.";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ -__c.DipToCurrent((int) (4))),(float) (_yi),(float) (_graph.Left /*int*/ ),(float) (_yi),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 1608;BA.debugLine="If ScaleLog(sY).Logs(Logi) <> 0 Then";
if (_scalelog[_sy].Logs /*double[]*/ [_logi]!=0) { 
 //BA.debugLineNum = 1609;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, yi, Graph.Right,";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_yi),(float) (_graph.Right /*int*/ ),(float) (_yi),_graph.GridColor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 }else {
 //BA.debugLineNum = 1611;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, yi, Graph.Right,";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_yi),(float) (_graph.Right /*int*/ ),(float) (_yi),_graph.GridColorDark /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
 };
 //BA.debugLineNum = 1613;BA.debugLine="Val0 = Power(10, ScaleLog(sY).Logs(Logi) + Manti";
_val0 = __c.Power(10,_scalelog[_sy].Logs /*double[]*/ [_logi]+_manti);
 //BA.debugLineNum = 1614;BA.debugLine="txt = NumberFormat3(Val0, 6)";
_txt = _numberformat3(_val0,(int) (6));
 //BA.debugLineNum = 1616;BA.debugLine="xcvsGraph.DrawText(txt, Graph.Left - 0.5 * Texts";
_xcvsgraph.DrawText(ba,_txt,(float) (_graph.Left /*int*/ -0.5*_texts.ScaleTextHeight /*int*/ ),(float) (_yi+0.35*_texts.ScaleTextHeight /*int*/ ),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_texts.ScaleTextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 1623;BA.debugLine="Logi = Logi + 1";
_logi = (int) (_logi+1);
 //BA.debugLineNum = 1624;BA.debugLine="If Logi = ScaleLog(sY).Logs.Length - 1 Then";
if (_logi==_scalelog[_sy].Logs /*double[]*/ .length-1) { 
 //BA.debugLineNum = 1625;BA.debugLine="Logi = 0";
_logi = (int) (0);
 //BA.debugLineNum = 1626;BA.debugLine="Manti = Manti + 1";
_manti = (int) (_manti+1);
 };
 }
;
 //BA.debugLineNum = 1629;BA.debugLine="End Sub";
return "";
}
public String  _drawyxlines() throws Exception{
int _i = 0;
int _l = 0;
b4a.example.cov.xchart._itemdata _id = null;
double[] _yxval = null;
int _x0 = 0;
int _y0 = 0;
int _x1 = 0;
int _y1 = 0;
int _xi = 0;
int _yi = 0;
int _myaxis0 = 0;
int _mxaxis0 = 0;
 //BA.debugLineNum = 2008;BA.debugLine="Private Sub DrawYXLines";
 //BA.debugLineNum = 2009;BA.debugLine="Private i, l As Int";
_i = 0;
_l = 0;
 //BA.debugLineNum = 2010;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 2011;BA.debugLine="Private yxVal(2) As Double";
_yxval = new double[(int) (2)];
;
 //BA.debugLineNum = 2012;BA.debugLine="Private x0, y0, x1, y1, xi, yi As Int";
_x0 = 0;
_y0 = 0;
_x1 = 0;
_y1 = 0;
_xi = 0;
_yi = 0;
 //BA.debugLineNum = 2014;BA.debugLine="If Items.Size = 0 Then Return";
if (_items.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 2016;BA.debugLine="xcvsGraph.ClipPath(pthGrid)";
_xcvsgraph.ClipPath(_pthgrid);
 //BA.debugLineNum = 2017;BA.debugLine="xi = Graph.Left - (ScaleLog(sX).MantMin + ScaleLo";
_xi = (int) (_graph.Left /*int*/ -(_scalelog[_sx].MantMin /*int*/ +_scalelog[_sx].LogMin /*double*/ )*_scalelog[_sx].Scale /*double*/ );
 //BA.debugLineNum = 2018;BA.debugLine="yi = Graph.Bottom + (ScaleLog(sY).MantMin + Scale";
_yi = (int) (_graph.Bottom /*int*/ +(_scalelog[_sy].MantMin /*int*/ +_scalelog[_sy].LogMin /*double*/ )*_scalelog[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2019;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step9 = 1;
final int limit9 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit9 ;_l = _l + step9 ) {
 //BA.debugLineNum = 2020;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.cov.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 2021;BA.debugLine="yxVal = ID.YXArray.Get(0)";
_yxval = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
 //BA.debugLineNum = 2022;BA.debugLine="If Scale(sX).Logarithmic = False Then";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2023;BA.debugLine="x0 = Graph.Left + (yxVal(0) - Scale(sX).MinVal)";
_x0 = (int) (_graph.Left /*int*/ +(_yxval[(int) (0)]-_scale[_sx].MinVal /*double*/ )*_scale[_sx].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 2025;BA.debugLine="x0 = xi + Logarithm(yxVal(0), 10) * ScaleLog(sX";
_x0 = (int) (_xi+__c.Logarithm(_yxval[(int) (0)],10)*_scalelog[_sx].Scale /*double*/ );
 };
 //BA.debugLineNum = 2027;BA.debugLine="If Scale(sY).Logarithmic = False Then";
if (_scale[_sy].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2028;BA.debugLine="y0 = Graph.Bottom - (yxVal(1) - Scale(sY).MinVa";
_y0 = (int) (_graph.Bottom /*int*/ -(_yxval[(int) (1)]-_scale[_sy].MinVal /*double*/ )*_scale[_sy].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 2030;BA.debugLine="y0 = yi - Logarithm(yxVal(1), 10) * ScaleLog(sY";
_y0 = (int) (_yi-__c.Logarithm(_yxval[(int) (1)],10)*_scalelog[_sy].Scale /*double*/ );
 };
 //BA.debugLineNum = 2033;BA.debugLine="For i = 0 To ID.YXArray.Size - 1";
{
final int step22 = 1;
final int limit22 = (int) (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
 //BA.debugLineNum = 2034;BA.debugLine="yxVal = ID.YXArray.Get(i)";
_yxval = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 //BA.debugLineNum = 2035;BA.debugLine="If Scale(sX).Logarithmic = False Then";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2036;BA.debugLine="x1 = Graph.Left + (yxVal(0) - Scale(sX).MinVal";
_x1 = (int) (_graph.Left /*int*/ +(_yxval[(int) (0)]-_scale[_sx].MinVal /*double*/ )*_scale[_sx].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 2038;BA.debugLine="x1 = xi + Logarithm(yxVal(0), 10) * ScaleLog(s";
_x1 = (int) (_xi+__c.Logarithm(_yxval[(int) (0)],10)*_scalelog[_sx].Scale /*double*/ );
 };
 //BA.debugLineNum = 2040;BA.debugLine="If Scale(sY).Logarithmic = False Then";
if (_scale[_sy].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 2041;BA.debugLine="y1 = Graph.Bottom - (yxVal(1) - Scale(sY).MinV";
_y1 = (int) (_graph.Bottom /*int*/ -(_yxval[(int) (1)]-_scale[_sy].MinVal /*double*/ )*_scale[_sy].Scale /*double*/ );
 }else {
 //BA.debugLineNum = 2043;BA.debugLine="y1 = yi - Logarithm(yxVal(1), 10) * ScaleLog(s";
_y1 = (int) (_yi-__c.Logarithm(_yxval[(int) (1)],10)*_scalelog[_sy].Scale /*double*/ );
 };
 //BA.debugLineNum = 2045;BA.debugLine="If ID.DrawLine = True Then";
if (_id.DrawLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 2046;BA.debugLine="xcvsGraph.DrawLine(x0, y0, x1, y1 , ID.Color,";
_xcvsgraph.DrawLine((float) (_x0),(float) (_y0),(float) (_x1),(float) (_y1),_id.Color /*int*/ ,(float) (_id.StrokeWidth /*int*/ ));
 };
 //BA.debugLineNum = 2048;BA.debugLine="If ID.PointType <> \"NONE\" Then";
if ((_id.PointType /*String*/ ).equals("NONE") == false) { 
 //BA.debugLineNum = 2049;BA.debugLine="If i = 0 Then";
if (_i==0) { 
 //BA.debugLineNum = 2050;BA.debugLine="DrawPoint(x0, y0, ID.PointColor, ID.PointType";
_drawpoint(_x0,_y0,_id.PointColor /*int*/ ,_id.PointType /*String*/ ,_id.Filled /*boolean*/ ,_id.StrokeWidth /*int*/ );
 }else {
 //BA.debugLineNum = 2052;BA.debugLine="DrawPoint(x1, y1, ID.PointColor, ID.PointType";
_drawpoint(_x1,_y1,_id.PointColor /*int*/ ,_id.PointType /*String*/ ,_id.Filled /*boolean*/ ,_id.StrokeWidth /*int*/ );
 };
 };
 //BA.debugLineNum = 2055;BA.debugLine="x0 = x1";
_x0 = _x1;
 //BA.debugLineNum = 2056;BA.debugLine="y0 = y1";
_y0 = _y1;
 }
};
 }
};
 //BA.debugLineNum = 2060;BA.debugLine="xcvsGraph.RemoveClip";
_xcvsgraph.RemoveClip();
 //BA.debugLineNum = 2062;BA.debugLine="xcvsGraph.DrawRect(Graph.Rect, Graph.GridFrameCol";
_xcvsgraph.DrawRect(_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 2063;BA.debugLine="If Scale(sY).MinVal< 0 And Scale(sY).MaxVal > 0 T";
if (_scale[_sy].MinVal /*double*/ <0 && _scale[_sy].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 2064;BA.debugLine="Private mYAxis0 = Graph.Bottom + Scale(sY).MinVa";
_myaxis0 = (int) (_graph.Bottom /*int*/ +_scale[_sy].MinVal /*double*/ *_scale[_sy].Scale /*double*/ );
 //BA.debugLineNum = 2065;BA.debugLine="xcvsGraph.DrawLine(Graph.Left, mYAxis0, Graph.Ri";
_xcvsgraph.DrawLine((float) (_graph.Left /*int*/ ),(float) (_myaxis0),(float) (_graph.Right /*int*/ ),(float) (_myaxis0),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 2068;BA.debugLine="xcvsGraph.DrawRect(Graph.Rect, Graph.GridFrameCol";
_xcvsgraph.DrawRect(_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ ,_graph.GridFrameColor /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 2069;BA.debugLine="If Scale(sX).MinVal< 0 And Scale(sX).MaxVal > 0 T";
if (_scale[_sx].MinVal /*double*/ <0 && _scale[_sx].MaxVal /*double*/ >0) { 
 //BA.debugLineNum = 2070;BA.debugLine="Private mXAxis0 = Graph.Left - Scale(sX).MinVal";
_mxaxis0 = (int) (_graph.Left /*int*/ -_scale[_sx].MinVal /*double*/ *_scale[_sx].Scale /*double*/ );
 //BA.debugLineNum = 2071;BA.debugLine="xcvsGraph.DrawLine(mXAxis0, Graph.Top, mXAxis0,";
_xcvsgraph.DrawLine((float) (_mxaxis0),(float) (_graph.Top /*int*/ ),(float) (_mxaxis0),(float) (_graph.Bottom /*int*/ ),_graph.GridFrameColor /*int*/ ,(float) (__c.DipToCurrent((int) (2))));
 };
 //BA.debugLineNum = 2074;BA.debugLine="If Legend.IncludeLegend <> \"NONE\" And (Points.Siz";
if ((_legend.IncludeLegend /*String*/ ).equals("NONE") == false && (_points.getSize()>0 || (_graph.ChartType /*String*/ ).equals("YX_CHART"))) { 
 //BA.debugLineNum = 2075;BA.debugLine="DrawLegend";
_drawlegend();
 };
 //BA.debugLineNum = 2078;BA.debugLine="xcvsGraph.Invalidate";
_xcvsgraph.Invalidate();
 //BA.debugLineNum = 2079;BA.debugLine="End Sub";
return "";
}
public boolean  _getautomaticscale() throws Exception{
 //BA.debugLineNum = 2883;BA.debugLine="Public Sub getAutomaticScale As Boolean";
 //BA.debugLineNum = 2884;BA.debugLine="Return Scale(sY).Automatic";
if (true) return _scale[_sy].Automatic /*boolean*/ ;
 //BA.debugLineNum = 2885;BA.debugLine="End Sub";
return false;
}
public boolean  _getautomatictextsizes() throws Exception{
 //BA.debugLineNum = 2965;BA.debugLine="Public Sub getAutomaticTextSizes As Boolean";
 //BA.debugLineNum = 2966;BA.debugLine="Return Texts.AutomaticTextSizes";
if (true) return _texts.AutomaticTextSizes /*boolean*/ ;
 //BA.debugLineNum = 2967;BA.debugLine="End Sub";
return false;
}
public float  _getaxistextsize() throws Exception{
 //BA.debugLineNum = 2987;BA.debugLine="Public Sub getAxisTextSize As Float";
 //BA.debugLineNum = 2988;BA.debugLine="Return Texts.AxisTextSize";
if (true) return _texts.AxisTextSize /*float*/ ;
 //BA.debugLineNum = 2989;BA.debugLine="End Sub";
return 0f;
}
public double[]  _getbarpointsminmaxvalues() throws Exception{
int _j = 0;
double[] _minmax = null;
int _i = 0;
double[] _yvals = null;
b4a.example.cov.xchart._pointdata _pd = null;
double _total = 0;
 //BA.debugLineNum = 1296;BA.debugLine="Private Sub GetBarPointsMinMaxValues As Double()";
 //BA.debugLineNum = 1297;BA.debugLine="Private j, j As Int";
_j = 0;
_j = 0;
 //BA.debugLineNum = 1298;BA.debugLine="Private MinMax(2) As Double";
_minmax = new double[(int) (2)];
;
 //BA.debugLineNum = 1300;BA.debugLine="If Graph.ChartType = \"BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("BAR")) { 
 //BA.debugLineNum = 1302;BA.debugLine="MinMax(1) = -1E10";
_minmax[(int) (1)] = -1e10;
 //BA.debugLineNum = 1303;BA.debugLine="MinMax(0) = 1E10";
_minmax[(int) (0)] = 1e10;
 //BA.debugLineNum = 1305;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 1306;BA.debugLine="Private YVals() As Double";
_yvals = new double[(int) (0)];
;
 //BA.debugLineNum = 1307;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 1308;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 1309;BA.debugLine="YVals = PD.YArray";
_yvals = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 1310;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step11 = 1;
final int limit11 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit11 ;_j = _j + step11 ) {
 //BA.debugLineNum = 1311;BA.debugLine="MinMax(1) = Max(MinMax(1), YVals(j))";
_minmax[(int) (1)] = __c.Max(_minmax[(int) (1)],_yvals[_j]);
 //BA.debugLineNum = 1312;BA.debugLine="MinMax(0) = Min(MinMax(0), YVals(j))";
_minmax[(int) (0)] = __c.Min(_minmax[(int) (0)],_yvals[_j]);
 }
};
 }
};
 //BA.debugLineNum = 1315;BA.debugLine="MinMaxMeanValues(0) = MinMax(0)";
_minmaxmeanvalues[(int) (0)] = _minmax[(int) (0)];
 //BA.debugLineNum = 1316;BA.debugLine="MinMaxMeanValues(1) = MinMax(1)";
_minmaxmeanvalues[(int) (1)] = _minmax[(int) (1)];
 //BA.debugLineNum = 1317;BA.debugLine="If MinMax(0) > 0 And MinMax(1) > 0 Then";
if (_minmax[(int) (0)]>0 && _minmax[(int) (1)]>0) { 
 //BA.debugLineNum = 1318;BA.debugLine="MinMax(0) = 0";
_minmax[(int) (0)] = 0;
 };
 //BA.debugLineNum = 1320;BA.debugLine="If MinMax(0) < 0 And MinMax(1) < 0 Then";
if (_minmax[(int) (0)]<0 && _minmax[(int) (1)]<0) { 
 //BA.debugLineNum = 1321;BA.debugLine="MinMax(1) = 0";
_minmax[(int) (1)] = 0;
 };
 }else {
 //BA.debugLineNum = 1325;BA.debugLine="MinMax(1) = 0";
_minmax[(int) (1)] = 0;
 //BA.debugLineNum = 1326;BA.debugLine="MinMax(0) = 0";
_minmax[(int) (0)] = 0;
 //BA.debugLineNum = 1328;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step27 = 1;
final int limit27 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
 //BA.debugLineNum = 1329;BA.debugLine="Private YVals(), Total As Double";
_yvals = new double[(int) (0)];
;
_total = 0;
 //BA.debugLineNum = 1330;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 1331;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 1332;BA.debugLine="YVals = PD.YArray";
_yvals = _pd.YArray /*double[]*/ ;
 //BA.debugLineNum = 1333;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step32 = 1;
final int limit32 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit32 ;_j = _j + step32 ) {
 //BA.debugLineNum = 1334;BA.debugLine="Total = Total + YVals(j)";
_total = _total+_yvals[_j];
 }
};
 //BA.debugLineNum = 1336;BA.debugLine="MinMax(1) = Max(MinMax(1), Total)";
_minmax[(int) (1)] = __c.Max(_minmax[(int) (1)],_total);
 }
};
 //BA.debugLineNum = 1338;BA.debugLine="MinMaxMeanValues(0) = MinMax(0)";
_minmaxmeanvalues[(int) (0)] = _minmax[(int) (0)];
 //BA.debugLineNum = 1339;BA.debugLine="MinMaxMeanValues(1) = MinMax(1)";
_minmaxmeanvalues[(int) (1)] = _minmax[(int) (1)];
 };
 //BA.debugLineNum = 1342;BA.debugLine="Return MinMax";
if (true) return _minmax;
 //BA.debugLineNum = 1343;BA.debugLine="End Sub";
return null;
}
public String  _getbarvalueorientation() throws Exception{
 //BA.debugLineNum = 3329;BA.debugLine="Public Sub getBarValueOrientation As String";
 //BA.debugLineNum = 3330;BA.debugLine="Return Graph.BarValueOrientation";
if (true) return _graph.BarValueOrientation /*String*/ ;
 //BA.debugLineNum = 3331;BA.debugLine="End Sub";
return "";
}
public String  _getcharttype() throws Exception{
 //BA.debugLineNum = 2904;BA.debugLine="Public Sub getChartType As String";
 //BA.debugLineNum = 2905;BA.debugLine="Return Graph.ChartType";
if (true) return _graph.ChartType /*String*/ ;
 //BA.debugLineNum = 2906;BA.debugLine="End Sub";
return "";
}
public int  _getcontrastcolor(int _color) throws Exception{
int _a = 0;
int _r = 0;
int _g = 0;
int _b = 0;
int _yiq = 0;
 //BA.debugLineNum = 2578;BA.debugLine="Private Sub GetContrastColor(Color As Int) As Int";
 //BA.debugLineNum = 2579;BA.debugLine="Private a, r, g, b, yiq As Int	'ignore";
_a = 0;
_r = 0;
_g = 0;
_b = 0;
_yiq = 0;
 //BA.debugLineNum = 2581;BA.debugLine="a = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_a = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,(int) (0xff000000)),(int) (24));
 //BA.debugLineNum = 2582;BA.debugLine="r = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_r = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,(int) (0xff0000)),(int) (16));
 //BA.debugLineNum = 2583;BA.debugLine="g = Bit.UnsignedShiftRight(Bit.And(Color, 0xff00)";
_g = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,(int) (0xff00)),(int) (8));
 //BA.debugLineNum = 2584;BA.debugLine="b = Bit.And(Color, 0xff)";
_b = __c.Bit.And(_color,(int) (0xff));
 //BA.debugLineNum = 2586;BA.debugLine="yiq = r * 0.299 + g * 0.587 + b * 0.114";
_yiq = (int) (_r*0.299+_g*0.587+_b*0.114);
 //BA.debugLineNum = 2588;BA.debugLine="If yiq > 128 Then";
if (_yiq>128) { 
 //BA.debugLineNum = 2589;BA.debugLine="Return xui.Color_Black";
if (true) return _xui.Color_Black;
 }else {
 //BA.debugLineNum = 2591;BA.debugLine="Return xui.Color_White";
if (true) return _xui.Color_White;
 };
 //BA.debugLineNum = 2593;BA.debugLine="End Sub";
return 0;
}
public boolean  _getdisplayvalues() throws Exception{
 //BA.debugLineNum = 3035;BA.debugLine="Public Sub getDisplayValues As Boolean";
 //BA.debugLineNum = 3036;BA.debugLine="Return Values.Show";
if (true) return _values.Show /*boolean*/ ;
 //BA.debugLineNum = 3037;BA.debugLine="End Sub";
return false;
}
public boolean  _getdrawouterframe() throws Exception{
 //BA.debugLineNum = 3242;BA.debugLine="Public Sub getDrawOuterFrame As Boolean";
 //BA.debugLineNum = 3243;BA.debugLine="Return Graph.DrawOuterFrame";
if (true) return _graph.DrawOuterFrame /*boolean*/ ;
 //BA.debugLineNum = 3244;BA.debugLine="End Sub";
return false;
}
public boolean  _getgradientcolors() throws Exception{
 //BA.debugLineNum = 3095;BA.debugLine="Public Sub getGradientColors As Boolean";
 //BA.debugLineNum = 3096;BA.debugLine="Return Graph.GradientColors";
if (true) return _graph.GradientColors /*boolean*/ ;
 //BA.debugLineNum = 3097;BA.debugLine="End Sub";
return false;
}
public int  _getgradientcolorsalpha() throws Exception{
 //BA.debugLineNum = 3106;BA.debugLine="Public Sub getGradientColorsAlpha As Int";
 //BA.debugLineNum = 3107;BA.debugLine="Return Graph.GradientColorsAlpha";
if (true) return _graph.GradientColorsAlpha /*int*/ ;
 //BA.debugLineNum = 3108;BA.debugLine="End Sub";
return 0;
}
public int  _getheight() throws Exception{
 //BA.debugLineNum = 2945;BA.debugLine="Public Sub getHeight As Int";
 //BA.debugLineNum = 2946;BA.debugLine="Return xBase.Height";
if (true) return _xbase.getHeight();
 //BA.debugLineNum = 2947;BA.debugLine="End Sub";
return 0;
}
public boolean  _getincludebarmeanline() throws Exception{
 //BA.debugLineNum = 2873;BA.debugLine="Public Sub getIncludeBarMeanLine As Boolean";
 //BA.debugLineNum = 2874;BA.debugLine="Return Graph.IncludeBarMeanLine";
if (true) return _graph.IncludeBarMeanLine /*boolean*/ ;
 //BA.debugLineNum = 2875;BA.debugLine="End Sub";
return false;
}
public String  _getincludelegend() throws Exception{
 //BA.debugLineNum = 2853;BA.debugLine="Public Sub getIncludeLegend As String";
 //BA.debugLineNum = 2854;BA.debugLine="Return Legend.IncludeLegend";
if (true) return _legend.IncludeLegend /*String*/ ;
 //BA.debugLineNum = 2855;BA.debugLine="End Sub";
return "";
}
public boolean  _getincludemaxline() throws Exception{
 //BA.debugLineNum = 3263;BA.debugLine="Public Sub getIncludeMaxLine As Boolean";
 //BA.debugLineNum = 3264;BA.debugLine="Return Graph.IncludeMaxLine";
if (true) return _graph.IncludeMaxLine /*boolean*/ ;
 //BA.debugLineNum = 3265;BA.debugLine="End Sub";
return false;
}
public boolean  _getincludemeanline() throws Exception{
 //BA.debugLineNum = 3274;BA.debugLine="Public Sub getIncludeMeanLine As Boolean";
 //BA.debugLineNum = 3275;BA.debugLine="Return Graph.IncludeMeanLine";
if (true) return _graph.IncludeMeanLine /*boolean*/ ;
 //BA.debugLineNum = 3276;BA.debugLine="End Sub";
return false;
}
public boolean  _getincludeminline() throws Exception{
 //BA.debugLineNum = 3252;BA.debugLine="Public Sub getIncludeMinLine As Boolean";
 //BA.debugLineNum = 3253;BA.debugLine="Return Graph.IncludeMinLine";
if (true) return _graph.IncludeMinLine /*boolean*/ ;
 //BA.debugLineNum = 3254;BA.debugLine="End Sub";
return false;
}
public boolean  _getincludevalues() throws Exception{
 //BA.debugLineNum = 2863;BA.debugLine="Public Sub getIncludeValues As Boolean";
 //BA.debugLineNum = 2864;BA.debugLine="Return Graph.IncludeValues";
if (true) return _graph.IncludeValues /*boolean*/ ;
 //BA.debugLineNum = 2865;BA.debugLine="End Sub";
return false;
}
public int  _getleft() throws Exception{
 //BA.debugLineNum = 2917;BA.debugLine="Public Sub getLeft As Int";
 //BA.debugLineNum = 2918;BA.debugLine="Return xBase.Left";
if (true) return _xbase.getLeft();
 //BA.debugLineNum = 2919;BA.debugLine="End Sub";
return 0;
}
public String  _getlegendlinenumbers(int _limit) throws Exception{
int _x = 0;
int _box = 0;
boolean _alltoobig = false;
int _i = 0;
b4a.example.cov.xchart._itemdata _item = null;
String _txt = "";
 //BA.debugLineNum = 2684;BA.debugLine="Private Sub GetLegendLineNumbers(Limit As Int)";
 //BA.debugLineNum = 2685;BA.debugLine="Private x As Int";
_x = 0;
 //BA.debugLineNum = 2686;BA.debugLine="Private box As Int = 0.7 * Legend.TextHeight";
_box = (int) (0.7*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 2688;BA.debugLine="Legend.LineNumber = 1";
_legend.LineNumber /*int*/  = (int) (1);
 //BA.debugLineNum = 2689;BA.debugLine="Legend.LineNumbers.Clear";
_legend.LineNumbers /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 //BA.debugLineNum = 2690;BA.debugLine="Legend.LineChange.Clear";
_legend.LineChange /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 //BA.debugLineNum = 2692;BA.debugLine="Private AllTooBig = False As Boolean";
_alltoobig = __c.False;
 //BA.debugLineNum = 2694;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 2695;BA.debugLine="Private Item As ItemData";
_item = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 2696;BA.debugLine="Item = Items.Get(i)";
_item = (b4a.example.cov.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 2697;BA.debugLine="Private txt As String = Item.Name";
_txt = _item.Name /*String*/ ;
 //BA.debugLineNum = 2698;BA.debugLine="If Graph.ChartType = \"PIE\" And Legend.IncludeLeg";
if ((_graph.ChartType /*String*/ ).equals("PIE") && (_legend.IncludeLegend /*String*/ ).equals("BOTTOM") && _graph.IncludeValues /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 2699;BA.debugLine="txt = txt & \" : \" & Item.Value";
_txt = _txt+" : "+BA.NumberToString(_item.Value /*float*/ );
 };
 //BA.debugLineNum = 2701;BA.debugLine="If 2.5 * box + MeasureTextWidth(txt, Legend.Text";
if (2.5*_box+_measuretextwidth(_txt,_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )>_limit) { 
 //BA.debugLineNum = 2702;BA.debugLine="AllTooBig = True";
_alltoobig = __c.True;
 };
 }
};
 //BA.debugLineNum = 2706;BA.debugLine="If AllTooBig = True Then";
if (_alltoobig==__c.True) { 
 //BA.debugLineNum = 2707;BA.debugLine="Legend.LineNumber = Items.Size";
_legend.LineNumber /*int*/  = _items.getSize();
 //BA.debugLineNum = 2708;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step20 = 1;
final int limit20 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 2709;BA.debugLine="Legend.LineChange.Add(True)";
_legend.LineChange /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.True));
 //BA.debugLineNum = 2710;BA.debugLine="Legend.LineNumbers.Add(i)";
_legend.LineNumbers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_i));
 }
};
 }else {
 //BA.debugLineNum = 2713;BA.debugLine="x = 0";
_x = (int) (0);
 //BA.debugLineNum = 2714;BA.debugLine="For i = 0 To Items.Size - 1";
{
final int step26 = 1;
final int limit26 = (int) (_items.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit26 ;_i = _i + step26 ) {
 //BA.debugLineNum = 2715;BA.debugLine="Private Item As ItemData";
_item = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 2716;BA.debugLine="Item = Items.Get(i)";
_item = (b4a.example.cov.xchart._itemdata)(_items.Get(_i));
 //BA.debugLineNum = 2717;BA.debugLine="Private txt As String = Item.Name";
_txt = _item.Name /*String*/ ;
 //BA.debugLineNum = 2718;BA.debugLine="If Graph.ChartType = \"PIE\" And Legend.IncludeLe";
if ((_graph.ChartType /*String*/ ).equals("PIE") && (_legend.IncludeLegend /*String*/ ).equals("BOTTOM") && _graph.IncludeValues /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 2719;BA.debugLine="txt = txt & \" : \" & Item.Value";
_txt = _txt+" : "+BA.NumberToString(_item.Value /*float*/ );
 };
 //BA.debugLineNum = 2721;BA.debugLine="x = x + 2.5 * box + MeasureTextWidth(txt, Legen";
_x = (int) (_x+2.5*_box+_measuretextwidth(_txt,_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ));
 //BA.debugLineNum = 2722;BA.debugLine="If x > Limit Then";
if (_x>_limit) { 
 //BA.debugLineNum = 2723;BA.debugLine="x = 2.5 * box + MeasureTextWidth(txt, Legend.T";
_x = (int) (2.5*_box+_measuretextwidth(_txt,_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ));
 //BA.debugLineNum = 2724;BA.debugLine="Legend.LineNumber = Legend.LineNumber + 1";
_legend.LineNumber /*int*/  = (int) (_legend.LineNumber /*int*/ +1);
 //BA.debugLineNum = 2725;BA.debugLine="Legend.LineChange.Add(True)";
_legend.LineChange /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.True));
 }else {
 //BA.debugLineNum = 2727;BA.debugLine="Legend.LineChange.Add(False)";
_legend.LineChange /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.False));
 };
 //BA.debugLineNum = 2729;BA.debugLine="Legend.LineNumbers.Add(Legend.LineNumber - 1)";
_legend.LineNumbers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_legend.LineNumber /*int*/ -1));
 }
};
 };
 //BA.debugLineNum = 2732;BA.debugLine="End Sub";
return "";
}
public float  _getlegendtextsize() throws Exception{
 //BA.debugLineNum = 3011;BA.debugLine="Public Sub getLegendTextSize As Float";
 //BA.debugLineNum = 3012;BA.debugLine="Return Legend.TextSize";
if (true) return _legend.TextSize /*float*/ ;
 //BA.debugLineNum = 3013;BA.debugLine="End Sub";
return 0f;
}
public double[]  _getlinepointsminmaxmeanvalues(int _axis) throws Exception{
int _i = 0;
int _j = 0;
double[] _mmmvalues = null;
double[] _yvals = null;
b4a.example.cov.xchart._pointdata _pd = null;
b4a.example.cov.xchart._itemdata _id = null;
int _l = 0;
double[] _yxval = null;
 //BA.debugLineNum = 1346;BA.debugLine="Private Sub GetLinePointsMinMaxMeanValues(Axis As";
 //BA.debugLineNum = 1347;BA.debugLine="Private i, j As Int";
_i = 0;
_j = 0;
 //BA.debugLineNum = 1348;BA.debugLine="Private MMMValues(3) As Double";
_mmmvalues = new double[(int) (3)];
;
 //BA.debugLineNum = 1349;BA.debugLine="MMMValues(1) = -1E10";
_mmmvalues[(int) (1)] = -1e10;
 //BA.debugLineNum = 1350;BA.debugLine="MMMValues(0) = 1E10";
_mmmvalues[(int) (0)] = 1e10;
 //BA.debugLineNum = 1351;BA.debugLine="MMMValues(2) = 0";
_mmmvalues[(int) (2)] = 0;
 //BA.debugLineNum = 1353;BA.debugLine="If Graph.ChartType = \"LINE\" Then";
if ((_graph.ChartType /*String*/ ).equals("LINE")) { 
 //BA.debugLineNum = 1354;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 1355;BA.debugLine="Private YVals() As Double";
_yvals = new double[(int) (0)];
;
 //BA.debugLineNum = 1356;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 1357;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 1358;BA.debugLine="If Axis = 0 Then";
if (_axis==0) { 
 //BA.debugLineNum = 1359;BA.debugLine="YVals = PD.YArray";
_yvals = _pd.YArray /*double[]*/ ;
 }else {
 //BA.debugLineNum = 1361;BA.debugLine="YVals = PD.XArray";
_yvals = _pd.XArray /*double[]*/ ;
 };
 //BA.debugLineNum = 1363;BA.debugLine="For j = 0 To PD.YArray.Length - 1";
{
final int step16 = 1;
final int limit16 = (int) (_pd.YArray /*double[]*/ .length-1);
_j = (int) (0) ;
for (;_j <= limit16 ;_j = _j + step16 ) {
 //BA.debugLineNum = 1364;BA.debugLine="MMMValues(1) = Max(MMMValues(1), YVals(j))";
_mmmvalues[(int) (1)] = __c.Max(_mmmvalues[(int) (1)],_yvals[_j]);
 //BA.debugLineNum = 1365;BA.debugLine="MMMValues(0) = Min(MMMValues(0), YVals(j))";
_mmmvalues[(int) (0)] = __c.Min(_mmmvalues[(int) (0)],_yvals[_j]);
 //BA.debugLineNum = 1366;BA.debugLine="MMMValues(2) = MMMValues(2) + YVals(j)";
_mmmvalues[(int) (2)] = _mmmvalues[(int) (2)]+_yvals[_j];
 }
};
 }
};
 //BA.debugLineNum = 1369;BA.debugLine="MMMValues(2) = MMMValues(2) / Points.Size / PD.Y";
_mmmvalues[(int) (2)] = _mmmvalues[(int) (2)]/(double)_points.getSize()/(double)_pd.YArray /*double[]*/ .length;
 }else {
 //BA.debugLineNum = 1371;BA.debugLine="Private ID As ItemData";
_id = new b4a.example.cov.xchart._itemdata();
 //BA.debugLineNum = 1373;BA.debugLine="For l = 0 To Items.Size - 1";
{
final int step25 = 1;
final int limit25 = (int) (_items.getSize()-1);
_l = (int) (0) ;
for (;_l <= limit25 ;_l = _l + step25 ) {
 //BA.debugLineNum = 1374;BA.debugLine="ID = Items.Get(l)";
_id = (b4a.example.cov.xchart._itemdata)(_items.Get(_l));
 //BA.debugLineNum = 1375;BA.debugLine="For i = 0 To ID.YXArray.Size - 1";
{
final int step27 = 1;
final int limit27 = (int) (_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
 //BA.debugLineNum = 1376;BA.debugLine="Private YXVal(2) As Double";
_yxval = new double[(int) (2)];
;
 //BA.debugLineNum = 1377;BA.debugLine="YXVal = ID.YXArray.Get(i)";
_yxval = (double[])(_id.YXArray /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 //BA.debugLineNum = 1378;BA.debugLine="If Axis = 0 Then  'Y axis";
if (_axis==0) { 
 //BA.debugLineNum = 1379;BA.debugLine="MMMValues(1) = Max(MMMValues(1), YXVal(1))";
_mmmvalues[(int) (1)] = __c.Max(_mmmvalues[(int) (1)],_yxval[(int) (1)]);
 //BA.debugLineNum = 1380;BA.debugLine="MMMValues(0) = Min(MMMValues(0), YXVal(1))";
_mmmvalues[(int) (0)] = __c.Min(_mmmvalues[(int) (0)],_yxval[(int) (1)]);
 }else {
 //BA.debugLineNum = 1382;BA.debugLine="MMMValues(1) = Max(MMMValues(1), YXVal(0))";
_mmmvalues[(int) (1)] = __c.Max(_mmmvalues[(int) (1)],_yxval[(int) (0)]);
 //BA.debugLineNum = 1383;BA.debugLine="MMMValues(0) = Min(MMMValues(0), YXVal(0))";
_mmmvalues[(int) (0)] = __c.Min(_mmmvalues[(int) (0)],_yxval[(int) (0)]);
 };
 }
};
 }
};
 //BA.debugLineNum = 1389;BA.debugLine="MMMValues(2) = 0";
_mmmvalues[(int) (2)] = 0;
 };
 //BA.debugLineNum = 1392;BA.debugLine="MinMaxMeanValues(0) = MMMValues(0)";
_minmaxmeanvalues[(int) (0)] = _mmmvalues[(int) (0)];
 //BA.debugLineNum = 1393;BA.debugLine="MinMaxMeanValues(1) = MMMValues(1)";
_minmaxmeanvalues[(int) (1)] = _mmmvalues[(int) (1)];
 //BA.debugLineNum = 1394;BA.debugLine="MinMaxMeanValues(2) = MMMValues(2)";
_minmaxmeanvalues[(int) (2)] = _mmmvalues[(int) (2)];
 //BA.debugLineNum = 1396;BA.debugLine="Return MMMValues";
if (true) return _mmmvalues;
 //BA.debugLineNum = 1397;BA.debugLine="End Sub";
return null;
}
public int  _getnbpoints() throws Exception{
 //BA.debugLineNum = 3219;BA.debugLine="Public Sub getNbPoints As Int";
 //BA.debugLineNum = 3220;BA.debugLine="Return Points.Size";
if (true) return _points.getSize();
 //BA.debugLineNum = 3221;BA.debugLine="End Sub";
return 0;
}
public int  _getnbxintervals() throws Exception{
 //BA.debugLineNum = 3199;BA.debugLine="Public Sub getNbXIntervals As Int";
 //BA.debugLineNum = 3200;BA.debugLine="Return Scale(sX).NbIntervals";
if (true) return _scale[_sx].NbIntervals /*int*/ ;
 //BA.debugLineNum = 3201;BA.debugLine="End Sub";
return 0;
}
public int  _getnbyintervals() throws Exception{
 //BA.debugLineNum = 3188;BA.debugLine="Public Sub getNbYIntervals As Int";
 //BA.debugLineNum = 3189;BA.debugLine="Return Scale(sY).NbIntervals";
if (true) return _scale[_sy].NbIntervals /*int*/ ;
 //BA.debugLineNum = 3190;BA.debugLine="End Sub";
return 0;
}
public int  _getpiepercentagenbfractions() throws Exception{
 //BA.debugLineNum = 3343;BA.debugLine="Public Sub getPiePercentageNbFractions As Int";
 //BA.debugLineNum = 3344;BA.debugLine="Return mPiePercentageNbFractions";
if (true) return _mpiepercentagenbfractions;
 //BA.debugLineNum = 3345;BA.debugLine="End Sub";
return 0;
}
public double  _getrotation() throws Exception{
 //BA.debugLineNum = 3231;BA.debugLine="Public Sub getRotation As Double";
 //BA.debugLineNum = 3232;BA.debugLine="Return Graph.Rotation";
if (true) return _graph.Rotation /*double*/ ;
 //BA.debugLineNum = 3233;BA.debugLine="End Sub";
return 0;
}
public double  _getscalemant(double _scalemant0,int _axis) throws Exception{
double _scalemant1 = 0;
int _i = 0;
 //BA.debugLineNum = 1276;BA.debugLine="Private Sub GetScaleMant(ScaleMant0 As Double, Axi";
 //BA.debugLineNum = 1277;BA.debugLine="Private ScaleMant1 As Double";
_scalemant1 = 0;
 //BA.debugLineNum = 1279;BA.debugLine="ScaleLogVals(Axis)";
_scalelogvals(_axis);
 //BA.debugLineNum = 1281;BA.debugLine="If ScaleMant0 <= ScaleLog(Axis).Logs(0) Then";
if (_scalemant0<=_scalelog[_axis].Logs /*double[]*/ [(int) (0)]) { 
 //BA.debugLineNum = 1282;BA.debugLine="ScaleMant1 = 0";
_scalemant1 = 0;
 }else {
 //BA.debugLineNum = 1284;BA.debugLine="For i = 0 To ScaleLog(Axis).Logs.Length - 2";
{
final int step6 = 1;
final int limit6 = (int) (_scalelog[_axis].Logs /*double[]*/ .length-2);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 1285;BA.debugLine="If ScaleMant0 > ScaleLog(Axis).Logs(i) And Scal";
if (_scalemant0>_scalelog[_axis].Logs /*double[]*/ [_i] && _scalemant0<=_scalelog[_axis].Logs /*double[]*/ [(int) (_i+1)]) { 
 //BA.debugLineNum = 1286;BA.debugLine="ScaleMant1 = Logarithm(ScaleLog(Axis).Vals(i +";
_scalemant1 = __c.Logarithm(_scalelog[_axis].Vals /*double[]*/ [(int) (_i+1)],10);
 //BA.debugLineNum = 1287;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 //BA.debugLineNum = 1292;BA.debugLine="Return ScaleMant1";
if (true) return _scalemant1;
 //BA.debugLineNum = 1293;BA.debugLine="End Sub";
return 0;
}
public float  _getscaletextsize() throws Exception{
 //BA.debugLineNum = 2999;BA.debugLine="Public Sub getScaleTextSize As Float";
 //BA.debugLineNum = 3000;BA.debugLine="Return Texts.ScaleTextSize";
if (true) return _texts.ScaleTextSize /*float*/ ;
 //BA.debugLineNum = 3001;BA.debugLine="End Sub";
return 0f;
}
public String  _getscalevalues() throws Exception{
 //BA.debugLineNum = 3047;BA.debugLine="Public Sub getScaleValues As String";
 //BA.debugLineNum = 3048;BA.debugLine="Return Scale(sY).ScaleValues";
if (true) return _scale[_sy].ScaleValues /*String*/ ;
 //BA.debugLineNum = 3049;BA.debugLine="End Sub";
return "";
}
public String  _getscalexvalueslog() throws Exception{
 //BA.debugLineNum = 3081;BA.debugLine="Public Sub getScaleXValuesLog As String";
 //BA.debugLineNum = 3082;BA.debugLine="Return ScaleLog(sX).ScaleValues";
if (true) return _scalelog[_sx].ScaleValues /*String*/ ;
 //BA.debugLineNum = 3083;BA.debugLine="End Sub";
return "";
}
public String  _getscaleyvalueslog() throws Exception{
 //BA.debugLineNum = 3064;BA.debugLine="Public Sub getScaleYValuesLog As String";
 //BA.debugLineNum = 3065;BA.debugLine="Return ScaleLog(sY).ScaleValues";
if (true) return _scalelog[_sy].ScaleValues /*String*/ ;
 //BA.debugLineNum = 3066;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getsnapshot() throws Exception{
 //BA.debugLineNum = 3224;BA.debugLine="Public Sub getSnapshot As B4XBitmap";
 //BA.debugLineNum = 3225;BA.debugLine="Return xBase.Snapshot";
if (true) return _xbase.Snapshot();
 //BA.debugLineNum = 3226;BA.debugLine="End Sub";
return null;
}
public String  _getsubtitle() throws Exception{
 //BA.debugLineNum = 3300;BA.debugLine="Public Sub getSubtitle As String";
 //BA.debugLineNum = 3301;BA.debugLine="Return Graph.Subtitle";
if (true) return _graph.Subtitle /*String*/ ;
 //BA.debugLineNum = 3302;BA.debugLine="End Sub";
return "";
}
public float  _getsubtitletextsize() throws Exception{
 //BA.debugLineNum = 3310;BA.debugLine="Public Sub getSubtitleTextSize As Float";
 //BA.debugLineNum = 3311;BA.debugLine="Return Texts.AxisTextSize";
if (true) return _texts.AxisTextSize /*float*/ ;
 //BA.debugLineNum = 3312;BA.debugLine="End Sub";
return 0f;
}
public String  _gettitle() throws Exception{
 //BA.debugLineNum = 2771;BA.debugLine="Public Sub getTitle As String";
 //BA.debugLineNum = 2772;BA.debugLine="Return Graph.Title";
if (true) return _graph.Title /*String*/ ;
 //BA.debugLineNum = 2773;BA.debugLine="End Sub";
return "";
}
public float  _gettitletextsize() throws Exception{
 //BA.debugLineNum = 2975;BA.debugLine="Public Sub getTitleTextSize As Float";
 //BA.debugLineNum = 2976;BA.debugLine="Return Texts.TitleTextSize";
if (true) return _texts.TitleTextSize /*float*/ ;
 //BA.debugLineNum = 2977;BA.debugLine="End Sub";
return 0f;
}
public int  _gettop() throws Exception{
 //BA.debugLineNum = 2926;BA.debugLine="Public Sub getTop As Int";
 //BA.debugLineNum = 2927;BA.debugLine="Return xBase.Top";
if (true) return _xbase.getTop();
 //BA.debugLineNum = 2928;BA.debugLine="End Sub";
return 0;
}
public float  _getvaluestextsize() throws Exception{
 //BA.debugLineNum = 3023;BA.debugLine="Public Sub getValuesTextSize As Float";
 //BA.debugLineNum = 3024;BA.debugLine="Return Values.TextSize";
if (true) return _values.TextSize /*float*/ ;
 //BA.debugLineNum = 3025;BA.debugLine="End Sub";
return 0f;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 2955;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 2956;BA.debugLine="Return xBase.Visible";
if (true) return _xbase.getVisible();
 //BA.debugLineNum = 2957;BA.debugLine="End Sub";
return false;
}
public int  _getwidth() throws Exception{
 //BA.debugLineNum = 2935;BA.debugLine="Public Sub getWidth As Int";
 //BA.debugLineNum = 2936;BA.debugLine="Return xBase.Width";
if (true) return _xbase.getWidth();
 //BA.debugLineNum = 2937;BA.debugLine="End Sub";
return 0;
}
public String  _getxaxisname() throws Exception{
 //BA.debugLineNum = 2780;BA.debugLine="Public Sub getXAxisName As String";
 //BA.debugLineNum = 2781;BA.debugLine="Return Graph.XAxisName";
if (true) return _graph.XAxisName /*String*/ ;
 //BA.debugLineNum = 2782;BA.debugLine="End Sub";
return "";
}
public String  _getxintervals() throws Exception{
int _i = 0;
b4a.example.cov.xchart._pointdata _pd = null;
 //BA.debugLineNum = 2529;BA.debugLine="Private Sub GetXIntervals";
 //BA.debugLineNum = 2530;BA.debugLine="Private I As Int";
_i = 0;
 //BA.debugLineNum = 2532;BA.debugLine="Scale(sX).Scale = Graph.Width / (Points.Size - 1)";
_scale[_sx].Scale /*double*/  = _graph.Width /*int*/ /(double)(_points.getSize()-1);
 //BA.debugLineNum = 2534;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 2535;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 2536;BA.debugLine="PD = Points.Get(I)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 2537;BA.debugLine="If PD.ShowTick = True Then";
if (_pd.ShowTick /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 2538;BA.debugLine="Scale(sX).NbIntervals = Scale(sX).NbIntervals +";
_scale[_sx].NbIntervals /*int*/  = (int) (_scale[_sx].NbIntervals /*int*/ +1);
 };
 }
};
 //BA.debugLineNum = 2541;BA.debugLine="Scale(sX).Scale = Graph.Width / (Points.Size - 1)";
_scale[_sx].Scale /*double*/  = _graph.Width /*int*/ /(double)(_points.getSize()-1);
 //BA.debugLineNum = 2542;BA.debugLine="End Sub";
return "";
}
public double  _getxmaxvalue() throws Exception{
 //BA.debugLineNum = 3383;BA.debugLine="Public Sub getXMaxValue As Double";
 //BA.debugLineNum = 3384;BA.debugLine="Return Scale(sX).MaxManu";
if (true) return _scale[_sx].MaxManu /*double*/ ;
 //BA.debugLineNum = 3385;BA.debugLine="End Sub";
return 0;
}
public double  _getxminvalue() throws Exception{
 //BA.debugLineNum = 3373;BA.debugLine="Public Sub getXMinValue As Double";
 //BA.debugLineNum = 3374;BA.debugLine="Return Scale(sX).MinManu";
if (true) return _scale[_sx].MinManu /*double*/ ;
 //BA.debugLineNum = 3375;BA.debugLine="End Sub";
return 0;
}
public boolean  _getxscalelogarithmic() throws Exception{
 //BA.debugLineNum = 3364;BA.debugLine="Public Sub getXScaleLogarithmic As Boolean";
 //BA.debugLineNum = 3365;BA.debugLine="Return Scale(sX).Logarithmic";
if (true) return _scale[_sx].Logarithmic /*boolean*/ ;
 //BA.debugLineNum = 3366;BA.debugLine="End Sub";
return false;
}
public double  _getxscalemaxvalue() throws Exception{
 //BA.debugLineNum = 2827;BA.debugLine="Public Sub getXScaleMaxValue As Double";
 //BA.debugLineNum = 2828;BA.debugLine="Return Scale(sX).MaxVal";
if (true) return _scale[_sx].MaxVal /*double*/ ;
 //BA.debugLineNum = 2829;BA.debugLine="End Sub";
return 0;
}
public double  _getxscaleminvalue() throws Exception{
 //BA.debugLineNum = 2841;BA.debugLine="Public Sub getXScaleMinValue As Double";
 //BA.debugLineNum = 2842;BA.debugLine="Return Scale(sX).MinVal";
if (true) return _scale[_sx].MinVal /*double*/ ;
 //BA.debugLineNum = 2843;BA.debugLine="End Sub";
return 0;
}
public String  _getxscaletextorientation() throws Exception{
 //BA.debugLineNum = 2894;BA.debugLine="Public Sub getXScaleTextOrientation As String";
 //BA.debugLineNum = 2895;BA.debugLine="Return Graph.XScaleTextOrientation";
if (true) return _graph.XScaleTextOrientation /*String*/ ;
 //BA.debugLineNum = 2896;BA.debugLine="End Sub";
return "";
}
public int  _getxscalewidth() throws Exception{
int _width = 0;
int _i = 0;
b4a.example.cov.xchart._pointdata _pd = null;
 //BA.debugLineNum = 1400;BA.debugLine="Private Sub GetXScaleWidth As Int";
 //BA.debugLineNum = 1401;BA.debugLine="Private Width As Int";
_width = 0;
 //BA.debugLineNum = 1403;BA.debugLine="If Graph.ChartType = \"YX_CHART\" Then";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART")) { 
 //BA.debugLineNum = 1404;BA.debugLine="If Scale(sY).Automatic = True Then";
if (_scale[_sy].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1405;BA.debugLine="Width = MeasureTextWidth(NumberFormat3(Scale(sX";
_width = _measuretextwidth(_numberformat3(_scale[_sx].MaxVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 1406;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sx].MinVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 1407;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sx].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 }else {
 //BA.debugLineNum = 1409;BA.debugLine="Width = MeasureTextWidth(NumberFormat3(Scale(sX";
_width = _measuretextwidth(_numberformat3(_scale[_sx].MaxVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 1410;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sx].MinVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 1411;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sx].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 1412;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sx].MaxVal /*double*/ -_scale[_sy].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 1413;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sx].MinVal /*double*/ +_scale[_sy].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 };
 }else {
 //BA.debugLineNum = 1416;BA.debugLine="For i = 0 To Points.Size - 1";
{
final int step15 = 1;
final int limit15 = (int) (_points.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 1417;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 1418;BA.debugLine="PD = Points.Get(i)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get(_i));
 //BA.debugLineNum = 1419;BA.debugLine="If Graph.ChartType = \"LINE\" And PD.ShowTick = T";
if ((_graph.ChartType /*String*/ ).equals("LINE") && _pd.ShowTick /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1420;BA.debugLine="Width = Max(Width, MeasureTextWidth(PD.X, Text";
_width = (int) (__c.Max(_width,_measuretextwidth(_pd.X /*String*/ ,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 }else {
 //BA.debugLineNum = 1422;BA.debugLine="Width = Max(Width, MeasureTextWidth(PD.X, Text";
_width = (int) (__c.Max(_width,_measuretextwidth(_pd.X /*String*/ ,_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 };
 }
};
 };
 //BA.debugLineNum = 1426;BA.debugLine="Return Width";
if (true) return _width;
 //BA.debugLineNum = 1427;BA.debugLine="End Sub";
return 0;
}
public String  _getyaxisname() throws Exception{
 //BA.debugLineNum = 2789;BA.debugLine="Public Sub getYAxisName As String";
 //BA.debugLineNum = 2790;BA.debugLine="Return Graph.YAxisName";
if (true) return _graph.YAxisName /*String*/ ;
 //BA.debugLineNum = 2791;BA.debugLine="End Sub";
return "";
}
public double  _getymaxvalue() throws Exception{
 //BA.debugLineNum = 3403;BA.debugLine="Public Sub getYMaxValue As Double";
 //BA.debugLineNum = 3404;BA.debugLine="Return Scale(sY).MaxManu";
if (true) return _scale[_sy].MaxManu /*double*/ ;
 //BA.debugLineNum = 3405;BA.debugLine="End Sub";
return 0;
}
public double  _getyminvalue() throws Exception{
 //BA.debugLineNum = 3393;BA.debugLine="Public Sub getYMinValue As Double";
 //BA.debugLineNum = 3394;BA.debugLine="Return Scale(sY).MinManu";
if (true) return _scale[_sy].MinManu /*double*/ ;
 //BA.debugLineNum = 3395;BA.debugLine="End Sub";
return 0;
}
public boolean  _getyscalelogaritmic() throws Exception{
 //BA.debugLineNum = 3354;BA.debugLine="Public Sub getYScaleLogaritmic As Boolean";
 //BA.debugLineNum = 3355;BA.debugLine="Return Scale(sY).Logarithmic";
if (true) return _scale[_sy].Logarithmic /*boolean*/ ;
 //BA.debugLineNum = 3356;BA.debugLine="End Sub";
return false;
}
public double  _getyscalemaxvalue() throws Exception{
 //BA.debugLineNum = 2800;BA.debugLine="Public Sub getYScaleMaxValue As Double";
 //BA.debugLineNum = 2801;BA.debugLine="Return Scale(sY).MaxVal";
if (true) return _scale[_sy].MaxVal /*double*/ ;
 //BA.debugLineNum = 2802;BA.debugLine="End Sub";
return 0;
}
public double  _getyscaleminvalue() throws Exception{
 //BA.debugLineNum = 2813;BA.debugLine="Public Sub getYScaleMinValue As Double";
 //BA.debugLineNum = 2814;BA.debugLine="Return Scale(sY).MinVal";
if (true) return _scale[_sy].MinVal /*double*/ ;
 //BA.debugLineNum = 2815;BA.debugLine="End Sub";
return 0;
}
public int  _getyscalewidth() throws Exception{
int _width = 0;
int _i = 0;
 //BA.debugLineNum = 1430;BA.debugLine="Private Sub GetYScaleWidth As Int";
 //BA.debugLineNum = 1431;BA.debugLine="Private Width As Int";
_width = 0;
 //BA.debugLineNum = 1433;BA.debugLine="If Scale(sY).Automatic = True And Scale(sY).Logar";
if (_scale[_sy].Automatic /*boolean*/ ==__c.True && _scale[_sy].Logarithmic /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 1438;BA.debugLine="Width = MeasureTextWidth(NumberFormat3(Scale(sY)";
_width = _measuretextwidth(_numberformat3(_scale[_sy].MinVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 1439;BA.debugLine="For i = 1 To Scale(sY).NbIntervals";
{
final int step4 = 1;
final int limit4 = _scale[_sy].NbIntervals /*int*/ ;
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 1441;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberForma";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sy].MinVal /*double*/ +_i*_scale[_sy].IntervalAuto /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 }
};
 }else {
 //BA.debugLineNum = 1444;BA.debugLine="Width = MeasureTextWidth(NumberFormat3(Scale(sY)";
_width = _measuretextwidth(_numberformat3(_scale[_sy].MaxVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 1445;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberFormat";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sy].MinVal /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 1446;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberFormat";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sy].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 1447;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberFormat";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sy].MaxVal /*double*/ -_scale[_sy].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 1448;BA.debugLine="Width = Max(Width, MeasureTextWidth(NumberFormat";
_width = (int) (__c.Max(_width,_measuretextwidth(_numberformat3(_scale[_sy].MinVal /*double*/ +_scale[_sy].Interval /*double*/ ,(int) (6)),_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 };
 //BA.debugLineNum = 1450;BA.debugLine="Return Width";
if (true) return _width;
 //BA.debugLineNum = 1451;BA.debugLine="End Sub";
return 0;
}
public boolean  _getyzeroaxis() throws Exception{
 //BA.debugLineNum = 3210;BA.debugLine="Public Sub getYZeroAxis As Boolean";
 //BA.debugLineNum = 3211;BA.debugLine="Return Scale(sY).YZeroAxis";
if (true) return _scale[_sy].YZeroAxis /*boolean*/ ;
 //BA.debugLineNum = 3212;BA.debugLine="End Sub";
return false;
}
public String  _initchart() throws Exception{
int _graphsize = 0;
b4a.example.cov.xchart._pointdata _pd = null;
int _margin = 0;
int _space = 0;
double _spaceratio = 0;
int _limit = 0;
 //BA.debugLineNum = 796;BA.debugLine="Private Sub InitChart";
 //BA.debugLineNum = 797;BA.debugLine="If Texts.AutomaticTextSizes = True Then";
if (_texts.AutomaticTextSizes /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 798;BA.debugLine="Private GraphSize As Int";
_graphsize = 0;
 //BA.debugLineNum = 799;BA.debugLine="GraphSize = Min(xcvsGraph.TargetRect.Width, xcvs";
_graphsize = (int) (__c.Min(_xcvsgraph.getTargetRect().getWidth(),_xcvsgraph.getTargetRect().getHeight())/(double)_xui.getScale());
 //BA.debugLineNum = 800;BA.debugLine="Texts.TitleTextSize = (1 + (GraphSize - 250)/100";
_texts.TitleTextSize /*float*/  = (float) ((1+(_graphsize-250)/(double)1000)*18);
 //BA.debugLineNum = 801;BA.debugLine="Texts.SubtitleTextSize = (1 + (GraphSize - 250)/";
_texts.SubtitleTextSize /*float*/  = (float) ((1+(_graphsize-250)/(double)1000)*16);
 //BA.debugLineNum = 802;BA.debugLine="Texts.AxisTextSize = (1 + (GraphSize - 250)/1000";
_texts.AxisTextSize /*float*/  = (float) ((1+(_graphsize-250)/(double)1000)*14);
 //BA.debugLineNum = 803;BA.debugLine="Legend.TextSize = (1 + (GraphSize - 250)/1000) *";
_legend.TextSize /*float*/  = (float) ((1+(_graphsize-250)/(double)1000)*14);
 //BA.debugLineNum = 804;BA.debugLine="Texts.ScaleTextSize = (1 + (GraphSize - 250)/100";
_texts.ScaleTextSize /*float*/  = (float) ((1+(_graphsize-250)/(double)1000)*12);
 //BA.debugLineNum = 805;BA.debugLine="Values.TextSize = (1 + (GraphSize - 250)/1000) *";
_values.TextSize /*float*/  = (float) ((1+(_graphsize-250)/(double)1000)*14);
 };
 //BA.debugLineNum = 808;BA.debugLine="Texts.TitleFont = xui.CreateDefaultFont(Texts.Tit";
_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.TitleTextSize /*float*/ );
 //BA.debugLineNum = 809;BA.debugLine="Texts.SubtitleFont = xui.CreateDefaultFont(Texts.";
_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.SubtitleTextSize /*float*/ );
 //BA.debugLineNum = 810;BA.debugLine="Texts.AxisFont = xui.CreateDefaultFont(Texts.Axis";
_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.AxisTextSize /*float*/ );
 //BA.debugLineNum = 811;BA.debugLine="Texts.ScaleFont = xui.CreateDefaultFont(Texts.Sca";
_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.ScaleTextSize /*float*/ );
 //BA.debugLineNum = 812;BA.debugLine="Legend.TextFont = xui.CreateDefaultFont(Legend.Te";
_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_legend.TextSize /*float*/ );
 //BA.debugLineNum = 813;BA.debugLine="Values.TextFont = xui.CreateDefaultFont(Values.Te";
_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_values.TextSize /*float*/ );
 //BA.debugLineNum = 815;BA.debugLine="Texts.TitleTextHeight = MeasureTextHeight(\"Mg\", T";
_texts.TitleTextHeight /*int*/  = _measuretextheight("Mg",_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 816;BA.debugLine="Texts.SubtitleTextHeight = MeasureTextHeight(\"Mg\"";
_texts.SubtitleTextHeight /*int*/  = _measuretextheight("Mg",_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 817;BA.debugLine="Texts.AxisTextHeight = MeasureTextHeight(\"Mg\", Te";
_texts.AxisTextHeight /*int*/  = _measuretextheight("Mg",_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 818;BA.debugLine="Texts.ScaleTextHeight = MeasureTextHeight(\"Mg\", T";
_texts.ScaleTextHeight /*int*/  = _measuretextheight("Mg",_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 819;BA.debugLine="Legend.TextHeight = MeasureTextHeight(\"Mg\", Legen";
_legend.TextHeight /*int*/  = _measuretextheight("Mg",_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 820;BA.debugLine="Values.TextHeight = MeasureTextHeight(\"Mg\", Value";
_values.TextHeight /*int*/  = _measuretextheight("Mg",_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 822;BA.debugLine="Graph.Error = False";
_graph.Error /*boolean*/  = __c.False;
 //BA.debugLineNum = 823;BA.debugLine="Graph.ErrorText = \"\"";
_graph.ErrorText /*String*/  = "";
 //BA.debugLineNum = 825;BA.debugLine="If Graph.ChartType = \"PIE\" Then";
if ((_graph.ChartType /*String*/ ).equals("PIE")) { 
 //BA.debugLineNum = 826;BA.debugLine="Graph.Height = xcvsGraph.TargetRect.Height";
_graph.Height /*int*/  = (int) (_xcvsgraph.getTargetRect().getHeight());
 //BA.debugLineNum = 827;BA.debugLine="If Legend.IncludeLegend = \"BOTTOM\" And Items.Siz";
if ((_legend.IncludeLegend /*String*/ ).equals("BOTTOM") && _items.getSize()>0) { 
 //BA.debugLineNum = 828;BA.debugLine="GetLegendLineNumbers(xcvsGraph.TargetRect.Width";
_getlegendlinenumbers((int) (_xcvsgraph.getTargetRect().getWidth()-0.8*_legend.TextHeight /*int*/ ));
 //BA.debugLineNum = 829;BA.debugLine="Legend.Height = (Legend.LineNumber + 0.2) * Leg";
_legend.Height /*int*/  = (int) ((_legend.LineNumber /*int*/ +0.2)*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 830;BA.debugLine="Graph.Height = Graph.Height - Legend.Height - 0";
_graph.Height /*int*/  = (int) (_graph.Height /*int*/ -_legend.Height /*int*/ -0.5*_legend.TextHeight /*int*/ );
 };
 //BA.debugLineNum = 832;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 835;BA.debugLine="If Scale(sY).Logarithmic = True And (Graph.ChartT";
if (_scale[_sy].Logarithmic /*boolean*/ ==__c.True && ((_graph.ChartType /*String*/ ).equals("LINE") || (_graph.ChartType /*String*/ ).equals("YX_CHART"))) { 
 //BA.debugLineNum = 836;BA.debugLine="If Scale(sY).Automatic = True Then";
if (_scale[_sy].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 837;BA.debugLine="CalcScaleLogAuto(sY)";
_calcscalelogauto(_sy);
 }else {
 //BA.debugLineNum = 839;BA.debugLine="CalcScaleLogManu(sY)";
_calcscalelogmanu(_sy);
 };
 }else {
 //BA.debugLineNum = 842;BA.debugLine="If Scale(sY).Automatic = True Then";
if (_scale[_sy].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 843;BA.debugLine="CalcScaleAuto(sY)";
_calcscaleauto(_sy);
 }else {
 //BA.debugLineNum = 845;BA.debugLine="CalcScaleManu(sY)";
_calcscalemanu(_sy);
 };
 };
 //BA.debugLineNum = 849;BA.debugLine="If Scale(sX).Logarithmic = True And Graph.ChartTy";
if (_scale[_sx].Logarithmic /*boolean*/ ==__c.True && (_graph.ChartType /*String*/ ).equals("YX_CHART")) { 
 //BA.debugLineNum = 850;BA.debugLine="If Scale(sX).Automatic = True Then";
if (_scale[_sx].Automatic /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 851;BA.debugLine="CalcScaleLogAuto(sX)";
_calcscalelogauto(_sx);
 }else {
 //BA.debugLineNum = 853;BA.debugLine="CalcScaleLogManu(sX)";
_calcscalelogmanu(_sx);
 };
 }else {
 //BA.debugLineNum = 856;BA.debugLine="CalcScaleManu(sX)";
_calcscalemanu(_sx);
 };
 //BA.debugLineNum = 859;BA.debugLine="Graph.Left = GetYScaleWidth + 0.7 * Texts.ScaleTe";
_graph.Left /*int*/  = (int) (_getyscalewidth()+0.7*_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 861;BA.debugLine="If Graph.YAxisName <> \"\" Then";
if ((_graph.YAxisName /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 862;BA.debugLine="Graph.Left = Graph.Left + Texts.AxisTextHeight *";
_graph.Left /*int*/  = (int) (_graph.Left /*int*/ +_texts.AxisTextHeight /*int*/ *1.2);
 };
 //BA.debugLineNum = 865;BA.debugLine="Graph.Right = xcvsGraph.TargetRect.Width - Texts.";
_graph.Right /*int*/  = (int) (_xcvsgraph.getTargetRect().getWidth()-_texts.ScaleTextHeight /*int*/ );
 //BA.debugLineNum = 866;BA.debugLine="Graph.Width = Graph.Right - Graph.Left";
_graph.Width /*int*/  = (int) (_graph.Right /*int*/ -_graph.Left /*int*/ );
 //BA.debugLineNum = 867;BA.debugLine="If Graph.ChartType = \"YX_CHART\" Then";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART")) { 
 //BA.debugLineNum = 868;BA.debugLine="Graph.Width = Floor(Graph.Width / Scale(sX).NbIn";
_graph.Width /*int*/  = (int) (__c.Floor(_graph.Width /*int*/ /(double)_scale[_sx].NbIntervals /*int*/ )*_scale[_sx].NbIntervals /*int*/ );
 //BA.debugLineNum = 869;BA.debugLine="Graph.Right = Graph.Left + Graph.Width";
_graph.Right /*int*/  = (int) (_graph.Left /*int*/ +_graph.Width /*int*/ );
 //BA.debugLineNum = 870;BA.debugLine="Scale(sY).Scale = Graph.Height / (Scale(sY).MaxV";
_scale[_sy].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_sy].MaxVal /*double*/ -_scale[_sy].MinVal /*double*/ );
 //BA.debugLineNum = 871;BA.debugLine="Scale(sX).Scale = Graph.Width / (Scale(sX).MaxVa";
_scale[_sx].Scale /*double*/  = _graph.Width /*int*/ /(double)(_scale[_sx].MaxVal /*double*/ -_scale[_sx].MinVal /*double*/ );
 }else {
 //BA.debugLineNum = 873;BA.debugLine="Scale(sY).Scale = Graph.Height / (Scale(sY).MaxV";
_scale[_sy].Scale /*double*/  = _graph.Height /*int*/ /(double)(_scale[_sy].MaxVal /*double*/ -_scale[_sy].MinVal /*double*/ );
 //BA.debugLineNum = 874;BA.debugLine="Scale(sX).Scale = Graph.Width / (Scale(sX).MaxVa";
_scale[_sx].Scale /*double*/  = _graph.Width /*int*/ /(double)(_scale[_sx].MaxVal /*double*/ -_scale[_sx].MinVal /*double*/ );
 };
 //BA.debugLineNum = 878;BA.debugLine="If Graph.ChartType = \"BAR\" Or Graph.ChartType = \"";
if ((_graph.ChartType /*String*/ ).equals("BAR") || (_graph.ChartType /*String*/ ).equals("STACKED_BAR")) { 
 //BA.debugLineNum = 879;BA.debugLine="BarWidth0 = False";
_barwidth0 = __c.False;
 //BA.debugLineNum = 880;BA.debugLine="Private PD As PointData = Points.Get(0)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 881;BA.debugLine="Private Margin = 0.02 * xcvsGraph.TargetRect.Wid";
_margin = (int) (0.02*_xcvsgraph.getTargetRect().getWidth());
 //BA.debugLineNum = 882;BA.debugLine="Graph.XInterval = (Graph.Width - Margin) / Point";
_graph.XInterval /*int*/  = (int) ((_graph.Width /*int*/ -_margin)/(double)_points.getSize());
 //BA.debugLineNum = 884;BA.debugLine="Private Space As Int";
_space = 0;
 //BA.debugLineNum = 885;BA.debugLine="If Graph.ChartType = \"BAR\" And Items.Size = 1 An";
if ((_graph.ChartType /*String*/ ).equals("BAR") && _items.getSize()==1 && _points.getSize()<=7) { 
 //BA.debugLineNum = 886;BA.debugLine="Private SpaceRatio As Double";
_spaceratio = 0;
 //BA.debugLineNum = 887;BA.debugLine="Select Points.Size";
switch (BA.switchObjectToInt(_points.getSize(),(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7))) {
case 0: {
 //BA.debugLineNum = 889;BA.debugLine="SpaceRatio = 1";
_spaceratio = 1;
 break; }
case 1: {
 //BA.debugLineNum = 891;BA.debugLine="SpaceRatio = 0.85";
_spaceratio = 0.85;
 break; }
case 2: {
 //BA.debugLineNum = 893;BA.debugLine="SpaceRatio = 0.75";
_spaceratio = 0.75;
 break; }
case 3: {
 //BA.debugLineNum = 895;BA.debugLine="SpaceRatio = 0.6";
_spaceratio = 0.6;
 break; }
case 4: {
 //BA.debugLineNum = 897;BA.debugLine="SpaceRatio = 0.5";
_spaceratio = 0.5;
 break; }
case 5: {
 //BA.debugLineNum = 899;BA.debugLine="SpaceRatio = 0.4";
_spaceratio = 0.4;
 break; }
case 6: {
 //BA.debugLineNum = 901;BA.debugLine="SpaceRatio = 0.3";
_spaceratio = 0.3;
 break; }
}
;
 //BA.debugLineNum = 903;BA.debugLine="Space = Graph.XInterval - xcvsGraph.TargetRect.";
_space = (int) (_graph.XInterval /*int*/ -_xcvsgraph.getTargetRect().getWidth()/(double)((1+_spaceratio)*_points.getSize()+2*_spaceratio));
 }else {
 //BA.debugLineNum = 905;BA.debugLine="Space = Margin";
_space = _margin;
 };
 //BA.debugLineNum = 914;BA.debugLine="Private Limit As Int";
_limit = 0;
 //BA.debugLineNum = 915;BA.debugLine="If Graph.ChartType = \"BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("BAR")) { 
 //BA.debugLineNum = 916;BA.debugLine="Limit = 4dip * PD.YArray.Length";
_limit = (int) (__c.DipToCurrent((int) (4))*_pd.YArray /*double[]*/ .length);
 }else {
 //BA.debugLineNum = 918;BA.debugLine="Limit = 4dip";
_limit = __c.DipToCurrent((int) (4));
 };
 //BA.debugLineNum = 923;BA.debugLine="If Graph.XInterval - Space < Limit Then";
if (_graph.XInterval /*int*/ -_space<_limit) { 
 //BA.debugLineNum = 924;BA.debugLine="Log(\"Bar width = too small !!! Drawing of Bar c";
__c.LogImpl("95046400","Bar width = too small !!! Drawing of Bar chart skipped",0);
 //BA.debugLineNum = 925;BA.debugLine="BarWidth0 = True";
_barwidth0 = __c.True;
 };
 //BA.debugLineNum = 928;BA.debugLine="Graph.XOffset = (Graph.Width - Graph.XInterval *";
_graph.XOffset /*int*/  = (int) ((_graph.Width /*int*/ -_graph.XInterval /*int*/ *_points.getSize())/(double)2);
 //BA.debugLineNum = 929;BA.debugLine="Graph.BarWidth = Graph.XInterval - Space";
_graph.BarWidth /*int*/  = (int) (_graph.XInterval /*int*/ -_space);
 //BA.debugLineNum = 930;BA.debugLine="Graph.BarSubWidth = Graph.BarWidth / PD.YArray.L";
_graph.BarSubWidth /*int*/  = (int) (_graph.BarWidth /*int*/ /(double)_pd.YArray /*double[]*/ .length);
 //BA.debugLineNum = 932;BA.debugLine="If Graph.ChartType = \"BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("BAR")) { 
 //BA.debugLineNum = 934;BA.debugLine="If Graph.BarSubWidth < 4dip And BarWidth0 = Fal";
if (_graph.BarSubWidth /*int*/ <__c.DipToCurrent((int) (4)) && _barwidth0==__c.False) { 
 //BA.debugLineNum = 935;BA.debugLine="Log(\"Bar width = too small !!! Drawing of Bar";
__c.LogImpl("95046411","Bar width = too small !!! Drawing of Bar chart skipped",0);
 //BA.debugLineNum = 936;BA.debugLine="BarWidth0 = True";
_barwidth0 = __c.True;
 };
 };
 };
 //BA.debugLineNum = 941;BA.debugLine="If Graph.Title <> \"\" Then";
if ((_graph.Title /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 942;BA.debugLine="Graph.Top = 1.2 * Texts.TitleTextHeight";
_graph.Top /*int*/  = (int) (1.2*_texts.TitleTextHeight /*int*/ );
 }else {
 //BA.debugLineNum = 944;BA.debugLine="Graph.Top = 0.6 * Texts.TitleTextHeight";
_graph.Top /*int*/  = (int) (0.6*_texts.TitleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 947;BA.debugLine="If Graph.Subtitle <> \"\" Then";
if ((_graph.Subtitle /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 948;BA.debugLine="Graph.Top = Graph.Top + Texts.SubtitleTextHeight";
_graph.Top /*int*/  = (int) (_graph.Top /*int*/ +_texts.SubtitleTextHeight /*int*/ );
 };
 //BA.debugLineNum = 951;BA.debugLine="Select Graph.XScaleTextOrientation";
switch (BA.switchObjectToInt(_graph.XScaleTextOrientation /*String*/ ,"HORIZONTAL","VERTICAL","45 DEGREES")) {
case 0: {
 //BA.debugLineNum = 953;BA.debugLine="Graph.Height = xcvsGraph.TargetRect.Height - Gr";
_graph.Height /*int*/  = (int) (_xcvsgraph.getTargetRect().getHeight()-_graph.Top /*int*/ -1.4*_texts.ScaleTextHeight /*int*/ );
 break; }
case 1: {
 //BA.debugLineNum = 955;BA.debugLine="Graph.Height = xcvsGraph.TargetRect.Height - Gr";
_graph.Height /*int*/  = (int) (_xcvsgraph.getTargetRect().getHeight()-_graph.Top /*int*/ -0.6*_texts.ScaleTextHeight /*int*/ -_getxscalewidth());
 break; }
case 2: {
 //BA.debugLineNum = 957;BA.debugLine="Graph.Height = xcvsGraph.TargetRect.Height - Gr";
_graph.Height /*int*/  = (int) (_xcvsgraph.getTargetRect().getHeight()-_graph.Top /*int*/ -0.6*_texts.ScaleTextHeight /*int*/ -_getxscalewidth()*0.8);
 break; }
}
;
 //BA.debugLineNum = 959;BA.debugLine="If Graph.XAxisName <> \"\" Then";
if ((_graph.XAxisName /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 960;BA.debugLine="Graph.Height = Graph.Height - 0.85 * Texts.AxisT";
_graph.Height /*int*/  = (int) (_graph.Height /*int*/ -0.85*_texts.AxisTextHeight /*int*/ );
 };
 //BA.debugLineNum = 963;BA.debugLine="If Legend.IncludeLegend = \"BOTTOM\" And Items.Size";
if ((_legend.IncludeLegend /*String*/ ).equals("BOTTOM") && _items.getSize()>0) { 
 //BA.debugLineNum = 964;BA.debugLine="GetLegendLineNumbers(xcvsGraph.TargetRect.Width";
_getlegendlinenumbers((int) (_xcvsgraph.getTargetRect().getWidth()-0.8*_legend.TextHeight /*int*/ ));
 //BA.debugLineNum = 965;BA.debugLine="Legend.Height = (Legend.LineNumber + 0.2) * Lege";
_legend.Height /*int*/  = (int) ((_legend.LineNumber /*int*/ +0.2)*_legend.TextHeight /*int*/ );
 //BA.debugLineNum = 966;BA.debugLine="Graph.Height = Graph.Height - Legend.Height - 0.";
_graph.Height /*int*/  = (int) (_graph.Height /*int*/ -_legend.Height /*int*/ -0.5*_legend.TextHeight /*int*/ );
 };
 //BA.debugLineNum = 969;BA.debugLine="Graph.YInterval = Graph.Height / Scale(sY).NbInte";
_graph.YInterval /*int*/  = (int) (_graph.Height /*int*/ /(double)_scale[_sy].NbIntervals /*int*/ );
 //BA.debugLineNum = 970;BA.debugLine="Graph.Height =  Graph.YInterval * Scale(sY).NbInt";
_graph.Height /*int*/  = (int) (_graph.YInterval /*int*/ *_scale[_sy].NbIntervals /*int*/ );
 //BA.debugLineNum = 971;BA.debugLine="Graph.Bottom = Graph.Top + Graph.Height";
_graph.Bottom /*int*/  = (int) (_graph.Top /*int*/ +_graph.Height /*int*/ );
 //BA.debugLineNum = 972;BA.debugLine="Graph.Rect.Initialize(Graph.Left, Graph.Top, Grap";
_graph.Rect /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (_graph.Left /*int*/ ),(float) (_graph.Top /*int*/ ),(float) (_graph.Right /*int*/ ),(float) (_graph.Bottom /*int*/ ));
 //BA.debugLineNum = 975;BA.debugLine="pthGrid.Initialize(Graph.Left, Graph.Top)";
_pthgrid.Initialize((float) (_graph.Left /*int*/ ),(float) (_graph.Top /*int*/ ));
 //BA.debugLineNum = 976;BA.debugLine="pthGrid.LineTo(Graph.Right, Graph.Top)";
_pthgrid.LineTo((float) (_graph.Right /*int*/ ),(float) (_graph.Top /*int*/ ));
 //BA.debugLineNum = 977;BA.debugLine="pthGrid.LineTo(Graph.Right, Graph.Bottom)";
_pthgrid.LineTo((float) (_graph.Right /*int*/ ),(float) (_graph.Bottom /*int*/ ));
 //BA.debugLineNum = 978;BA.debugLine="pthGrid.LineTo(Graph.Left, Graph.Bottom)";
_pthgrid.LineTo((float) (_graph.Left /*int*/ ),(float) (_graph.Bottom /*int*/ ));
 //BA.debugLineNum = 979;BA.debugLine="pthGrid.LineTo(Graph.Left, Graph.Top)";
_pthgrid.LineTo((float) (_graph.Left /*int*/ ),(float) (_graph.Top /*int*/ ));
 //BA.debugLineNum = 981;BA.debugLine="InitValues";
_initvalues();
 //BA.debugLineNum = 982;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 250;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 251;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 252;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return "";
}
public String  _initvalues() throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _linenumber = 0;
b4a.example.cov.xchart._pointdata _pd = null;
int _itemwidth = 0;
b4a.example.cov.xchart._itemdata _item = null;
String _txt = "";
int _valuewidth = 0;
b4a.example.cov.xchart._pointdata _pnt = null;
int _h = 0;
int _i = 0;
int _x = 0;
int _y = 0;
int _top = 0;
 //BA.debugLineNum = 418;BA.debugLine="Private Sub InitValues";
 //BA.debugLineNum = 419;BA.debugLine="Private r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 420;BA.debugLine="Private LineNumber As Int";
_linenumber = 0;
 //BA.debugLineNum = 422;BA.debugLine="Values.Left = 0.3 * Values.TextHeight";
_values.Left /*int*/  = (int) (0.3*_values.TextHeight /*int*/ );
 //BA.debugLineNum = 423;BA.debugLine="Values.Top = 0.3 * Values.TextHeight";
_values.Top /*int*/  = (int) (0.3*_values.TextHeight /*int*/ );
 //BA.debugLineNum = 424;BA.debugLine="Values.MaxDigits = 6";
_values.MaxDigits /*int*/  = (int) (6);
 //BA.debugLineNum = 426;BA.debugLine="LineNumber = Items.Size + 1";
_linenumber = (int) (_items.getSize()+1);
 //BA.debugLineNum = 427;BA.debugLine="If Graph.ChartType = \"LINE\" Then";
if ((_graph.ChartType /*String*/ ).equals("LINE")) { 
 //BA.debugLineNum = 428;BA.debugLine="Private PD As PointData";
_pd = new b4a.example.cov.xchart._pointdata();
 //BA.debugLineNum = 429;BA.debugLine="PD = Points.Get(0)";
_pd = (b4a.example.cov.xchart._pointdata)(_points.Get((int) (0)));
 //BA.debugLineNum = 430;BA.debugLine="If PD.YArray.Length = 1 Then";
if (_pd.YArray /*double[]*/ .length==1) { 
 //BA.debugLineNum = 431;BA.debugLine="If Graph.IncludeMinLine = True Then";
if (_graph.IncludeMinLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 432;BA.debugLine="LineNumber = LineNumber + 1";
_linenumber = (int) (_linenumber+1);
 };
 //BA.debugLineNum = 434;BA.debugLine="If Graph.IncludeMaxLine = True Then";
if (_graph.IncludeMaxLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 435;BA.debugLine="LineNumber = LineNumber + 1";
_linenumber = (int) (_linenumber+1);
 };
 //BA.debugLineNum = 437;BA.debugLine="If Graph.IncludeMeanLine = True Then";
if (_graph.IncludeMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 438;BA.debugLine="LineNumber = LineNumber + 1";
_linenumber = (int) (_linenumber+1);
 };
 };
 };
 //BA.debugLineNum = 442;BA.debugLine="Values.Height = Values.TextHeight * 1.2 * LineNum";
_values.Height /*int*/  = (int) (_values.TextHeight /*int*/ *1.2*_linenumber);
 //BA.debugLineNum = 444;BA.debugLine="Private ItemWidth As Int";
_itemwidth = 0;
 //BA.debugLineNum = 445;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group24 = _items;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_item = (b4a.example.cov.xchart._itemdata)(group24.Get(index24));
 //BA.debugLineNum = 446;BA.debugLine="Private txt As String = Item.Name & \" = \"";
_txt = _item.Name /*String*/ +" = ";
 //BA.debugLineNum = 447;BA.debugLine="ItemWidth = Max(ItemWidth, MeasureTextWidth(txt,";
_itemwidth = (int) (__c.Max(_itemwidth,_measuretextwidth(_txt,_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 }
};
 //BA.debugLineNum = 449;BA.debugLine="If Graph.ChartType = \"STACKED_BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("STACKED_BAR")) { 
 //BA.debugLineNum = 450;BA.debugLine="ItemWidth = Max(ItemWidth, MeasureTextWidth(\"Tot";
_itemwidth = (int) (__c.Max(_itemwidth,_measuretextwidth("Total = ",_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 //BA.debugLineNum = 451;BA.debugLine="Values.Height = Values.TextHeight * 1.2 * (Items";
_values.Height /*int*/  = (int) (_values.TextHeight /*int*/ *1.2*(_items.getSize()+2));
 };
 //BA.debugLineNum = 453;BA.debugLine="ItemWidth = ItemWidth + 1.2 * Values.TextHeight";
_itemwidth = (int) (_itemwidth+1.2*_values.TextHeight /*int*/ );
 //BA.debugLineNum = 454;BA.debugLine="Values.MidPont = ItemWidth - 0.6 * Values.TextHei";
_values.MidPont /*int*/  = (int) (_itemwidth-0.6*_values.TextHeight /*int*/ );
 //BA.debugLineNum = 455;BA.debugLine="Private ValueWidth = MeasureTextWidth(\"-1.23456\",";
_valuewidth = _measuretextwidth("-1.23456",_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 456;BA.debugLine="For Each pnt As PointData In Points";
{
final anywheresoftware.b4a.BA.IterableList group35 = _points;
final int groupLen35 = group35.getSize()
;int index35 = 0;
;
for (; index35 < groupLen35;index35++){
_pnt = (b4a.example.cov.xchart._pointdata)(group35.Get(index35));
 //BA.debugLineNum = 457;BA.debugLine="Private txt As String = pnt.X";
_txt = _pnt.X /*String*/ ;
 //BA.debugLineNum = 458;BA.debugLine="ValueWidth = Max(ValueWidth, MeasureTextWidth(tx";
_valuewidth = (int) (__c.Max(_valuewidth,_measuretextwidth(_txt,_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )));
 }
};
 //BA.debugLineNum = 460;BA.debugLine="Values.Width = ItemWidth + ValueWidth";
_values.Width /*int*/  = (int) (_itemwidth+_valuewidth);
 //BA.debugLineNum = 461;BA.debugLine="Values.rectRight.Initialize(Values.MidPont, 0, Va";
_values.rectRight /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (_values.MidPont /*int*/ ),(float) (0),(float) (_values.Width /*int*/ ),(float) (_values.Height /*int*/ ));
 //BA.debugLineNum = 462;BA.debugLine="Values.rectCursor.Initialize(0, 0, 5dip, xpnlCurs";
_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ .Initialize((float) (0),(float) (0),(float) (__c.DipToCurrent((int) (5))),(float) (_xpnlcursor.getHeight()));
 //BA.debugLineNum = 464;BA.debugLine="xpnlValues.Left = Values.Left";
_xpnlvalues.setLeft(_values.Left /*int*/ );
 //BA.debugLineNum = 465;BA.debugLine="xpnlValues.Top = Values.Top";
_xpnlvalues.setTop(_values.Top /*int*/ );
 //BA.debugLineNum = 466;BA.debugLine="xpnlValues.Width = Values.Width";
_xpnlvalues.setWidth(_values.Width /*int*/ );
 //BA.debugLineNum = 467;BA.debugLine="If Values.Position = \"TOP_RIGHT\" Then";
if ((_values.Position /*String*/ ).equals("TOP_RIGHT")) { 
 //BA.debugLineNum = 468;BA.debugLine="xpnlValues.Left = xBase.Width - Values.Left - Va";
_xpnlvalues.setLeft((int) (_xbase.getWidth()-_values.Left /*int*/ -_values.Width /*int*/ ));
 };
 //BA.debugLineNum = 470;BA.debugLine="xpnlValues.Height = Values.Height";
_xpnlvalues.setHeight(_values.Height /*int*/ );
 //BA.debugLineNum = 471;BA.debugLine="xcvsValues.Resize(Values.Width, Values.Height)";
_xcvsvalues.Resize((float) (_values.Width /*int*/ ),(float) (_values.Height /*int*/ ));
 //BA.debugLineNum = 473;BA.debugLine="r.Initialize(0, 0, Values.Width, Values.Height)";
_r.Initialize((float) (0),(float) (0),(float) (_values.Width /*int*/ ),(float) (_values.Height /*int*/ ));
 //BA.debugLineNum = 474;BA.debugLine="xcvsValues.ClearRect(r)";
_xcvsvalues.ClearRect(_r);
 //BA.debugLineNum = 475;BA.debugLine="xcvsValues.DrawRect(r, 0xAAFFFFFF, True, 0)";
_xcvsvalues.DrawRect(_r,(int) (0xaaffffff),__c.True,(float) (0));
 //BA.debugLineNum = 477;BA.debugLine="Private h, i, x, y As Int";
_h = 0;
_i = 0;
_x = 0;
_y = 0;
 //BA.debugLineNum = 478;BA.debugLine="h = Values.TextHeight * 1.2";
_h = (int) (_values.TextHeight /*int*/ *1.2);
 //BA.debugLineNum = 479;BA.debugLine="x = Values.MidPont";
_x = _values.MidPont /*int*/ ;
 //BA.debugLineNum = 480;BA.debugLine="y = 0.8 * Values.TextHeight";
_y = (int) (0.8*_values.TextHeight /*int*/ );
 //BA.debugLineNum = 481;BA.debugLine="xcvsValues.DrawText(\"x = \", x, y + 0.2 * h, Value";
_xcvsvalues.DrawText(ba,"x = ",(float) (_x),(float) (_y+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_values.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 482;BA.debugLine="i = 1";
_i = (int) (1);
 //BA.debugLineNum = 483;BA.debugLine="Private top As Int";
_top = 0;
 //BA.debugLineNum = 484;BA.debugLine="For Each Item As ItemData In Items";
{
final anywheresoftware.b4a.BA.IterableList group60 = _items;
final int groupLen60 = group60.getSize()
;int index60 = 0;
;
for (; index60 < groupLen60;index60++){
_item = (b4a.example.cov.xchart._itemdata)(group60.Get(index60));
 //BA.debugLineNum = 485;BA.debugLine="top = y + h * i";
_top = (int) (_y+_h*_i);
 //BA.debugLineNum = 486;BA.debugLine="Private txt As String = Item.Name & \" = \"";
_txt = _item.Name /*String*/ +" = ";
 //BA.debugLineNum = 487;BA.debugLine="xcvsValues.DrawText(txt, x, top + 0.2 * h, Value";
_xcvsvalues.DrawText(ba,_txt,(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_item.Color /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 //BA.debugLineNum = 488;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
 //BA.debugLineNum = 491;BA.debugLine="If Graph.ChartType = \"LINE\" And Graph.IncludeMinL";
if ((_graph.ChartType /*String*/ ).equals("LINE") && _graph.IncludeMinLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 492;BA.debugLine="If  Graph.IncludeMaxLine = True Then";
if (_graph.IncludeMaxLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 493;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 494;BA.debugLine="xcvsValues.DrawText(\"max = \", x, top + 0.2 * h,";
_xcvsvalues.DrawText(ba,"max = ",(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_graph.MaxLineColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 };
 //BA.debugLineNum = 496;BA.debugLine="If  Graph.IncludeMeanLine = True Then";
if (_graph.IncludeMeanLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 497;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 498;BA.debugLine="xcvsValues.DrawText(\"mean = \", x, top + 0.2 * h";
_xcvsvalues.DrawText(ba,"mean = ",(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_graph.MeanLineColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 };
 //BA.debugLineNum = 500;BA.debugLine="If  Graph.IncludeMinLine = True Then";
if (_graph.IncludeMinLine /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 501;BA.debugLine="top = top + h";
_top = (int) (_top+_h);
 //BA.debugLineNum = 502;BA.debugLine="xcvsValues.DrawText(\"min = \", x, top + 0.2 * h,";
_xcvsvalues.DrawText(ba,"min = ",(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_graph.MinLineColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 };
 };
 //BA.debugLineNum = 506;BA.debugLine="If Graph.ChartType = \"STACKED_BAR\" Then";
if ((_graph.ChartType /*String*/ ).equals("STACKED_BAR")) { 
 //BA.debugLineNum = 507;BA.debugLine="Private top As Int = y + h * i";
_top = (int) (_y+_h*_i);
 //BA.debugLineNum = 508;BA.debugLine="Private txt As String = \"Total = \"";
_txt = "Total = ";
 //BA.debugLineNum = 509;BA.debugLine="xcvsValues.DrawText(txt, x, top + 0.2 * h, Value";
_xcvsvalues.DrawText(ba,_txt,(float) (_x),(float) (_top+0.2*_h),_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_values.TextColor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"RIGHT"));
 };
 //BA.debugLineNum = 512;BA.debugLine="xcvsValues.Invalidate";
_xcvsvalues.Invalidate();
 //BA.debugLineNum = 513;BA.debugLine="End Sub";
return "";
}
public int  _measuretextheight(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rct = null;
 //BA.debugLineNum = 2570;BA.debugLine="Private Sub MeasureTextHeight(Text As String, Font";
 //BA.debugLineNum = 2571;BA.debugLine="Private rct As B4XRect";
_rct = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 2572;BA.debugLine="rct = xcvsCursor.MeasureText(Text, Font1)";
_rct = _xcvscursor.MeasureText(_text,_font1);
 //BA.debugLineNum = 2573;BA.debugLine="Return rct.Width";
if (true) return (int) (_rct.getWidth());
 //BA.debugLineNum = 2575;BA.debugLine="End Sub";
return 0;
}
public int  _measuretextwidth(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rct = null;
 //BA.debugLineNum = 2564;BA.debugLine="Private Sub MeasureTextWidth(Text As String, Font1";
 //BA.debugLineNum = 2565;BA.debugLine="Private rct As B4XRect";
_rct = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
 //BA.debugLineNum = 2566;BA.debugLine="rct = xcvsCursor.MeasureText(Text, Font1)";
_rct = _xcvscursor.MeasureText(_text,_font1);
 //BA.debugLineNum = 2567;BA.debugLine="Return rct.Width";
if (true) return (int) (_rct.getWidth());
 //BA.debugLineNum = 2568;BA.debugLine="End Sub";
return 0;
}
public String  _numberformat3(double _number,int _maxdigits) throws Exception{
double _mant = 0;
double _exp = 0;
double _lng = 0;
double _lng2 = 0;
String _str = "";
String _strminus = "";
 //BA.debugLineNum = 2737;BA.debugLine="Public Sub NumberFormat3(Number As Double, MaxDigi";
 //BA.debugLineNum = 2738;BA.debugLine="Private mant, exp, lng, lng2 As Double";
_mant = 0;
_exp = 0;
_lng = 0;
_lng2 = 0;
 //BA.debugLineNum = 2739;BA.debugLine="Private str, strMinus As String";
_str = "";
_strminus = "";
 //BA.debugLineNum = 2741;BA.debugLine="If Abs(Number) < 1e-11 Then Return \"0\"";
if (__c.Abs(_number)<1e-11) { 
if (true) return "0";};
 //BA.debugLineNum = 2743;BA.debugLine="If Number < 0 Then";
if (_number<0) { 
 //BA.debugLineNum = 2744;BA.debugLine="strMinus = \"-\"";
_strminus = "-";
 }else {
 //BA.debugLineNum = 2746;BA.debugLine="strMinus = \"\"";
_strminus = "";
 };
 //BA.debugLineNum = 2748;BA.debugLine="lng = Logarithm(Abs(Number), 10)";
_lng = __c.Logarithm(__c.Abs(_number),10);
 //BA.debugLineNum = 2749;BA.debugLine="exp = Floor(lng)";
_exp = __c.Floor(_lng);
 //BA.debugLineNum = 2750;BA.debugLine="If exp < 0 Then";
if (_exp<0) { 
 //BA.debugLineNum = 2751;BA.debugLine="lng2 = Floor(lng)";
_lng2 = __c.Floor(_lng);
 //BA.debugLineNum = 2752;BA.debugLine="lng = -lng2 + lng";
_lng = -_lng2+_lng;
 }else {
 //BA.debugLineNum = 2754;BA.debugLine="lng = lng - exp";
_lng = _lng-_exp;
 };
 //BA.debugLineNum = 2757;BA.debugLine="If exp < MaxDigits And exp > -5 Then";
if (_exp<_maxdigits && _exp>-5) { 
 //BA.debugLineNum = 2758;BA.debugLine="str = NumberFormat2(Number, 1, MaxDigits - 1 - e";
_str = __c.NumberFormat2(_number,(int) (1),(int) (_maxdigits-1-_exp),(int) (0),__c.False);
 }else if(_exp<=-5 && _exp>-7) { 
 //BA.debugLineNum = 2760;BA.debugLine="str = NumberFormat2(Number, 1, 9, 0, False)";
_str = __c.NumberFormat2(_number,(int) (1),(int) (9),(int) (0),__c.False);
 }else {
 //BA.debugLineNum = 2762;BA.debugLine="mant = Power(10, lng)";
_mant = __c.Power(10,_lng);
 //BA.debugLineNum = 2763;BA.debugLine="str = strMinus & NumberFormat2(mant, 1, MaxDigit";
_str = _strminus+__c.NumberFormat2(_mant,(int) (1),(int) (_maxdigits-1),(int) (0),__c.False);
 //BA.debugLineNum = 2764;BA.debugLine="str = str & \"E\" & exp";
_str = _str+"E"+BA.NumberToString(_exp);
 };
 //BA.debugLineNum = 2767;BA.debugLine="Return str";
if (true) return _str;
 //BA.debugLineNum = 2768;BA.debugLine="End Sub";
return "";
}
public String  _removepointdata(int _index) throws Exception{
 //BA.debugLineNum = 3284;BA.debugLine="Public Sub RemovePointData(Index As Int)";
 //BA.debugLineNum = 3285;BA.debugLine="Points.RemoveAt(Index)";
_points.RemoveAt(_index);
 //BA.debugLineNum = 3286;BA.debugLine="End Sub";
return "";
}
public String  _scalelogvals(int _axis) throws Exception{
String[] _scales = null;
double[] _vals = null;
double[] _logs = null;
int _i = 0;
 //BA.debugLineNum = 1168;BA.debugLine="Private Sub ScaleLogVals(Axis As Int)";
 //BA.debugLineNum = 1169;BA.debugLine="Private Scales() As String";
_scales = new String[(int) (0)];
java.util.Arrays.fill(_scales,"");
 //BA.debugLineNum = 1170;BA.debugLine="Scales = Regex.Split(\"!\", ScaleLog(Axis).ScaleVal";
_scales = __c.Regex.Split("!",_scalelog[_axis].ScaleValues /*String*/ );
 //BA.debugLineNum = 1171;BA.debugLine="Private Vals(Scales.Length), Logs(Scales.Length)";
_vals = new double[_scales.length];
;
_logs = new double[_scales.length];
;
 //BA.debugLineNum = 1172;BA.debugLine="For i = 0 To Scales.Length - 1";
{
final int step4 = 1;
final int limit4 = (int) (_scales.length-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 1173;BA.debugLine="Vals(i) = Scales(i)";
_vals[_i] = (double)(Double.parseDouble(_scales[_i]));
 //BA.debugLineNum = 1174;BA.debugLine="Logs(i) = Logarithm(Vals(i), 10)";
_logs[_i] = __c.Logarithm(_vals[_i],10);
 }
};
 //BA.debugLineNum = 1176;BA.debugLine="ScaleLog(Axis).Logs = Logs";
_scalelog[_axis].Logs /*double[]*/  = _logs;
 //BA.debugLineNum = 1177;BA.debugLine="ScaleLog(Axis).Vals = Vals";
_scalelog[_axis].Vals /*double[]*/  = _vals;
 //BA.debugLineNum = 1178;BA.debugLine="End Sub";
return "";
}
public String  _setautomaticscale(boolean _automaticscale) throws Exception{
 //BA.debugLineNum = 2887;BA.debugLine="Public Sub setAutomaticScale(AutomaticScale As Boo";
 //BA.debugLineNum = 2888;BA.debugLine="Scale(sY).Automatic = AutomaticScale";
_scale[_sy].Automatic /*boolean*/  = _automaticscale;
 //BA.debugLineNum = 2889;BA.debugLine="Scale(sX).Automatic = AutomaticScale";
_scale[_sx].Automatic /*boolean*/  = _automaticscale;
 //BA.debugLineNum = 2890;BA.debugLine="End Sub";
return "";
}
public String  _setautomatictextsizes(boolean _automatictextsizes) throws Exception{
 //BA.debugLineNum = 2969;BA.debugLine="Public Sub setAutomaticTextSizes(AutomaticTextSize";
 //BA.debugLineNum = 2970;BA.debugLine="Texts.AutomaticTextSizes = AutomaticTextSizes";
_texts.AutomaticTextSizes /*boolean*/  = _automatictextsizes;
 //BA.debugLineNum = 2971;BA.debugLine="End Sub";
return "";
}
public String  _setaxistextcolor(int _color) throws Exception{
 //BA.debugLineNum = 3147;BA.debugLine="Public Sub setAxisTextColor(Color As Int)";
 //BA.debugLineNum = 3148;BA.debugLine="Texts.AxisTextColor = Color";
_texts.AxisTextColor /*int*/  = _color;
 //BA.debugLineNum = 3149;BA.debugLine="End Sub";
return "";
}
public String  _setaxistextsize(float _axistextsize) throws Exception{
 //BA.debugLineNum = 2991;BA.debugLine="Public Sub setAxisTextSize(AxisTextSize As Float)";
 //BA.debugLineNum = 2992;BA.debugLine="Texts.AxisTextSize = AxisTextSize";
_texts.AxisTextSize /*float*/  = _axistextsize;
 //BA.debugLineNum = 2993;BA.debugLine="Texts.AxisFont = xui.CreateDefaultFont(Texts.Axis";
_texts.AxisFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.AxisTextSize /*float*/ );
 //BA.debugLineNum = 2994;BA.debugLine="Texts.AutomaticTextSizes = False";
_texts.AutomaticTextSizes /*boolean*/  = __c.False;
 //BA.debugLineNum = 2995;BA.debugLine="End Sub";
return "";
}
public String  _setbarmeanvalueformat(int _minimumintegers,int _maximumfractions,int _minimumfractions,boolean _groupingused) throws Exception{
 //BA.debugLineNum = 3291;BA.debugLine="Public Sub SetBarMeanValueFormat(MinimumIntegers A";
 //BA.debugLineNum = 3292;BA.debugLine="BMVNFUsed = True";
_bmvnfused = __c.True;
 //BA.debugLineNum = 3293;BA.debugLine="BMVNF.MinimumIntegers = MinimumIntegers";
_bmvnf.MinimumIntegers /*int*/  = _minimumintegers;
 //BA.debugLineNum = 3294;BA.debugLine="BMVNF.MaximumFractions = MaximumFractions";
_bmvnf.MaximumFractions /*int*/  = _maximumfractions;
 //BA.debugLineNum = 3295;BA.debugLine="BMVNF.MinimumFractions = MinimumFractions";
_bmvnf.MinimumFractions /*int*/  = _minimumfractions;
 //BA.debugLineNum = 3296;BA.debugLine="BMVNF.GroupingUsed = GroupingUsed";
_bmvnf.GroupingUsed /*boolean*/  = _groupingused;
 //BA.debugLineNum = 3297;BA.debugLine="End Sub";
return "";
}
public String  _setbarvalueorientation(String _barvalueorientation) throws Exception{
 //BA.debugLineNum = 3333;BA.debugLine="Public Sub setBarValueOrientation(BarValueOrientat";
 //BA.debugLineNum = 3334;BA.debugLine="If BarValueOrientation = \"HORIZONTAL\" Or BarValue";
if ((_barvalueorientation).equals("HORIZONTAL") || (_barvalueorientation).equals("VERTICAL")) { 
 //BA.debugLineNum = 3335;BA.debugLine="Graph.BarValueOrientation = BarValueOrientation";
_graph.BarValueOrientation /*String*/  = _barvalueorientation;
 }else {
 //BA.debugLineNum = 3337;BA.debugLine="Log(\"Error: wrong BarValueOrientation value\")";
__c.LogImpl("913697028","Error: wrong BarValueOrientation value",0);
 };
 //BA.debugLineNum = 3339;BA.debugLine="End Sub";
return "";
}
public String  _setchartbackgroundcolor(int _color) throws Exception{
 //BA.debugLineNum = 3119;BA.debugLine="Public Sub setChartBackgroundColor(Color As Int)";
 //BA.debugLineNum = 3120;BA.debugLine="Graph.ChartBackgroundColor = Color";
_graph.ChartBackgroundColor /*int*/  = _color;
 //BA.debugLineNum = 3121;BA.debugLine="End Sub";
return "";
}
public String  _setcharttype(String _charttype) throws Exception{
 //BA.debugLineNum = 2908;BA.debugLine="Public Sub setChartType(ChartType As String)";
 //BA.debugLineNum = 2909;BA.debugLine="If ChartType = \"BAR\" Or ChartType = \"STACKED_BAR\"";
if ((_charttype).equals("BAR") || (_charttype).equals("STACKED_BAR") || (_charttype).equals("LINE") || (_charttype).equals("PIE")) { 
 //BA.debugLineNum = 2910;BA.debugLine="Graph.ChartType = ChartType";
_graph.ChartType /*String*/  = _charttype;
 }else {
 //BA.debugLineNum = 2912;BA.debugLine="Log(\"Wrong chart type\")";
__c.LogImpl("99043972","Wrong chart type",0);
 };
 //BA.debugLineNum = 2914;BA.debugLine="End Sub";
return "";
}
public String  _setdisplayvalues(boolean _displayvalues) throws Exception{
 //BA.debugLineNum = 3039;BA.debugLine="Public Sub setDisplayValues(DisplayValues As Boole";
 //BA.debugLineNum = 3040;BA.debugLine="Values.Show = DisplayValues";
_values.Show /*boolean*/  = _displayvalues;
 //BA.debugLineNum = 3041;BA.debugLine="End Sub";
return "";
}
public String  _setdrawouterframe(boolean _drawouterframe) throws Exception{
 //BA.debugLineNum = 3246;BA.debugLine="Public Sub setDrawOuterFrame (DrawOuterFrame As Bo";
 //BA.debugLineNum = 3247;BA.debugLine="Graph.DrawOuterFrame = DrawOuterFrame";
_graph.DrawOuterFrame /*boolean*/  = _drawouterframe;
 //BA.debugLineNum = 3248;BA.debugLine="End Sub";
return "";
}
public String  _setgradientcolors(boolean _gradientcolors) throws Exception{
 //BA.debugLineNum = 3099;BA.debugLine="Public Sub setGradientColors(GradientColors As Boo";
 //BA.debugLineNum = 3100;BA.debugLine="Graph.GradientColors = GradientColors";
_graph.GradientColors /*boolean*/  = _gradientcolors;
 //BA.debugLineNum = 3101;BA.debugLine="End Sub";
return "";
}
public String  _setgradientcolorsalpha(int _gradientcolorsalpha) throws Exception{
 //BA.debugLineNum = 3110;BA.debugLine="Public Sub setGradientColorsAlpha(GradientColorsAl";
 //BA.debugLineNum = 3111;BA.debugLine="Graph.GradientColorsAlpha = GradientColorsAlpha";
_graph.GradientColorsAlpha /*int*/  = _gradientcolorsalpha;
 //BA.debugLineNum = 3112;BA.debugLine="Graph.GradientColorsAlpha = Max(0, Graph.Gradient";
_graph.GradientColorsAlpha /*int*/  = (int) (__c.Max(0,_graph.GradientColorsAlpha /*int*/ ));
 //BA.debugLineNum = 3113;BA.debugLine="Graph.GradientColorsAlpha = Min(255, Graph.Gradie";
_graph.GradientColorsAlpha /*int*/  = (int) (__c.Min(255,_graph.GradientColorsAlpha /*int*/ ));
 //BA.debugLineNum = 3114;BA.debugLine="End Sub";
return "";
}
public String  _setgridcolor(int _color) throws Exception{
 //BA.debugLineNum = 3133;BA.debugLine="Public Sub setGridColor(Color As Int)";
 //BA.debugLineNum = 3134;BA.debugLine="Graph.GridColor = Color";
_graph.GridColor /*int*/  = _color;
 //BA.debugLineNum = 3135;BA.debugLine="End Sub";
return "";
}
public String  _setgridframecolor(int _color) throws Exception{
 //BA.debugLineNum = 3126;BA.debugLine="Public Sub setGridFrameColor(Color As Int)";
 //BA.debugLineNum = 3127;BA.debugLine="Graph.GridFrameColor = Color";
_graph.GridFrameColor /*int*/  = _color;
 //BA.debugLineNum = 3128;BA.debugLine="End Sub";
return "";
}
public String  _setheight(int _height) throws Exception{
 //BA.debugLineNum = 2949;BA.debugLine="Public Sub setHeight(Height As Int)";
 //BA.debugLineNum = 2950;BA.debugLine="xBase.Height = Height";
_xbase.setHeight(_height);
 //BA.debugLineNum = 2951;BA.debugLine="Base_Resize(xBase.Width, Height)";
_base_resize(_xbase.getWidth(),_height);
 //BA.debugLineNum = 2952;BA.debugLine="End Sub";
return "";
}
public String  _setincludebarmeanline(boolean _includebarmeanline) throws Exception{
 //BA.debugLineNum = 2877;BA.debugLine="Public Sub setIncludeBarMeanLine(IncludeBarMeanLin";
 //BA.debugLineNum = 2878;BA.debugLine="Graph.IncludeBarMeanLine = IncludeBarMeanLine";
_graph.IncludeBarMeanLine /*boolean*/  = _includebarmeanline;
 //BA.debugLineNum = 2879;BA.debugLine="End Sub";
return "";
}
public String  _setincludelegend(String _includelegend) throws Exception{
 //BA.debugLineNum = 2857;BA.debugLine="Public Sub setIncludeLegend(IncludeLegend As Strin";
 //BA.debugLineNum = 2858;BA.debugLine="Legend.IncludeLegend = IncludeLegend";
_legend.IncludeLegend /*String*/  = _includelegend;
 //BA.debugLineNum = 2859;BA.debugLine="End Sub";
return "";
}
public String  _setincludemaxline(boolean _includemaxline) throws Exception{
 //BA.debugLineNum = 3267;BA.debugLine="Public Sub setIncludeMaxLine (IncludeMaxLine As Bo";
 //BA.debugLineNum = 3268;BA.debugLine="Graph.IncludeMaxLine = IncludeMaxLine";
_graph.IncludeMaxLine /*boolean*/  = _includemaxline;
 //BA.debugLineNum = 3270;BA.debugLine="End Sub";
return "";
}
public String  _setincludemeanline(boolean _includemeanline) throws Exception{
 //BA.debugLineNum = 3278;BA.debugLine="Public Sub setIncludeMeanLine (IncludeMeanLine As";
 //BA.debugLineNum = 3279;BA.debugLine="Graph.IncludeMeanLine = IncludeMeanLine";
_graph.IncludeMeanLine /*boolean*/  = _includemeanline;
 //BA.debugLineNum = 3281;BA.debugLine="End Sub";
return "";
}
public String  _setincludeminline(boolean _includeminline) throws Exception{
 //BA.debugLineNum = 3256;BA.debugLine="Public Sub setIncludeMinLine (IncludeMinLine As Bo";
 //BA.debugLineNum = 3257;BA.debugLine="Graph.IncludeMinLine = IncludeMinLine";
_graph.IncludeMinLine /*boolean*/  = _includeminline;
 //BA.debugLineNum = 3259;BA.debugLine="End Sub";
return "";
}
public String  _setincludevalues(boolean _includevalues) throws Exception{
 //BA.debugLineNum = 2867;BA.debugLine="Public Sub setIncludeValues(IncludeValues As Boole";
 //BA.debugLineNum = 2868;BA.debugLine="Graph.IncludeValues = IncludeValues";
_graph.IncludeValues /*boolean*/  = _includevalues;
 //BA.debugLineNum = 2869;BA.debugLine="End Sub";
return "";
}
public String  _setleft(int _left) throws Exception{
 //BA.debugLineNum = 2921;BA.debugLine="Public Sub setLeft(Left As Int)";
 //BA.debugLineNum = 2922;BA.debugLine="xBase.Left = Left";
_xbase.setLeft(_left);
 //BA.debugLineNum = 2923;BA.debugLine="End Sub";
return "";
}
public String  _setlegendtextsize(float _legendtextsize) throws Exception{
 //BA.debugLineNum = 3015;BA.debugLine="Public Sub setLegendTextSize(LegendTextSize As Flo";
 //BA.debugLineNum = 3016;BA.debugLine="Legend.TextSize = LegendTextSize";
_legend.TextSize /*float*/  = _legendtextsize;
 //BA.debugLineNum = 3017;BA.debugLine="Legend.TextFont = xui.CreateDefaultFont(Legend.Te";
_legend.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_legend.TextSize /*float*/ );
 //BA.debugLineNum = 3018;BA.debugLine="Texts.AutomaticTextSizes = False";
_texts.AutomaticTextSizes /*boolean*/  = __c.False;
 //BA.debugLineNum = 3019;BA.debugLine="End Sub";
return "";
}
public String  _setmaxlinecolor(int _color) throws Exception{
 //BA.debugLineNum = 3175;BA.debugLine="Public Sub setMaxLineColor(Color As Int)";
 //BA.debugLineNum = 3176;BA.debugLine="Graph.MaxLineColor = Color";
_graph.MaxLineColor /*int*/  = _color;
 //BA.debugLineNum = 3177;BA.debugLine="End Sub";
return "";
}
public String  _setmeanlinecolor(int _color) throws Exception{
 //BA.debugLineNum = 3182;BA.debugLine="Public Sub setMeanLineColor(Color As Int)";
 //BA.debugLineNum = 3183;BA.debugLine="Graph.MeanLineColor = Color";
_graph.MeanLineColor /*int*/  = _color;
 //BA.debugLineNum = 3184;BA.debugLine="End Sub";
return "";
}
public String  _setminlinecolor(int _color) throws Exception{
 //BA.debugLineNum = 3168;BA.debugLine="Public Sub setMinLineColor(Color As Int)";
 //BA.debugLineNum = 3169;BA.debugLine="Graph.MinLineColor = Color";
_graph.MinLineColor /*int*/  = _color;
 //BA.debugLineNum = 3170;BA.debugLine="End Sub";
return "";
}
public String  _setnbxintervals(int _nbxintervals) throws Exception{
 //BA.debugLineNum = 3203;BA.debugLine="Public Sub setNbXIntervals (NbXIntervals As Int)";
 //BA.debugLineNum = 3204;BA.debugLine="Scale(sX).NbIntervals = NbXIntervals";
_scale[_sx].NbIntervals /*int*/  = _nbxintervals;
 //BA.debugLineNum = 3205;BA.debugLine="End Sub";
return "";
}
public String  _setnbyintervals(int _nbyintervals) throws Exception{
 //BA.debugLineNum = 3192;BA.debugLine="Public Sub setNbYIntervals (NbYIntervals As Int)";
 //BA.debugLineNum = 3193;BA.debugLine="Scale(sY).NbIntervals = NbYIntervals";
_scale[_sy].NbIntervals /*int*/  = _nbyintervals;
 //BA.debugLineNum = 3194;BA.debugLine="End Sub";
return "";
}
public String  _setpiepercentagenbfractions(int _piepercentagenbfractions) throws Exception{
 //BA.debugLineNum = 3347;BA.debugLine="Public Sub setPiePercentageNbFractions(PiePercenta";
 //BA.debugLineNum = 3348;BA.debugLine="mPiePercentageNbFractions = Max(PiePercentageNbFr";
_mpiepercentagenbfractions = (int) (__c.Max(_piepercentagenbfractions,0));
 //BA.debugLineNum = 3349;BA.debugLine="mPiePercentageNbFractions = Min(mPiePercentageNbF";
_mpiepercentagenbfractions = (int) (__c.Min(_mpiepercentagenbfractions,2));
 //BA.debugLineNum = 3350;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(double _rotation) throws Exception{
 //BA.debugLineNum = 3235;BA.debugLine="Public Sub setRotation (Rotation As Double)";
 //BA.debugLineNum = 3236;BA.debugLine="Graph.Rotation = Rotation";
_graph.Rotation /*double*/  = _rotation;
 //BA.debugLineNum = 3237;BA.debugLine="xBase.Rotation = Graph.Rotation";
_xbase.setRotation((float) (_graph.Rotation /*double*/ ));
 //BA.debugLineNum = 3238;BA.debugLine="End Sub";
return "";
}
public String  _setscaletextcolor(int _color) throws Exception{
 //BA.debugLineNum = 3154;BA.debugLine="Public Sub setScaleTextColor(Color As Int)";
 //BA.debugLineNum = 3155;BA.debugLine="Texts.ScaleTextColor = Color";
_texts.ScaleTextColor /*int*/  = _color;
 //BA.debugLineNum = 3156;BA.debugLine="End Sub";
return "";
}
public String  _setscaletextsize(float _scaletextsize) throws Exception{
 //BA.debugLineNum = 3003;BA.debugLine="Public Sub setScaleTextSize(ScaleTextSize As Float";
 //BA.debugLineNum = 3004;BA.debugLine="Texts.ScaleTextSize = ScaleTextSize";
_texts.ScaleTextSize /*float*/  = _scaletextsize;
 //BA.debugLineNum = 3005;BA.debugLine="Texts.ScaleFont = xui.CreateDefaultFont(Texts.Sca";
_texts.ScaleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.ScaleTextSize /*float*/ );
 //BA.debugLineNum = 3006;BA.debugLine="Texts.AutomaticTextSizes = False";
_texts.AutomaticTextSizes /*boolean*/  = __c.False;
 //BA.debugLineNum = 3007;BA.debugLine="End Sub";
return "";
}
public String  _setscalevalues(String _scalevalues) throws Exception{
 //BA.debugLineNum = 3051;BA.debugLine="Public Sub setScaleValues(ScaleValues As String)";
 //BA.debugLineNum = 3052;BA.debugLine="If ScaleValues.StartsWith(\"1!\") = False Or ScaleV";
if (_scalevalues.startsWith("1!")==__c.False || _scalevalues.endsWith("!10")==__c.False) { 
 //BA.debugLineNum = 3053;BA.debugLine="Log(\"Wrong ScaleValues property\")";
__c.LogImpl("910747906","Wrong ScaleValues property",0);
 //BA.debugLineNum = 3054;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3056;BA.debugLine="Scale(sY).ScaleValues = ScaleValues";
_scale[_sy].ScaleValues /*String*/  = _scalevalues;
 //BA.debugLineNum = 3057;BA.debugLine="End Sub";
return "";
}
public String  _setscalexvalueslog(String _scalexvalueslog) throws Exception{
 //BA.debugLineNum = 3085;BA.debugLine="Public Sub setScaleXValuesLog(ScaleXValuesLog As S";
 //BA.debugLineNum = 3086;BA.debugLine="If ScaleXValuesLog.StartsWith(\"1!\") = False Or Sc";
if (_scalexvalueslog.startsWith("1!")==__c.False || _scalexvalueslog.endsWith("!10")==__c.False) { 
 //BA.debugLineNum = 3087;BA.debugLine="Log(\"Wrong ScaleXValuesLog property\")";
__c.LogImpl("911010050","Wrong ScaleXValuesLog property",0);
 //BA.debugLineNum = 3088;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3090;BA.debugLine="ScaleLog(sX).ScaleValues = ScaleXValuesLog";
_scalelog[_sx].ScaleValues /*String*/  = _scalexvalueslog;
 //BA.debugLineNum = 3091;BA.debugLine="End Sub";
return "";
}
public String  _setscaleyvalueslog(String _scaleyvalueslog) throws Exception{
 //BA.debugLineNum = 3068;BA.debugLine="Public Sub setScaleYValuesLog(ScaleYValuesLog As S";
 //BA.debugLineNum = 3069;BA.debugLine="If ScaleYValuesLog.StartsWith(\"1!\") = False Or Sc";
if (_scaleyvalueslog.startsWith("1!")==__c.False || _scaleyvalueslog.endsWith("!10")==__c.False) { 
 //BA.debugLineNum = 3070;BA.debugLine="Log(\"Wrong ScaleYValuesLog property\")";
__c.LogImpl("910878978","Wrong ScaleYValuesLog property",0);
 //BA.debugLineNum = 3071;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3073;BA.debugLine="ScaleLog(sY).ScaleValues = ScaleYValuesLog";
_scalelog[_sy].ScaleValues /*String*/  = _scaleyvalueslog;
 //BA.debugLineNum = 3074;BA.debugLine="End Sub";
return "";
}
public String  _setsubitletextcolor(int _color) throws Exception{
 //BA.debugLineNum = 3323;BA.debugLine="Public Sub setSubitleTextColor(Color As Int)";
 //BA.debugLineNum = 3324;BA.debugLine="Texts.SubtitleTextColor = Color";
_texts.SubtitleTextColor /*int*/  = _color;
 //BA.debugLineNum = 3325;BA.debugLine="End Sub";
return "";
}
public String  _setsubtitle(String _subtitle) throws Exception{
 //BA.debugLineNum = 3304;BA.debugLine="Public Sub setSubtitle(Subtitle As String)";
 //BA.debugLineNum = 3305;BA.debugLine="Graph.Subtitle = Subtitle";
_graph.Subtitle /*String*/  = _subtitle;
 //BA.debugLineNum = 3306;BA.debugLine="End Sub";
return "";
}
public String  _setsubtitletextsize(float _subtitletextsize) throws Exception{
 //BA.debugLineNum = 3314;BA.debugLine="Public Sub setSubtitleTextSize(SubtitleTextSize As";
 //BA.debugLineNum = 3315;BA.debugLine="Texts.SubtitleTextSize = SubtitleTextSize";
_texts.SubtitleTextSize /*float*/  = _subtitletextsize;
 //BA.debugLineNum = 3316;BA.debugLine="Texts.SubtitleFont = xui.CreateDefaultFont(Texts.";
_texts.SubtitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.SubtitleTextSize /*float*/ );
 //BA.debugLineNum = 3317;BA.debugLine="Texts.AutomaticTextSizes = False";
_texts.AutomaticTextSizes /*boolean*/  = __c.False;
 //BA.debugLineNum = 3318;BA.debugLine="End Sub";
return "";
}
public String  _settitle(String _title) throws Exception{
 //BA.debugLineNum = 2775;BA.debugLine="Public Sub setTitle(Title As String)";
 //BA.debugLineNum = 2776;BA.debugLine="Graph.Title = Title";
_graph.Title /*String*/  = _title;
 //BA.debugLineNum = 2777;BA.debugLine="End Sub";
return "";
}
public String  _settitletextcolor(int _color) throws Exception{
 //BA.debugLineNum = 3140;BA.debugLine="Public Sub setTitleTextColor(Color As Int)";
 //BA.debugLineNum = 3141;BA.debugLine="Texts.TitleTextColor = Color";
_texts.TitleTextColor /*int*/  = _color;
 //BA.debugLineNum = 3142;BA.debugLine="End Sub";
return "";
}
public String  _settitletextsize(float _titletextsize) throws Exception{
 //BA.debugLineNum = 2979;BA.debugLine="Public Sub setTitleTextSize(TitleTextSize As Float";
 //BA.debugLineNum = 2980;BA.debugLine="Texts.TitleTextSize = TitleTextSize";
_texts.TitleTextSize /*float*/  = _titletextsize;
 //BA.debugLineNum = 2981;BA.debugLine="Texts.TitleFont = xui.CreateDefaultFont(Texts.Tit";
_texts.TitleFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_texts.TitleTextSize /*float*/ );
 //BA.debugLineNum = 2982;BA.debugLine="Texts.AutomaticTextSizes = False";
_texts.AutomaticTextSizes /*boolean*/  = __c.False;
 //BA.debugLineNum = 2983;BA.debugLine="End Sub";
return "";
}
public String  _settop(int _top) throws Exception{
 //BA.debugLineNum = 2930;BA.debugLine="Public Sub setTop(Top As Int)";
 //BA.debugLineNum = 2931;BA.debugLine="xBase.Top = Top";
_xbase.setTop(_top);
 //BA.debugLineNum = 2932;BA.debugLine="End Sub";
return "";
}
public String  _setvaluestextcolor(int _color) throws Exception{
 //BA.debugLineNum = 3161;BA.debugLine="Public Sub setValuesTextColor(Color As Int)";
 //BA.debugLineNum = 3162;BA.debugLine="Values.TextColor = Color";
_values.TextColor /*int*/  = _color;
 //BA.debugLineNum = 3163;BA.debugLine="End Sub";
return "";
}
public String  _setvaluestextsize(float _legendtextsize) throws Exception{
 //BA.debugLineNum = 3027;BA.debugLine="Public Sub setValuesTextSize(LegendTextSize As Flo";
 //BA.debugLineNum = 3028;BA.debugLine="Values.TextSize = LegendTextSize";
_values.TextSize /*float*/  = _legendtextsize;
 //BA.debugLineNum = 3029;BA.debugLine="Values.TextFont = xui.CreateDefaultFont(Values.Te";
_values.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xui.CreateDefaultFont(_values.TextSize /*float*/ );
 //BA.debugLineNum = 3030;BA.debugLine="Texts.AutomaticTextSizes = False";
_texts.AutomaticTextSizes /*boolean*/  = __c.False;
 //BA.debugLineNum = 3031;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 2959;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 2960;BA.debugLine="xBase.Visible = Visible";
_xbase.setVisible(_visible);
 //BA.debugLineNum = 2961;BA.debugLine="End Sub";
return "";
}
public String  _setwidth(int _width) throws Exception{
 //BA.debugLineNum = 2939;BA.debugLine="Public Sub setWidth(Width As Int)";
 //BA.debugLineNum = 2940;BA.debugLine="xBase.Width = Width";
_xbase.setWidth(_width);
 //BA.debugLineNum = 2941;BA.debugLine="Base_Resize(Width, xBase.Height)";
_base_resize(_width,_xbase.getHeight());
 //BA.debugLineNum = 2942;BA.debugLine="End Sub";
return "";
}
public String  _setxaxisname(String _xaxisname) throws Exception{
 //BA.debugLineNum = 2784;BA.debugLine="Public Sub setXAxisName(XAxisName As String)";
 //BA.debugLineNum = 2785;BA.debugLine="Graph.XAxisName = XAxisName";
_graph.XAxisName /*String*/  = _xaxisname;
 //BA.debugLineNum = 2786;BA.debugLine="End Sub";
return "";
}
public String  _setxmaxvalue(double _maxvalue) throws Exception{
 //BA.debugLineNum = 3387;BA.debugLine="Public Sub setXMaxValue(MaxValue As Double)";
 //BA.debugLineNum = 3388;BA.debugLine="Scale(sX).MaxManu = MaxValue";
_scale[_sx].MaxManu /*double*/  = _maxvalue;
 //BA.debugLineNum = 3389;BA.debugLine="Scale(sX).MaxVal = MaxValue";
_scale[_sx].MaxVal /*double*/  = _maxvalue;
 //BA.debugLineNum = 3390;BA.debugLine="End Sub";
return "";
}
public String  _setxminvalue(double _minvalue) throws Exception{
 //BA.debugLineNum = 3377;BA.debugLine="Public Sub setXMinValue(MinValue As Double)";
 //BA.debugLineNum = 3378;BA.debugLine="Scale(sX).MinManu = MinValue";
_scale[_sx].MinManu /*double*/  = _minvalue;
 //BA.debugLineNum = 3379;BA.debugLine="Scale(sX).MinVal = MinValue";
_scale[_sx].MinVal /*double*/  = _minvalue;
 //BA.debugLineNum = 3380;BA.debugLine="End Sub";
return "";
}
public String  _setxscalelogarithmic(boolean _xscalelogarithmic) throws Exception{
 //BA.debugLineNum = 3368;BA.debugLine="Public Sub setXScaleLogarithmic(XScaleLogarithmic";
 //BA.debugLineNum = 3369;BA.debugLine="Scale(sX).Logarithmic = XScaleLogarithmic";
_scale[_sx].Logarithmic /*boolean*/  = _xscalelogarithmic;
 //BA.debugLineNum = 3370;BA.debugLine="End Sub";
return "";
}
public String  _setxscalemaxvalue(double _xscalemaxvalue) throws Exception{
 //BA.debugLineNum = 2831;BA.debugLine="Public Sub setXScaleMaxValue(XScaleMaxValue As Dou";
 //BA.debugLineNum = 2832;BA.debugLine="Scale(sX).MaxManu = XScaleMaxValue";
_scale[_sx].MaxManu /*double*/  = _xscalemaxvalue;
 //BA.debugLineNum = 2833;BA.debugLine="Scale(sX).MaxVal = XScaleMaxValue";
_scale[_sx].MaxVal /*double*/  = _xscalemaxvalue;
 //BA.debugLineNum = 2834;BA.debugLine="Scale(sX).Automatic = False";
_scale[_sx].Automatic /*boolean*/  = __c.False;
 //BA.debugLineNum = 2835;BA.debugLine="End Sub";
return "";
}
public String  _setxscaleminvalue(double _xscaleminvalue) throws Exception{
 //BA.debugLineNum = 2845;BA.debugLine="Public Sub setXScaleMinValue(XScaleMinValue As Dou";
 //BA.debugLineNum = 2846;BA.debugLine="Scale(sX).MinManu = XScaleMinValue";
_scale[_sx].MinManu /*double*/  = _xscaleminvalue;
 //BA.debugLineNum = 2847;BA.debugLine="Scale(sX).MinVal = XScaleMinValue";
_scale[_sx].MinVal /*double*/  = _xscaleminvalue;
 //BA.debugLineNum = 2848;BA.debugLine="Scale(sX).Automatic = False";
_scale[_sx].Automatic /*boolean*/  = __c.False;
 //BA.debugLineNum = 2849;BA.debugLine="End Sub";
return "";
}
public String  _setxscaletextorientation(String _xscaletextorientation) throws Exception{
 //BA.debugLineNum = 2898;BA.debugLine="Public Sub setXScaleTextOrientation(XScaleTextOrie";
 //BA.debugLineNum = 2899;BA.debugLine="Graph.XScaleTextOrientation = XScaleTextOrientati";
_graph.XScaleTextOrientation /*String*/  = _xscaletextorientation;
 //BA.debugLineNum = 2900;BA.debugLine="End Sub";
return "";
}
public String  _setyaxisname(String _yaxisname) throws Exception{
 //BA.debugLineNum = 2793;BA.debugLine="Public Sub setYAxisName(YAxisName As String)";
 //BA.debugLineNum = 2794;BA.debugLine="Graph.YAxisName = YAxisName";
_graph.YAxisName /*String*/  = _yaxisname;
 //BA.debugLineNum = 2795;BA.debugLine="End Sub";
return "";
}
public String  _setymaxvalue(double _maxvalue) throws Exception{
 //BA.debugLineNum = 3407;BA.debugLine="Public Sub setYMaxValue(MaxValue As Double)";
 //BA.debugLineNum = 3408;BA.debugLine="Scale(sY).MaxManu = MaxValue";
_scale[_sy].MaxManu /*double*/  = _maxvalue;
 //BA.debugLineNum = 3409;BA.debugLine="Scale(sY).MaxVal = MaxValue";
_scale[_sy].MaxVal /*double*/  = _maxvalue;
 //BA.debugLineNum = 3410;BA.debugLine="End Sub";
return "";
}
public String  _setyminvalue(double _minvalue) throws Exception{
 //BA.debugLineNum = 3397;BA.debugLine="Public Sub setYMinValue(MinValue As Double)";
 //BA.debugLineNum = 3398;BA.debugLine="Scale(sY).MinManu = MinValue";
_scale[_sy].MinManu /*double*/  = _minvalue;
 //BA.debugLineNum = 3399;BA.debugLine="Scale(sY).MinVal = MinValue";
_scale[_sy].MinVal /*double*/  = _minvalue;
 //BA.debugLineNum = 3400;BA.debugLine="End Sub";
return "";
}
public String  _setyscalelogaritmic(boolean _yscalelogarithmic) throws Exception{
 //BA.debugLineNum = 3358;BA.debugLine="Public Sub setYScaleLogaritmic(YScaleLogarithmic A";
 //BA.debugLineNum = 3359;BA.debugLine="Scale(sY).Logarithmic = YScaleLogarithmic";
_scale[_sy].Logarithmic /*boolean*/  = _yscalelogarithmic;
 //BA.debugLineNum = 3360;BA.debugLine="End Sub";
return "";
}
public String  _setyscalemaxvalue(double _yscalemaxvalue) throws Exception{
 //BA.debugLineNum = 2804;BA.debugLine="Public Sub setYScaleMaxValue(YScaleMaxValue As Dou";
 //BA.debugLineNum = 2805;BA.debugLine="Scale(sY).MaxManu = YScaleMaxValue";
_scale[_sy].MaxManu /*double*/  = _yscalemaxvalue;
 //BA.debugLineNum = 2806;BA.debugLine="Scale(sY).MaxVal = YScaleMaxValue";
_scale[_sy].MaxVal /*double*/  = _yscalemaxvalue;
 //BA.debugLineNum = 2807;BA.debugLine="Scale(sY).Automatic = False";
_scale[_sy].Automatic /*boolean*/  = __c.False;
 //BA.debugLineNum = 2808;BA.debugLine="End Sub";
return "";
}
public String  _setyscaleminvalue(double _yscaleminvalue) throws Exception{
 //BA.debugLineNum = 2817;BA.debugLine="Public Sub setYScaleMinValue(YScaleMinValue As Dou";
 //BA.debugLineNum = 2818;BA.debugLine="Scale(sY).MinManu = YScaleMinValue";
_scale[_sy].MinManu /*double*/  = _yscaleminvalue;
 //BA.debugLineNum = 2819;BA.debugLine="Scale(sY).MinVal = YScaleMinValue";
_scale[_sy].MinVal /*double*/  = _yscaleminvalue;
 //BA.debugLineNum = 2820;BA.debugLine="Scale(sY).Automatic = False";
_scale[_sy].Automatic /*boolean*/  = __c.False;
 //BA.debugLineNum = 2821;BA.debugLine="End Sub";
return "";
}
public String  _setyzeroaxis(boolean _yzeroaxis) throws Exception{
 //BA.debugLineNum = 3214;BA.debugLine="Public Sub setYZeroAxis (YZeroAxis As Boolean)";
 //BA.debugLineNum = 3215;BA.debugLine="Scale(sY).YZeroAxis = YZeroAxis";
_scale[_sy].YZeroAxis /*boolean*/  = _yzeroaxis;
 //BA.debugLineNum = 3216;BA.debugLine="End Sub";
return "";
}
public String  _xpnlcursor_touch(int _action,float _x,float _y) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Private Sub xpnlCursor_Touch (Action As Int, X As";
 //BA.debugLineNum = 383;BA.debugLine="If Graph.ChartType = \"YX_CHART\" Then";
if ((_graph.ChartType /*String*/ ).equals("YX_CHART")) { 
 //BA.debugLineNum = 384;BA.debugLine="If (Action = 0 Or Action = 2) And X > Graph.Left";
if ((_action==0 || _action==2) && _x>_graph.Left /*int*/  && _x<_graph.Right /*int*/  && _y>_graph.Top /*int*/  && _y<_graph.Bottom /*int*/  && _xui.SubExists(ba,_mcallback,_meventname+"_Touch",(int) (2))) { 
 //BA.debugLineNum = 385;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Touc";
if (_xui.SubExists(ba,_mcallback,_meventname+"_Touch",(int) (2))) { 
 //BA.debugLineNum = 386;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Touc";
__c.CallSubDelayed3(ba,_mcallback,_meventname+"_Touch",(Object)(_scale[_sx].MinVal /*double*/ +(_x-_graph.Left /*int*/ )/(double)_scale[_sx].Scale /*double*/ ),(Object)(_scale[_sy].MaxVal /*double*/ -(_y-_graph.Top /*int*/ )/(double)_scale[_sy].Scale /*double*/ ));
 };
 };
 };
 //BA.debugLineNum = 392;BA.debugLine="If Values.Show = False Or Graph.ChartType = \"PIE\"";
if (_values.Show /*boolean*/ ==__c.False || (_graph.ChartType /*String*/ ).equals("PIE") || (_graph.ChartType /*String*/ ).equals("YX_CHART")) { 
 //BA.debugLineNum = 394;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 397;BA.debugLine="Select Action";
switch (_action) {
case 0: {
 //BA.debugLineNum = 399;BA.debugLine="If X > Graph.Left And X < Graph.Right And Y > G";
if (_x>_graph.Left /*int*/  && _x<_graph.Right /*int*/  && _y>_graph.Top /*int*/  && _y<_graph.Bottom /*int*/ ) { 
 //BA.debugLineNum = 400;BA.debugLine="DrawItemValues(X, Y)";
_drawitemvalues((int) (_x),(int) (_y));
 //BA.debugLineNum = 401;BA.debugLine="xpnlValues.Visible = True";
_xpnlvalues.setVisible(__c.True);
 };
 break; }
case 1: {
 //BA.debugLineNum = 404;BA.debugLine="xpnlValues.Visible = False";
_xpnlvalues.setVisible(__c.False);
 //BA.debugLineNum = 405;BA.debugLine="xcvsCursor.ClearRect(Values.rectCursor)";
_xcvscursor.ClearRect(_values.rectCursor /*anywheresoftware.b4a.objects.B4XCanvas.B4XRect*/ );
 //BA.debugLineNum = 406;BA.debugLine="xcvsCursor.Invalidate";
_xcvscursor.Invalidate();
 break; }
case 2: {
 //BA.debugLineNum = 408;BA.debugLine="If xpnlValues.Visible = False Then";
if (_xpnlvalues.getVisible()==__c.False) { 
 //BA.debugLineNum = 409;BA.debugLine="xpnlValues.Visible = True";
_xpnlvalues.setVisible(__c.True);
 };
 //BA.debugLineNum = 412;BA.debugLine="If X > Graph.Left And X < Graph.Right And Y > G";
if (_x>_graph.Left /*int*/  && _x<_graph.Right /*int*/  && _y>_graph.Top /*int*/  && _y<_graph.Bottom /*int*/ ) { 
 //BA.debugLineNum = 413;BA.debugLine="DrawItemValues(X, Y)";
_drawitemvalues((int) (_x),(int) (_y));
 };
 break; }
}
;
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
