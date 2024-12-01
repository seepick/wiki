package contact

import Wiki
import defineList
import image
import kotlinx.html.*
import tabs.sectionedTab
import youtube

object ContactWiki : Wiki() {
    override val titleText = "Contact Improvisation Wiki"
    override val tabs = listOf(
        sectionedTab("32 Xings") {
            section("Introduction") {
                render {
                    p { +"For sake of simplicity, we are going to consider five dimensions leading to 32 (times 2 for each starting side, left and right) possible variations:" }
                    defineList(
                        "Start direction" to "Are both facing in the same / or the other direction at the beginning?",
                        "First crossing" to "Is your head / or your legs going over first?",
                        "First contact" to "Are you on your partner with your belly / or with your back?",
                        "Landing side" to "Are you ending up on the original / or do you go around (crossing)?",
                        "End direction" to "Are both facing in the same / or the other direction at the end?",
                    )
                    p {
                        +"Going onto your partner with your side (instead with belly or back) will not be covered here and is left for the individual exploration."
                    }
                    image("images/32_animals_table.png", "All 32 possibilities on how to cross an animal")
                    p {
                        +"General advice:"
                    }
                    ul {
                        li { +"Reach for standard position, 90 degrees/perpendicular" }
                        li { +"superman to verify balanced" }
                        li { +"octopus quality" }
                        li { +"little animal is living/supporting/active/helping" }
                    }
                }
            }
            section("Crossings") {
                subSection("1. Same / Head / Belly / Original / Same") {
                    /*
on:
outer leg to the front
    straight/diagonal = as in foot replacing inner/outer hand, depending on...
        personally: slight perference to replace outer hand
        height difference/length (to climb bigger animals, replace inner hand)
        replace hand which leads to be most stable, experiment/research
rotate upper body, while center connected
    do a "lifted lunge", push your knee off the ground to raise the level of your pelvis (otherwise no proper center landing)
    really be precise! with the landing position (no cheating = sliding)
    if possible, don't use hands to support
CAVE: don't slide, keep rolling point of contact, keep pouring weight, try to not to lift up yourself to find proper center connection
    as a help, push both hands (or one) on the back of your partner (one on shoulder, other diagonally on pelvis)
while on the partner doing a superman, possibly do chicken leg if unbalanced

off:
A) don't use hands; optionally can use chicken wing
    more similar to when doing lifts while standing
B) use hands to push down (down dog)
    allows for more fancy ground techniques (e.g. spiral while on partner, etc)
land with feet, outer leg first, far away (even further then initially when replacing outer hand)
land inner knee already in final position
if use hands (B) push into ground
land hands a bit delayed on the ground (not at the same time, control/stability/safety); preferrably inner hand first
    ... rest easy, see video
                     */
                    render {
                        p { +"The easiest one" }
                        youtube("", "Crossing same direction, with head first, on your belly, ending original side and same direction")
                    }
                }
                subSection("2. Same / Head / Belly / Original / Other") {
                    render {
                        p { +"Some description" }
                    }
                }
            }
        }
    )
}
