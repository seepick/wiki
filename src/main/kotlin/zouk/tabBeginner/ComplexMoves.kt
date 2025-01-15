package zouk.tabBeginner

import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun ZoukBeginnerSections.complex(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Complex Moves") {
            subSection("Viradinha") {
                // =====================================================================================================
                content {
                    p {
                        +"\"Virada\" means \"turn\" in Portuguese, and the diminutive \"inha\" means \"little\". "; br
                        +"It is done while in a mixed hand position (left open, right closed), and doing a basic step. "
                        +"The leader steps out of the line of the follower (she always stays on a straight line) while going backwards. "
                        +"Both are facing in the same direction, the hands are more on the side of the follower, who is then doing a lateral step."
                        +"The leader gives a quick impulse to rotate back again and step into her line, crossing his feet to make space."; br
                        i { +"Attention" }; +": Both need a proper frame (arms connected to torso, to hips/feet) for this to work,"
                        +"no noodle limbs but a moderate amount of tension kept for the connection to maintain."
                    }
                    p {
                        +"The hand contact is completely unnecessary; that is a general rule, that we don't lead by "
                        +"pushing/pulling the hand, as most of the leading/following is via the frame connection. "
                        +"If the follower is not following though, a slow and continuous increasing pressure is applied; "
                        +"again, through once connection to the frame (shoulder and arm)."; br
                        +"Also, the leader's right hand slides during this move to the other side of the follower's back; "
                        +"this happens automatically if keeping the frame and angles of the arm."
                    }
                    p {
                        +"A "; b { +"variation" }; +" is for example a \"turned Viradinha\": Instead of the follower simple doing a 180-degrees"
                        +"(through a lateral step), it will be a 270-degrees turn clockwise."
                        +"The position is closed again when stepping backwards and rounding up possibly with a regular (CCW) turn to be in the original position."
                    }
                    p {
                        +"Another variation is, once opened up in Viradinha, simply go forward and backward "
                        +"(like a basic step), both looking in the same direction without a turn back (yet)."
                    }
                    youtube("HnHuy8IMmso?si=LkZIwpHlDeb__w4w", "The Viradinha move, opening the line for the follower")
                }
            }
            subSection("Yoyo") {
                // =====================================================================================================
                content {
                    p {
                        +"While being in the embrace, you give a push to the followers back and keep the hand contact. "
                        +"When pulling her back in you can either do another turn (thus the name Yoyo) by "
                        +"not letting go of the hand, or move here into a free spin with a quick movement from the wrist, throwing it."
                    }
                    p { +"Once she is in front of you again (adjust the distance), you are back in basic step." }
                    youtube("TH-BPM3PvLk?si=YJKa9FZH5QX-u3vW", "Lateral, to embrace, and Yoyo")
                }
            }
            subSection("Lunge") {
                // =====================================================================================================
                content {
                    p {
                        +"We did a lunge with a simple turn by having both hands firmly embracing around the back, the latissimus dorsi muscle, during this move. "
                        +"It is similar to the Viradinha: Stepping out of the line, and side-step, yet the footwork is a bit more complex, pivoting the feet. "
                        +"The turn itself is done by pushing the follower sideways with one hand and disconnecting the other."
                    }
                    p {
                        +"The follower keeps the footwork pattern (we always do, all the time, no hopping and jumping or "
                        +"anything weird), and returns to the original position. A common mistake is that the follower moves "
                        +"to the side, stepping away from the line. "
                        +"Also watch out not to hit your leader with your elbows (leaders, give enough space), alternatively "
                        +"raise up your arms into the sky (as done with the Yoyo)."
                    }
                    p {
                        +"It can be used for playing with musicality, choosing to slow much down, while followers wait the lead to exit the lunge; or keeping it short. "
                        +"It is a very effective tool when getting off-beat, to get back in your basic step dancing on time again."
                    }
                    youtube("ERZ1zvCSW-g?si=T82y4QCKFs8m7ZmD", "A few times the lunge-turn done in a row")
                    youtube("PB6iiSucaJA?si=WwfIgCo_Kmmm6mEq", "Out - pivot - lunge, with some remarks")
                    p {
                        +"You can also do a lunge hesitate turn: "
                        +"From the basic step, start like with the Viradinha, step to the side, pivot on the spot, and lunge. "
                        +"Here it is possible to "; i { +"optionally" }; +" do a \"hesitate\" before turning (free spin or holding hand). "
                        +"Hesitate is basically shifting the weight left and right, with a clear, good connection, before going into a simple turn. "
                    }
                    p {
                        +"You can also go directly into the hesitate from the basic step. "
                        +"Just remember that the classical direction is possible when the leader is to the back, and then do basic steps backwards again."
                        +"When doing it while in the front, the turn has to go into the other direction; and then basic steps forward again."
                    }
                    youtube("WksqVNRF2Ps?si=Ck9mnFSrJcDqo9yR", "Lunge with an optional Hesitate before the simple turn")
                    p { +"Also have a look at "; a("https://www.youtube.com/watch?v=RqK62OQ4qto") { +"Tiago Movimentus' instruction video" }; +" for more details on how to do the Lunge properly." }
                }
            }
            subSection("Soltinho") {
                // =====================================================================================================
                content {
                    p {
                        +"The name comes from the Portuguese word \"solta\", meaning free or loose. "
                        +"It is the first more complex move we learned so far, and it will need some time to master it; be patient, be kind (to yourself). "
                    }
                    p {
                        +"The footwork is more complicated and also used in more complicated, other moves. "
                        +"It is recommended to practice it by yourself! First going linear, then in circles."
                    }
                    p {
                        +"Enter it by doing a lateral step, when moving to the left, keep the arms wide open to give a clear signal to go into circular step. "
                        +"When the leader steps with the right leg, she goes/turns (lifting arm up). "
                        +"When stepping with the left leg, he goes/turns (put her hand on body, turn, and catch again)."
                    }
                    p { +"An exit is possible everytime the follower, into a lateral step again, indicating it by keeping the arms spread wider open." }
                    p { +"A "; b { +"variation" }; +" is possible by keep holding both hands (at least as long as possible) -try it yourself :)" }
                    youtube(
                        "HnxtpvG_nDM?si=a9t3PKf5i5l9PDqO",
                        "Soltinho footwork (linear/circular) - enter and exit from lateral"
                    )
                    p { +"Also see a one-hour video from about the "; a("https://www.youtube.com/live/mvLOJurjr7Y") { +"StepFlix on the Soltinho" }; +"." }
                }
            }
            subSection("Bonus") {
                // =====================================================================================================
                content {
                    p {
                        +"From lateral while she is walking to the right, prepare the right hand, raise up head height, palms touching each other. "
                        +"Once the follower is moving to the left, turn her 1.5 times by pulling the left hand into the desire direction. "
                        +"Do NOT push with the right hand, although this might seem tempting to do. "; br
                        +"The footwork is rather complex (for both roles). "
                        +"The leader steps in the beginning into her line, pulls her back after the first spin, and then walks back two times; the second being the begin of the basic already. "
                        +"The follower goes, before the second spin return, forward with the boom. "
                    }
                    p {
                        +"Keep the right arm up, indicating that the follower should keep on spinning (ad infinitum). "
                        +"The moment that arm goes down, it signals her to stop spinning. "
                        +"Shortly after that, there is a quick, elastic stretch on that arm side to pull her back again -maintain frame connection! "
                        +"Pull her back and let her do a free spin, similarly to Yoyo. "
                        +"Really throw the right hand outwards, to indicate she shall spin), and finally going back to basic again. "
                    }
                    youtube(
                        "ix1h05vJhxo?si=v9xYMRlW30M8T4ya",
                        "From lateral a pushed turn, free-spin and back to basic"
                    )
                }
            }
        }
    }
}
