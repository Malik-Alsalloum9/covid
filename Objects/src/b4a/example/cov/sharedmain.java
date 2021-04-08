package b4a.example.cov;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class sharedmain extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.cov.sharedmain");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.cov.sharedmain.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.cov.b4xtable _b4xtable1 = null;
public b4a.example.cov.xchart _xchart1 = null;
public b4a.example.cov.b4xtable._b4xtablecolumn _countrycolumn = null;
public b4a.example.cov.b4xtable._b4xtablecolumn _graphcolumn = null;
public b4a.example.cov.csvparser _parser = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.cov.b4xorderedmap _countriesdata = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnrefresh = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbldate = null;
public long _lastmaxdate = 0L;
public b4a.example.cov.b4xswitch _b4xswitch1 = null;
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
public static class _countrydatapoint{
public boolean IsInitialized;
public long Date;
public int TotalCases;
public int TotalDeaths;
public String Country;
public void Initialize() {
IsInitialized = true;
Date = 0L;
TotalCases = 0;
TotalDeaths = 0;
Country = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addpointstochart(anywheresoftware.b4a.objects.collections.List _points,b4a.example.cov.xchart _chart) throws Exception{
b4a.example.cov.sharedmain._countrydatapoint _cdp = null;
 //BA.debugLineNum = 115;BA.debugLine="Sub AddPointsToChart (Points As List, Chart As xCh";
 //BA.debugLineNum = 116;BA.debugLine="For Each cdp As CountryDataPoint In Points";
{
final anywheresoftware.b4a.BA.IterableList group1 = _points;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_cdp = (b4a.example.cov.sharedmain._countrydatapoint)(group1.Get(index1));
 //BA.debugLineNum = 117;BA.debugLine="Chart.AddLineMultiplePoints(DateTime.Date(cdp.Da";
_chart._addlinemultiplepoints /*String*/ (__c.DateTime.Date(_cdp.Date /*long*/ ),new double[]{_cdp.TotalCases /*int*/ ,_cdp.TotalDeaths /*int*/ },__c.False);
 }
};
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _b4xtable1_dataupdated() throws Exception{
int _i = 0;
long _rowid = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _chartparent = null;
b4a.example.cov.xchart _chart = null;
String _country = "";
 //BA.debugLineNum = 27;BA.debugLine="Sub B4XTable1_DataUpdated";
 //BA.debugLineNum = 28;BA.debugLine="For i = 0 To B4XTable1.VisibleRowIds.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_b4xtable1._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 29;BA.debugLine="Dim RowId As Long = B4XTable1.VisibleRowIds.Get(";
_rowid = BA.ObjectToLongNumber(_b4xtable1._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 //BA.debugLineNum = 30;BA.debugLine="Dim pnl As B4XView = GraphColumn.CellsLayouts.Ge";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl.setObject((java.lang.Object)(_graphcolumn.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_i+1))));
 //BA.debugLineNum = 31;BA.debugLine="Dim ChartParent As B4XView = pnl.GetView(1)";
_chartparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chartparent = _pnl.GetView((int) (1));
 //BA.debugLineNum = 32;BA.debugLine="If RowId > 0 Then";
if (_rowid>0) { 
 //BA.debugLineNum = 33;BA.debugLine="ChartParent.SetLayoutAnimated(0, 0, 0, pnl.Widt";
_chartparent.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_pnl.getWidth(),_pnl.getHeight());
 //BA.debugLineNum = 34;BA.debugLine="ChartParent.Visible = True";
_chartparent.setVisible(__c.True);
 //BA.debugLineNum = 35;BA.debugLine="Dim Chart As xChart = ChartParent.Tag";
_chart = (b4a.example.cov.xchart)(_chartparent.getTag());
 //BA.debugLineNum = 37;BA.debugLine="If xui.IsB4A Then Chart.Base_Resize(ChartParent";
if (_xui.getIsB4A()) { 
_chart._base_resize /*void*/ (_chartparent.getWidth(),_chartparent.getHeight());};
 //BA.debugLineNum = 38;BA.debugLine="Chart.ClearData";
_chart._cleardata /*String*/ ();
 //BA.debugLineNum = 39;BA.debugLine="Chart.AddLine(\"Cases\", xui.Color_Blue)";
_chart._addline /*String*/ ("Cases",_xui.Color_Blue);
 //BA.debugLineNum = 40;BA.debugLine="Chart.AddLine(\"Deaths\", xui.Color_Red)";
_chart._addline /*String*/ ("Deaths",_xui.Color_Red);
 //BA.debugLineNum = 41;BA.debugLine="Dim Country As String = B4XTable1.GetRow(RowId)";
_country = BA.ObjectToString(_b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (_rowid).Get((Object)(_countrycolumn.Id /*String*/ )));
 //BA.debugLineNum = 42;BA.debugLine="AddPointsToChart(CountriesData.Get(Country), Ch";
_addpointstochart((anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_countriesdata._get /*Object*/ ((Object)(_country)))),_chart);
 //BA.debugLineNum = 43;BA.debugLine="Chart.DrawChart";
_chart._drawchart /*String*/ ();
 }else {
 //BA.debugLineNum = 45;BA.debugLine="ChartParent.Visible = False";
_chartparent.setVisible(__c.False);
 };
 }
};
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _btnrefresh_click() throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub btnRefresh_Click";
 //BA.debugLineNum = 136;BA.debugLine="DownloadAndLoad";
