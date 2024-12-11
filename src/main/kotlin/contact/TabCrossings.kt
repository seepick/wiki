package contact

import common.defineList
import common.youtube
import kotlinx.html.*
import tabs.Tab
import tabs.sectionedTab

val ContactTabs.animalCrossings: Tab
    get() = sectionedTab("Animal Crossings") {
        section("Introduction") {
            content {
                p {
                    +"What we call a \"little animal\" is basically just a table top position, with the difference of being more dynamic, more alive. "
                    +"This section will describe how we can cross such a little animal, meaning going over to the other side (or down to the same again). "
                    +"It could have been called also \"Going over table top position for dummies.\" "
                    +"The parts of going onto (hop on) and coming off (hop off) are separated as they can be freely combined. "
                }
                p { +"General Advice for both:" }
                ul {
                    li { +"Maintain an oompf-quality (sharing weight) throughout the whole process, from start to end." }
                }
                p { +"General Advice for flyers:" }
                ul {
                    li { +"Keep a rolling point of contact; yet sliding a bit sometimes is ok." }
                }
                p { +"General Advice for animals:" }
                ul {
                    li { +"You are alive, thus active in supporting the flyer. Be present, moving, and compensate for glitches." }
                    li { +"During practicing, you can be more static, to not compensate, so your flyer can feel where he is wrong." }
                    li { +"Keep a hollow back to keep a better landing surface (a yoga cow pose)." }
                    li { +"Always keep your head above your ass, as otherwise your flyer will panic and possibly fall down your shoulder." }
                    li { +"In case the flyer accidentally falls down your butt on your feet, you better have your toes untucked!" }
                }
            }
        }
        section("Hop On") {
            content {
                p { +"This section will cover how to get from a side-by-side little animal position to one partner being on top of the other. " }
                tableHopOn()
                defineList(
                    "First Crossing" to "Are your arms / or your legs going over first?",
                    "Body Contact" to "Are you on your partner with your belly / or with your back?",
                    "Face Direction" to "Are both facing in the same / or the opposite direction at the beginning?",
                )
                p { +"Going onto your partner with your side (instead with belly or back) will not be covered here (yet)." }
                p { +"General advice for flyers:" }
                ul {
                    li { +"Pour your weight slowly onto your animal; don't jump!" }
                    li { +"Always aim to land on the lower back; don't fall off the butt and don't reach the head." }
                    li { +"Reach for the standard position of 90 degrees, being perpendicular to your animal." }
                    li { +"Reach out like a superman to verify you are balanced, and float with an octopus quality." }
                    li { +"If unbalanced, bend/extend your legs/arms to compensate with minor weight shifts or use a chicken leg (belly position) to rebalance a bit." }
                    li { +"Be really, really precise with the landing position to stay balanced. Avoid cheating by sliding your position or lifting yourself up." }
                }
            }
            subSection("Arms first on Belly") {
                content {
                    p { +"This is the most simple one to get on your partner." }
                    ol {
                        li {
                            +"Start by moving your outer leg to the front, whether diagonally or straight depends on the height difference:"
                            ul {
                                li { +"When climbing bigger animals, step diagonally, replacing the inner hand (closer by)." }
                                li {
                                    +"When climbing smaller animals, step straight forward, replacing the outer hand (further away). "
                                    +"This could also lead to slightly better angle and control of lifting, and you can even try to roll instead of slight (without loosing the oompf quality). "
                                }
                            }
                            +"Experiment yourself and replace the hand which leads to the most stable position and allowing you a centered landing (distance). "
                            +"To make it easier, you can lift the palm a bit (she's doing it), or arch the back to create space and tilt the pelvis (he's doing it)."
                        }
                        li { +"Tuck the toes of your inner leg, and externally rotate the leg, pivoting on your knee, so that your foot is placed further away." }
                        li {
                            +"Lift and rotate your upper body, while maintaining the connection with your partner. "
                            +"Continue doing a knee-lifted lunge, pushing your knee off the ground to raise the level of your pelvis (adjust depending on where you need to land centered)."
                        }
                        li {
                            +"Put your hands diagonally onto your partner for support (if needed):"
                            ul {
                                li { +"One on the closer shoulder blade, the other on the further away pelvis bone, and slowly pour your weight into the box." }
                                li { +"From there gradually transfer your weight from the hands to the belly contact (2nd pouring)." }
                            }
                        }
                        li { +"Rotate both legs so your whole body is facing 90 degrees perpendicular towards your partner, your legs in a V-shape." }
                    }
                    youtube(
                        "Y3HvsLQzmW4?si=v00sMdnjBcavLxuz",
                        "Start crossing in same direction, with arms first, landing on your belly"
                    )
                }
                subSubSection("Facing opposite direction") {
                    content {
                        p { +"TODO" }
                    }
                }
            }
            subSection("Arms first on Back") {
                content {
                    ol {
                        li { +"The inner leg moves diagonally, close to where the outer hand is." }
                        li { +"Tuck the toes of the foot of the outer leg, and rotate inwards a bit if necessary (when crossing a bigger animal)." }
                        li { +"Rotate your body 90 degrees, with your back to your animal." }
                        li {
                            +"Lift up whole body a bit, to afterwards find the proper center-point."
                            ul {
                                li { +"Don't sit on top of your animal (that's rude), but rather push your butt against the sides." }
                                li { +"If you need more support, you can push with both of your hands on box of the animal." }
                            }
                        }
                        li { +"Bend backwards, arching your spine, arms reaching away, and relaxing your head, look back." }
                        li { +"As usual: First find your balance, then float with octopus quality and do a reversed superman." }
                        li { +"Don't grab the sides of your animal but rather reach over head to safeguard yourself." }
                    }
                    youtube(
                        "8e3j6nEnqLs?si=a6XSga7sg7Dl0QeT",
                        "Start crossing in same direction, with arms first, landing on your back"
                    )
                }
            }
            subSection("Legs first on Belly") {
                content {
                    p { +"TODO" }
                }
            }
            subSection("Legs first on Back") {
                content {
                    p { +"TODO" }
                }
            }
        }
        section("Hop Off") {
            content {
                p { +"Learn how to get back on the ground once you are on your little animal." }
                tableHopOff()
                defineList(
                    "Body Contact" to "Are you on your partner with your belly / or with your back?",
                    "Going Down" to "Are your arms / or your legs landing first on the ground?",
                    "Face Direction" to "Are both facing in the same / or the opposite direction at the end?",
                )
                p { +"General advice for flyers:" }
                ul {
                    li { +"When going down landing opposite direction, always be careful of your animal's head, to not kick it." }
                }
            }
            subSection("From Belly through Arms") {
                content {
                    p { +"TODO" }
                }
            }
            subSection("From Belly through Legs") {
                content {
                    p { +"TODO" }
                }
            }
            subSection("From Back through Arms") {
                content {
                    p { +"TODO" }
                }
            }
            subSection("From back through Legs") {
                content {
                    p { +"TODO" }
                }
            }
        }
    }

