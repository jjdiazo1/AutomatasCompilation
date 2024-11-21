// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/BACKUP.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class BACKUP {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=5;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=6;
      Object coder=$fix(BACKUP.createCoder());
      $line=7;
      Object deCoder=$fix(BACKUP.createDecoder());
      $line=11;
      Utilities.testCodeDecode($cast(gold.structures.automaton.ITransducer.class,coder),$cast(gold.structures.automaton.ITransducer.class,deCoder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"main",$line);
    }
  }
  public static ITransducer createCoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=18;
      Object Q=$fix($opUnionY($opUnionY($opUnionY($opUnionY($opCartsY(new Object[]{$opIntvlY(0,4),$opIntvlY(0,2),$opIntvlY(0,4),$opIntvlY('a','z')}),GCollections.asSet("error")),GCollections.asSet("inicio")),GCollections.asSet("final")),GCollections.asSet(GCollections.asList(0,0,0,' '),GCollections.asList(0,0,1,' '),GCollections.asList(0,0,2,' '),GCollections.asList(0,0,3,' '),GCollections.asList(0,0,4,' '),GCollections.asList(0,1,0,' '),GCollections.asList(0,1,1,' '),GCollections.asList(0,1,2,' '),GCollections.asList(0,1,3,' '),GCollections.asList(0,1,4,' '),GCollections.asList(0,2,0,' '),GCollections.asList(0,2,1,' '),GCollections.asList(0,2,2,' '),GCollections.asList(0,2,3,' '),GCollections.asList(0,2,4,' '),GCollections.asList(1,0,0,' '),GCollections.asList(1,0,1,' '),GCollections.asList(1,0,2,' '),GCollections.asList(1,0,3,' '),GCollections.asList(1,0,4,' '),GCollections.asList(1,1,0,' '),GCollections.asList(1,1,1,' '),GCollections.asList(1,1,2,' '),GCollections.asList(1,1,3,' '),GCollections.asList(1,1,4,' '),GCollections.asList(1,2,0,' '),GCollections.asList(1,2,1,' '),GCollections.asList(1,2,2,' '),GCollections.asList(1,2,3,' '),GCollections.asList(1,2,4,' '),GCollections.asList(2,0,0,' '),GCollections.asList(2,0,1,' '),GCollections.asList(2,0,2,' '),GCollections.asList(2,0,3,' '),GCollections.asList(2,0,4,' '),GCollections.asList(2,1,0,' '),GCollections.asList(2,1,1,' '),GCollections.asList(2,1,2,' '),GCollections.asList(2,1,3,' '),GCollections.asList(2,1,4,' '),GCollections.asList(2,2,0,' '),GCollections.asList(2,2,1,' '),GCollections.asList(2,2,2,' '),GCollections.asList(2,2,3,' '),GCollections.asList(2,2,4,' '),GCollections.asList(3,0,0,' '),GCollections.asList(3,0,1,' '),GCollections.asList(3,0,2,' '),GCollections.asList(3,0,3,' '),GCollections.asList(3,0,4,' '),GCollections.asList(3,1,0,' '),GCollections.asList(3,1,1,' '),GCollections.asList(3,1,2,' '),GCollections.asList(3,1,3,' '),GCollections.asList(3,1,4,' '),GCollections.asList(3,2,0,' '),GCollections.asList(3,2,1,' '),GCollections.asList(3,2,2,' '),GCollections.asList(3,2,3,' '),GCollections.asList(3,2,4,' '),GCollections.asList(4,0,0,' '),GCollections.asList(4,0,1,' '),GCollections.asList(4,0,2,' '),GCollections.asList(4,0,3,' '),GCollections.asList(4,0,4,' '),GCollections.asList(4,1,0,' '),GCollections.asList(4,1,1,' '),GCollections.asList(4,1,2,' '),GCollections.asList(4,1,3,' '),GCollections.asList(4,1,4,' '),GCollections.asList(4,2,0,' '),GCollections.asList(4,2,1,' '),GCollections.asList(4,2,2,' '),GCollections.asList(4,2,3,' '),GCollections.asList(4,2,4,' '))));
      $line=40;
      Object In=$fix($opUnionY($opUnionY($opIntvlY('a','z'),GCollections.asSet('.')),GCollections.asSet(' ')));
      $line=41;
      Object Out=$fix($opUnionY($opUnionY($opUnionY($opIntvlY('a','z'),$opIntvlY('0','4')),GCollections.asSet('.')),GCollections.asSet(' ')));
      $line=42;
      Object q_0=$fix("inicio");
      $line=43;
      Object F=$fix(GCollections.asSet("final"));
      $line=45;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,In,Out,q_0,F,new GMethod(BACKUP.class,"\u03B4"),new GMethod(BACKUP.class,"g"),new GMethod(BACKUP.class,"h")});
      if (true) break $try;
      $line=46;
      $rethrow(new RuntimeException("The function \"createCoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"createCoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object q, Object symbol) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=50;
      if (($opEqualY(q,"inicio")&&$opMembrY(symbol,$opIntvlY('a','z')))) {
        $line=50;
        $result=GCollections.asList(2,2,2,symbol);
        if (true) break $try;
      }
      else {
        $line=52;
        if (($opEqualY(q,"final")&&$opMembrY(symbol,$opIntvlY('a','z')))) {
          $line=52;
          $result="error";
          if (true) break $try;
        }
        else {
          $line=54;
          $result="error";
          if (true) break $try;
        }
      }
      $line=57;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,symbol:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object \u03B4(java.lang.Iterable $v1, Object symbol) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v2=GCollections.unmodifiableCollection($v1).iterator();
      Object i=$v2.next();
      Object j=$v2.next();
      Object d=$v2.next();
      Object s=$v2.next();
      $line=61;
      if ($opEqualY(symbol,' ')) {
        $line=61;
        $result=GCollections.asList($opModulY($opAdditY(d,1),5),1,$opModulY($opAdditY(d,1),5),symbol);
        if (true) break $try;
      }
      else {
        $line=63;
        if (($opEqualY(s,' ')&&!$opEqualY(symbol,'.'))) {
          $line=63;
          $result=GCollections.asList(i,$opModulY($opAdditY(j,1),3),d,symbol);
          if (true) break $try;
        }
        else {
          $line=65;
          if ($opMembrY(symbol,$opIntvlY('a','z'))) {
            $line=65;
            $result=GCollections.asList($opModulY($opAdditY(i,1),5),$opModulY($opAdditY(j,1),3),d,s);
            if (true) break $try;
          }
          else {
            $line=67;
            if ($opEqualY(symbol,'.')) {
              $line=67;
              $result="final";
              if (true) break $try;
            }
          }
        }
      }
      $line=70;
      $rethrow(new RuntimeException("The function \"\u03B4(\u27E8i,j,d,s\u27E9:java.lang.Iterable,symbol:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(java.lang.Iterable $v3, Object symbol) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v4=GCollections.unmodifiableCollection($v3).iterator();
      Object i=$v4.next();
      Object j=$v4.next();
      Object d=$v4.next();
      Object s=$v4.next();
      $line=74;
      Object jChar=$fix(BACKUP.toChar(j));
      $line=75;
      Object iChar=$fix(BACKUP.toChar(i));
      $line=77;
      if ($opEqualY(symbol,s)) {
        $line=77;
        $result=jChar;
        if (true) break $try;
      }
      else {
        $line=79;
        if ($opEqualY(symbol,'.')) {
          $line=79;
          $result=$opAdditY($opAdditY($invokeMethod(String.class,"valueOf",true,null,new Object[]{s}),$invokeMethod(String.class,"valueOf",true,null,new Object[]{iChar})),$invokeMethod(String.class,"valueOf",true,null,new Object[]{symbol}));
          if (true) break $try;
        }
        else {
          $line=81;
          if ($opEqualY(symbol,' ')) {
            $line=81;
            $result=$opAdditY($invokeMethod(String.class,"valueOf",true,null,new Object[]{s}),$invokeMethod(String.class,"valueOf",true,null,new Object[]{iChar}));
            if (true) break $try;
          }
          else {
            $line=83;
            if (!$opEqualY(symbol,s)) {
              $line=83;
              $result=symbol;
              if (true) break $try;
            }
          }
        }
      }
      $line=86;
      $rethrow(new RuntimeException("The function \"h(\u27E8i,j,d,s\u27E9:java.lang.Iterable,symbol:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"h",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object symbol) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=92;
      if (($opEqualY(q,"inicio")&&$opMembrY(symbol,$opIntvlY('a','z')))) {
        $line=92;
        $result=symbol;
        if (true) break $try;
      }
      else {
        $line=94;
        if (($opEqualY(q,"final")&&$opMembrY(symbol,$opIntvlY('a','z')))) {
          $line=94;
          $result="error";
          if (true) break $try;
        }
        else {
          $line=96;
          $result="error";
          if (true) break $try;
        }
      }
      $line=99;
      $rethrow(new RuntimeException("The function \"h(q:Object,symbol:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"h",$line);
    }
    return $result;
  }
  public static Object toChar(Object symbol) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=102;
      if ($opEqualY(symbol,0)) {
        $line=102;
        $result='0';
        if (true) break $try;
      }
      else {
        $line=104;
        if ($opEqualY(symbol,1)) {
          $line=104;
          $result='1';
          if (true) break $try;
        }
        else {
          $line=106;
          if ($opEqualY(symbol,2)) {
            $line=106;
            $result='2';
            if (true) break $try;
          }
          else {
            $line=108;
            if ($opEqualY(symbol,3)) {
              $line=108;
              $result='3';
              if (true) break $try;
            }
            else {
              $line=110;
              if ($opEqualY(symbol,4)) {
                $line=110;
                $result='4';
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=113;
      $rethrow(new RuntimeException("The function \"toChar(symbol:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"toChar",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=117;
      $result="";
      if (true) break $try;
      $line=118;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"g",$line);
    }
    return $result;
  }
  public static ITransducer createDecoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=126;
      Object Q=$fix($opUnionY($opUnionY($opUnionY($opUnionY($opCartsY(new Object[]{$opIntvlY(0,4),$opIntvlY(0,2),$opIntvlY(0,4),$opIntvlY('a','z')}),GCollections.asSet("error")),GCollections.asSet("inicio")),GCollections.asSet("final")),GCollections.asSet(GCollections.asList(0,0,0,' '),GCollections.asList(0,0,1,' '),GCollections.asList(0,0,2,' '),GCollections.asList(0,0,3,' '),GCollections.asList(0,0,4,' '),GCollections.asList(0,1,0,' '),GCollections.asList(0,1,1,' '),GCollections.asList(0,1,2,' '),GCollections.asList(0,1,3,' '),GCollections.asList(0,1,4,' '),GCollections.asList(0,2,0,' '),GCollections.asList(0,2,1,' '),GCollections.asList(0,2,2,' '),GCollections.asList(0,2,3,' '),GCollections.asList(0,2,4,' '),GCollections.asList(1,0,0,' '),GCollections.asList(1,0,1,' '),GCollections.asList(1,0,2,' '),GCollections.asList(1,0,3,' '),GCollections.asList(1,0,4,' '),GCollections.asList(1,1,0,' '),GCollections.asList(1,1,1,' '),GCollections.asList(1,1,2,' '),GCollections.asList(1,1,3,' '),GCollections.asList(1,1,4,' '),GCollections.asList(1,2,0,' '),GCollections.asList(1,2,1,' '),GCollections.asList(1,2,2,' '),GCollections.asList(1,2,3,' '),GCollections.asList(1,2,4,' '),GCollections.asList(2,0,0,' '),GCollections.asList(2,0,1,' '),GCollections.asList(2,0,2,' '),GCollections.asList(2,0,3,' '),GCollections.asList(2,0,4,' '),GCollections.asList(2,1,0,' '),GCollections.asList(2,1,1,' '),GCollections.asList(2,1,2,' '),GCollections.asList(2,1,3,' '),GCollections.asList(2,1,4,' '),GCollections.asList(2,2,0,' '),GCollections.asList(2,2,1,' '),GCollections.asList(2,2,2,' '),GCollections.asList(2,2,3,' '),GCollections.asList(2,2,4,' '),GCollections.asList(3,0,0,' '),GCollections.asList(3,0,1,' '),GCollections.asList(3,0,2,' '),GCollections.asList(3,0,3,' '),GCollections.asList(3,0,4,' '),GCollections.asList(3,1,0,' '),GCollections.asList(3,1,1,' '),GCollections.asList(3,1,2,' '),GCollections.asList(3,1,3,' '),GCollections.asList(3,1,4,' '),GCollections.asList(3,2,0,' '),GCollections.asList(3,2,1,' '),GCollections.asList(3,2,2,' '),GCollections.asList(3,2,3,' '),GCollections.asList(3,2,4,' '),GCollections.asList(4,0,0,' '),GCollections.asList(4,0,1,' '),GCollections.asList(4,0,2,' '),GCollections.asList(4,0,3,' '),GCollections.asList(4,0,4,' '),GCollections.asList(4,1,0,' '),GCollections.asList(4,1,1,' '),GCollections.asList(4,1,2,' '),GCollections.asList(4,1,3,' '),GCollections.asList(4,1,4,' '),GCollections.asList(4,2,0,' '),GCollections.asList(4,2,1,' '),GCollections.asList(4,2,2,' '),GCollections.asList(4,2,3,' '),GCollections.asList(4,2,4,' '))));
      $line=148;
      Object In=$fix($opUnionY($opUnionY($opIntvlY('a','z'),$opIntvlY('0','4')),GCollections.asSet('.')));
      $line=149;
      Object Out=$fix($opUnionY($opUnionY($opIntvlY('a','z'),GCollections.asSet('.')),GCollections.asSet(' ')));
      $line=150;
      Object q_0=$fix("inicio");
      $line=151;
      Object F=$fix(GCollections.asSet("final"));
      $line=153;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,In,Out,q_0,F,new GMethod(BACKUP.class,"\u03B41"),new GMethod(BACKUP.class,"g1"),new GMethod(BACKUP.class,"h1")});
      if (true) break $try;
      $line=154;
      $rethrow(new RuntimeException("The function \"createDecoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"createDecoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B41(Object q, Object symbol) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=158;
      if (($opEqualY(q,"inicio")&&$opMembrY(symbol,$opIntvlY('a','z')))) {
        $line=158;
        $result=GCollections.asList(2,2,2,symbol);
        if (true) break $try;
      }
      else {
        $line=160;
        if (($opEqualY(q,"final")&&!$opEqualY(symbol,""))) {
          $line=160;
          $result="error";
          if (true) break $try;
        }
        else {
          $line=162;
          $result="error";
          if (true) break $try;
        }
      }
      $line=165;
      $rethrow(new RuntimeException("The function \"\u03B41(q:Object,symbol:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object \u03B41(java.lang.Iterable $v5, Object symbol) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v6=GCollections.unmodifiableCollection($v5).iterator();
      Object i=$v6.next();
      Object j=$v6.next();
      Object d=$v6.next();
      Object s=$v6.next();
      $line=169;
      if ($opEqualY(symbol,s)) {
        $line=169;
        $result=GCollections.asList($opModulY($opAdditY(d,1),5),$opModulY($opAdditY(j,1),3),$opModulY($opAdditY(d,1),5),' ');
        if (true) break $try;
      }
      else {
        $line=171;
        if (($opMembrY(symbol,$opIntvlY('0','4'))&&$opEqualY(s,' '))) {
          $line=171;
          $result=GCollections.asList(i,1,d,s);
          if (true) break $try;
        }
        else {
          $line=173;
          if (($opEqualY(s,' ')&&!$opEqualY(symbol,'.'))) {
            $line=173;
            $result=GCollections.asList(i,$opModulY($opAdditY(j,1),3),d,symbol);
            if (true) break $try;
          }
          else {
            $line=175;
            if ($opMembrY(symbol,$opIntvlY('a','z'))) {
              $line=175;
              $result=GCollections.asList($opModulY($opAdditY(i,1),5),$opModulY($opAdditY(j,1),3),d,s);
              if (true) break $try;
            }
            else {
              $line=177;
              if (($opMembrY(symbol,$opIntvlY('0','4'))&&!$opEqualY(s,' '))) {
                $line=177;
                $result=GCollections.asList($opModulY($opAdditY(i,1),5),$opModulY($opAdditY(j,1),3),d,s);
                if (true) break $try;
              }
              else {
                $line=179;
                if ($opEqualY(symbol,'.')) {
                  $line=179;
                  $result="final";
                  if (true) break $try;
                }
                else {
                  $line=181;
                  $result="error";
                  if (true) break $try;
                }
              }
            }
          }
        }
      }
      $line=184;
      $rethrow(new RuntimeException("The function \"\u03B41(\u27E8i,j,d,s\u27E9:java.lang.Iterable,symbol:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object h1(java.lang.Iterable $v7, Object symbol) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v8=GCollections.unmodifiableCollection($v7).iterator();
      Object i=$v8.next();
      Object j=$v8.next();
      Object d=$v8.next();
      Object s=$v8.next();
      $line=189;
      if ($opEqualY(symbol,s)) {
        $line=189;
        $result="";
        if (true) break $try;
      }
      else {
        $line=191;
        if ($opEqualY(symbol,'.')) {
          $line=191;
          $result='.';
          if (true) break $try;
        }
        else {
          $line=193;
          if ($opEqualY(symbol,' ')) {
            $line=193;
            $result="Error";
            if (true) break $try;
          }
          else {
            $line=195;
            if (($opMembrY(symbol,$opIntvlY('a','z'))&&$opEqualY(s,' '))) {
              $line=195;
              $result=$opAdditY(" ",symbol);
              if (true) break $try;
            }
            else {
              $line=197;
              if (($opMembrY(symbol,$opIntvlY('0','4'))&&$opEqualY(s,' '))) {
                $line=197;
                $result="";
                if (true) break $try;
              }
              else {
                $line=199;
                if ($opMembrY(symbol,$opIntvlY('0','4'))) {
                  $line=199;
                  $result=s;
                  if (true) break $try;
                }
                else {
                  $line=201;
                  $result=symbol;
                  if (true) break $try;
                }
              }
            }
          }
        }
      }
      $line=204;
      $rethrow(new RuntimeException("The function \"h1(\u27E8i,j,d,s\u27E9:java.lang.Iterable,symbol:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"h1",$line);
    }
    return $result;
  }
  public static Object h1(Object q, Object symbol) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=208;
      if (($opEqualY(q,"inicio")&&$opMembrY(symbol,$opIntvlY('a','z')))) {
        $line=208;
        $result=symbol;
        if (true) break $try;
      }
      else {
        $line=210;
        if (($opEqualY(q,"final")&&!$opEqualY(symbol,""))) {
          $line=210;
          $result="error";
          if (true) break $try;
        }
        else {
          $line=212;
          $result="error";
          if (true) break $try;
        }
      }
      $line=215;
      $rethrow(new RuntimeException("The function \"h1(q:Object,symbol:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"h1",$line);
    }
    return $result;
  }
  public static Object toChar1(Object symbol) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=218;
      if ($opEqualY(symbol,0)) {
        $line=218;
        $result='0';
        if (true) break $try;
      }
      else {
        $line=220;
        if ($opEqualY(symbol,1)) {
          $line=220;
          $result='1';
          if (true) break $try;
        }
        else {
          $line=222;
          if ($opEqualY(symbol,2)) {
            $line=222;
            $result='2';
            if (true) break $try;
          }
          else {
            $line=224;
            if ($opEqualY(symbol,3)) {
              $line=224;
              $result='3';
              if (true) break $try;
            }
            else {
              $line=226;
              if ($opEqualY(symbol,4)) {
                $line=226;
                $result='4';
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=229;
      $rethrow(new RuntimeException("The function \"toChar1(symbol:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"toChar1",$line);
    }
    return $result;
  }
  public static Object g1(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=233;
      $result="";
      if (true) break $try;
      $line=234;
      $rethrow(new RuntimeException("The function \"g1(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,BACKUP.class,"g1",$line);
    }
    return $result;
  }
}
