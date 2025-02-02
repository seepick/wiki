package zouk.tabIntermediate

import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl
import zouk.ZoukRef

fun ZoukIntermediateSections.movesRevised(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Moves Revised") {
            content {
                p {
                    +"Before rushing to the next, and the next, and the next fancy, impressive technique, "
                    +"it is sometimes recommendable to slow down a bit, and work on the details first before rushing further. "
                    +"Let's thus review a few more details on already learned moves."
                }
            }
            subSection("Yoyo") {
                content {
                    p {
                        +"We already had a look on how to do the ";ref(ZoukRef.Yoyo)
                        +", starting from embrace steps and always sending the follower back to the same direction. "
                        +"To finish it, we would let go of the hand with a swift external rotation and a free spin. "
                    }
                    p {
                        +"A simple variation is, just as with the ";ref(ZoukRef.Viradinha);+", to turn 90 degrees at the end. "
                        +"Or you can step aside, out of the line of the follower, and thus basically doing a half turn. "
                        +"You do so, by starting in lateral, and when she is on the right side, step into her line, "
                        +"letting go of the left hand, and indicate to stay facing towards you, and not open totally. "; br
                        +"Step out again, and give a clear, circular push into her frame to turn her into your arm. "
                        +"Now you are temporarily in something which resembles the embrace but with only one arm connection. "
                        +"With every turn towards you, you can choose to go into a free-spin and back to a basic again."
                    }
                    // TODO video once its published
                }
            }
            subSection("Soltinho") {
                content {
                    p {
                        +"The footwork of the ";ref(ZoukRef.Soltinho);+" we already learned is very universal and can have many variations. "
                        +"You can practice also by yourself, going in a line, in a square, or a triangle. "
                    }
                    p {
                        +"You can enter it from the lateral and immediately turn yourself, "
                        +"or wait one beat, and let her do the first turn a bit delayed, which might feel a bit more relaxed. "
                    }
                    p {
                        +"As a follower, you can either turn as well, or let her arm slide around your belly. "
                    }
                    p {
                        +"As a simple styling element, you can tilt your upper body a bit. "
                        +"When your partner turns, tilting towards her, otherwise away."
                    }
                    p {
                        +"Exiting is possible to by going back to lateral by either sliding over the back along the arm, "
                        +"or, the slightly safer option to avoid unintentional \"boob-grazing\", by clearly offering your open palm. "
                        +"Alternatively you can also give a clear signal for the basic by a straight pull of the back. "
                    }
                    youtube("c2RSi2pBsGs?si=capXVvAalK5SW-42", "Soltinho footwork revised")
                }
            }
        }
    }
}
