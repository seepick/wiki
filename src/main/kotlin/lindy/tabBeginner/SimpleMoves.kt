package lindy.tabBeginner

import common.ref
import common.youtube
import kotlinx.html.*
import lindy.LindyRef
import tabs.SectionedTabDsl


fun LindyBeginnerSections.simpleMoves(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Simple Moves") {
            subSection("Butterfly") {
                // =====================================================================================================
                content {
                    p {
                        +"Also called (Lindy-, there is also a Charleston-) \"open doors\", and is one of the most basic moves there is. "
                        +"To indicate it, first externally rotate a bit with the whole body, but only on the y-axis through the spine. "
                        +"Don't bend the upper body; stay upright. "
                        +"This creates a stretch in the arm through the frame, so don't push only with your arm/hand directly. "
                        +"Doing so will create an uncomfortable, sharp sensation for the follower. "
                        +"The follower has as well a small stretch in the shoulder through the hand which is placed on the leader's shoulder blade. "
                        +"Push the followers back a bit, and then both half-turn 180 degrees towards each other, \"opening their wings\". "; br
                        +"Try to start with left and right leg, as well as clockwise and counter-clockwise. "; br
                        +"This is usually done in 8-count basic, as it is not really possible to do it continuously in 6-count (rock-step is missing). "
                    }
                    p {
                        +"The classical butterfly/open doors is done in the closed-position, standing side-by-side. "
                        +"It can also be part of more complex movements, think of ";ref(LindyRef.Franky6);+" for example. "
                        +"We turn and push our partner into (subsequent) rotations by moving our whole body. "
                    }
                    p {
                        +"Here is a nice possibility to ";b { +"switch roles" };+": "
                        +"The leader puts his arm above and on the closer shoulder blade, instead underneath the follower's arm. "
                    }
                }
            }
            subSection("Send-out") {
                // =====================================================================================================
                content {
                    p {
                        +"A send-out is basically moving from closed- to open-position, with either leader or follower in front. "
                        +"We could therefore also call the opposite move, from closed- to open-position, a \"send-in\". "
                    }
                    ul {
                        li {
                            +"To send out the ";b { +"follower" };+", the leader stays on the spot and does a rock-step to the side (or slightly back). "
                            +"By rotating the torso towards the follower (CW), a stretch is created. "
                            +"With the right arm connected to the frame, an elastic push can be generated."
                        }
                        li { +"Slightly pull with your left hand and push with your right to rotate the follower and make her step in front of you. "
                            +"Again: Stay on your spot, otherwise she will have difficulties traveling! " }
                        li { +"Watch out: The second rock-step is done backwards (staying on the spot!), and not as usually to the front. "
                            +"Also for the follower: Don't travel too far but maintain the right distance, adjust the steps. "
                            +"Otherwise the stretch on the rock-step is going to over-stretch (losing the frame). " }
                    }
                    p {
                        +"The ";b { +"leader" };+" send-out is done by first indicating to the follower to stay on the spot (otherwise tricky traveling far), and then move in front. "
                        +"Continue with the basic-step or move back again to a side-by-side position. "
                    }
                    p { +"A ";b { +"variation" };+" of it includes a turn CW, by pushing the follower's left side of the back. "
                        +"This might come a bit counter-intuitive and as a surprise at first. " }
                    youtube(
                        "1Sk1JpUVf1Y?si=UVDAv7ToEx89F734",
                        "6-count, send-out to open, change places, call back and walk"
                    )
                }
            }
            subSection("Circle") {
                // =====================================================================================================
                content {
                    p {
                        +"We both, usually, turn CW, as it is easier. "
                        +"The hand-connection is possible, but not necessary. "
                        +"The rock-steps are only regular steps and not really shifting the weight fully backward/forward. "
                        +"On those, also most of the circle motion happening. "; br
                        +"";i{+"Both"};+" really have to move around a pivot point between them, not just one is moving around the other. "
                        +"We give each other counter-balance, so shift your weight really back, with the butt (requires some core strength) and not with upper-body only. "
                        +"Touch each other's shoulder blade, not the waist, and don't grab or pull there. "
                        +"The follower has also a strong connection to the frame through the arm here (valid in general, but here especially). "; br
                        +"If you get dizzy, simply do it a bit more, as more practice will get your body used to it, and it'll improve over time. "
                    }
                    youtube(
                        "xmEYWHzWzhI?si=qXxiyOy1iZAAcUt1",
                        "Doing circles, round and round, counter-balancing, and entering/leaving properly"
                    )
                    youtube("XaLfPpZqbe0?si=QCcTCuCKzBrwB_hg", "Lindy Circle in 8-count and leave at the 7th")
                    p {
                        +"Practice the entering and exit properly, as this might pose the biggest difficulty. "
                        +"Enter on the rock-step and already start to turn your follower, providing some space for her and indicating early enough what's about to come. "; br
                        +"After 8 counts, a 360-degree circle should be completed, and the last triple-steps should be pulled straight back (not rotational). "
                        +"Finally go back into basic, facing in the original direction. "; br
                        +"Alternatively, a ";b{+"release"};+" into the open position is possible and from there immediately back into the circle. "
                    }
                    youtube("A8_RVUervLI?si=8_CgI8i4B4ld_ZyF", "Lindy Circle and release to open position")
                    p {
                        +"You can make it a bit more \"spicy\" by adding a tuck turn from within the circle. "
                        +"Watch out to switch shortly into a 6-count-basic for the duration of the tuck turn and then back into a 8-count again. "
                    }
                    youtube("AeHyQg_uOXM?si=dapGmYzR59378Xt9", "Lindy Circle and tuck turn")
                }
            }
        }
    }
}
