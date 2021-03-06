package varaha.text;

import java.util.Set;
import java.util.HashSet;
import org.apache.lucene.util.Version;
import org.apache.lucene.analysis.util.CharArraySet;

public class StopWords {
    
    public static final CharArraySet ENGLISH_STOP_WORDS = new CharArraySet(Version.LUCENE_44, 600, true) {
            {
                add("a");
                add("about");
                add("above");
                add("across");
                add("after");
                add("again");
                add("against");
                add("all");
                add("almost");
                add("alone");
                add("along");
                add("already");
                add("also");
                add("although");
                add("always");
                add("among");
                add("an");
                add("and");
                add("another");
                add("any");
                add("anybody");
                add("anyone");
                add("anything");
                add("anywhere");
                add("apos");
                add("are");
                add("area");
                add("areas");
                add("around");
                add("as");
                add("ask");
                add("asked");
                add("asking");
                add("asks");
                add("at");
                add("away");
                add("back");
                add("backed");
                add("backing");
                add("backs");
                add("be");
                add("became");
                add("because");
                add("become");
                add("becomes");
                add("been");
                add("before");
                add("began");
                add("behind");
                add("being");
                add("beings");
                add("best");
                add("better");
                add("between");
                add("big");
                add("both");
                add("but");
                add("by");
                add("came");
                add("can");
                add("cannot");
                add("case");
                add("cases");
                add("certain");
                add("certainly");
                add("clear");
                add("clearly");
                add("come");
                add("could");
                add("did");
                add("differ");
                add("different");
                add("differently");
                add("do");
                add("does");
                add("done");
                add("down");
                add("down");
                add("downed");
                add("downing");
                add("downs");
                add("during");
                add("each");
                add("early");
                add("either");
                add("end");
                add("ended");
                add("ending");
                add("ends");
                add("enough");
                add("even");
                add("evenly");
                add("ever");
                add("every");
                add("everybody");
                add("everyone");
                add("everything");
                add("everywhere");
                add("face");
                add("faces");
                add("fact");
                add("facts");
                add("far");
                add("felt");
                add("few");
                add("find");
                add("finds");
                add("first");
                add("for");
                add("four");
                add("from");
                add("full");
                add("fully");
                add("further");
                add("furthered");
                add("furthering");
                add("furthers");
                add("gave");
                add("general");
                add("generally");
                add("get");
                add("gets");
                add("give");
                add("given");
                add("gives");
                add("go");
                add("going");
                add("good");
                add("goods");
                add("got");
                add("great");
                add("greater");
                add("greatest");
                add("group");
                add("grouped");
                add("grouping");
                add("groups");
                add("had");
                add("has");
                add("have");
                add("having");
                add("he");
                add("her");
                add("here");
                add("herself");
                add("high");
                add("high");
                add("high");
                add("higher");
                add("highest");
                add("him");
                add("himself");
                add("his");
                add("how");
                add("however");
                add("i");
                add("if");
                add("important");
                add("in");
                add("interest");
                add("interested");
                add("interesting");
                add("interests");
                add("into");
                add("is");
                add("it");
                add("its");
                add("it's");
                add("itself");
                add("just");
                add("keep");
                add("keeps");
                add("kind");
                add("knew");
                add("know");
                add("known");
                add("knows");
                add("large");
                add("largely");
                add("last");
                add("later");
                add("latest");
                add("least");
                add("less");
                add("let");
                add("lets");
                add("like");
                add("likely");
                add("long");
                add("longer");
                add("longest");
                add("made");
                add("make");
                add("making");
                add("man");
                add("many");
                add("may");
                add("me");
                add("member");
                add("members");
                add("men");
                add("might");
                add("more");
                add("most");
                add("mostly");
                add("mr");
                add("mrs");
                add("much");
                add("must");
                add("my");
                add("myself");
                add("nbsp");
                add("necessary");
                add("need");
                add("needed");
                add("needing");
                add("needs");
                add("never");
                add("new");
                add("new");
                add("newer");
                add("newest");
                add("next");
                add("no");
                add("nobody");
                add("non");
                add("noone");
                add("not");
                add("nothing");
                add("now");
                add("nowhere");
                add("number");
                add("numbers");
                add("of");
                add("off");
                add("often");
                add("old");
                add("older");
                add("oldest");
                add("on");
                add("once");
                add("one");
                add("only");
                add("open");
                add("opened");
                add("opening");
                add("opens");
                add("or");
                add("order");
                add("ordered");
                add("ordering");
                add("orders");
                add("other");
                add("others");
                add("our");
                add("out");
                add("over");
                add("part");
                add("parted");
                add("parting");
                add("parts");
                add("per");
                add("perhaps");
                add("place");
                add("places");
                add("point");
                add("pointed");
                add("pointing");
                add("points");
                add("possible");
                add("present");
                add("presented");
                add("presenting");
                add("presents");
                add("problem");
                add("problems");
                add("put");
                add("puts");
                add("quite");
                add("quot");
                add("rather");
                add("really");
                add("right");
                add("right");
                add("room");
                add("rooms");
                add("said");
                add("same");
                add("saw");
                add("say");
                add("says");
                add("second");
                add("seconds");
                add("see");
                add("seem");
                add("seemed");
                add("seeming");
                add("seems");
                add("sees");
                add("several");
                add("shall");
                add("she");
                add("should");
                add("show");
                add("showed");
                add("showing");
                add("shows");
                add("side");
                add("sides");
                add("since");
                add("small");
                add("smaller");
                add("smallest");
                add("so");
                add("some");
                add("somebody");
                add("someone");
                add("something");
                add("somewhere");
                add("state");
                add("states");
                add("still");
                add("still");
                add("such");
                add("sure");
                add("take");
                add("taken");
                add("than");
                add("that");
                add("the");
                add("their");
                add("them");
                add("then");
                add("there");
                add("therefore");
                add("these");
                add("they");
                add("thing");
                add("things");
                add("think");
                add("thinks");
                add("this");
                add("those");
                add("though");
                add("thought");
                add("thoughts");
                add("three");
                add("through");
                add("thus");
                add("to");
                add("today");
                add("together");
                add("too");
                add("took");
                add("toward");
                add("turn");
                add("turned");
                add("turning");
                add("turns");
                add("two");
                add("under");
                add("until");
                add("up");
                add("upon");
                add("us");
                add("use");
                add("used");
                add("uses");
                add("very");
                add("want");
                add("wanted");
                add("wanting");
                add("wants");
                add("was");
                add("way");
                add("ways");
                add("we");
                add("well");
                add("wells");
                add("went");
                add("were");
                add("what");
                add("when");
                add("where");
                add("whether");
                add("which");
                add("while");
                add("who");
                add("whole");
                add("whose");
                add("why");
                add("will");
                add("with");
                add("within");
                add("without");
                add("work");
                add("worked");
                add("working");
                add("works");
                add("would");
                add("year");
                add("years");
                add("yet");
                add("you");
                add("young");
                add("younger");
                add("youngest");
                add("your");
                add("yours");

                // Common names, you may not want this in general

                add("alex");
                add("alex's");
                add("alexis");
                add("alexis's");
                add("amy");
                add("amy's");
                add("andre");
                add("andre's");
                add("andrea");
                add("andrea's");
                add("ann");
                add("ann's");
                add("anne");
                add("anne's");
                add("arthur");
                add("arthur's");
                add("betty");
                add("betty's");
                add("bill");
                add("bill's");
                add("carol");
                add("carol's");
                add("cathy");
                add("cathy's");
                add("celia");
                add("celia's");
                add("chris");
                add("chris's");
                add("cindy");
                add("cindy's");
                add("cynthia");
                add("cynthia's");
                add("dan");
                add("dan's");
                add("dave");
                add("dave's");
                add("debbi");
                add("debbi's");
                add("debbie");
                add("debbie's");
                add("don");
                add("don's");
                add("donna");
                add("donna's");
                add("doug");
                add("doug's");
                add("dylan");
                add("dylan's");
                add("edward");
                add("edward's");
                add("eileen");
                add("eileen's");
                add("ellen");
                add("ellen's");
                add("emily");
                add("emily's");
                add("eric");
                add("eric's");
                add("erica");
                add("erica's");
                add("eva");
                add("eva's");
                add("helen");
                add("helen's");
                add("jane");
                add("jane's");
                add("jeff");
                add("jeff's");
                add("jenni");
                add("jenni's");
                add("jenny");
                add("jenny's");
                add("jill");
                add("jill's");
                add("jim");
                add("jim's");
                add("joann");
                add("joann's");
                add("joe");
                add("joe's");
                add("judy");
                add("judy's");
                add("karen");
                add("karen's");
                add("kat");
                add("kat's");
                add("katt");
                add("katt's");
                add("kim");
                add("kim's");
                add("linda");
                add("linda's");
                add("lisa");
                add("lisa's");
                add("lloyd");
                add("lloyd's");
                add("lynn");
                add("lynn's");
                add("marcy");
                add("marcy's");
                add("mark");
                add("mark's");
                add("mary");
                add("mary's");
                add("melanie");
                add("melanie's");
                add("mona");
                add("mona's");
                add("nancy");
                add("nancy's");
                add("nicole");
                add("nicole's");
                add("nina");
                add("nina's");
                add("peggy");
                add("peggy's");
                add("renee");
                add("renee's");
                add("riki");
                add("riki's");
                add("rikki");
                add("rikki's");
                add("robert");
                add("robert's");
                add("ruth");
                add("ruth's");
                add("sally");
                add("sally's");
                add("sara");
                add("sara's");
                add("sarah");
                add("sarah's");
                add("sharon");
                add("sharon's");
                add("sue");
                add("sue's");
                add("teddy");
                add("teddy's");
                add("teresa");
                add("teresa's");
                add("terri");
                add("terri's");
                add("terry");
                add("terry's");
                add("tim");
                add("tim's");
                add("timmy");
                add("timmy's");
                add("tom");
                add("tom's");
                add("vicky");
                add("vicky's");
                add("zeke");
                add("zeke's");
            }            
        };
}
