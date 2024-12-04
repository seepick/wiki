package contact

import common.defineList
import common.youtube
import kotlinx.html.FlowContent
import kotlinx.html.TABLE
import kotlinx.html.div
import kotlinx.html.i
import kotlinx.html.li
import kotlinx.html.ol
import kotlinx.html.p
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.th
import kotlinx.html.tr
import kotlinx.html.ul
import tabs.Tab
import tabs.sectionedTab

val ContactTabs.animalCrossings: Tab
    get() = sectionedTab("Animal Crossings") {
        section("Introduction") {
            /*

* alternate title "... for dummies"
* during jam/application, always be living animal, support and compensate for mistakes of flyer
	- during exercise/practice/learning, be static, don't compensate, so partner can feel where he is doing it wrong
* always aim to land on the lower back (animal hollow back/cow)
* animal always head above ass, otherwise fall down the shoulder/head
* CAVE: don't fall on your animals' feet, injury! (animals don't tuck your toes!)
* when going down with goal both facing opposite direction:
	- be careful of your animals' head, to not kick it with your leg
* adhere basic principles: start with oompf;
	maintain sharing weight + rolling point of contact (sometimes a bit sliding, that's ok)
	pouring weight (don't jump)
             */
            content {
                p {
                    +"A little animal is basically a more dynamic (alive) table top position. "
                    +"This section will describe how we can cross such a little animal, meaning going over to the other side. "
                    +"The parts of going onto (hop on) and coming off (hop off) are separated as they can be freely combined."
                }
                p { +"General advice: (TODO: refine)" } // TODO: refine general advice
                ul {
                    li { +"oompf quality (from very beginning, maintain throughout)" }
                    li { +"little animal is living/active/supporting/helping" }
                }
            }
        }
        section("Hop On") {
            content {
                p { +"TODO: some intro text ..." } // TODO intro text
                p { +"Going onto your partner with your side (instead with belly or back) will not be covered here and is left for the individual exploration (or for an additional part II)." }
                tableHopOn()
                defineList(
                    "First Crossing" to "Are your arms / or your legs going over first?",
                    "Body Contact" to "Are you on your partner with your belly / or with your back?",
                    "Face Direction" to "Are both facing in the same / or the opposite direction at the beginning?",
                )
                p { +"General advice: (TODO: refine)" } // TODO: refine general advice
                ul {
                    li { +"Reach for standard position, 90 degrees/perpendicular" }
                    li { +"superman to verify balanced" }
                    li { +"use chicken leg if unbalanced" }
                    li { +"octopus quality" }
                    li { +"Be really, really precise with the landing position to stay balanced. Avoid cheating by sliding your position or lifting yourself up." }
                }
            }
            subSection("Arms first on Belly") {
                content = {
                    /*
* to make it easier to bend the leg in/forward:
	1) arch the back to create space and be able to tilt the pelvis (he's doing it)
	2) lift the palm a bit (she's doing it)
* first leg position:
	1) for taller people, needs to be further away, thus outer leg goes stright forward (outside of outer hand)
	2) for smaller people, diagonally, so foot is closer position
* step outer leg straight forward (not diagonal!) to keep it closer to your partner (benefit later to raise up, better control, better angle)
	- now without losing oompf (or even contact), roll your pelvis towards the right spot => maintain sharing weight + rolling point of contact
* first pour weight into hands on your partner's shoulder/pelvis, then slowly transition from there to your center ("2nd pouring")
                     */
                    p { +"This is the most simple one to get on your partner." }
                    ol {
                        li {
                            +"Start by moving your outer leg diagonally to the front, replacing the outer (preferred) or sometimes inner hand. "
                            +"Where to place the foot depends on height/length differences: When climbing bigger animals, replace the inner hand. "
                            +"Experiment yourself and replace the hand which leads to the most stable position and allowing you a centered landing (distance)."
                        }
                        li { +"Tuck the toes of your inner leg, and externally rotate the leg, pivoting on your knee, so that your foot is placed further away." }
                        li {
                            +"Lift and rotate your upper body, while maintaining the connection with your partner. "
                            +"Continue doing a knee-lifted lunge, pushing your knee off the ground to raise the level of your pelvis (adjust depending on where you need to land centered)."
                        }
                        li { +"Put your hands diagonally onto your partner for support (if needed): One on the closer shoulder blade, the other on the further away pelvis bone." }
                        li { +"Rotate both legs so your whole body is facing 90 degrees perpendicular towards your partner, your legs in a V-shape." }
                    }
                    youtube(
                        id = "DCPziLhu8f8?si=skom3gXy0pPKqo1P",
                        caption = "Start crossing in same direction, with arms first, landing on your belly"
                    )
                }
                subSubSection("Facing opposite direction") {

                }
            }
            subSection("Arms first on Back") {}
            subSection("Legs first on Belly") {}
            subSection("Legs first on Back") {}
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
            }
            subSection("TODO") {
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
            p("caption") { i {+caption} }
        }
    }
}
