package zouk.tabPreadvanced

import common.ref
import common.youtube
import kotlinx.html.b
import kotlinx.html.br
import kotlinx.html.li
import kotlinx.html.ol
import kotlinx.html.p
import tabs.SectionedTabDsl
import zouk.ZoukRef

fun ZoukPreadvancedSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            subSection("Side Basic") {
                html {
                    p {
                        +"The Side Basic steps look a bit like Capoeira steps: Step sideways, then cross to the front, behind or simply small to the side, and shift weight (2nd chick). "
                        +"It's the footwork leaders do while the follower is in Lateral step. "; br
                        +"From here you can do simple turns (regular/backwards or sideways) and your ";ref(ZoukRef.Rotisserie);+". "
                    }
                    youtube("w_Ya-Yde1Ow?si=s1xAdQWxvtoUAJar", "Some different moves to be done from the Side Basic")
                    ol {
                        li {
                            +"";b{+"Regular Simple Turn"};+": Just as we would usually do from the Lateral, directing the turn backwards.. "
                        }
                        li {
                            +"";b{+"Sideways Simple Turn"};+": Just like the regular, but pulling sideways, travelling turn, and the follower's footwork and orientation changes. "
                        }
                        li {
                            +"";b{+"Rotisserie Simple Turn"};+": Adding a head movement for the follower. "
                        }
                        li {
                            +"";b{+"Held Simple Turns"};+": Both partner hold hands and do a simple turn. "
                        }
                        li {
                            +"";b{+"Rotisserie Held Simple Turns"};+": Same as the regular one, but both do a head movement. "
                        }
                    }
                    p {
                        +"Important for the leader is to change the second step, when going to the right, to step forward (not backward), "
                        +"in order to maintain the right distance to the follower and not overextend the arms. "
                    }
                }
            }
        }
    }
}
