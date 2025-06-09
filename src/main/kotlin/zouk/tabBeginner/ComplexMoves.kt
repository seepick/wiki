package zouk.tabBeginner

import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl
import zouk.ZoukRef

fun ZoukBeginnerSections.complex(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Complex Moves") {
            subSection("Viradinha") {
                // =====================================================================================================
                html {
                    p {
                        +"\"Virada\" means \"turn\" in Portuguese, and the diminutive \"inha\" means \"little\". "; br
                        +"It is done while in a mixed hand position (left open, right closed), and doing a basic step. "
                        +"The leader steps out of the line of the follower (she always stays on a straight line) while going backwards. "
                        +"It resembles a bit of a \"drunken style\" movement due to the crossing of the legs. "
                        +"When going straight back on the tuum, cross the right behind to go out of the line. "
                        +"Both are facing in the same direction, the hands are more on the side of the follower, who is then doing a lateral step."
                        +"The leader gives a quick impulse to rotate back again and step into her line, crossing his feet to make space. "
                        +"When doing so, the steps must be smaller in order to not bump (or push) the follower. "; br
                        i { +"Attention" }; +": Both need a proper frame (arms connected to torso, to hips/feet) for this to work,"
                        +"no noodle limbs but a moderate amount of tension kept for the connection to maintain."
                    }
                    p {
                        +"The hand contact is completely unnecessary; that is a general rule, that we don't lead by "
                        +"pushing/pulling the hand, as most of the leading/following is via the frame connection. "
                        +"If the follower is not following though, a slow and continuous increasing pressure is applied; "
                        +"again, through one's connection to the frame (shoulder and arm)."; br
                        +"Also, the leader's right hand slides during this move to the other side of the follower's back; "
                        +"this happens automatically when keeping the frame and angles of the arm."; br
                    }
                    youtube("HnHuy8IMmso?si=LkZIwpHlDeb__w4w", "The Viradinha move, opening the line for the follower")
                    p {
                        +"A "; b { +"variation" }; +" is for example a \"turned Viradinha\". "
                        +"While with the regular one, the follower turns 180-degrees into a lateral, and the leader stays facing in the same direction, "
                        +"now the follower does a 270 degrees turn clockwise, and the leader also turns, but 90 degrees. "
                        +"The position is closed again when stepping backwards and rounding up possibly with a regular (CCW) turn to be in the original position."
                    }
                    p {
                        +"Another, more simple, variation is, once opened up in Viradinha, simply go forward and backward "
                        +"(like a basic step), both looking in the same direction without a turn back (yet)."
                    }
                    p {
                        +"It can also be used for a ";b { +"transition into lateral" };+", if the leader stays on the spot for a moment, "
                        +"sending the follower forward, pulling her back into a lateral, and stepping sideways. "; br
                        +"This can be especially smooth when immediately combined with a switch back into basic, and then continuing in an infinite cycle. "
                    }
                    youtube("UI73rEZ9NB0?si=FclPc08NHz3xSvJa", "From Viradinha, into Lunge and Simple-Turn")
                    p {
                        +"After you feel confident with a ";ref(ZoukRef.Lunge);+" and Simple Turn, you can also use the Viradinha to enter those. "
                        +"The leader needs to turn with the follower, does a side step (Lunge), and introduces a turn. "
                        +"Remember to \"collect the follower\" by stepping towards her, otherwise the distance is too big between you. "
                    }
                }
            }
            subSection("Yoyo") {
                // =====================================================================================================
                html {
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
                html {
                    p {
                        +"We did a lunge with a simple turn by having both hands firmly embracing around the back, the latissimus dorsi muscle, during this move. "
                        +"It is similar to the ";ref(ZoukRef.Viradinha);+": Stepping out of the line, and side-step, yet the footwork is a bit more complex, pivoting the feet. "
                        +"The turn itself is done by pushing the follower sideways with one hand and disconnecting the other. "; br
                        +"To be more clear in your intention, connect both frames firmly, and simply initiate the move yourself, "
                        +"by going first down a bit, then accelerate a bit upwards, which will give the follower enough direction."
                    }
                    p {
                        +"The follower keeps the footwork pattern (we always do, all the time, no hopping and jumping or "
                        +"anything weird), and returns to the original position. A common mistake is that the follower moves "
                        +"to the side, stepping away from the line. "
                        +"Also watch out not to hit your leader with your elbows (leaders, give enough space), alternatively "
                        +"raise up your arms into the sky (as done with the ";ref(ZoukRef.Yoyo);+")."
                    }
                    p {
                        +"It can be used for playing with ";b { +"musicality" };+", choosing to slow much down, while followers wait the lead to exit the lunge; or keeping it short. "
                        +"It is a very effective tool when getting off-beat, to get back in your basic step dancing on time again."
                    }
                    youtube("ERZ1zvCSW-g?si=T82y4QCKFs8m7ZmD", "A few times the lunge-turn done in a row")
                    youtube("PB6iiSucaJA?si=WwfIgCo_Kmmm6mEq", "Out - pivot - lunge, with some remarks")
                }
                subSubSection("Hesitated Lunge") {
                    html {
                        p {
                            +"You can also do a lunge ";b { +"hesitate" };+" turn: "
                            +"From the basic step, start like with the Viradinha, step to the side, pivot on the spot, and lunge. "
                            +"Here it is possible to "; i { +"optionally" }; +" do a \"hesitate\" before turning (free spin or holding hand). "
                            +"Hesitate is basically shifting the weight left and right, with a clear, good connection, before going into a simple turn. "
                        }
                        p {
                            +"You can also go directly into the hesitate from the basic step. "
                            +"Just remember that the classical direction is possible when the leader is to the back, and then do basic steps backwards again."
                            +"When doing it while in the front, the turn has to go into the other direction; and then basic steps forward again."
                        }
                        youtube(
                            "WksqVNRF2Ps?si=Ck9mnFSrJcDqo9yR",
                            "Lunge with an optional Hesitate before the simple turn"
                        )
                        p { +"Also have a look at "; a("https://www.youtube.com/watch?v=RqK62OQ4qto") { +"Tiago Movimentus' instruction video" }; +" for more details on how to do the Lunge properly." }
                    }
                }
            }
            subSection("Soltinho") {
                // =====================================================================================================
                html {
                    p {
                        +"The name comes from the Portuguese word \"solta\", meaning free or loose. "
                        +"It is the first more complex move we learned so far, and it will need some time to master it; be patient, be kind (to yourself). "
                    }
                    p {
                        +"The footwork is somewhat complex and also used in more complicated, other moves. "
                        +"It is recommended to practice it by yourself! First going linear, then in circles. "
                        +"You can do for example quarter turns in a cross-shape, then move towards half turns for left-right change, and do three-quarter turns to challenge yourself. "
                    }
                    p {
                        +"";b { +"Enter" };+" it by doing a lateral step, when moving to the left, keep the arms wide open to give a clear signal to go into circular step. "
                        +"The first step is done with the left leg for the leader, and the right one for the follower. "
                        +"When the leader steps with the left leg, he goes and turns. "
                    }
                    p {
                        +"The turn can be either by putting her hand on your belly, turn, and catch her again. "
                        +"Or you can do a full spin like she is doing by going underneath your arm. "
                    }
                    p {
                        +"When stepping with the right leg, she goes/turns, lifting the ";b { +"arm up" };+". "
                        +"Think of a ";b { +"halo" };+", a circle drawn around the head, and not much higher than that. "
                        +"To clearly indicate to the follower whether you or her turns, move the hand either closer to yourself or her. "
                        +"While you are watching your partner turn, rotate your upper body towards her to \"charge a stretch\" in your body. "
                        +"You can use that charged, kinetic energy to release it and accelerate your rotation. "
                    }
                    p {
                        +"You can easily ";b { +"exit" };+" by sliding your hand over the shoulder-blades of your follower, sliding along the arm. "
                        +"Thus reaching back into the lateral where we came from. "
                        +"Alternatively, and much safer in regard to \"unintentional boob-grazing\", is to simply reach your arm out wide. "
                        +"This will give your partner a visual cue to reach for it, and you can invite her back into a lateral. "
                        // , going back into a lateral step again, indicating it by keeping the arms spread wider open
                    }
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
                html {
                    p {
                        +"Just to be sure: This technique's name is indeed \"bonus\". "
                        +"It's not just some bonus material, or similar, but the name it was given. "
                        +"Strange?! True. But it is what it is... terminology in Zouk evolved organically and was not deliberately designed with any kind of logic or structure. "
                    }
                    p {
                        +"Start to prepare from lateral while the follower is walking to the right. "
                        +"Raise the right hand up to head height, her elbow at 90 degrees, palms touching each other. "
                        +"The left hand can be used to indicate a rotation, but don't force with a pull. "
                        +"Once the follower is moving to the left, turn her 1.5 times by pulling the left hand into the desired direction. "
                        +"Do NOT push with the right hand (don't stir the soup), although this might seem tempting to do. "; br
                        +"The footwork is rather complex (for both roles). "
                        +"The leader steps in the beginning into her line, pulls her back after the first spin, and then walks back two times; the second being the begin of the basic already. "
                        +"The follower goes, before the second spin return, forward with the boom. "
                    }
                    p {
                        +"Keep the right arm up, indicating that the follower should keep on spinning (ad infinitum). "
                        +"The moment that arm goes down, it signals her to stop spinning (a general rule). "
                        +"During this period, the transition to free spin, keep the lego shaped hand connection. "
                        +"Shortly after that, there is a quick, elastic stretch on that arm side to pull her back again -maintain frame connection! "
                        +"Pull her back and let her do a free spin, similarly to Yoyo. "
                        +"Really throw the right hand outwards, to indicate a spin, and finally going back to basic again catching the shoulder blade. "; br
                        +"The follower's footwork at the end is to stay on the left foot, shift it to the right, turn, and then only do the travelling turn in the other direction. "
                    }
                    youtube(
                        "ix1h05vJhxo?si=v9xYMRlW30M8T4ya",
                        "From lateral into the bonus, free-spin and back to basic"
                    )
                }
            }
        }
    }
}
