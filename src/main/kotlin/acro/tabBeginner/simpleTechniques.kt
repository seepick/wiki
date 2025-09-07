package acro.tabBeginner

import acro.AcroRef
import acro.AcroRef.*
import common.Ref
import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun AcroBeginnerSections.simpleTechniques(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Simple Techniques") {
            subSection("Tuck Sit") {
                html {
                    p {
                        +"This is a very basic and fundamental position which will show up in many other techniques as well. "
                        +"You start in a peace-grip and hands in 45 degrees; not straight, no platform; not 90 degrees, too heavy for the wrists. "
                        +"The palms are \"sucked\" into each other, almost creating a vacuum so that no air-pocket is in between. "; br
                        +"The base simply lies on his back with the arms straight up. "
                        +"For more stability, engage your latissimus dorsi, locking shoulder and especially the stabilizers, and embrace your ribs; do not push from your shoulders up. "; br
                        +"The flyer is slowly pouring her weight into hands, and then release one leg after the other from the ground. "
                        +"Next, move your legs forward, through the arms, but do NOT lean backward, as then you are off balance and might fall with your back onto the base. "
                        +"You have to round your chest, shoulder forward; don't change your hand position, as you might have the tendency to go to 90 degrees, flat, putting pressure on your wrists. "
                    }
                    youtube("4UAfHgjbvxY", "Tuck Sit quickly demonstrated by AcroYogaTV")
                }
            }
            subSection("Straddle Bat") {
                html {
                    p {
                        +"The flyer simply hanging upside down with the legs on the base's extended feet/legs (straddle), legs extended sideways. "
                        +"It is important when transitioning into it, that the flyer provides a proper platform by spreading the legs, toes pulled towards the floor. "
                        +"You can be facing either direction, but the name and position is identical for both. "; br
                        +"It's usually a common transition pose: from ";ref(Bird);+" letting yourself down, "
                        +"step up/down to/from ";ref(Star);+", into Floating Paschi, an in-between pose of a Cart Wheel between Side Stars, etc."
                    }
                    youtube("mwETRw_OOXs", "Candace showing a direct entrance into Straddle Bat")
                    p {
                        +"A possible ";b{+"exit"};+" from here would be by first connecting via a peace grip to be able to shift the weight. "
                        +"Get one leg out and place the flexed foot under her butt and shins under her back. "
                        +"Then do the same with the other leg and both are in some kind of \"";i{+"stacked inverted child pose"};+"\". "
                        +"Hold onto her shoulders, and slowly roll forward using her gravitational pull so both end sitting upright. "
                    }
                }
            }
            subSection("Foot-to-Shin") {
                html {
                    p {
                        +"Connecting both hands (just like in Bird), the flyer steps on the lower legs of the base. "
                        +"Slightly below the knees, with the big toes and 2nd toes between the shin bones. "; br
                        +"The flyer stands up upright, balancing herself only with the feet, gaze is forward (not down anymore). "
                        +"The base can have the legs fully bent or the knees above the hips (slightly more advanced), "
                        +"but always keep the feet slightly higher than the knees to provide a safe foundation for the flyer. "
                    }
                    youtube("GNq_MVWxLB0", "Acro Connection demonstrating the Foot to Shin pose")
                    p {
                        +"You can of course transition from/into different positions, like Airplane, Throne and Whale (see video below). "
                    }
                    youtube("gixLd-6i9ko", "Yogafreq showing several different transitions for Foot to Shin")
                    p {
                        +"Instead of the flyer's feet onto the base's shins, it can also be the other way round: "
                        +"";b{+"Shin-to-foot"};+", the flyer thus basically shin-kneeling on the base's feet. "; br
                        +"If you the sides differ, one shin-to-foot, the other foot-to-shin, you are basically in a ";b{+"Flamingo"};+" position."
                    }
                }
            }
            subSection("Whale Pose") {
                html {
                    p {
                        +"It's basically a Reverse ";ref(BackBird);+" but with the contact points repositioned. "
                    }
                    p {
                        +"Flyer stands next to base's head, facing away; base is grabbing the ankles. "
                        +"Reach with toes under the shoulder blades (maybe with help of flyer reaching for them), and flyer bends backwards. "
                        +"Bend the knees to lift, and then extend all four limbs at the same time. "
                    }
                    p {
                        +"";b { +"Landing" };+" by bending all limbs, putting her feet on the ground, "
                        +"and help her stand in her own center by pushing her a bit forward with the feet. "
                    }
                    youtube("hBrGxXFZQ98", "Acro Connection presenting the Whale Pose")
                }
            }
            subSection("Throne Pose") {
                html {
                    p {
                        +"Also called ";b{+"Chair Pose"};+", which is basically sitting on the base's feet like on a throne/chair. "
                    }
                    p {
                        +"The entrance can be the same as with the ";ref(WhalePose);+", going backwards (flexible Happy Baby for the base), "
                        +"or transition from ";ref(Bird);+". "; br
                        +"Another entrance, which requires less flexibility from the base, is coming from the front. "
                        +"The flyer steps with one foot on the base hand (elbow touching the ground for more support if needed). "
                        +"On the other side, the flyer is pushing on the base's foot (extended leg). "
                        +"Now the base is reaching with the foot underneath the lifted flyer's leg on one buttock. "
                        +"The base is initiating to shift the weight towards his head, while the flyer is pushing weight onto all contact points. "
                        +"Now the second foot of the flyer can be given a platform with the hand, and finally reach with the second foot underneath the other buttock. "
                    }
                    p {
                        +"Watch out to keep the base's legs bent until the flyer is fully upright, and only then extend the legs. "; br
                        +"It's nice and easy to transition here from/to shin-to-foot or foot-to-shin. "
                    }
                    youtube("Mz_P0UzoBbk", "Super Dave showing variations of the Throne Pose")
                    p {
                        +"A variation would be to place the feet not on the buttocks but more towards the knees. "
                        +"The flyer then wraps (like a snake) her legs around yours, which makes things a bit more stable/easier. "
                    }
                }
            }
        }
    }
}
