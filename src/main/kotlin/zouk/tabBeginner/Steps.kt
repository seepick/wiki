package zouk.tabBeginner

import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun ZoukBeginnerSections.steps(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Steps") {
            subSection("Basic") {
                // =====================================================================================================
                content {
                    p {
                        b { +"On-Spot" }; +": Step only on slow; or even slower (at the very beginning of the dance, or when there is no beat)."
                    }
                    p {
                        b { +"Basic Step" }; +": This is the most regular forward-and-backward step universally present in all moves. "
                        +"Using either connecting style (closed or open), the leader starts with his left leg stepping back. "
                        +"The 1st step on the slow gives the direction, the 2nd is to control the force "
                        +"or for direction change (only toes touch, heels up), and the 3rd to ground again. "
                        +"Feet are sliding on the ground (not stepping) and on different lines than partner (\"within\") to avoid stepping on each other's feet."
                    }
                    p {
                        b { +"Transition" }; +": From basic to lateral, by \"sending follower out\" "
                        +"(leader stays on the spot during basic), and both are changing their stepping styles."
                    }
                    youtube(
                        "mA9xGt11twk?si=VHsTUE19Yt-52WbW",
                        "Standing on the down-beat, small lateral, and stepping on the spot (with styling)"
                    )
                }
            }
            subSection("Lateral") {
                // =====================================================================================================
                content {
                    p {
                        +"The leader is just doing side-steps (optionally stepping in), the follower on the other hand crosses "
                        +"her steps while always facing to the leader, both moving sideways. "
                        +"The follower waits to feel the pull from the lead to step across. "
                    }
                    youtube(
                        "l_xhJqttlu0?si=bj8gJusBO4OMCTw1",
                        "Basic, push-out, lateral, and back to basic (mixed, or close)"
                    )
                    p {
                        +"For your own investigation, feel free to research the \"reverse lateral\", where the follower walks backwards. "
                        +"From the lateral, let her rotate (other direction than embrace), leader from side-step to lateral step. "
                        +"Exit by simply staying on the spot for one beat, and pulling her straight into lateral again. "
                    }
                }
            }
            subSection("Embrace") {
                // =====================================================================================================
                content {
                    p {
                        +"From lateral step, keep holding both hands; on the follower's first quick (let her do the first slow-step), "
                        +"keep her in place and rotate on the spot by giving her a clear spin. "
                        +"After that, identical footwork, arm is once over shoulder then rib cage height. "
                    }
                    youtube("6ooQMB8Rlz4?si=ImRNGXUvJzQPAVWH", "Lateral, to embrace, and simply back to basic")
                    p {
                        +"It is also possible to go directly from the basic (without the lateral) into the embrace."
                        +"Do so when the leader is stepped back, keep the follower on the spot (clear signal), and turn her."
                    }
                }
            }
        }
    }
}
