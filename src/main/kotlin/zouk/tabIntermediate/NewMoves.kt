package zouk.tabIntermediate

import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun ZoukIntermediateSections.newMoves(dsl: SectionedTabDsl) {
    with(dsl) {
        section("New Moves") {
            subSection("Elastico") {
                html {
                    p {
                        +"Start in a basic, holding hands in a further away distance. "
                        +"It can also done from a lateral step, then you need to step back once you are on the right side. "; br
                        +"When positioned at the back, stay on the spot to increase the distance further. "
                        +"Watch out to clearly indicate the difference between going into lateral (rotational pull) and staying straight for an Elastico (although positioned on the side). "; br
                        +"Let go of the right hand and step out of the line. "
                        +"Let go of the left hand and use the right to pull the follower back on the hip. "
                        +"Slide in with the left over the shoulder and arm to go back to basic. "
                    }
                    youtube("DaQ4HhR7Ekc?si=0e2rCdM-jJiUSbG8", "Elastico move from basic")
                    subSubSection("Elastico with Raul") {
                        html {
                            p {
                                +"You can add a Raul (Portuguese meaning 'to vomit') which is due to the nature of the wave travelling the body upwards. "
                                +"Step the left leg forward, raise your body up along with the arm, which will make her body go up as well. "
                            }
                            youtube("Wwm1PGBE8sk?si=f4TBjO6_mg0sndIe", "Elastico with Raul")
                        }
                    }
                }
            }
            subSection("Hammer Lock") {
                html {
                    p {
                        +"While being in lateral, instead of doing a simple turn, we now lift the right arm (not the left). "
                        +"Using ";b{+"crab steps"};+" to walk to the right and left side parallel. "
                        +"On the first step to the left, we are now positioned in a lunge. "
                        +"The lifted (right) arm draws kind of a halo around the (fore-)head of the follower.";br
                        +"Watch out that the left hand stays connected (";i{+"locked"};+") throughout with a soft palm connection using a moderate amount of pressure; oomph-quality. "
                        +"Extend the arm in the middle of the turn, as otherwise the follower will have issues in their shoulders. "
                        +"Also bend it again to have it on the waist, instead of the butt. Don't bend the elbow, to prevent unintentional boob grazing. "; br
                        +"To go back to basic, lift the left hand (switching from right to left), and do a simple turn. "
                        +"Don't forget to slide over the shoulder blade as usual to indicate going back to a basic. "
                    }
                    youtube("FjlsyVHGza4?si=F5ZhNJzuEfxmMy0j", "Hammer Lock Lunge Turn with explanations")
                }
            }
        }
    }
}