private fun FlowContent.tableHopOn() {
    tableHopOnOff(
        caption = "All 8 simple versions on how to hop on a little animal",
        headers = Triple("First Crossing", "Body Contact", "Face Direction"),
        left = Pair("Arms", "Legs"),
        middle = Pair("Belly", "Back"),
        right = Pair("Same", "Opposite"),
    )
}

private fun FlowContent.tableHopOff() {
    tableHopOnOff(
        caption = "All 8 simple versions on how to hop off a little animal",
        headers = Triple("Body Contact", "Going Down", "Face Direction"),
        left = Pair("Belly", "Back"),
        middle = Pair("Arms", "Legs"),
        right = Pair("Same", "Opposite"),
    )
}

private fun FlowContent.tableHopOnOff(
    caption: String,
    headers: Triple<String, String, String>,
    left: Pair<String, String>,
    middle: Pair<String, String>,
    right: Pair<String, String>,
) {
    div("center") {
        div {
            table {
                tr {
                    th { +headers.first }
                    th { +headers.second }
                    th { +headers.third }
                }
                fun TABLE.tableHalf(faceDirection: String) {
                    tr {
                        td("td1") { +faceDirection; rowSpan = "4" }
                        td("td1") { +middle.first; rowSpan = "2" }
                        td("td1") { +right.first }
                    }
                    tr {
                        td("td2") { +right.second }
                    }
                    tr {
                        td("td2") { +middle.second; rowSpan = "2" }
                        td("td1") { +right.first }
                    }
                    tr {
                        td("td2") { +right.second }
                    }
                }
                tableHalf(left.first)
                tableHalf(left.second)
            }
            p("caption") { i { +caption } }
        }
    }
}
