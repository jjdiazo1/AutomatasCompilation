// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/TP2Desigualdades.gold"
import gold.structures.automaton.*;
import gold.util.*;
import gold.visualization.automaton.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class TP2Desigualdades {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=8;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,TP2Desigualdades.createAutomaton()));
      $line=9;
      Utilities.test($cast(gold.structures.automaton.IAutomaton.class,TP2Desigualdades.createAutomaton()));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,TP2Desigualdades.class,"main",$line);
    }
  }
  public static IAutomaton createAutomaton() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=14;
      Object Q=$fix($opUnionY($opUnionY($opUnionY($opCartsY(new Object[]{$opIntvlY(0,9),GCollections.asSet('>','<','=')}),GCollections.asSet(GCollections.asList(0,0),GCollections.asList(0,1),GCollections.asList(0,2),GCollections.asList(0,3),GCollections.asList(0,4),GCollections.asList(0,5),GCollections.asList(0,6),GCollections.asList(0,7),GCollections.asList(0,8),GCollections.asList(0,9),GCollections.asList(1,0),GCollections.asList(1,1),GCollections.asList(1,2),GCollections.asList(1,3),GCollections.asList(1,4),GCollections.asList(1,5),GCollections.asList(1,6),GCollections.asList(1,7),GCollections.asList(1,8),GCollections.asList(1,9),GCollections.asList(2,0),GCollections.asList(2,1),GCollections.asList(2,2),GCollections.asList(2,3),GCollections.asList(2,4),GCollections.asList(2,5),GCollections.asList(2,6),GCollections.asList(2,7),GCollections.asList(2,8),GCollections.asList(2,9),GCollections.asList(3,0),GCollections.asList(3,1),GCollections.asList(3,2),GCollections.asList(3,3),GCollections.asList(3,4),GCollections.asList(3,5),GCollections.asList(3,6),GCollections.asList(3,7),GCollections.asList(3,8),GCollections.asList(3,9),GCollections.asList(4,0),GCollections.asList(4,1),GCollections.asList(4,2),GCollections.asList(4,3),GCollections.asList(4,4),GCollections.asList(4,5),GCollections.asList(4,6),GCollections.asList(4,7),GCollections.asList(4,8),GCollections.asList(4,9),GCollections.asList(5,0),GCollections.asList(5,1),GCollections.asList(5,2),GCollections.asList(5,3),GCollections.asList(5,4),GCollections.asList(5,5),GCollections.asList(5,6),GCollections.asList(5,7),GCollections.asList(5,8),GCollections.asList(5,9),GCollections.asList(6,0),GCollections.asList(6,1),GCollections.asList(6,2),GCollections.asList(6,3),GCollections.asList(6,4),GCollections.asList(6,5),GCollections.asList(6,6),GCollections.asList(6,7),GCollections.asList(6,8),GCollections.asList(6,9),GCollections.asList(7,0),GCollections.asList(7,1),GCollections.asList(7,2),GCollections.asList(7,3),GCollections.asList(7,4),GCollections.asList(7,5),GCollections.asList(7,6),GCollections.asList(7,7),GCollections.asList(7,8),GCollections.asList(7,9),GCollections.asList(8,0),GCollections.asList(8,1),GCollections.asList(8,2),GCollections.asList(8,3),GCollections.asList(8,4),GCollections.asList(8,5),GCollections.asList(8,6),GCollections.asList(8,7),GCollections.asList(8,8),GCollections.asList(8,9),GCollections.asList(9,0),GCollections.asList(9,1),GCollections.asList(9,2),GCollections.asList(9,3),GCollections.asList(9,4),GCollections.asList(9,5),GCollections.asList(9,6),GCollections.asList(9,7),GCollections.asList(9,8),GCollections.asList(9,9))),$opIntvlY(0,9)),GCollections.asSet("error")));
      $line=25;
      Object \u03A3=$fix(GCollections.asSet('0','1','2','3','4','5','6','7','8','9','>','<','='));
      $line=27;
      Object q_0=$fix(GCollections.asList(0,0));
      $line=29;
      Object F=$fix($opIntvlY(0,9));
      $line=31;
      $result=$invokeConstructor(GDeterministicAutomaton.class,new Object[]{Q,\u03A3,q_0,F,new GMethod(TP2Desigualdades.class,"\u03B4")});
      if (true) break $try;
      $line=32;
      $rethrow(new RuntimeException("The function \"createAutomaton()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,TP2Desigualdades.class,"createAutomaton",$line);
    }
    return $cast(IAutomaton.class,$result);
  }
  public static Object \u03B4(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=37;
      if ($opEqualY(q,"error")) {
        $line=37;
        $result="error";
        if (true) break $try;
      }
      else {
        $line=39;
        if ($opMembrY(s,GCollections.asSet('>','<','='))) {
          $line=40;
          $result=GCollections.asList(q,s);
          if (true) break $try;
        }
        else {
          $line=42;
          $result="error";
          if (true) break $try;
        }
      }
      $line=44;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,TP2Desigualdades.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object \u03B4(java.lang.Iterable $v1, Object symbol) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v2=GCollections.unmodifiableCollection($v1).iterator();
      Object s1=$v2.next();
      Object s2=$v2.next();
      $line=49;
      if ((($opMembrY(symbol,GCollections.asSet('>','<','='))&&$opEqualY(s1,0))&&$opEqualY(s2,0))) {
        $line=49;
        $result="error";
        if (true) break $try;
      }
      else {
        $line=52;
        if ((($opMembrY(symbol,GCollections.asSet('0','1','2','3','4','5','6','7','8','9'))&&$opEqualY(s1,0))&&$opEqualY(s2,0))) {
          $line=52;
          $result=GCollections.asList(Integer.parseInt($cast(java.lang.String.class,symbol)),0);
          if (true) break $try;
        }
        else {
          $line=55;
          if (($opMembrY(symbol,GCollections.asSet('>','<','='))&&$opEqualY(s2,0))) {
            $line=55;
            $result=GCollections.asList(s1,symbol);
            if (true) break $try;
          }
          else {
            $line=58;
            if (($opMembrY(symbol,GCollections.asSet('0','1','2','3','4','5','6','7','8','9'))&&$opEqualY(s2,0))) {
              $line=58;
              $result="error";
              if (true) break $try;
            }
            else {
              $line=64;
              if (($opMembrY(symbol,GCollections.asSet('0','1','2','3','4','5','6','7','8','9'))&&$opMembrY(s2,GCollections.asSet('0','1','2','3','4','5','6','7','8','9')))) {
                $line=64;
                $result="error";
                if (true) break $try;
              }
              else {
                $line=66;
                if (($opMembrY(symbol,GCollections.asSet('>','<','='))&&$opMembrY(s2,GCollections.asSet('>','<','=')))) {
                  $line=66;
                  $result="error";
                  if (true) break $try;
                }
                else {
                  $line=72;
                  if ((($opMembrY(symbol,GCollections.asSet('0','1','2','3','4','5','6','7','8','9'))&&$opEqualY(s2,'>'))&&$opGreatY(s1,Integer.parseInt($cast(java.lang.String.class,symbol))))) {
                    $line=72;
                    $result=Integer.parseInt($cast(java.lang.String.class,symbol));
                    if (true) break $try;
                  }
                  else {
                    $line=74;
                    if ((($opMembrY(symbol,GCollections.asSet('0','1','2','3','4','5','6','7','8','9'))&&$opEqualY(s2,'<'))&&$opLesstY(s1,Integer.parseInt($cast(java.lang.String.class,symbol))))) {
                      $line=74;
                      $result=Integer.parseInt($cast(java.lang.String.class,symbol));
                      if (true) break $try;
                    }
                    else {
                      $line=76;
                      if ((($opMembrY(symbol,GCollections.asSet('0','1','2','3','4','5','6','7','8','9'))&&$opEqualY(s2,'='))&&$opEqualY(s1,Integer.parseInt($cast(java.lang.String.class,symbol))))) {
                        $line=76;
                        $result=Integer.parseInt($cast(java.lang.String.class,symbol));
                        if (true) break $try;
                      }
                      else {
                        $line=80;
                        $result="error";
                        if (true) break $try;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=82;
      $rethrow(new RuntimeException("The function \"\u03B4(\u27E8s1,s2\u27E9:java.lang.Iterable,symbol:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,TP2Desigualdades.class,"\u03B4",$line);
    }
    return $result;
  }
}