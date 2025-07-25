package zouk.tabExternal

import common.externalLink
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun ZoukExternalSections.footwork(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Inverted Lateral") {
            html {
                p {
                    +"Inverted laterals is basically a fancy way of saying: \"Going around the follower while facing each other\". "
                    +"You can check out all the videos from ZoukAtoms in this ";externalLink("https://www.youtube.com/watch?v=pB4SMdkEzP4&list=PLS9C6blUpe_dAztpizUkORXsa1n0jyL2q", "Inverted Lateral Series");+". "
                }
            }
            subSection("From Lateral") {
                html {
                    p {
                        +"While doing lateral steps, it is possible to ";b{+"enter from both sides"};+": While leader is on the left (CW, easier) or on the right (CCW, difficult, but necessary for Viradinha entrance). "
                        +"The follower is doing her lateral with a slight change in rotation, to stay facing leader (with upper body and feet). "
                        +"The leader is walking around her, crossing her line, and rotate continuously staying facing each other. "
                        +"Give the follower a slight push (by rotating yourself) at the end to signal her step back and over-rotate. "
                    }
                    youtube("YyKKj3ALVM8?si=ThIQ4y_uSp6NEFzG", "From Lateral to Inverted Lateral (ZoukAtom)")
                    p {
                        +"You have to stay close together, steps/footwork close to each other, staying in front and on her line. "
                        +"Bodies and feet are close also, as otherwise the distance gets too big and it might feel rushed and destroy the frame. "
                        +"Lastly, maintain hand contact to give clear signals, but do NOT pull the hand but use your own frame to indicate rotations. "
                        +"When over-rotating, pull one hand, and then the regular lateral-pull through rotation. "
                    }
                }
            }
            subSection("From Viradinha") {
                html {
                    p {
                        +"";b{+"Watch out"};+": The shown footwork is different than taught at BZA; personally, it feels a bit less smoth and balanced. "
                        +"He is stepping with his left further than the follower (unbalanced), whereas BZA steps deliberately smaller than her. "
                        +"Then the right foot closes in, and then crossing. BZA stays on the left, steps right forward, and then crosses over with the left. "; br
                    }
                    p {
                        +"";b{+"Two variations"};+" are possible: Either 1) do the Inverted Lateral at the end of the Viradinha (thus going CCW circling around the follower), "
                        +"or 2) do it at the very beginning (CW), which is a bit more complicated. "; br
                        +"It is important to remember that the moment you are facing each others feet (cross position) is on the first chick; if you target for that moment, it will work by itself. "; br
                        +"There are different ways what to do with you arms: Stay super close (bellies touch) and keep the hand on her back, but then there is little space and might require a lateral flexion (unbalanced, frame). "
                        +"Sliding during Viradinha into hand connect seems a long way to go, no time for it, and unclear to communicate. "
                        +"Thus, the most clear and practical connection is through the forearms, and then sliding to the hands once in the regular Lateral. "
                    }
                    youtube("qRlvJClTMGY?si=gnK3KXkYxO69P8ZY", "From Viradinha to Inverted Lateral (ZoukAtom)")
                }
            }
//            subSection("Drunken Step") {
            // https://www.youtube.com/watch?v=Xis_udWLgqU
//                html {
//                    p {
//                        +"Basically a variation of inverted lateral, with different entrance/exit possibilities. "
//                    }
//                }
//            }
        }
    }
}
