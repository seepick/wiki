package zouk.tabPreadvanced

import common.ref
import common.youtube
import kotlinx.html.b
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
                        +"The Side Basic steps look a bit like Capoeira steps: Step sideways, then cross behind, and shift weight (2nd chick). "
                        +"From here you can do simple turns (regular/backwards or sideways) and your ";ref(ZoukRef.RoastedChicken);+". "
                    }
                    youtube("w_Ya-Yde1Ow?si=s1xAdQWxvtoUAJar", "Some different moves to be done from the Side Basic")
                    ol {
                        li {
                            +"";b{+"Regular Simple Turn"};+": Just as we would usually do from the Lateral. "
                        }
                        li {
                            +"";b{+"Sideways Simple Turn"};+": Just like the regular, but pulling sideways, travelling turn, and the follower's footwork and orientation changes. "
                        }
                        li {
                            +"";b{+"Rotisserie Simple Turn"};+": Adding a spiral head movement for the follower. "
                        }
                        li {
                            +"";b{+"Double Spin"};+": Both partner hold hands and start to rotate; leader's leg goes to the front. "
                        }
                        li {
                            +"";b{+"Rotisserie Double Spin"};+": Same as the regular one, but both do a spiral head movement. "
                        }
                    }
                }
            }
        }
    }
}
