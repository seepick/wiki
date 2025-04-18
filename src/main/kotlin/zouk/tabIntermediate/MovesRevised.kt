package zouk.tabIntermediate

import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl
import zouk.ZoukRef

fun ZoukIntermediateSections.movesRevised(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Moves Revised") {
            html {
                p {
                    +"Before rushing to the next, and the next, and the next fancy, impressive technique, "
                    +"it is sometimes recommendable to slow down a bit, and work on the details first before rushing further. "
                    +"Let's thus review a few more details on already learned moves."
                }
            }
            subSection("Steps") {
                html {
                    p {
                        +"We usually go back- and forward all the time, but you can of course also ";b { +"travel" };+" through the room. "
                        +"Obviously during the basic step, simply repeat it two additional times in a direction. "
                        +"With a proper frame connection (the closer the better) and the follower listening, instead of following a pattern, it should be easy. "; br
                        +"Alternatively when in an open ";ref(ZoukRef.Viradinha);+" position, where both looking in the same direction, you can also travel. "
                    }
                    p {
                        +"When in lateral, and going back to basic (with or without a Soltinho), be sure to very quickly position yourself properly. "
                        +"Clearly stand right in front of your partner, aligning your shoulders with theirs. "
                        +"This should be possible with little to none pull force from the hand on her back. "
                    }
                }
            }
            subSection("Yoyo") {
                html {
                    p {
                        +"We already had a look on how to do the ";ref(ZoukRef.Yoyo)
                        +", starting from embrace steps and always sending the follower back to the same direction. "
                        +"To finish it, we would pull and let go of the hand with a swift external rotation and a free spin. ";
                        +"The follower has to watch out to do a proper travelling turn to adjust the distance accordingly. "
                    }
                    p {
                        +"A simple variation is to do it from the lateral, and just as with the ";ref(ZoukRef.Viradinha);+", to turn at the end. "
                        +"You can turn 90 degrees, or you can step aside, out of the line of the follower, and thus basically doing a 180 degrees turn. "
                        +"You do so, by starting in lateral, and when she is on the right side, step into her line, "
                        +"letting go of the left hand, and indicate to stay facing towards you, and not open totally. "; br
                        +"Step out again, and give a clear, ";b { +"circular push" };+" into her frame to turn her into your arm. "
                        +"Now you are temporarily in something which resembles the embrace but with only one arm connection. "
                        +"With every turn towards you, you can choose to go into a free-spin and back to a basic again."
                    }
                    p {
                        +"Watch out that you have a proper distance when spinning your follower out. "
                        +"Your posture should of course stay intact, the arms should still have \"some room\". "
                    }
                    youtube("N-4jFkbjVDk?si=ffEfxCo02Op8XJkO", "Yoyo with doing half turns")
                    p {
                        +"With every \"send out\" of the follower, the leader can also turn, and at the end \"spin\" the follower's arm. "
                    }
                }
            }
            subSection("Lung Turn") {
                html {
                    p {
                        +"Sometimes the communication of a turn is not clear for the follower. "
                        +"In that case, try to emphasize the left hand pulling more back-diagonal, instead of only sideways. "; br
                        +"Alternatively, you can put your left hand not on the ribcage, but take the follower's hand, "
                        +"and lead a simple turn instead."
                    }
                }
            }
            subSection("Soltinho") {
                html {
                    p {
                        +"The footwork of the ";ref(ZoukRef.Soltinho);+" we already learned is very universal and can have many variations. "
                        +"You can practice also by yourself, going in a line, in a square, or a triangle. "
                        +"Especially the triangle shaped footwork with your partner with WiFi connection can be useful to work on precision."
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
                subSubSection("Two-armed Soltinho") {
                    html {
                        p {
                            +"Yet another variation of Soltinho, next to doing it in the default version of keeping contact with one arm, "
                            +"you can keep contact with both arm, sliding each other's hands over the side and back. "
                            +"Watch out to not put the hand on the front or even worse: on the \"other\" side. "
                            +"Keep your arms active, elbows flexed and forearms facing forward (no dead fish arms), so they can be easily caught for reconnection. "
                            +"The leaders will slide the arm from the inside of the follower's arm, thus ending up in a non-default hand position. "
                        }
                        p {
                            +"If the stroke goes around the waist line, this should indicate continuing the Soltinho. "
                            +"If the hand would go a bit higher to the shoulder blade (with a slight pull and proper repositioning), this is usually an indicator for going back to basic. "
                            +"Just watch out for some unintentional boob grazing. "
                        }
                        p {
                            +"In the video, you will see that he starts going under first (follower facing to the right), "
                            +"contrary to what might be more natural to let the follower go first (follower facing to the left) "
                            +"which resembles a more common simple turn."
                        }
                        youtube("rq2iex3x-Wc?si=-5z3kWVqYDas9j42", "Soltinho with two arms connection")
                    }
                }
            }
        }
    }
}