_downloadandload();
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private B4XTable1 As B4XTable";
_b4xtable1 = new b4a.example.cov.b4xtable();
 //BA.debugLineNum = 4;BA.debugLine="Private xChart1 As xChart";
_xchart1 = new b4a.example.cov.xchart();
 //BA.debugLineNum = 5;BA.debugLine="Private CountryColumn, GraphColumn As B4XTableCol";
_countrycolumn = new b4a.example.cov.b4xtable._b4xtablecolumn();
_graphcolumn = new b4a.example.cov.b4xtable._b4xtablecolumn();
 //BA.debugLineNum = 6;BA.debugLine="Private parser As CSVParser";
_parser = new b4a.example.cov.csvparser();
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 8;BA.debugLine="Private CountriesData As B4XOrderedMap";
_countriesdata = new b4a.example.cov.b4xorderedmap();
 //BA.debugLineNum = 9;BA.debugLine="Type CountryDataPoint (Date As Long, TotalCases A";
;
 //BA.debugLineNum = 10;BA.debugLine="Private btnRefresh As B4XView";
_btnrefresh = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private lblDate As B4XView";
_lbldate = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private LastMaxDate As Long";
_lastmaxdate = 0L;
 //BA.debugLineNum = 13;BA.debugLine="Private B4XSwitch1 As B4XSwitch";
