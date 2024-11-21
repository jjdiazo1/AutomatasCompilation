// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Tp4Parser202420.gold"
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
public final class Tp4Parser202420 {
  public static Object toSet(Object C) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v1=$newSet();
      $v2:for (Object x:GCollections.unmodifiableCollection(C)) {
        $v1.add(x);
      }
      $result=$v1;
      if (true) break $try;
      $line=3;
      $rethrow(new RuntimeException("The function \"toSet(C:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Tp4Parser202420.class,"toSet",$line);
    }
    return $result;
  }
  public static IPushdownAutomaton createParser(Object A) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=8;
      Object Q=$fix($opIntvlY(0,5));
      $line=9;
      Object \u03A3=$fix($opUnionY(Tp4Parser202420.toSet(A),GCollections.asSet(' ','\n','\t')));
      $line=11;
      Object \u0393=$fix(GCollections.asSet('0'));
      $line=12;
      Object q_0=$fix(0);
      $line=13;
      Object F=$fix(GCollections.asSet(0));
      $line=14;
      Object M=$fix($invokeConstructor(GPushdownAutomaton.class,new Object[]{Q,\u03A3,\u0393,q_0,F}));
      $line=15;
      Object SkipChars=$fix(GCollections.asSet(' ','\n','\t'));
      $line=18;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,1,$cast(java.lang.String.class,'f')),new Object[]{});
      $line=19;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(1,0,$cast(java.lang.String.class,'#')),new Object[]{});
      $line=20;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(1,0,$cast(java.lang.String.class,'i')),new Object[]{});
      $line=22;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,2,$cast(java.lang.String.class,'r')),new Object[]{});
      $line=23;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(2,0,$cast(java.lang.String.class,'#')),new Object[]{});
      $line=24;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(2,0,$cast(java.lang.String.class,'i')),new Object[]{});
      $line=26;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,0,$cast(java.lang.String.class,'u')),new Object[]{});
      $line=27;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,0,$cast(java.lang.String.class,'d')),new Object[]{});
      $line=29;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,3,$cast(java.lang.String.class,'R')),new Object[]{});
      $line=30;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(3,4,$cast(java.lang.String.class,'#')),new Object[]{});
      $line=31;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(3,4,$cast(java.lang.String.class,'i')),new Object[]{});
      $line=32;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(4,0,$cast(java.lang.String.class,'[')),new Object[]{"0"});
      $line=33;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,0,$cast(java.lang.String.class,']')),new Object[]{"0"});
      $line=36;
      for (Object $v3:GCollections.unmodifiableCollection(Q)) {
        Object q=$v3;
        $line=37;
        for (Object $v4:GCollections.unmodifiableCollection(SkipChars)) {
          Object s=$v4;
          $line=38;
          $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(q,q,$cast(java.lang.String.class,$opAdditY("",s))),new Object[]{});
        }
      }
      $line=43;
      $result=M;
      if (true) break $try;
      $line=44;
      $rethrow(new RuntimeException("The function \"createParser(A:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Tp4Parser202420.class,"createParser",$line);
    }
    return $cast(IPushdownAutomaton.class,$result);
  }
}
