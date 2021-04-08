package b4a.example.cov;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class csvparser extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.cov.csvparser");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.cov.csvparser.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public int _currentindex = 0;
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private CurrentIndex As Int";
_currentindex = 0;
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public String  _generatestring(anywheresoftware.b4a.objects.collections.List _table,String _separatorchar) throws Exception{
String _eol = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String[] _row = null;
int _i = 0;
boolean _wrap = false;
String _word = "";
 //BA.debugLineNum = 10;BA.debugLine="Public Sub GenerateString (Table As List, Separato";
 //BA.debugLineNum = 11;BA.debugLine="Dim eol As String = Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (10)));
 //BA.debugLineNum = 12;BA.debugLine="If Table.Size = 0 Then Return \"\"";
if (_table.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 13;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 14;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="For Each row() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group5 = _table;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = (String[])(group5.Get(index5));
 //BA.debugLineNum = 16;BA.debugLine="For i = 0 To row.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_row.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 17;BA.debugLine="Dim Wrap As Boolean";
_wrap = false;
 //BA.debugLineNum = 18;BA.debugLine="Dim word As String = row(i)";
_word = _row[_i];
 //BA.debugLineNum = 19;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = Tru";
if (_word.contains(_separatorchar)) { 
_wrap = __c.True;};
 //BA.debugLineNum = 20;BA.debugLine="If word.Contains(QUOTE) Then";
if (_word.contains(__c.QUOTE)) { 
 //BA.debugLineNum = 21;BA.debugLine="Wrap = True";
_wrap = __c.True;
 //BA.debugLineNum = 22;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
_word = _word.replace(__c.QUOTE,("\"\""));
 };
 //BA.debugLineNum = 24;BA.debugLine="If Wrap Then";
if (_wrap) { 
 //BA.debugLineNum = 25;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
_sb.Append(__c.QUOTE).Append(_word).Append(__c.QUOTE);
 }else {
 //BA.debugLineNum = 27;BA.debugLine="sb.Append(word)";
_sb.Append(_word);
 };
 //BA.debugLineNum = 29;BA.debugLine="sb.Append(SeparatorChar)";
_sb.Append(_separatorchar);
 }
};
 //BA.debugLineNum = 31;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
 //BA.debugLineNum = 32;BA.debugLine="sb.Append(eol)";
_sb.Append(_eol);
 }
};
 //BA.debugLineNum = 34;BA.debugLine="sb.Remove(sb.Length - eol.Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-_eol.length()),_sb.getLength());
 //BA.debugLineNum = 35;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _parse(String _input,String _separatorchar,boolean _skipfirstrow) throws Exception{
anywheresoftware.b4a.objects.collections.List _result = null;
int _count = 0;
String[] _row = null;
 //BA.debugLineNum = 38;BA.debugLine="Public Sub Parse (Input As String, SeparatorChar A";
 //BA.debugLineNum = 39;BA.debugLine="SeparatorChar = SeparatorChar.CharAt(0)";
_separatorchar = BA.ObjectToString(_separatorchar.charAt((int) (0)));
 //BA.debugLineNum = 40;BA.debugLine="Dim Result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 41;BA.debugLine="Result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 42;BA.debugLine="If Input = \"\" Then Return Result";
if ((_input).equals("")) { 
if (true) return _result;};
 //BA.debugLineNum = 43;BA.debugLine="CurrentIndex = 0";
_currentindex = (int) (0);
 //BA.debugLineNum = 44;BA.debugLine="Dim count As Int = ReadLine(Input, Null, True, Se";
_count = _readline(_input,(String[])(__c.Null),__c.True,_separatorchar);
 //BA.debugLineNum = 45;BA.debugLine="If SkipFirstRow = False Then CurrentIndex = 0";
if (_skipfirstrow==__c.False) { 
_currentindex = (int) (0);};
 //BA.debugLineNum = 46;BA.debugLine="Do While CurrentIndex < Input.Length";
while (_currentindex<_input.length()) {
 //BA.debugLineNum = 47;BA.debugLine="Dim row(count) As String";
_row = new String[_count];
java.util.Arrays.fill(_row,"");
 //BA.debugLineNum = 48;BA.debugLine="ReadLine(Input, row, False, SeparatorChar)";
_readline(_input,_row,__c.False,_separatorchar);
 //BA.debugLineNum = 49;BA.debugLine="Result.Add(row)";
_result.Add((Object)(_row));
 }
;
 //BA.debugLineNum = 51;BA.debugLine="Return Result";