_b4xswitch1 = new b4a.example.cov.b4xswitch();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public b4a.example.cov.sharedmain._countrydatapoint  _createcountrydatapoint(long _date,int _totalcases,int _totaldeaths,String _country) throws Exception{
b4a.example.cov.sharedmain._countrydatapoint _t1 = null;
 //BA.debugLineNum = 125;BA.debugLine="Public Sub CreateCountryDataPoint (Date As Long, T";
 //BA.debugLineNum = 126;BA.debugLine="Dim t1 As CountryDataPoint";
_t1 = new b4a.example.cov.sharedmain._countrydatapoint();
 //BA.debugLineNum = 127;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 128;BA.debugLine="t1.Date = Date";
_t1.Date /*long*/  = _date;
 //BA.debugLineNum = 129;BA.debugLine="t1.TotalCases = TotalCases";
_t1.TotalCases /*int*/  = _totalcases;
 //BA.debugLineNum = 130;BA.debugLine="t1.TotalDeaths = TotalDeaths";
_t1.TotalDeaths /*int*/  = _totaldeaths;
 //BA.debugLineNum = 131;BA.debugLine="t1.Country = Country";
_t1.Country /*String*/  = _country;
 //BA.debugLineNum = 132;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public void  _downloadandload() throws Exception{
ResumableSub_DownloadAndLoad rsub = new ResumableSub_DownloadAndLoad(this);
rsub.resume(ba, null);
}
public static class ResumableSub_DownloadAndLoad extends BA.ResumableSub {
public ResumableSub_DownloadAndLoad(b4a.example.cov.sharedmain parent) {
this.parent = parent;
}
b4a.example.cov.sharedmain parent;
b4a.example.cov.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 140;BA.debugLine="btnRefresh.Enabled = False";
parent._btnrefresh.setEnabled(parent.__c.False);
 //BA.debugLineNum = 141;BA.debugLine="lblDate.Text = \"Loading...\"";
parent._lbldate.setText(BA.ObjectToCharSequence("Loading..."));
 //BA.debugLineNum = 142;BA.debugLine="Dim j As HttpJob";
_j = new b4a.example.cov.httpjob();
 //BA.debugLineNum = 143;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 144;BA.debugLine="j.Download(\"https://covid.ourworldindata.org/data";
_j._download /*String*/ ("https://covid.ourworldindata.org/data/ecdc/full_data.csv");
 //BA.debugLineNum = 145;BA.debugLine="Wait For (j) JobDone (j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4a.example.cov.httpjob) result[0];
;
 //BA.debugLineNum = 146;BA.debugLine="lblDate.Text = \"\"";
parent._lbldate.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 147;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 148;BA.debugLine="LoadData(j.GetString)";
parent._loaddata(_j._getstring /*String*/ ());
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 150;BA.debugLine="xui.MsgboxAsync(\"Error downloading data\", \"\")";
parent._xui.MsgboxAsync(ba,BA.ObjectToCharSequence("Error downloading data"),BA.ObjectToCharSequence(""));
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 152;BA.debugLine="btnRefresh.Enabled = True";
parent._btnrefresh.setEnabled(parent.__c.True);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example.cov.httpjob _j) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
 //BA.debugLineNum = 19;BA.debugLine="parser.Initialize";
_parser._initialize /*String*/ (ba);
 //BA.debugLineNum = 20;BA.debugLine="Parent.LoadLayout(\"graph\")";
_parent.LoadLayout("graph",ba);
 //BA.debugLineNum = 21;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 22;BA.debugLine="CountriesData.Initialize";
_countriesdata._initialize /*String*/ (ba);
 //BA.debugLineNum = 23;BA.debugLine="LoadData(File.ReadString(File.DirAssets, \"full_da";
_loaddata(__c.File.ReadString(__c.File.getDirAssets(),"full_data.csv"));
 //BA.debugLineNum = 24;BA.debugLine="DownloadAndLoad";
