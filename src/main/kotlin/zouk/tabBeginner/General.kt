package zouk.tabBeginner

import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl
import zouk.ZoukBeginnerSections

fun ZoukBeginnerSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            subSection("Advice") {
                // =====================================================================================================
                content {
                    ul {
                        li { +"Find a comfortable ";b{+"distance"};+" with your partner, it's also fine to just ask explicitly." }
                        li { +"Keep your ";b{+"arms up"};+" (follower rests upon), as it helps to maintain a better connection." }
                        li { +"Firm yet ";b{+"soft grip"};+", on torso and shoulders, as it helps with sending a clear intention." }
                        li { +"Find the sweet spot between softness (relaxation) and strength (confident guidance)."}
                        li { +"The boom sound is usually for walking straight, the chic is for turns/spins." }
                        li { +"Keep your feet always on the ground; ";b{+"slide"};+", don't step!" }
                        li { +"The slow step is reached really ";b{+"far"};+" forward and backward." }
                        li { +"Keep your feet always in a ";b{+"V-shape"};+" like seen in Ballet's plie position." }
                        li { +"Have a ";b{+"recovery attitude"};+": continue when you made a mistake; it's not about perfection." }
                    }
                }
            }
            subSection("Mistakes") {
                // =====================================================================================================
                content {
                    ul {
                        li { b{+"Hopping"};+" up and down, not keeping the vertical axis still." }
                        li { +"Leader's ";b{+"hands too low"};+", not properly positioned on the shoulder blades." }
                        li { b{+"Rushing"};+" the initial connection too quickly: take your time, slow down." }
                        li { b{+"Looking down"};+" at the feet, instead of smiling into the room / at your partner." }
                    }
                }
            }
            subSection("Connection") {
                // =====================================================================================================
                content {
                    ul {
                        li { b{+"Close"};+": Leader hands on the back (usually shoulder blades, or more embraced) and elbows slightly pushed up and outwards. "
                            +"Follower rest on partner's body depending on distance (usually outside upper arms, or around neck/shoulders if closer)." }
                        li { b{+"Open"};+": Hold each other's hands with a loose grip, applying no pressure with the thumbs." }
                        li { b{+"Mixed"};+": One side closed, and the other is open." }
                    }
                    youtube("dy2gSclrzSs?si=YSdm1nVn_TgweYgX", "The different connecting styles")
                }
            }
            subSection("Attitude") {
                // =====================================================================================================
                content {
                    p { +"To prepare us for the social event, we've been demonstrated on how to apply different ";b{+"styles"};+" "
                        +"(speed, energy) and thus being able to only use a few techniques yet enrich them with some diversity. "; br
                        +"We practice giving each other ";b{+"feedback"};+" after the dance how we experienced the dance in terms "
                        +"of qualities, such as: Tense, slow, tender, fast-paced, ... "; br
                        +"We also play with inviting and recognizing an appropriate ";b{+"distance"};+", letting the follower "
                        +"come by opening up, inviting space to come as close as desired, not using any force and respecting each other's comfort zone ." }
                    p { +"Also learn how to ";b{+"soften"};+" a bit and tap into the more subtle qualities of a partner dance. "
                        +"Simple things like the qualities of expansion and contraction, but also the fundamental source of relaxation: the ";b{+"breath"};+". "
                        +"Doing a quick ";b{+"body scan"};+", dropping the chest, bending the knees. "
                        +"When dancing with a new/unknown partner, or the unknown happens, instead of tensing up, simply let go, relax, and recover."; br
                        +"Speaking of ";b{+"unknown partner"};+": Before immediately and right away start dancing, first establish "
                        +"eye contact, say \"hi\", smile, and give it a few moments to connect; groove on the beat, "
                        +"and then slowly build up the technical moves. "}
                }
            }
            subSection("Overview") {
                // =====================================================================================================
                content {
                    p { +"Here a video showing all the movements learned during the level 1 beginner course." }
                    youtube("VllfJOm_3O8?si=aLpdPJKnrKRu4Mu6", "All the movements from Level 1")
                }
            }
        }
    }
}
