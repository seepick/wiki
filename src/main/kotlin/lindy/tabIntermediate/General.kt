package lindy.tabIntermediate

import kotlinx.html.*
import tabs.SectionedTabDsl

fun LindyIntermediateSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            subSection("Musicality") {
                content {
                    p {
                        +"This could be considered some kind of meta-skill, which is beyond and above, transcending moves and common techniques. "
                        +"On a pure technical level, it's about choosing steps and moves, counting the beats, and listening to the music so it fits a full phrase (melody loop). "
                        +"This way, when there is a change in the music, your moves will perfectly fit in, and both will be aligned with each other. "
                    }
                    p {
                        +"Example: When a phrase consists of 32 beats, and we dance with a 6-Count Basic, doing some move for 4 times, thus resulting in 24 beats. "
                        +"The leftover 8 beats need to be filled, but not by using the current 6-Count Basic, but something else, like a Mess Around technique to just \"go over it\". "
                    }
                    p {
                        +"Then of course there is the quality of the music, the emotional color of it and choosing moves and quality of movement which fits. "
                        +"This requires a good musical ear and having the technique, the purely physical aspect of dancing already almost automated. "
                        +"It's like driving a car: First it requires our full attention, later we can have a lively conversation yet paying attention to the traffic without effort. "
                    }
                }
            }
        }
    }
}