_downloadandload();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public String  _loaddata(String _csv) throws Exception{
anywheresoftware.b4a.objects.collections.List _tabledata = null;
 //BA.debugLineNum = 68;BA.debugLine="Sub LoadData (csv As String)";
 //BA.debugLineNum = 69;BA.debugLine="Dim TableData As List";
_tabledata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 70;BA.debugLine="TableData.Initialize";
_tabledata.Initialize();
 //BA.debugLineNum = 71;BA.debugLine="If ReadCountriesData(csv, TableData) = False Then";
if (_readcountriesdata(_csv,_tabledata)==__c.False) { 
 //BA.debugLineNum = 72;BA.debugLine="Log(\"No new data\")";
__c.LogImpl("339387140","No new data",0);
 //BA.debugLineNum = 73;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 75;BA.debugLine="PrepareTable";
_preparetable();
 //BA.debugLineNum = 76;BA.debugLine="B4XTable1.SetData(TableData)";
_b4xtable1._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_tabledata);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _preparetable() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 51;BA.debugLine="Sub PrepareTable";
 //BA.debugLineNum = 52;BA.debugLine="B4XTable1.Clear";
_b4xtable1._clear /*void*/ ();
 //BA.debugLineNum = 53;BA.debugLine="CountryColumn = B4XTable1.AddColumn(\"Country\", B4";
_countrycolumn = _b4xtable1._addcolumn /*b4a.example.cov.b4xtable._b4xtablecolumn*/ ("Country",_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 54;BA.debugLine="CountryColumn.Width = 100dip";
_countrycolumn.Width /*int*/  = __c.DipToCurrent((int) (100));
 //BA.debugLineNum = 55;BA.debugLine="GraphColumn = B4XTable1.AddColumn(\"Graph\", B4XTab";
_graphcolumn = _b4xtable1._addcolumn /*b4a.example.cov.b4xtable._b4xtablecolumn*/ ("Graph",_b4xtable1._column_type_void /*int*/ );
 //BA.debugLineNum = 56;BA.debugLine="B4XTable1.MaximumRowsPerPage = 10";
_b4xtable1._maximumrowsperpage /*int*/  = (int) (10);
 //BA.debugLineNum = 57;BA.debugLine="B4XTable1.BuildLayoutsCache(B4XTable1.MaximumRows";
_b4xtable1._buildlayoutscache /*String*/ (_b4xtable1._maximumrowsperpage /*int*/ );
 //BA.debugLineNum = 58;BA.debugLine="B4XTable1.RowHeight = 150dip";
_b4xtable1._rowheight /*int*/  = __c.DipToCurrent((int) (150));
 //BA.debugLineNum = 59;BA.debugLine="For i = 1 To B4XTable1.MaximumRowsPerPage";
{
final int step8 = 1;
final int limit8 = _b4xtable1._maximumrowsperpage /*int*/ ;
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 60;BA.debugLine="Dim pnl As B4XView = GraphColumn.CellsLayouts.Ge";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl.setObject((java.lang.Object)(_graphcolumn.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
 //BA.debugLineNum = 61;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 62;BA.debugLine="pnl.AddView(p, 0, 0, Max(10dip, pnl.Width), Max(";
_pnl.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),(int) (__c.Max(__c.DipToCurrent((int) (10)),_pnl.getWidth())),(int) (__c.Max(__c.DipToCurrent((int) (10)),_pnl.getHeight())));
 //BA.debugLineNum = 63;BA.debugLine="p.LoadLayout(\"Chart\")";
_p.LoadLayout("Chart",ba);
 //BA.debugLineNum = 64;BA.debugLine="p.Tag = xChart1";
_p.setTag((Object)(_xchart1));
 }
};
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public boolean  _readcountriesdata(String _csv,anywheresoftware.b4a.objects.collections.List _tabledata) throws Exception{
anywheresoftware.b4a.objects.collections.List _data = null;
String _currentcountry = "";
b4a.example.cov.b4xorderedmap _newdata = null;
long _maxdate = 0L;
String[] _row = null;
String _country = "";
anywheresoftware.b4a.objects.collections.List _countrydatapoints = null;
long _date = 0L;
String _c = "";
 //BA.debugLineNum = 80;BA.debugLine="Sub ReadCountriesData (csv As String, TableData As";
 //BA.debugLineNum = 81;BA.debugLine="Log(\"Read countries data\")";
__c.LogImpl("339452673","Read countries data",0);
 //BA.debugLineNum = 82;BA.debugLine="Dim Data As List = parser.Parse(csv, \",\", True)";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = _parser._parse /*anywheresoftware.b4a.objects.collections.List*/ (_csv,",",__c.True);
 //BA.debugLineNum = 83;BA.debugLine="Dim CurrentCountry As String";
_currentcountry = "";
 //BA.debugLineNum = 84;BA.debugLine="Dim NewData As B4XOrderedMap";
_newdata = new b4a.example.cov.b4xorderedmap();
 //BA.debugLineNum = 85;BA.debugLine="NewData.Initialize";
_newdata._initialize /*String*/ (ba);
 //BA.debugLineNum = 86;BA.debugLine="Dim MaxDate As Long";
_maxdate = 0L;
 //BA.debugLineNum = 87;BA.debugLine="For Each row() As String In Data";
{
final anywheresoftware.b4a.BA.IterableList group7 = _data;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_row = (String[])(group7.Get(index7));
 //BA.debugLineNum = 88;BA.debugLine="Dim Country As String = row(1)";
_country = _row[(int) (1)];
 //BA.debugLineNum = 89;BA.debugLine="If row(4) = \"\" Then row(4) = \"0\"";
if ((_row[(int) (4)]).equals("")) { 
_row[(int) (4)] = "0";};
 //BA.debugLineNum = 90;BA.debugLine="If row(5) = \"\" Then row(5) = \"0\"";
if ((_row[(int) (5)]).equals("")) { 
_row[(int) (5)] = "0";};
 //BA.debugLineNum = 91;BA.debugLine="If Country <> CurrentCountry Then";
if ((_country).equals(_currentcountry) == false) { 
 //BA.debugLineNum = 92;BA.debugLine="CurrentCountry = Country";
_currentcountry = _country;
 //BA.debugLineNum = 93;BA.debugLine="Dim CountryDataPoints As List";
_countrydatapoints = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 94;BA.debugLine="CountryDataPoints.Initialize";
_countrydatapoints.Initialize();
 //BA.debugLineNum = 95;BA.debugLine="NewData.Put(CurrentCountry, CountryDataPoints)";
_newdata._put /*String*/ ((Object)(_currentcountry),(Object)(_countrydatapoints.getObject()));
 };
 //BA.debugLineNum = 97;BA.debugLine="Dim Date As Long = DateTime.DateParse(row(0))";
_date = __c.DateTime.DateParse(_row[(int) (0)]);
 //BA.debugLineNum = 98;BA.debugLine="MaxDate = Max(MaxDate, Date)";
_maxdate = (long) (__c.Max(_maxdate,_date));
 //BA.debugLineNum = 99;BA.debugLine="CountryDataPoints.Add(CreateCountryDataPoint(Dat";
_countrydatapoints.Add((Object)(_createcountrydatapoint(_date,(int)(Double.parseDouble(_row[(int) (4)])),(int)(Double.parseDouble(_row[(int) (5)])),_country)));
 }
};
 //BA.debugLineNum = 101;BA.debugLine="NewData.Keys.Sort(True)";
_newdata._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ().Sort(__c.True);
 //BA.debugLineNum = 102;BA.debugLine="For Each c As String In NewData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group22 = _newdata._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_c = BA.ObjectToString(group22.Get(index22));
 //BA.debugLineNum = 103;BA.debugLine="TableData.Add(Array(c))";
_tabledata.Add((Object)(new Object[]{(Object)(_c)}));
 }
};
 //BA.debugLineNum = 105;BA.debugLine="lblDate.Text = $\"Dataset date: $date{MaxDate}\"$";
_lbldate.setText(BA.ObjectToCharSequence(("Dataset date: "+__c.SmartStringFormatter("date",(Object)(_maxdate))+"")));
 //BA.debugLineNum = 106;BA.debugLine="If LastMaxDate <> MaxDate Then";
if (_lastmaxdate!=_maxdate) { 
 //BA.debugLineNum = 107;BA.debugLine="LastMaxDate = MaxDate";
_lastmaxdate = _maxdate;
 //BA.debugLineNum = 108;BA.debugLine="CountriesData = NewData";
_countriesdata = _newdata;
 //BA.debugLineNum = 109;BA.debugLine="Return True";
if (true) return __c.True;
 }else {
 //BA.debugLineNum = 111;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return false;
}
public String  _resize() throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Public Sub Resize";
 //BA.debugLineNum = 122;BA.debugLine="B4XTable1_DataUpdated";
_b4xtable1_dataupdated();
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