if (true) return _result;
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public int  _readline(String _input,String[] _row,boolean _justcount,String _sep) throws Exception{
boolean _insidequotes = false;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _count = 0;
String _c = "";
 //BA.debugLineNum = 54;BA.debugLine="Private Sub ReadLine(Input As String, Row() As Str";
 //BA.debugLineNum = 55;BA.debugLine="Dim InsideQuotes As Boolean";
_insidequotes = false;
 //BA.debugLineNum = 56;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 57;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 58;BA.debugLine="Dim count As Int";
_count = 0;
 //BA.debugLineNum = 59;BA.debugLine="Do While CurrentIndex <= Input.Length";
while (_currentindex<=_input.length()) {
 //BA.debugLineNum = 60;BA.debugLine="Dim c As String";
_c = "";
 //BA.debugLineNum = 61;BA.debugLine="If CurrentIndex < Input.Length Then";
if (_currentindex<_input.length()) { 
 //BA.debugLineNum = 62;BA.debugLine="c = Input.CharAt(CurrentIndex)";
_c = BA.ObjectToString(_input.charAt(_currentindex));
 }else {
 //BA.debugLineNum = 64;BA.debugLine="c = Chr(10)";
_c = BA.ObjectToString(__c.Chr((int) (10)));
 };
 //BA.debugLineNum = 66;BA.debugLine="If InsideQuotes Then";
if (_insidequotes) { 
 //BA.debugLineNum = 67;BA.debugLine="If c = QUOTE Then";
if ((_c).equals(__c.QUOTE)) { 
 //BA.debugLineNum = 69;BA.debugLine="If CurrentIndex < Input.Length - 1 And Input.C";
if (_currentindex<_input.length()-1 && _input.charAt((int) (_currentindex+1))==BA.ObjectToChar(__c.QUOTE)) { 
 //BA.debugLineNum = 70;BA.debugLine="sb.Append(QUOTE)";
_sb.Append(__c.QUOTE);
 //BA.debugLineNum = 71;BA.debugLine="CurrentIndex = CurrentIndex + 1";
_currentindex = (int) (_currentindex+1);
 }else {
 //BA.debugLineNum = 73;BA.debugLine="InsideQuotes = False";
_insidequotes = __c.False;
 };
 }else {
 //BA.debugLineNum = 76;BA.debugLine="sb.Append(c)";
_sb.Append(_c);
 };
 }else {
 //BA.debugLineNum = 79;BA.debugLine="If c = Chr(13) Then";
if ((_c).equals(BA.ObjectToString(__c.Chr((int) (13))))) { 
 //BA.debugLineNum = 80;BA.debugLine="CurrentIndex = CurrentIndex + 1";
_currentindex = (int) (_currentindex+1);
 //BA.debugLineNum = 81;BA.debugLine="Continue";
if (true) continue;
 }else if((_c).equals(BA.ObjectToString(__c.Chr((int) (10))))) { 
 //BA.debugLineNum = 83;BA.debugLine="If JustCount = False Then Row(count) = sb.ToSt";
if (_justcount==__c.False) { 
_row[_count] = _sb.ToString();};
 //BA.debugLineNum = 84;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 //BA.debugLineNum = 85;BA.debugLine="CurrentIndex = CurrentIndex + 1";
_currentindex = (int) (_currentindex+1);
 //BA.debugLineNum = 86;BA.debugLine="Exit";
if (true) break;
 }else if((_c).equals(_sep)) { 
 //BA.debugLineNum = 88;BA.debugLine="If JustCount = False Then Row(count) = sb.ToSt";
if (_justcount==__c.False) { 
_row[_count] = _sb.ToString();};
 //BA.debugLineNum = 89;BA.debugLine="sb.Remove(0, sb.Length)";
_sb.Remove((int) (0),_sb.getLength());
 //BA.debugLineNum = 90;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 //BA.debugLineNum = 91;BA.debugLine="InsideQuotes = False";
_insidequotes = __c.False;
 }else if((_c).equals(__c.QUOTE)) { 
 //BA.debugLineNum = 93;BA.debugLine="InsideQuotes = True";
_insidequotes = __c.True;
 }else {
 //BA.debugLineNum = 95;BA.debugLine="sb.Append(c)";
_sb.Append(_c);
 };
 };
 //BA.debugLineNum = 98;BA.debugLine="CurrentIndex = CurrentIndex + 1";
_currentindex = (int) (_currentindex+1);
 }
;
 //BA.debugLineNum = 100;BA.debugLine="Return count";
if (true) return _count;
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
